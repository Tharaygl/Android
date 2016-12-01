package com.felight.toastactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import  android.view.Gravity.*;

import static android.R.attr.y;

public class MainActivity extends AppCompatActivity {
    private Button btnTL;
    private Button btnTC;
    private Button btnTR;
    private Button btnCL;
    private Button btnCC;
    private Button btnCR;
    private Button btnBL;
    private Button btnBC;
    private Button btnBR;

     public void btnTL(View view){

            int xPos=(int)view.getX();
            int yPos=(int)view.getY();
             //Toast toast=Toast.makeText(this,"x="+xPos+",y="+yPos,Toast.LENGTH_SHORT);
            Toast toast=Toast.makeText(this,"Top Left button is pressed",Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.TOP|Gravity.LEFT,0,150);
            toast.show();
    }

    public void btnTC(View view){

        int xPos=(int)view.getX();
        int yPos=(int)view.getY();
        //Toast toast=Toast.makeText(this,"x="+xPos+",y="+yPos,Toast.LENGTH_SHORT);
        Toast toast=Toast.makeText(this,"Top Center button is pressed",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP|Gravity.CENTER,0,150);
        toast.show();
    }

    public void btnTR(View view){

        int xPos=(int)view.getX();
        int yPos=(int)view.getY();
        Toast toast=Toast.makeText(this,"Top Right button is pressed",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,150);
        toast.show();
    }

    public void btnCL(View view){

        int xPos=(int)view.getX();
        int yPos=(int)view.getY();
        Toast toast=Toast.makeText(this,"Center Left button is pressed",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER|Gravity.LEFT,0,50);
        toast.show();
    }

    public void btnCC(View view){

        int xPos=(int)view.getX();
        int yPos=(int)view.getY();
        Toast toast=Toast.makeText(this,"Center Center button is pressed",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER|Gravity.CENTER,0,50);
        toast.show();
    }

    public void btnCR(View view){

        int xPos=(int)view.getX();
        int yPos=(int)view.getY();
        Toast toast=Toast.makeText(this,"Center Right button is pressed",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER|Gravity.RIGHT,0,50);
        toast.show();
    }

    public void btnBL(View view){

        int xPos=(int)view.getX();
        int yPos=(int)view.getY();
        Toast toast=Toast.makeText(this,"Bottom Left button is pressed",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM|Gravity.LEFT,0,60);
        toast.show();
    }

    public void btnBC(View view){

        int xPos=(int)view.getX();
        int yPos=(int)view.getY();
        Toast toast=Toast.makeText(this,"Bottom Center button is pressed",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM|Gravity.CENTER,0,60);
        toast.show();
    }

    public void btnBR(View view){

        int xPos=(int)view.getX();
        int yPos=(int)view.getY();
        Toast toast=Toast.makeText(this,"Bottom Right button is pressed",Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM|Gravity.RIGHT,0,60);
        toast.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTL = (Button) findViewById(R.id.btnTopLeft);
        btnTC = (Button) findViewById(R.id.btnTopCenter);
        btnTR = (Button) findViewById(R.id.btnTopRight);
        btnCL = (Button) findViewById(R.id.btnCenterRight);
        btnCC = (Button) findViewById(R.id.btnCenterCenter);
        btnCR = (Button) findViewById(R.id.btnCenterLeft);
        btnBL = (Button) findViewById(R.id.btnBottomLeft);
        btnBC = (Button) findViewById(R.id.btnBottomCenter);
        btnBR = (Button) findViewById(R.id.btnBottomRight);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
           MenuInflater menuInflater=super.getMenuInflater();
            menuInflater.inflate(R.menu.menu,menu);
            return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem){

        switch(menuItem.getItemId()){
            case R.id.item1:
                //toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,60);
                Toast.makeText(this,"Settings is selected",Toast.LENGTH_SHORT).show();

                break;

            case R.id.item2:
                Toast.makeText(this,"About is selected",Toast.LENGTH_SHORT).show();
                break;

            case R.id.item3:
                Toast.makeText(this,"Help is selected",Toast.LENGTH_SHORT).show();
                break;

        }
        return true;
    }
}
