package org.vosk.demo;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.EnableService);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //EnableService();
                //DisableService();
            }
        });
    }

    private void EnableService() {
        //activate the application
    }

    private void DisableService(){
        //deactivate the application
    }

}