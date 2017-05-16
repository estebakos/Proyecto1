package com.salidas.proyecto1.controller.main.repository;

import com.salidas.proyecto1.model.Profile;

/**
 * Created by esteban on 15/05/17.
 */

interface IProfileResponseHandler {
    void onProfile(Profile profile);
    void onError();
}
