package com.example.mytipproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.InputMismatchException;

public class MainActivity extends AppCompatActivity {
    DecimalFormat df = new DecimalFormat( "###.##");
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

        double bill = 0.0;
        try{
            bill = Double.parseDouble(billEditText.getText().toString());
        }
        catch(Exception e)
        {
            Context context = getApplicationContext();
            CharSequence text = "Please enter a bill value!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }

        double tip = bill * 0;
        double total = bill + tip;
        //set text for ans
        tipTextView.setText("Tip: $" + df.format(tip));
        totalTextView.setText("Total: $" + df.format(total));
    }
    public void bill2(View v){
        //get references to all elements on app screen
        EditText billEditText = (EditText) findViewById(R.id.billEditText);
        TextView totalTextView = (TextView) findViewById(R.id.totalTextView);
        TextView tipTextView = (TextView) findViewById(R.id.tipTextView);

        double bill = 0.0;
        try{
            bill = Double.parseDouble(billEditText.getText().toString());
        }
        catch(Exception e)
        {
            Context context = getApplicationContext();
            CharSequence text = "Please enter a bill value!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }

        double tip = bill * .1;
        double total = bill + tip;
        //set text for ans
        tipTextView.setText("Tip: $" + df.format(tip));
        totalTextView.setText( "Total: $" + df.format(total));
    }
    public void bill3(View v){
        //get references to all elements on app screen
        EditText billEditText = (EditText) findViewById(R.id.billEditText);
        TextView totalTextView = (TextView) findViewById(R.id.totalTextView);
        TextView tipTextView = (TextView) findViewById(R.id.tipTextView);

        double bill = 0.0;
        try{
            bill = Double.parseDouble(billEditText.getText().toString());
        }
        catch(Exception e)
        {
            Context context = getApplicationContext();
            CharSequence text = "Please enter a bill value!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }

        double tip = bill * .15;
        double total = bill + tip;
        //set text for ans
        tipTextView.setText("Tip: $" + df.format(tip));
        totalTextView.setText("Total: $" + df.format(total));
    }
    public void bill4(View v){
        //get references to all elements on app screen
        EditText billEditText = (EditText) findViewById(R.id.billEditText);
        TextView totalTextView = (TextView) findViewById(R.id.totalTextView);
        TextView tipTextView = (TextView) findViewById(R.id.tipTextView);
        double bill = 0.0;
        try{
            bill = Double.parseDouble(billEditText.getText().toString());
        }
        catch(Exception e)
        {
            Context context = getApplicationContext();
            CharSequence text = "Please enter a bill value!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }

        double tip = bill * .25;
        double total = bill + tip;
        //set text for ans
        tipTextView.setText("Tip: $" + df.format(tip));
        totalTextView.setText("Total: $" + df.format(total));
    }
    public void bill5(View v){
        //get references to all elements on app screen
        EditText billEditText = (EditText) findViewById(R.id.billEditText);
        TextView totalTextView = (TextView) findViewById(R.id.totalTextView);
        TextView tipTextView = (TextView) findViewById(R.id.tipTextView);
        double bill = 0.0;
        try{
             bill = Double.parseDouble(billEditText.getText().toString());
        }
        catch(Exception e)
        {
            Context context = getApplicationContext();
            CharSequence text = "Please enter a bill value!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
        // get the values from the EditText boxes and convert them to int data types


        double tip = bill * .35;
        double total = bill + tip;
        //set text for ans
        tipTextView.setText("Tip: $" + df.format(tip));
        totalTextView.setText("Total: $" + df.format(total));
    }

}
