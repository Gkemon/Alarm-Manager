package com.gkemon.alarmmanager;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public
class MainActivity extends AppCompatActivity {
    AlarmManager alarmManager;
    private PendingIntent pendingIntent = null;
    @Override
    protected
    void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.btn_start_repeat_alarm).setOnClickListener(new View.OnClickListener() {
            @Override
            public
            void onClick(View view) {


                AlarmCreator.createRepeatedAlarm(MainActivity.this,0,AlarmReceiver.class,System.currentTimeMillis(),60000);


//                alarmManager = (AlarmManager) getApplicationContext().getSystemService(Context.ALARM_SERVICE);
//                Intent intent = new Intent(getApplicationContext(), AlarmReceiver.class);
//
//
//                pendingIntent = PendingIntent.getBroadcast(getApplicationContext(), 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
//
//                long alarmStartTime = System.currentTimeMillis() + (1000 * 60 );
//                long alarmExecuteInterval = 60 * 1000;
//
//                alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, alarmStartTime, alarmExecuteInterval, pendingIntent);

            }
        });

        findViewById(R.id.btn_cancle_repeat_alarm).setOnClickListener(new View.OnClickListener() {
            @Override
            public
            void onClick(View view) {


//                AlarmManager alarmManager;
//                Intent intent = new Intent(getApplicationContext(), AlarmReceiver.class);
//                pendingIntent = PendingIntent.getBroadcast(getApplicationContext(), 0, intent, 0);
//
//
//                alarmManager=(AlarmManager) getApplicationContext().getSystemService(Context.ALARM_SERVICE);
//                alarmManager.cancel(pendingIntent);


                AlarmCreator.cancleAlarm(MainActivity.this,0);

            }
        });


    }


}
