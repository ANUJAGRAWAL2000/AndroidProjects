package com.example.teamnaugatfirstpro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextInputEditText From,To,Message,Heading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=(Button) findViewById(R.id.button);
    }

    public void Display(View view)
    {
        From=(TextInputEditText) findViewById(R.id.From);
        String str1=From.getText().toString().trim();
        To=(TextInputEditText) findViewById(R.id.To);
        String str2=To.getText().toString().trim();
        Heading=(TextInputEditText) findViewById(R.id.Heading);
        String str3=Heading.getText().toString().trim();
        Message=(TextInputEditText) findViewById(R.id.Message);
        String str4=Message.getText().toString().trim();

//        Toast.makeText(this,Name,Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(MainActivity.this,Card.class);
        intent.putExtra("From",str1);
        intent.putExtra("To",str2);
        intent.putExtra("Message",str3);
        intent.putExtra("Heading",str4);
        startActivity(intent);
    }

}
