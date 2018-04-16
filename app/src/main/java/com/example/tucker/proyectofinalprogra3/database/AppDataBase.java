package com.example.tucker.proyectofinalprogra3.database;

import com.raizlabs.android.dbflow.annotation.Database;

/**
 * Created by John on 4/15/2018.
 */

@Database(name = AppDataBase.NAME, version = AppDataBase.VERSION)
public class AppDataBase {

    public static final String NAME = "AppDatabase";
    public static final int VERSION = 1;
}
