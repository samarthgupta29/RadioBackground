package com.example.samarth.radiobackground;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button)findViewById(R.id.button2);


        final LinearLayout ll=(LinearLayout) findViewById(R.id.linearLayout);


        final RadioButton radio_red = (RadioButton) findViewById(R.id.radio_red);
        final RadioButton radio_yellow = (RadioButton) findViewById(R.id.radio_yellow);
        final RadioButton radio_blue = (RadioButton) findViewById(R.id.radio_blue);
        final RadioButton radio_green = (RadioButton) findViewById(R.id.radio_green);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ll.setBackgroundColor(Color.WHITE);
            }
        });
        radio_red.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                ll.setBackgroundColor(Color.RED);

            }
        });

        radio_yellow.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                ll.setBackgroundColor(Color.YELLOW);

            }
        });
        radio_blue.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                ll.setBackgroundColor(Color.BLUE);

            }
        });
        radio_green.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                ll.setBackgroundColor(Color.GREEN);

            }
        });
    }
}
