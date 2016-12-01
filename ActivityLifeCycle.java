package com.felight.toastactivity;

import android.app.Activity;
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

public class ActivityLifeCycle extends AppCompatActivity implements OnClickListener{
    final String TAG = "States";

    Button btnAction;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acticitylifecycle_layout);

        btnAction = (Button) findViewById(R.id.btnAction);
        btnAction.setOnClickListener( this);

        Log.d(TAG, "ActivityLifeCycle: onCreate()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "ActivityLifeCycle: onRestart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "ActivityLifeCycle: onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "ActivityLifeCycle: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "ActivityLifeCycle: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "ActivityLifeCycle: onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "ActivityLifeCycle: onDestroy()");
    }

    @Override
    public void onClick(View view) {
        Intent intent=new Intent(this,ActivityTwo.class);
        startActivity(intent);
    }
}
