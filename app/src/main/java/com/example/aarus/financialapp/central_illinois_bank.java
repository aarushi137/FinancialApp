package com.example.aarus.financialapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class central_illinois_bank extends AppCompatActivity {

    String[] items = new String[] {"Name : Central Illinois Bank", "Certificate Deposit Rate: 0.15%", "Annual Percentage Yield: 0.15%", "ATM Fee: N/A", "Overdraft Fee: N/A", "Minimum Balance: $100",
            "Card Replacement Fee: N/A"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_central_illinois_bank);

        ListView listView = (ListView) findViewById(R.id.centralbank_list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);
    }
}
