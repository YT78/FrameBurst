package com.example.frameburst;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.frameburst.acr.acrABAActivity;
import com.example.frameburst.acr.acrAnjiActivity;
import com.example.frameburst.acr.acrAxlActivity;
import com.example.frameburst.acr.acrBaikenActivity;
import com.example.frameburst.acr.acrBridgetActivity;
import com.example.frameburst.acr.acrChippActivity;
import com.example.frameburst.acr.acrDizzyActivity;
import com.example.frameburst.acr.acrEddieActivity;
import com.example.frameburst.acr.acrFaustActivity;
import com.example.frameburst.acr.acrINoActivity;
import com.example.frameburst.acr.acrJamActivity;
import com.example.frameburst.acr.acrJohnnyActivity;
import com.example.frameburst.acr.acrJusticeActivity;
import com.example.frameburst.acr.acrKliffActivity;
import com.example.frameburst.acr.acrKyActivity;
import com.example.frameburst.acr.acrMayActivity;
import com.example.frameburst.acr.acrMilliaActivity;
import com.example.frameburst.acr.acrOrderSolActivity;
import com.example.frameburst.acr.acrPotemkinActivity;
import com.example.frameburst.acr.acrRoboKyActivity;
import com.example.frameburst.acr.acrSlayerActivity;
import com.example.frameburst.acr.acrSolActivity;
import com.example.frameburst.acr.acrTestamentActivity;
import com.example.frameburst.acr.acrVenomActivity;
import com.example.frameburst.acr.acrZappaActivity;
import com.example.frameburst.xrd.Rev2AxlActivity;
import com.example.frameburst.xrd.Rev2BaikenActivity;
import com.example.frameburst.xrd.Rev2ChippActivity;
import com.example.frameburst.xrd.Rev2DizzyActivity;
import com.example.frameburst.xrd.Rev2FaustActivity;
import com.example.frameburst.xrd.Rev2INoActivity;
import com.example.frameburst.xrd.Rev2JamActivity;
import com.example.frameburst.xrd.Rev2JohnnyActivity;
import com.example.frameburst.xrd.Rev2KyActivity;
import com.example.frameburst.xrd.Rev2MayActivity;
import com.example.frameburst.xrd.Rev2MilliaActivity;
import com.example.frameburst.xrd.Rev2PotemkinActivity;
import com.example.frameburst.xrd.Rev2SlayerActivity;
import com.example.frameburst.xrd.Rev2SolActivity;
import com.example.frameburst.xrd.Rev2VenomActivity;
import com.example.frameburst.xrd.Rev2ZatoActivity;

import androidx.appcompat.app.AppCompatActivity;

public class GuiltygearSeriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acr_characters);

        ImageButton acrSolBtn = findViewById(R.id.SolBtn);
        acrSolBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), Rev2SolActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton acrKyBtn = findViewById(R.id.KyBtn);
        acrKyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), Rev2KyActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton acrMayBtn = findViewById(R.id.MayBtn);
        acrMayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), Rev2MayActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton acrMilliaBtn = findViewById(R.id.MilliaBtn);
        acrMilliaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), Rev2MilliaActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton acrEddieBtn = findViewById(R.id.ZatoBtn);
        acrEddieBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), Rev2ZatoActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton acrPotemkinBtn = findViewById(R.id.PotemkinBtn);
        acrPotemkinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), Rev2PotemkinActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton acrChippBtn = findViewById(R.id.ChippBtn);
        acrChippBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), Rev2ChippActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton acrFaustBtn = findViewById(R.id.FaustBtn);
        acrFaustBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), Rev2FaustActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton acrAxlBtn = findViewById(R.id.AxlBtn);
        acrAxlBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), Rev2AxlActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton acrVenomBtn = findViewById(R.id.VenomBtn);
        acrVenomBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), Rev2VenomActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton acrSlayerBtn = findViewById(R.id.SlayerBtn);
        acrSlayerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), Rev2SlayerActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton acrI_NoBtn = findViewById(R.id.I_NoBtn);
        acrI_NoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), Rev2INoActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton acrRoboKyBtn = findViewById(R.id.RobokyBtn);
        acrRoboKyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), acrRoboKyActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton acrBridgetBtn = findViewById(R.id.BridgetBtn);
        acrBridgetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), acrBridgetActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton acrAnjiBtn = findViewById(R.id.AnjiBtn);
        acrAnjiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), acrAnjiActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton acrZappaBtn = findViewById(R.id.ZappaBtn);
        acrZappaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), acrZappaActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton acrABABtn = findViewById(R.id.ABABtn);
        acrABABtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), acrABAActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton acrJohnnyBtn = findViewById(R.id.JohnnyBtn);
        acrJohnnyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), Rev2JohnnyActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton acrOrderSolBtn = findViewById(R.id.OrderSolBtn);
        acrOrderSolBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), acrOrderSolActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton acrJamBtn = findViewById(R.id.JamBtn);
        acrJamBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), Rev2JamActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton acrTestamentBtn = findViewById(R.id.TestamentBtn);
        acrTestamentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), acrTestamentActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton acrKliffBtn = findViewById(R.id.KliffBtn);
        acrKliffBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), acrKliffActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton acrDizzyBtn = findViewById(R.id.DizzyBtn);
        acrDizzyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), Rev2DizzyActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton acrBaikenBtn = findViewById(R.id.BaikenBtn);
        acrBaikenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), Rev2BaikenActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton acrJusticeBtn = findViewById(R.id.JusticeBtn);
        acrJusticeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), acrJusticeActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton Rev2BedmanBtn = findViewById(R.id.BedmanBtn);
        Rev2BedmanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), com.example.frameburst.xrd.Rev2BedmanActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton Rev2RamlethalBtn = findViewById(R.id.RamlethalBtn);
        Rev2RamlethalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), com.example.frameburst.xrd.Rev2RamlethalActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton Rev2SinBtn = findViewById(R.id.SinBtn);
        Rev2SinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), com.example.frameburst.xrd.Rev2SinActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton Rev2ElpheltBtn = findViewById(R.id.ElpheltBtn);
        Rev2ElpheltBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), com.example.frameburst.xrd.Rev2ElpheltActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton Rev2LeoBtn = findViewById(R.id.LeoBtn);
        Rev2LeoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), com.example.frameburst.xrd.Rev2LeoActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton Rev2JackoBtn = findViewById(R.id.JackoBtn);
        Rev2JackoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), com.example.frameburst.xrd.Rev2JackoActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton Rev2HaeyhyunBtn = findViewById(R.id.HaeyhyunBtn);
        Rev2HaeyhyunBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), com.example.frameburst.xrd.Rev2HaeyhyunActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton Rev2RavenBtn = findViewById(R.id.RavenBtn);
        Rev2RavenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), com.example.frameburst.xrd.Rev2RavenActivity.class);

                startActivity(startIntent);
            }
        });

        ImageButton Rev2AnswerBtn = findViewById(R.id.AnswerBtn);
        Rev2AnswerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), com.example.frameburst.xrd.Rev2AnswerActivity.class);

                startActivity(startIntent);
            }
        });

    }
}
