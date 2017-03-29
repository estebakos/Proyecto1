package com.salidas.proyecto1.controller.main.view;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.salidas.proyecto1.R;
import com.salidas.proyecto1.controller.main.controller.AppController;
import com.salidas.proyecto1.model.Country;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by esteban on 27/03/17.
 */

public class CountryListActivity extends AppCompatActivity{

    private RecyclerView rvCountries;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_list);

        rvCountries = (RecyclerView) findViewById(R.id.rvCountryList);
        rvCountries.setLayoutManager(new LinearLayoutManager(this));
        rvCountries.setHasFixedSize(true);

        String tag_json_arry = "json_array_req";
        String url = "http://private-f1dbf3-androidclass.apiary-mock.com/teams";

        final ProgressDialog pDialog = new ProgressDialog(this);

        RequestQueue queue = Volley.newRequestQueue(this);

        JsonArrayRequest req = new JsonArrayRequest(url,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        List<Country> countries = new Gson().fromJson(response.toString(),
                                new TypeToken<ArrayList<Country>>() {
                                }.getType());
                        CountriesAdapter countriesAdapter = new CountriesAdapter(countries, CountryListActivity.this);
                        rvCountries.setAdapter(countriesAdapter);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
            }
        });

        queue.add(req);
    }
}
