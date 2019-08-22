package com.example.mytipproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bill1(View v){
        //get references to all elements on app screen
        EditText billEditText = (EditText) findViewById(R.id.billEditText);
        TextView totalTextView = (TextView) findViewById(R.id.totalTextView);
        TextView tipTextView = (TextView) findViewById(R.id.tipTextView);

        // get the values from the EditText boxes and convert them to int data types
        double bill = Double.parseDouble(billEditText.getText().toString());

        double tip = bill * 0;
         double total = bill + tip;
        //set text for ans
        tipTextView.setText("Tip: $" + tip);
        totalTextView.setText("Total: $" + total);
    }
    public void bil21(View v){
        //get references to all elements on app screen
        EditText billEditText = (EditText) findViewById(R.id.billEditText);
        TextView totalTextView = (TextView) findViewById(R.id.totalTextView);
        TextView tipTextView = (TextView) findViewById(R.id.tipTextView);

        // get the values from the EditText boxes and convert them to int data types
        double bill = Double.parseDouble(billEditText.getText().toString());

        double tip = bill * .1;
        double total = bill + tip;
        //set text for ans
        tipTextView.setText("Tip: $" + tip);
        totalTextView.setText("Total: $" + total);
    }
    public void bill3(View v){
        //get references to all elements on app screen
        EditText billEditText = (EditText) findViewById(R.id.billEditText);
        TextView totalTextView = (TextView) findViewById(R.id.totalTextView);
        TextView tipTextView = (TextView) findViewById(R.id.tipTextView);

        // get the values from the EditText boxes and convert them to int data types
        double bill = Double.parseDouble(billEditText.getText().toString());

        double tip = bill * .15;
        double total = bill + tip;
        //set text for ans
        tipTextView.setText("Tip: $" + tip);
        totalTextView.setText("Total: $" + total);
    }
    public void bill4(View v){
        //get references to all elements on app screen
        EditText billEditText = (EditText) findViewById(R.id.billEditText);
        TextView totalTextView = (TextView) findViewById(R.id.totalTextView);
        TextView tipTextView = (TextView) findViewById(R.id.tipTextView);

        // get the values from the EditText boxes and convert them to int data types
        double bill = Double.parseDouble(billEditText.getText().toString());

        double tip = bill * .25;
        double total = bill + tip;
        //set text for ans
        tipTextView.setText("Tip: $" + tip);
        totalTextView.setText("Total: $" + total);
    }
    public void bill5(View v){
        //get references to all elements on app screen
        EditText billEditText = (EditText) findViewById(R.id.billEditText);
        TextView totalTextView = (TextView) findViewById(R.id.totalTextView);
        TextView tipTextView = (TextView) findViewById(R.id.tipTextView);

        // get the values from the EditText boxes and convert them to int data types
        double bill = Double.parseDouble(billEditText.getText().toString());

        double tip = bill * .35;
        double total = bill + tip;
        //set text for ans
        tipTextView.setText("Tip: $" + tip);
        totalTextView.setText("Total: $" + total);
    }
}
