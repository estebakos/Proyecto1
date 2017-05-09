package com.salidas.proyecto1.controller.main.controller;

import com.salidas.proyecto1.controller.main.repository.CountryRepository;
import com.salidas.proyecto1.controller.main.repository.ICountryResponseHandler;
import com.salidas.proyecto1.controller.main.view.ICountryActivity;
import com.salidas.proyecto1.model.Country;

import java.util.List;

/**
 * Created by esteban on 8/05/17.
 */

public class CountryController implements ICountryResponseHandler {

    private ICountryActivity iCountryActivity;

    public CountryController(ICountryActivity iCountryActivity) {
        this.iCountryActivity = iCountryActivity;
    }

    public void getCountries() {
        CountryRepository.callCountryService(this);
    }

    @Override
    public void onAPIResponse(List<Country> countries) {
        iCountryActivity.onCountries(countries);
    }

    @Override
    public void onError(String error) {
        iCountryActivity.onError(error);
    }
}
