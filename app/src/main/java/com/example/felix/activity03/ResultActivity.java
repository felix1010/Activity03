package com.example.felix.activity03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ResultActivity extends AppCompatActivity {

    private TextView resultView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        resultView = (TextView) findViewById(R.id.textView);

        Intent intent = getIntent();
        String factorOneStr = intent.getStringExtra("one");
        String factorTwoStr = intent.getStringExtra("two");

        int factorOneInt = Integer.parseInt(factorOneStr);
        int factorTwoInt = Integer.parseInt(factorTwoStr);

        int result = factorOneInt * factorTwoInt;
        resultView.setText(result + "");


    }
}
