package com.felight.toastactivity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.net.wifi.WifiManager;

public class WifiActivity extends AppCompatActivity {

    ToggleButton tgWifi;
    WifiManager wifiManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wifi);

        wifiManager = (WifiManager) this.getSystemService(Context.WIFI_SERVICE);

        tgWifi = (ToggleButton) findViewById(R.id.tgWifi);
        tgWifi.setChecked(wifiManager.isWifiEnabled());

        tgWifi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
           @Override
            public void onCheckedChanged(CompoundButton buttonView,boolean isChecked){
               wifiManager.setWifiEnabled(isChecked);
           }
        });
    }
}
