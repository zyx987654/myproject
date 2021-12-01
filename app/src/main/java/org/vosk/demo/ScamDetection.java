package org.vosk.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ScamDetection extends AppCompatActivity {

    // if scam detection result==TRUE, then setup layout

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scam_detection);
        Button endcall = (Button) findViewById(R.id.endcall);
        Button ignoremessage = (Button) findViewById(R.id.ignoremessage);

        endcall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                endcall();
            }
        });
        ignoremessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ignoremessage();
            }
        });

    }

    private void ignoremessage() {
        //ignore alert message
    }

    private void endcall() {
        //end conversation
    }

    private void pattern_evualtion(){
        //evaluate conversation pattern
    }

    private void scam_result(){
        //obtain result from scam detection model
    }
}