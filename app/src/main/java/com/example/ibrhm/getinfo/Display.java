package com.example.ibrhm.getinfo;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;

/**
 * Created by ibrhm on 9.02.2017.
 */

public class Display extends Activity{
    Context context;
    public void display(){
        Toast.makeText(getApplicationContext(),"geeee",Toast.LENGTH_LONG).show();

    }
}
