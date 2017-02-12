package com.example.ibrhm.getinfo.DB;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by ibrhm on 12.02.2017.
 */

public class DBOperations { Context context;
    int count = 0;
    int trailer = 0;
    Databeses database = new Databeses(this.context);

    public void recordAdd(int id, String date, Databeses database) {
        SQLiteDatabase db = database.getWritableDatabase();
        ContentValues data = new ContentValues();
        data.put("pID", id);
        data.put("date", date);
        db.insertOrThrow("informationDB", null, data);
    }

    public Boolean display(String Mdate,Databeses database) {
           SQLiteDatabase db = database.getReadableDatabase();
        Cursor cursor = db.query("informationDB", new String[]{"pID", "date"}, null, null, null, null, null);
        if(cursor.getCount()!=0) {
            while(cursor.moveToNext()) {
                String date = cursor.getString((cursor.getColumnIndex("date")));
            }
        return  true;
        }
        else {
            String date=null;
            recordAdd(1,date,database);
        return false;
        }

    }

    public void dBUpdate(Databeses dateDB,int id,String date)
    {
            ContentValues update = new ContentValues();
            update.put("date",date);
            SQLiteDatabase db=dateDB.getWritableDatabase();
                         db.update("informationDB",update, "pID" + "="
                    + id, null);
    }
}
