package com.example.aarus.financialapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class bank_champaign extends AppCompatActivity {
    String[] items = new String[] {"Name : Bank Champaign", "Certificate Deposit Rate: 0.05%", "Annual Percentage Yield: 0.05%", "ATM Fee: N/A", "Overdraft Fee: N/A", "Minimum Balance: $300",
            "Card Replacement Fee: N/A"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_champaign);

        ListView listView = (ListView) findViewById(R.id.bankchampaign_list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);
    }
}
