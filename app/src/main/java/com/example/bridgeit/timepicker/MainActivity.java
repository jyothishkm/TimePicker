package com.example.bridgeit.timepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    private TimePicker mTimePicker;
    private TextView mCurrentTime;
    private Button mChangeTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mChangeTime = (Button)findViewById(R.id.button1);
        mCurrentTime = (TextView)findViewById(R.id.textView1);
        mTimePicker = (TimePicker)findViewById(R.id.timePicker1);

       //setting 24 hours formate
        mTimePicker.setIs24HourView(true);
        mCurrentTime.setText(getTime());

        //change the time
        mChangeTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCurrentTime.setText(getTime());
            }
        });
    }

    //returns the time
    public String getTime() {
        String currentTime="Current Time: "+mTimePicker.getCurrentHour()+":"+mTimePicker.getCurrentMinute();
        return currentTime;
    }
}
