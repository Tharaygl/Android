package com.felight.toastactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.telephony.SmsManager;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;

/**
 * Created by hp on 17-10-2016.
 */

public class SmsActivity extends AppCompatActivity {

    public Button btnSend;
    public EditText etNumber;
    public EditText etMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sms_layout);

        etNumber=(EditText)findViewById(R.id.etNumber);
        etMessage=(EditText)findViewById(R.id.etMessage);
        btnSend=(Button)findViewById(R.id.btnSend);
    }

    public void sendMessage(View view){
        String Phone=etNumber.getText().toString();
        String Message=etMessage.getText().toString();

        try{

            SmsManager smsManager=SmsManager.getDefault();
            smsManager.sendTextMessage(Phone,null,Message,null,null);
            Toast.makeText(getApplicationContext(),"Message sent",Toast.LENGTH_SHORT).show();

        }catch(Exception e){
            Toast.makeText(getApplicationContext(),"Unable to send",Toast.LENGTH_SHORT).show();
        }
    }
}
