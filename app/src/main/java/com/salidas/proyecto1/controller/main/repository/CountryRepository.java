package com.salidas.proyecto1.controller.main.repository;

import com.android.volley.AuthFailureError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.google.gson.Gson;
import com.salidas.proyecto1.app.AppContext;
import com.salidas.proyecto1.base.BaseRepository;
import com.salidas.proyecto1.model.CountryResponse;
import com.salidas.proyecto1.util.VolleyQueueManager;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class CountryRepository extends BaseRepository {

    public static void callCountryService(final ICountryResponseHandler handler) {

        String url = "http://private-f1dbf3-androidclass.apiary-mock.com/teams";

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            CountryResponse countryResponse = new Gson().fromJson(response.toString(), CountryResponse.class);
                            handler.onAPIResponse(countryResponse.getCountries());
                        } catch (Exception e) {
                            handler.onError("Ay mk, se embaló");
                        }

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        handler.onError("Qué cagada guevón");
                    }
                }) {

            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                Map<String, String> headers = new HashMap<String, String>();
                headers.put("Content-Type", "application/json");
                return headers;
            }
        };

        request.setRetryPolicy(new

                DefaultRetryPolicy(
                10000,
                DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
                DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));

        VolleyQueueManager.getInstance(AppContext.getGlobalContext()).
                addToRequestQueue(request);

    }
}