package com.example.felix.activity03;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.Menu;

public class Activity03 extends AppCompatActivity {

    private EditText factorOne;
    private EditText factorTwo;
    private TextView symbol;
    private Button calcculate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_03);

        factorOne = (EditText) findViewById(R.id.editText3);
        factorTwo = (EditText) findViewById(R.id.editText4);
        symbol = (TextView) findViewById(R.id.textView2);
        calcculate = (Button) findViewById(R.id.button3);

        calcculate.setOnClickListener(new CalculateListener());

    }

    public boolean onCreateOptionsMenu(Menu menu){
        menu.add (0,1,1,R.string.exit);
        menu.add(0,2,2,R.string.about);
        return super.onCreateOptionsMenu(menu);

    }

    public boolean onOptionsItemSelected (MenuItem item){

        if(item.getItemId() == 1){
            finish();
        }

        return super.onOptionsItemSelected(item);
    }

    class CalculateListener implements View.OnClickListener {

        public void onClick(View v){

            String factorOneStr = factorOne.getText().toString();
            String factorTwoStr = factorTwo.getText().toString();

            Intent intent = new Intent();
            intent.putExtra("one", factorOneStr);
            intent.putExtra("two", factorTwoStr);
            intent.setClass(Activity03.this, ResultActivity.class);

            Activity03.this.startActivity(intent);

        }
    }
}
