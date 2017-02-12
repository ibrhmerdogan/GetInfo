package com.example.ibrhm.getinfo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by ibrhm on 10.02.2017.
 */
//
public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"myReceiver",Toast.LENGTH_LONG).show();
    }
}
