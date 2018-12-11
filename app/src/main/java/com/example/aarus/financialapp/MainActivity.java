package com.example.aarus.financialapp;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private static final int ERROR_DIALOG_REQUEST = 9001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button lookupButton = (Button) findViewById(R.id.lookupBankButton);
        lookupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(startIntent);
            }
        });

        if (isServicesOK()) {
            init();
        }
    }

    private void init(){
        Button locateButton = (Button) findViewById(R.id.locateBanksButton);
        locateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), MapsActivity.class);
                startActivity(startIntent);
            }
        });
    }

    public boolean isServicesOK() {
        Log.d(TAG, "isServicesOK: checking google services version");

        int available = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(MainActivity.this);

        if (available == ConnectionResult.SUCCESS) {
            Log.d(TAG, "isServicesOK: Google Play Services is working");
            return true;
        } else if (GoogleApiAvailability.getInstance().isUserResolvableError(available)) {
            Log.d(TAG, "isServicesOK: a fixable error occurred");
            Dialog dialog = GoogleApiAvailability.getInstance().getErrorDialog(MainActivity.this, available, ERROR_DIALOG_REQUEST);
            dialog.show();
        } else {
            Toast.makeText(this, "Can't make map requests", Toast.LENGTH_SHORT).show();
        }
        return false;
    }

}
