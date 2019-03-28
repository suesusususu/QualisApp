package com.example.qualisapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button recPac = (Button) findViewById(R.id.recPac);
        recPac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), DropComfirmation.class);
                startActivity(startIntent);
            }
        });

        Button schDlvr = (Button) findViewById(R.id.schDlvr);
        schDlvr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), OrderDelivery.class);
                startActivity(startIntent);
            }
        });
    }
}