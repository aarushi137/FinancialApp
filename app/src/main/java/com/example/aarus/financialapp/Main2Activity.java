package com.example.aarus.financialapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Main2Activity extends AppCompatActivity {
    // to delete
    //String[] items = new String[] {"PNC Bank", "Busey Bank", "Marine Bank", "Chase", "Bank Champaign", "U of I Community Credit Union",
            //"First Federal Savings Bank of Champaign-Urbana", "Central Illinois Bank", "Regions Bank"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bank_buttons);

        Button pncButton = (Button) findViewById(R.id.button_pnc);
        pncButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), Main22Activity.class);
                startActivity(startIntent);
            }
        });
        Button buseyButton = (Button) findViewById(R.id.button_busey);
        buseyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), busey_bank.class);
                startActivity(startIntent);
            }
        });
        Button marineButton = (Button) findViewById(R.id.button_marine);
        marineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), marine_bank.class);
                startActivity(startIntent);
            }
        });
        Button chaseButton = (Button) findViewById(R.id.button_chase);
        chaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), chase.class);
                startActivity(startIntent);
            }
        });
        Button champaignButton = (Button) findViewById(R.id.button_chase);
        champaignButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), bank_champaign.class);
                startActivity(startIntent);
            }
        });
        Button firstButton = (Button) findViewById(R.id.button_firstfederal);
        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), first_federal.class);
                startActivity(startIntent);
            }
        });
        Button centralButton = (Button) findViewById(R.id.button_central);
        centralButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), central_illinois_bank.class);
                startActivity(startIntent);
            }
        });
    }
}
