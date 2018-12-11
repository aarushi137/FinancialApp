package com.example.aarus.financialapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class busey_bank extends AppCompatActivity {
    String[] items = new String[] {"Name : Busey Bank", "Certificate Deposit Rate: 0.30%", "Annual Percentage Yield: 0.30%", "ATM Fee: N/A", "Overdraft Fee: $35 per item", "Minimum Balance: $100",
            "Card Replacement Fee: $5.00"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busey_bank);

        ListView listView = (ListView) findViewById(R.id.busey_list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);
    }

}
