package com.example.testing1;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button button=(Button) findViewById(R.id.button7);
        Button button22=(Button) findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG,"Button Clicker");
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }


        });

                button22.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.i(TAG,"Button Clicker");
                        Intent intent = new Intent(MainActivity2.this, MainActivity2.class);
                        startActivity(intent);
                    }


                });
    }
}