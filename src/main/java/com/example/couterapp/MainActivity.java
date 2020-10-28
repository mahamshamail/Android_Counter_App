package com.example.couterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myfirstapplication.R;

public class MainActivity extends AppCompatActivity {
    String TAG = "Counter_App";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "App is in onCreate function");
    }

    @SuppressLint({"WrongConstant", "ShowToast"})
    public void incrementButtonPressed(View view) {
        Context context = getApplicationContext();
        TextView textView = findViewById(R.id.textView2);
        int incrementCounter = Integer.parseInt(textView.getText().toString());
        incrementCounter++;
        Log.d(TAG,"Incrementing by 1, New value is: "+incrementCounter);
        textView.setText(String.valueOf(incrementCounter));
        int duration = Toast.LENGTH_SHORT;;
        String text = "Incrementing By One (1++)";
        Toast toast =Toast.makeText(context,text,duration);
        toast.show();
    }

    @SuppressLint({"WrongConstant", "ShowToast"})
    public void decrementButtonPressed(View view){
        TextView textView = findViewById(R.id.textView2);
        int decrementCounter = Integer.parseInt(textView.getText().toString());
        decrementCounter--;
        Log.d(TAG,"Decrementing by 1, New value is: "+decrementCounter);
        textView.setText(String.valueOf(decrementCounter));
        int duration = Toast.LENGTH_LONG;
        String text = "Decrementing By One (1--)";
        Toast toast =Toast.makeText(this,text,duration);
        toast.show();
    }
}