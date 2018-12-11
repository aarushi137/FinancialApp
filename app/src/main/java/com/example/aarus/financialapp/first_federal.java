package com.example.aarus.financialapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class first_federal extends AppCompatActivity {

    String[] items = new String[] {"Name : First Federal Savings Bank of Champaign- Urbana", "Certificate Deposit Rate: 0.20%", "Annual Percentage Yield: 0.20%", "ATM Fee: $3", "Overdraft Fee: $30", "Minimum Balance: $500",
            "Card Replacement Fee: N/A"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_federal);

        ListView listView = (ListView) findViewById(R.id.firstfederal_list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);
    }
}
