package com.example.android.practice24;

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

        Button buttonStart=(Button)findViewById(R.id.btnStartService);
        Button buttonEnd=(Button)findViewById(R.id.btnEndtService);
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,MyService.class);
                intent.putExtra("num", 1111111);
                startService(intent);
            }
        });

        buttonEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,MyService.class);
                stopService(intent);
            }
        });

    }
}
