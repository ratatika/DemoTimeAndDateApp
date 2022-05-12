package sg.edu.rp.c346.id20006092.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate;
    Button btnDisplayTime;
    Button btnReset;
    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnDisplayDate = findViewById(R.id.buttonDisplayDate);
        btnDisplayTime = findViewById(R.id.buttonDisplayTime);
        tvDisplay = findViewById(R.id.textViewDisplay);
        btnReset = findViewById(R.id.buttonReset);

        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String message = "Time is ";
                int hour = tp.getCurrentHour();
                int minute = tp.getCurrentMinute();

                if (minute < 10) {

                    message = message + hour + ":0" + minute;

                } else {

                    message = message + hour + ":" + minute;

                }

                tvDisplay.setText(message);

            }
        });

        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int day = dp.getMonth();
                int month = dp.getDayOfMonth();
                int year = dp.getYear();

                String message = "Date is " + day + "/" + month + "/" + year;
                tvDisplay.setText(message);

            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int day = dp.getMonth();
                int month = dp.getDayOfMonth();
                int year = dp.getYear();

                String message = "Date is " + day + "/" + month + "/" + year;
                tvDisplay.setText(message);

            }
        });

    }



}