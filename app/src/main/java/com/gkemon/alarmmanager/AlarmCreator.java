package com.gkemon.alarmmanager;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

public
class AlarmCreator {
    public
    AlarmCreator() {

    }
    public static void createRepeatedAlarm(Activity activity,int requestCode,Class<?> targetComponent,long startTime,long interval){

       AlarmManager alarmManager = (AlarmManager) activity.getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent(activity, targetComponent);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(activity, requestCode, intent, PendingIntent.FLAG_UPDATE_CURRENT);

        long alarmStartTime = startTime;
        long alarmExecuteInterval =interval;

        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, alarmStartTime, alarmExecuteInterval, pendingIntent);



    }

    public static void cancleAlarm(Context context,int requestCode){
        AlarmManager alarmManager;
        Intent intent = new Intent(context, AlarmReceiver.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(context, requestCode, intent, 0);
        alarmManager=(AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
        alarmManager.cancel(pendingIntent);

    }

}
