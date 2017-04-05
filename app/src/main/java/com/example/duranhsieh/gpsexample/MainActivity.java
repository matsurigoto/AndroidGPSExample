package com.example.duranhsieh.gpsexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textStatus;
    private Button buttonGPS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textStatus = (TextView) findViewById(R.id.gps_display);
        buttonGPS = (Button) findViewById(R.id.gps_click);

        buttonGPS.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                textStatus.setText("clicked!");
            }
        });
    }
}
