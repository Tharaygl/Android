package com.felight.toastactivity;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.app.Notification;


public class NotificationActivity extends AppCompatActivity {

    private static final int NOTIFY_ME_ID=1337;
    private int count=0;
    private NotificationManager notifyMgr=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        notifyMgr=(NotificationManager)getSystemService(NOTIFICATION_SERVICE);
    }

    public void triggerNotification(View v) {
        Notification notifyObj = new Notification(R.drawable.telephone, "New Message", System.currentTimeMillis());
        PendingIntent i=PendingIntent.getActivity(this, 0,
                new Intent(this, NotifyActivity.class),
                0);
        //notifyObj.setLatestEventInfo(this, "Notification Created",
                //"Click here to see the message", i);
        notifyObj.number=++count;
        notifyObj.defaults |= Notification.DEFAULT_VIBRATE;
        notifyObj.defaults |= Notification.DEFAULT_SOUND;
        notifyObj.flags|=Notification.FLAG_AUTO_CANCEL;
        notifyMgr.notify(NOTIFY_ME_ID, notifyObj);
    }

    public void clearNotification(View v)
    {
        notifyMgr.cancel(NOTIFY_ME_ID);
    }
}


