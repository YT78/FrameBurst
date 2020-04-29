package com.example.frameburst;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.frameburst.acr.acrSolActivity;

import androidx.appcompat.app.AppCompatActivity;

public class acrCharactersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acr_characters);

        ImageButton acrSolBtn = findViewById(R.id.acrSolBtn);
        acrSolBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), acrSolActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton acrKyBtn = findViewById(R.id.acrKyBtn);
        acrKyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), acrKyActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton acrMayBtn = findViewById(R.id.acrmayBtn);
        acrMayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), acrMayActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton acrMilliaBtn = findViewById(R.id.acrmilliaBtn);
        acrMilliaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), acrMilliaActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton acrEddieBtn = findViewById(R.id.acreddieBtn);
        acrEddieBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), acrEddieActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton acrPotemkinBtn = findViewById(R.id.acrpotemkinBtn);
        acrPotemkinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), acrPotemkinActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton acrChippBtn = findViewById(R.id.acrChippBtn);
        acrChippBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), acrChippActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton acrFaustBtn = findViewById(R.id.acrFaustBtn);
        acrFaustBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), acrFaustActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton acrAxlBtn = findViewById(R.id.acrAxlBtn);
        acrAxlBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), acrAxlActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton acrVenomBtn = findViewById(R.id.acrVenomBtn);
        acrVenomBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), acrVenomActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton acrSlayerBtn = findViewById(R.id.acrSlayerBtn);
        acrSlayerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), acrSlayerActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton acrI_NoBtn = findViewById(R.id.acrI_NoBtn);
        acrI_NoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), acrINoActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton acrRoboKyBtn = findViewById(R.id.acrRoboKyBtn);
        acrRoboKyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), acrRoboKyActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton acrBridgetBtn = findViewById(R.id.acrBridgetBtn);
        acrBridgetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), acrBridgetActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton acrAnjiBtn = findViewById(R.id.acrAnjiBtn);
        acrAnjiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), acrAnjiActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton acrZappaBtn = findViewById(R.id.acrZappaBtn);
        acrZappaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), acrZappaActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton acrABABtn = findViewById(R.id.acrABABtn);
        acrABABtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), acrABAActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton acrJohnnyBtn = findViewById(R.id.acrJohnnyBtn);
        acrJohnnyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), acrJohnnyActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton acrOrderSolBtn = findViewById(R.id.acrOrderSolBtn);
        acrOrderSolBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), acrOrderSolActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton acrJamBtn = findViewById(R.id.acrJamBtn);
        acrJamBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), acrJamActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton acrTestamentBtn = findViewById(R.id.acrTestamentBtn);
        acrTestamentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), acrTestamentActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton acrKliffBtn = findViewById(R.id.acrKliffBtn);
        acrKliffBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), acrKliffActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton acrDizzyBtn = findViewById(R.id.acrDizzyBtn);
        acrDizzyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), acrDizzyActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton acrBaikenBtn = findViewById(R.id.acrBaikenBtn);
        acrBaikenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), acrBaikenActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton acrJusticeBtn = findViewById(R.id.acrJusticeBtn);
        acrJusticeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), acrJusticeActivity.class);

                startActivity(startIntent);
            }
        });
    }
}
