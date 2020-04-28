package com.example.frameburst;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton BlazblueSeriesBtn = findViewById(R.id.BlazblueSeriesBtn);
        BlazblueSeriesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), bbcfCharactersActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton TagBtn = findViewById(R.id.TagBtn);
        TagBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), tagCharactersActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton GuiltyGearSeriesBtn = findViewById(R.id.GuiltyGearSeriesBtn);
        GuiltyGearSeriesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), GuiltygearSeriesActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton UNIELSeriesBtn = findViewById(R.id.UNIELSeriesBtn);
        UNIELSeriesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), uniclrCharactersActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton P4ASeriesBtn = findViewById(R.id.P4ASeriesBtn);
        P4ASeriesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), p4auCharactersActivity.class);

                startActivity(startIntent);
            }
        });


    }

}
