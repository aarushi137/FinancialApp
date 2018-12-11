package com.example.aarus.financialapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class marine_bank extends AppCompatActivity {

    String[] items = new String[] {"Name : Marine Bank", "Certificate Deposit Rate: 0.20%", "Annual Percentage Yield: 0.20%", "ATM Fee: free within AlphaLink Alliance", "Overdraft Fee: $30 per item", "Minimum Balance: $100",
            "Card Replacement Fee: N/A"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marine_bank);

        ListView listView = (ListView) findViewById(R.id.marinebank_list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);
    }
}
