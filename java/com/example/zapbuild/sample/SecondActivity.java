package com.example.zapbuild.sample;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;


public class SecondActivity extends Activity {
    TextView txt_fname,txt_lname,txt_company,txt_designation;

    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        txt_fname=(TextView)findViewById(R.id.text_fname);
        txt_lname=(TextView)findViewById(R.id.text_lname);
        txt_company=(TextView)findViewById(R.id.text_companyname);
        txt_designation=(TextView)findViewById(R.id.text_designation);
        sharedPreferences = getSharedPreferences("mydata", Context.MODE_PRIVATE);
        String first_name  = sharedPreferences.getString("fname","");
        String last_name = sharedPreferences.getString("lname","");
        String company_name = sharedPreferences.getString("cname","");
        String designation = sharedPreferences.getString("designation","");
        txt_fname.setText(first_name);
        txt_lname.setText(last_name);
        txt_company.setText(company_name);
        txt_designation.setText(designation);



    }
}
