package com.felight.toastactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

/**
 * Created by hp on 18-10-2016.
 */

public class ActivityNavigator extends AppCompatActivity implements OnClickListener{

    Button btnMain;
    Button btnMassage;
    Button btnSms;
    Button btnGoogleNews;
    Button btnFelightNews;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitynavigator_layout);

        btnMain = (Button) findViewById(R.id.btnMain);
        btnMain.setOnClickListener( this);

        btnMassage = (Button) findViewById(R.id.btnMassage);
        btnMassage.setOnClickListener( this);

        btnSms = (Button) findViewById(R.id.btnSms);
        btnSms.setOnClickListener( this);

        btnGoogleNews = (Button) findViewById(R.id.btnGoogleNews);
        btnGoogleNews.setOnClickListener( this);

        btnFelightNews = (Button) findViewById(R.id.btnFelightNews);
        btnFelightNews.setOnClickListener( this);

    }
    @Override
    public  void onClick(View view){

        switch(view.getId()) {
            case R.id.btnMassage:
                Intent intent = new Intent(ActivityNavigator.this, MassageActivity.class);
                startActivity(intent);
                break;

            case R.id.btnMain:
                Intent intent1 = new Intent(ActivityNavigator.this, MainActivity.class);
                startActivity(intent1);
                break;

            case R.id.btnSms:
                Intent intent2 = new Intent(ActivityNavigator.this, SmsActivity.class);
                startActivity(intent2);
                break;

            case R.id.btnGoogleNews:
                //1.create an intent
                Intent intent3=new Intent(ActivityNavigator.this,NewIntent.class);
                //2.put key value data
                intent3.putExtra("message","hi good morning");
                //3.you can add data to a bundle
               Bundle extras=new Bundle();
                extras.putString("status","Data Received");
                //4.add bundle to intent
                intent3.putExtras(extras);
                //5.start the activity
                startActivity(intent3);
                break;

            case R.id.btnFelightNews:
                //1.create an intent
                Intent intent4=new Intent(ActivityNavigator.this,NewIntent1.class);
                //2.put key value data
                intent4.putExtra("message","hi good evening");
                //3.you can add data to a bundle
                Bundle extras1=new Bundle();
                extras1.putString("status","Data Received");
                //4.add bundle to intent
                intent4.putExtras(extras1);
                //5.start the activity
                startActivity(intent4);
                break;

        }


    }




}
