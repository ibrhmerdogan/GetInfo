package com.example.ibrhm.getinfo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends Activity {
    private static final String url = "http://denemesitesidirdbyeni.co.nf/uyeler.php";
    ListView lvUyeler;
    ArrayList<String> uyeler;
    TextView textView;
    public int MaingetInfoId=57;
    Button getInfo;
    EditText getId;
    JSONObject jRegister;
    GetInformation getInformation;
    ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getInfo=(Button)findViewById(R.id.button);
        getId=(EditText)findViewById(R.id.editText);
        jRegister = new JSONObject();

              MainActivity.this.startService(new Intent(MainActivity.this.getApplicationContext(),Services.class));
    }


}
