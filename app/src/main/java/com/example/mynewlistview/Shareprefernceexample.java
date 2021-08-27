package com.example.mynewlistview;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Shareprefernceexample extends AppCompatActivity {
    Button login,Register;
    EditText username,password;
   SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sharedpreferenceexample);
        login=(Button) findViewById(R.id.button2);
        Register=(Button)findViewById(R.id.button3);
        username=(EditText)findViewById(R.id.editTextTextPersonName3);
        password=(EditText)findViewById(R.id.editTextTextPersonName4);
        sharedPreferences=getSharedPreferences("USERINFO",0);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Username=username.getText().toString();
                String Password=password.getText().toString();
             String usssernnname= sharedPreferences.getString("username","");
              String paassss= sharedPreferences.getString("Password","");
              if (Username.equals(usssernnname)&& Password.equals(paassss)){
                  Log.d("Sharepreference","if loop");
                  Toast.makeText(Shareprefernceexample.this, "new activity", Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(Shareprefernceexample.this,HomeActivity.class);
                    startActivity(intent);

              } else{
                  Toast.makeText(Shareprefernceexample.this, "error", Toast.LENGTH_SHORT).show();
              }

            }
        });
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Shareprefernceexample.this,Register.class );
                startActivity(intent);
            }
        });



    }
}
