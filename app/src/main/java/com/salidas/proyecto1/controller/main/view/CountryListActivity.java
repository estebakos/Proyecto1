package com.salidas.proyecto1.controller.main.view;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.salidas.proyecto1.R;
import com.salidas.proyecto1.app.AppContext;
import com.salidas.proyecto1.controller.main.controller.CountryController;
import com.salidas.proyecto1.model.Country;

import java.util.List;

/**
 * Created by esteban on 27/03/17.
 */

public class CountryListActivity extends AppCompatActivity implements ICountryActivity {

    private RecyclerView rvCountries;
    private CountryController countryController;
    private ProgressDialog pDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_list);
        AppContext.setGlobalContext(this);
        countryController = new CountryController(this);

        rvCountries = (RecyclerView) findViewById(R.id.rvCountryList);
        rvCountries.setLayoutManager(new LinearLayoutManager(this));
        rvCountries.setHasFixedSize(true);
    }

    @Override
    public void onCountries(List<Country> countries) {
        CountriesAdapter countriesAdapter = new CountriesAdapter(countries, this);
        rvCountries.setAdapter(countriesAdapter);
    }

    @Override
    public void onError(String error) {
        Toast.makeText(this, error, Toast.LENGTH_LONG).show();
    }

    private void hideDialog() {
        if (pDialog != null && !pDialog.isShowing()) {
            pDialog.cancel();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        //pDialog = new ProgressDialog(this);
        countryController.getCountries();
    }
}
