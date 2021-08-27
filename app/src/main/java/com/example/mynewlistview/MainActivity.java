package com.example.mynewlistview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView listView;
    String[] avinash={"Avinash","kumars","Avinash","kumars","Avinash","kumars","Avinash","kumars",};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.listview_example);
        module moodule=new module("Avinash","Kumar");


        ArrayList<module> moduleArrayList=new ArrayList<module>();
        CustomizedArrayAdapter customizedArrayAdapter=new CustomizedArrayAdapter(MainActivity.this,moduleArrayList);
    //    View view= LayoutInflater.from(MainActivity.this).inflate(R.layout.activity_mypagestore,getParent().findViewById(R.id.button),true);
    //    Button btn=(Button) view;
      //  btn.setOnClickListener(new View.OnClickListener() {
       //     @Override
         //   public void onClick(View view) {
        //        Toast.makeText(MainActivity.this, "hii", Toast.LENGTH_SHORT).show();
       //         Log.d("Avinash","sinha");
         //   }
     //   });
        listView.setAdapter(customizedArrayAdapter);
           customizedArrayAdapter.add(moodule);

    }
}