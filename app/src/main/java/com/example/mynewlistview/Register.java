package com.example.mynewlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {
    Button login_register,Register_register;
    EditText username_register,password_register;
    SharedPreferences  sharedpreferance;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        username_register=(EditText) findViewById(R.id.register_edittext);
        password_register=(EditText) findViewById(R.id.username_edit_register);
        Register_register=(Button) findViewById(R.id.register_button);
        Register_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uuser_name=username_register.getText().toString();
                String passsword_register=password_register.getText().toString();
                sharedpreferance=getSharedPreferences("USERINFO",0);

                editor.putString("username",uuser_name);
                editor.putString("Password",passsword_register);

            }
        });
    }
}