package sg.edu.rp.c346.id22012205.demotimeanddateapp;

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
Button BtnDisplayTime;
TextView tvDisplay;

Button btnReset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);        setContentView(R.layout.activity_main);
        dp=findViewById(R.id.datePicker);
        tp=findViewById(R.id.timePicker);
        btnDisplayDate=findViewById(R.id.buttonDisplayDate);
        BtnDisplayTime=findViewById(R.id.buttonDisplayTime);
        tvDisplay=findViewById(R.id.textViewDisplay);
        btnReset=findViewById(R.id.rbutton);

        BtnDisplayTime.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(tp.getMinute()<10) {
                    tvDisplay.setHint("Time is " + tp.getMinute() + "." + "0"+tp.getMinute());
                }else{
                    tvDisplay.setHint("Time is " + tp.getHour() + "." + tp.getMinute());
                }
            }
        });
        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvDisplay.setHint("Date is "+dp.getDayOfMonth()+"/"+(dp.getMonth()+1)+"/"+dp.getYear());
            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            tp.setHour(0);
            tp.setMinute(0);
            int day=01;
            int month=0;
            int year=2020;
            dp.updateDate(year,month,day);
            }
        });



    }}