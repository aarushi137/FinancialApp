package com.example.aarus.financialapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main22Activity extends AppCompatActivity {
    String[] items = new String[] {"Name : PNC Financial Services", "Certificate Deposit Rate: 0.15%", "Annual Percentage Yield: 0.15%", "ATM Fee: $3", "Overdraft Fee: $10 per item", "Minimum Balance: $25",
            "Card Replacement Fee: $7.50"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pnc);

        ListView listView = (ListView) findViewById(R.id.pnc_details);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);
    }


}
