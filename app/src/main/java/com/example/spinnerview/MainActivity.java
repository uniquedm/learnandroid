package com.example.spinnerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    String dropDownItems[]={"Descriptive", "Prescriptive", "Predictive"};
    Spinner x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        x=(Spinner) findViewById(R.id.spinner);
        ArrayAdapter a = new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,dropDownItems);
        x.setAdapter(a);
    }
}
