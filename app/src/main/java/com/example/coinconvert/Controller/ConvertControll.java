package com.example.coinconvert.Controller;

import android.content.SharedPreferences;
import android.util.Log;

import androidx.annotation.NonNull;

import com.example.coinconvert.Model.Value;
import com.example.coinconvert.View.MainActivity;

public class ConvertControll {

    SharedPreferences preferences;
    public static final String New_preferences = "values";
    SharedPreferences.Editor valueList;

    public ConvertControll(MainActivity mainActivity) {

        preferences = mainActivity.getSharedPreferences(New_preferences, 0);
        valueList = preferences.edit();

    }


    @NonNull
    @Override
    public String toString() {

        Log.d("MVC_Controller","Controller_Iniciado");
        return super.toString();
    }

    public void Clear(Value value){

        valueList.clear();
        valueList.apply();

    }

    public void Convert(Value value) {

        valueList.putString("value: ", value.getValue());
        valueList.apply();

    }


    public void Search(Value value) {

        value.setResult(preferences.getString("value: ", "NA"));

    }
}
