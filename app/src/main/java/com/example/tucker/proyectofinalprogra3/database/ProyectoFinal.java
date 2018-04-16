package com.example.tucker.proyectofinalprogra3.database;

import android.app.Application;
import com.raizlabs.android.dbflow.config.FlowManager;

/**
 * Created by John on 4/15/2018.
 */


public class ProyectoFinal extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FlowManager.init(this);
    }
}
