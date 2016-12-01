package com.felight.toastactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by hp on 18-10-2016.
 */

public class NewIntent1 extends AppCompatActivity {

    TextView tvMessage1;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newintent1_layout);

        //1.get passed intent
        Intent intent=getIntent();

        //2.get message value from intent
        String message1=intent.getStringExtra("message");

        //3.show message on textView
        ((TextView) findViewById(R.id.tvMessage1)).setText(message1);

        //4.get bundle from intent
        Bundle bundle= intent.getExtras();

        //5.get status value from bundle
        String status=bundle.getString("status");

        //6.show status on toast
        Toast toast=Toast.makeText(this,status,Toast.LENGTH_SHORT);
        toast.show();
    }
}
