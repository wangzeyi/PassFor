package com.example.wang_.passform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecActivity extends AppCompatActivity {

    TextView display_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);

        display_tv = findViewById(R.id.Display_Tv);

        MyForm mf = getIntent().getExtras().getParcelable("MyKey");

        int id = mf.id;
        int age = mf.age;
        String nm = mf.name;

        display_tv.setText("" + id + " " + age + " " + nm);


    }
}
