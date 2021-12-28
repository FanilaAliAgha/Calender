package com.example.calender;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.CalendarView;

public class MainActivity extends AppCompatActivity {


    private  static final String TAG = "CalendarActivity";
    private CalendarView mCalendarView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mCalendarView = (CalendarView) findViewById(R.id.mCalendarView);
        mCalendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView CalendarView, int year, int month, int dayOfMonth) {
                String date = year + "/" + month + "/"+ dayOfMonth ;
                Log.d(TAG, "onSelectedDayChange: yyyy/mm/dd:" + date);

            }
        });

    }
}