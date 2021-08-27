package com.example.mynewlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    Button login_register,Register_register;
    EditText username_register,password_register;
  SharedPreferences sharedpreferance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        username_register=(EditText) findViewById(R.id.register_edittext);
        password_register=(EditText) findViewById(R.id.username_edit_register);
        Register_register=(Button) findViewById(R.id.register_button);
        sharedpreferance = getSharedPreferences("USERINFO", 0);
        Register_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username_register.length() > 0) {
                    SharedPreferences.Editor editor = sharedpreferance.edit();

                    String uuser_name = username_register.getText().toString();
                    String passsword_register = password_register.getText().toString();

                    editor.putString("username", uuser_name);
                    editor.putString("Password", passsword_register);
                    editor.apply();
                    Log.d("Register_java", "sinha");
                    Intent intent=new Intent(Register.this,Shareprefernceexample.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(Register.this, "pplease intervalid details", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}