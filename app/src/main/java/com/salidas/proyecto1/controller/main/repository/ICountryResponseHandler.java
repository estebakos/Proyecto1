package com.salidas.proyecto1.controller.main.repository;


import com.salidas.proyecto1.model.Country;

import java.util.List;

/**
 * Created by sebastiangomez on 24/02/16.
 */
public interface ICountryResponseHandler {

    void onAPIResponse(List<Country> countries);
    void onError(String error);
}
