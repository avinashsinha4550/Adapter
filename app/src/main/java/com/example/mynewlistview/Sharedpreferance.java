package com.example.mynewlistview;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Sharedpreferance extends AppCompatActivity {
        ListView listView;
        Button button,button1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sharedpreferance);
        listView=(ListView) findViewById(R.id.listview);
        button=(Button) findViewById(R.id.sharedprefedittext_btn1);
        button1=(Button) findViewById(R.id.button5);
        ArrayList<Users> usersArrayList=new ArrayList<Users>();
        Adapterusers adapterusers=new Adapterusers(Sharedpreferance.this,usersArrayList);
        listView.setAdapter(adapterusers);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
