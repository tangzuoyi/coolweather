package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Qweather {
    public Basic basic;

    public String code;

    public Now now;
    @SerializedName("daily")
    public List<Daily> dailyList;


    public class Now{
        public String temp;
        public String text;
    }
}
