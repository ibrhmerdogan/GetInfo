package com.example.ibrhm.getinfo.DB;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by ibrhm on 12.02.2017.
 */


public class Databeses extends SQLiteOpenHelper {

    static final String DATABASE_NAME = "dateDB";
    // Contacts table name
    private static final String TABLE_COUNTRIES = "informationDB";
    public Databeses(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE informationDB (pID INTEGER PRIMARY KEY ,date TEXT);");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_COUNTRIES);
        onCreate(db);
    }
}
