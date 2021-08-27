package com.example.mynewlistview;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class Storingdatatshared {
   static String string_key="STRING_KEY";

    public static void writelist(Context context, ArrayList<Users> users)
    {
        Gson gson=new Gson();
        String jason= gson.toJson(users);
        SharedPreferences sharedpreferance= PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor= sharedpreferance.edit();
        editor.putString(string_key,jason);
        editor.apply();
    }
    public static ArrayList<Users> readdata(Context context)
    {
        SharedPreferences sharedpreferance=PreferenceManager.getDefaultSharedPreferences(context);
        String jasonString=sharedpreferance.getString(string_key,"");

        Gson gson=new Gson();
        Type type=new TypeToken<ArrayList<Users>>()
        {

        }.getType();
        ArrayList<Users> usersArrayList=gson.fromJson(jasonString,type);

        return usersArrayList;
    }
}
