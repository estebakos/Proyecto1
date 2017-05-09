package com.salidas.proyecto1.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by esteban on 8/05/17.
 */

public class CountryResponse {
    private List<Country> countries = new ArrayList<>();

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }
}
