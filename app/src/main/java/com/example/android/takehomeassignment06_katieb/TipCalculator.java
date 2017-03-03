package com.example.android.takehomeassignment06_katieb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class TipCalculator extends AppCompatActivity {

    private EditText amount;
    private EditText tax;
    private EditText tip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_calculator);

        amount = (EditText) findViewById(R.id.amount);
        tax = (EditText) findViewById(R.id.tax);
        tip = (EditText) findViewById(R.id.tip);
    }

    public void submit(View view) {
        double myAmount = Double.parseDouble(amount.getText().toString());
        double myTax = Double.parseDouble(tax.getText().toString());
        double myTip = Double.parseDouble(tip.getText().toString());

        double totalTax = myAmount * myTax;
        double totalTip = myAmount * myTip;

        String receiptMessage = "Total: " + myAmount + "\n" +
                "Sales Tax: " + (totalTax) + "\n" +
                "Tip: " + (totalTip) + "\n" +
                "Grand total: " + (myAmount + totalTax + totalTip);

        Intent intent = new Intent(this, YourReceipt.class);
        intent.putExtra(Key.STRING, receiptMessage);
        startActivity(intent);


    }
}
