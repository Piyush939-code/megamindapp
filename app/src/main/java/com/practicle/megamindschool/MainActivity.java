package com.practicle.megamindschool;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    CardView maincard;
    Button mainbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        maincard = findViewById(R.id.maincard);
       mainbtn = findViewById(R.id.mainbtn);

        maincard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                maincard.setCardBackgroundColor(R.color.black);
            }
        });

        mainbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });
    }
}