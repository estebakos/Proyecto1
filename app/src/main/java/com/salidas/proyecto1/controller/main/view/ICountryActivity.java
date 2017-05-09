package com.salidas.proyecto1.controller.main.view;

import com.salidas.proyecto1.model.Country;

import java.util.List;

/**
 * Created by esteban on 8/05/17.
 */

public interface ICountryActivity {

    void onCountries(List<Country> countries);

    void onError(String error);
}
