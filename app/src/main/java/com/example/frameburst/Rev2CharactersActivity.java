package com.example.frameburst;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Rev2CharactersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rev2_characters);

        ImageButton Rev2SolBtn = findViewById(R.id.rev2SolBtn);
        Rev2SolBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), Rev2SolActivity.class);

                startActivity(startIntent);
            }
        });
    }
}
