package com.example.teamnaugatfirstpro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Card extends AppCompatActivity {

    TextView From,To,Heading,Message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);


        From = (TextView)findViewById(R.id.From);
        To = (TextView)findViewById(R.id.To);
        Message = (TextView)findViewById(R.id.Message);
        Heading = (TextView)findViewById(R.id.Heading);
        // create the get Intent object
        Intent intent = getIntent();

        // receive the value by getStringExtra() method
        // and key must be same which is send by first activity
        String str = "From "+intent.getStringExtra("From");
        String str1 = "To "+intent.getStringExtra("To");
        String str2 = intent.getStringExtra("Message");
        String str3 = intent.getStringExtra("Heading");
        // display the string into textView
        From.setText(str);
        To.setText(str1);
        Heading.setText(str2);
        Message.setText(str3);
    }



}
