package com.example.mynewlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapterusers extends ArrayAdapter<Users> {
    public Adapterusers(@NonNull Context context, @NonNull ArrayList<Users> Users) {
        super(context, 0, Users);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view= LayoutInflater.from(getContext()).inflate(R.layout.sharedpreferance,parent,false);
        convertView=view;

        Users users=getItem(position);
        EditText usrname=(EditText)convertView.findViewById(R.id.sharedprefedittext);
        EditText name=(EditText)convertView.findViewById(R.id.sharedprefedittext2);
           usrname.setText(users.username);
        usrname.setText(users.useraddress);
        return  convertView;
    }
}
