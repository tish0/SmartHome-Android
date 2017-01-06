package com.peneff.smarthome;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;


public class HouseSettings extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_house_settings);


        HouseFragment HF = new HouseFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.container, HF).commit();
    }
}

