package com.example.aarus.financialapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class chase extends AppCompatActivity {
    String[] items = new String[] {"Name : Chase Bank", "Certificate Deposit Rate: 0.90%", "Annual Percentage Yield: 0.90%", "ATM Fee: $2.50", "Overdraft Fee: $34 per item", "Minimum Balance: $25",
            "Card Replacement Fee: $5.00"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chase);

        ListView listView = (ListView) findViewById(R.id.chase_list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);
    }
}
