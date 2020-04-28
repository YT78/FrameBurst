package com.example.frameburst;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class GuiltygearSeriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guiltygear_series);

        ImageButton Rev2CharactersBtn = findViewById(R.id.rev2Btn);
        Rev2CharactersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), Rev2CharactersActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton ACRCharactersBtn = findViewById(R.id.acrBtn);
        ACRCharactersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), acrCharactersActivity.class);

                startActivity(startIntent);
            }
        });
    }
}
