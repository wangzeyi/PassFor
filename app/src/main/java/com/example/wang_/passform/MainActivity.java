package com.example.wang_.passform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button_send;
    EditText id_txt, age_txt, name_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        id_txt = findViewById(R.id.Id_Txt);
        age_txt = findViewById(R.id.Age_Txt);
        name_txt = findViewById(R.id.Name_Txt);
        button_send = findViewById(R.id.Button_Send);

        button_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String id_string = id_txt.getText().toString();
                int id = Integer.parseInt(id_string);
                String age_string = age_txt.getText().toString();
                int age = Integer.parseInt(age_string);
                String name = name_txt.getText().toString();

                MyForm mf = new MyForm(id, age, name);

                Intent i = new Intent(MainActivity.this, SecActivity.class);
                i.putExtra("MyKey", mf);
                startActivity(i);

            }
        });


    }




}
