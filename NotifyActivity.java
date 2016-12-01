package com.felight.toastactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by hp on 23-10-2016.
 */
public class NotifyActivity extends AppCompatActivity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView txt=new TextView(this);

        txt.setText("You have successfully opened the activity associated with the notification!");
        setContentView(txt);
    }
}
