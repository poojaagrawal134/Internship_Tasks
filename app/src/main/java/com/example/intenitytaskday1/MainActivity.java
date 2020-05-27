package com.example.intenitytaskday1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText e;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button)findViewById(R.id.button);
        e=(EditText)findViewById(R.id.editText2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You Clicked Button,  Redirecting to Activity B", Toast.LENGTH_LONG).show();
                String textToPass = e.getText().toString();

                // start the SecondActivity
                Intent intent = new Intent(MainActivity.this, ActivityB.class);
                intent.putExtra(Intent.EXTRA_TEXT, textToPass);
                startActivity(intent);
            }
        });
        Toast.makeText(MainActivity.this, "Activity A created", Toast.LENGTH_LONG).show();
    }
    protected void onStart() {
        super.onStart();

        Toast.makeText(MainActivity.this, "Activity A Started", Toast.LENGTH_LONG).show();
    }
    protected void onResume() {
        super.onResume();
        Toast.makeText(MainActivity.this, "Activity A Resumed", Toast.LENGTH_LONG).show();
    }
    protected void onPause() {
        super.onPause();
        Toast.makeText(MainActivity.this, "Activity A Paused", Toast.LENGTH_LONG).show();

    }
}
