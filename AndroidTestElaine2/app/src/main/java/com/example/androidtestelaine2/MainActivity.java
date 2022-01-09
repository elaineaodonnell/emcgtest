package com.example.androidtestelaine2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    City c= new City();

    jsonData jdata=new jsonData();
    String s1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        JSONObject jobj, jobj1;

        try{
            jobj = new JSONObject(jdata.paris);
            jobj1 = new JSONObject(jobj.getString("city"));
            c.name=jobj1.getString("name");
            c.rank=jobj1.getInt("rank");
        }catch (JSONException e){
            e.printStackTrace();
        }

        Log.i("City Name", c.name);
        Log.i("City Rank", c.rank+"");
    }
}