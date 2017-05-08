package com.zizi.l28;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        TextView textView = (TextView) findViewById(R.id.textView);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        textView.setText(name);
    }
}
