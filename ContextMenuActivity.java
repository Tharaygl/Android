package com.felight.toastactivity;

import android.content.ClipData;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.ContextMenu;
import android.widget.LinearLayout;
import android.widget.Toast;


/**
 * Created by hp on 18-10-2016.
 */

public class ContextMenuActivity extends AppCompatActivity {

    private Button btnClickMe;
    private LinearLayout llLayout;

    public void doSomething(View view){


    }

    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contextmenu);
        btnClickMe=(Button)findViewById(R.id.btnClickMe);
        registerForContextMenu(btnClickMe);
        llLayout=(LinearLayout) findViewById(R.id.llLayout);


    }

    public void onCreateContextMenu(ContextMenu menu,View v,ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu,v,menuInfo);
        menu.setHeaderTitle("Context Menu");
        menu.add(0,v.getId(),0,"BLUE");
        menu.add(0,v.getId(),0,"GREEN");
        menu.add(0,v.getId(),0,"YELLOW");

    }


    public boolean onContextItemSelected(MenuItem item){
        if(item.getTitle()=="BLUE"){
            llLayout.setBackgroundColor(Color.BLUE);
            Toast.makeText(this, "BLUE INVOKE", Toast.LENGTH_SHORT).show();
        }
        if(item.getTitle()=="GREEN"){
            llLayout.setBackgroundColor(Color.GREEN);
            Toast.makeText(this, "GREEN INVOKE", Toast.LENGTH_SHORT).show();
        }
        if(item.getTitle()=="YELLOW"){
            llLayout.setBackgroundColor(Color.YELLOW);
            Toast.makeText(this, "YELLOW INVOKE", Toast.LENGTH_SHORT).show();
        }else{
            return false;
        }
        return true;
    }
}
