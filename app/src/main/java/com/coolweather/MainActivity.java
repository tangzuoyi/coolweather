package com.coolweather;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import org.litepal.LitePal;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        LitePal.initialize(this);
        LitePal.getDatabase();
    }
}
