package com.example.android.takehomeassignment06_katieb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class YourReceipt extends AppCompatActivity {

    private TextView receipt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_receipt);

        receipt = (TextView) findViewById(R.id.show_receipt);

        Intent intent = getIntent();
        String message = intent.getStringExtra(Key.STRING);
        receipt.setText(message);

    }
}
