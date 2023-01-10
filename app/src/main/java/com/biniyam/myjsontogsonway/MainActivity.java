package com.biniyam.myjsontogsonway;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();
       /*
        Employee employee = new Employee( "Johan", 30 , "johan@gmail.com");
        // i am turning this Johan employee into a Json format
        String json = gson.toJson(employee);
*/
        String json = "{\"first_name\": \"Johan\",\"age\":30,\"mail\": \"johan@gmail.com\"}";
        Employee employee = gson.fromJson(json,Employee.class);

    }
}