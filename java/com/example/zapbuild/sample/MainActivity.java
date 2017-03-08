package com.example.zapbuild.sample;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText first_name,last_name,company_name,designation;
    Button registered;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first_name=(EditText)findViewById(R.id.input_fname);
        last_name=(EditText)findViewById(R.id.input_lname);
        company_name=(EditText)findViewById(R.id.input_company);
        designation=(EditText)findViewById(R.id.input_designation);
        registered=(Button)findViewById(R.id.btn_registered);

        SharedPreferences sharedPreferences = getSharedPreferences("mydata", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPreferences.edit();
        registered.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                editor.putString("fname",first_name.getText().toString());
                editor.putString("lname",last_name.getText().toString());
                editor.putString("cname",company_name.getText().toString());
                editor.putString("designation",designation.getText().toString());
                editor.apply();

                Toast.makeText(MainActivity.this, "Save data successfully", Toast.LENGTH_SHORT).show();
                Intent i=new Intent(getApplicationContext(),SecondActivity.class);
                startActivity(i);
            }
        });


    }
}
