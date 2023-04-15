package com.example.mimex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class signActivity extends AppCompatActivity {

    Toolbar toolbarsign;
    CardView whatUrNameCard,whereLiveCard,howRUCard,howOldCard,howCanIHelpCard,thankYouCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);
        // toolbar
        toolbarsign = findViewById(R.id.toolbarSign);
        setSupportActionBar(toolbarsign);

        whatUrNameCard = findViewById(R.id.WhatsUrName);
        whereLiveCard = findViewById(R.id.WhereULive);
        howRUCard = findViewById(R.id.HowRU);
        howOldCard = findViewById(R.id.HowOldRU);
        howCanIHelpCard = findViewById(R.id.HowCanIHelpU);
        thankYouCard = findViewById(R.id.ThankingYou);


        whatUrNameCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/watch?v=7_IfOa0NZoA&ab_channel=ASLLOVE");
            }
        });

        whereLiveCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/watch?v=PuMaXsWhR-E&ab_channel=eHowEducation");
            }
        });


        howRUCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/watch?v=14L639SkuXE&ab_channel=MUSLSClub");
            }
        });

        howOldCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/watch?v=O2rk8olIBT4&ab_channel=eHowEducation");
            }
        });

        howCanIHelpCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/watch?v=_tQWsgX-ljU&ab_channel=SignTimeWithEmilie");
            }
        });

        thankYouCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.youtube.com/watch?v=EPlhDhll9mw&ab_channel=GrabOfficial");
            }
        });

    }

    private void gotoUrl(String s) {

        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}