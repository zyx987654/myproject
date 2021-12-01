package org.vosk.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CallerDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caller_detail);
        Button report = (Button) findViewById(R.id.report);
        Button back = (Button) findViewById(R.id.back);

        report.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reportcaller();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back();
            }
        });
    }

    private void reportcaller() {
        //report caller
    }

    private void back() {
        //go back to home page
    }
    private void getcallnumber(){
        //obtain the caller's number
    }
    private void setcallernumber(){
        //display caller number on layout
    }
    private void getcallerdescription(){
        //obtain caller description
    }
    private void setcallerdescription(){
        //display caller description on layout
    }
}