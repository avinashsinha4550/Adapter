package com.example.mynewlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class CustomizedArrayAdapter extends ArrayAdapter<module> {


    public CustomizedArrayAdapter(@NonNull Context context, @NonNull ArrayList<module> module) {
        super(context, 0, module);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null)
        {
            View layoutInflater = LayoutInflater.from(getContext()).inflate(R.layout.activity_mypagestore, parent, false);
        convertView = layoutInflater;
    }
        module moodule=getItem(position);
       // Button button=(Button)convertView.findViewById(R.id.button);
        EditText textView1=(EditText) convertView.findViewById(R.id.username_edit);
        EditText textView2=(EditText) convertView.findViewById(R.id.Namepleaese_edit);


                textView1.setText(moodule.Name+" ");
                textView2.setText(moodule.Username+" ");
            //    Toast.makeText(getContext(),""+ position+"", Toast.LENGTH_SHORT).show();


        return convertView;
    }
}
