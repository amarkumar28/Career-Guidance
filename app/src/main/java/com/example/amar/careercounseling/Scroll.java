package com.example.amar.careercounseling;

import android.content.Intent;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Scroll extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
Spinner s;
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll);
        this.setTitle("Arts");
        Toast.makeText(this,"CHOOSE YOUR COURSE FROM SPINNER",Toast.LENGTH_SHORT).show();
        tv=(TextView)findViewById(R.id.textview1);
        s=(Spinner)findViewById(R.id.spinner1);
        s.setOnItemSelectedListener(this);
    }
    public void onItemSelected(AdapterView<?> parent, View view,int pos,long id)
    {   switch ((int) parent.getItemIdAtPosition(pos))
        { case 0:tv.setText(R.string.BA_SOCIAL);
                break;
            case 1:tv.setText(R.string.fine_arts);
                    break;
            case 2:tv.setText(R.string.BA_Design);
                break;
            case 3:tv.setText(R.string.BA_LLB);
                break;
            case 4:tv.setText(R.string.BHM_hospitality);
                break;
            case 5:tv.setText(R.string.BJMC);
                break;
            case 6:tv.setText(R.string.BCA1);
                break;
        }
    }
    public void onNothingSelected(AdapterView<?> parent)
    {
    }
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater Inf=getMenuInflater();
        Inf.inflate(R.menu.menu_arts,menu);
        return true;

    }
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch(item.getItemId())
        {
            case R.id.aitem1:
                Intent  I=new Intent(this,arts_colleges.class);
                startActivity(I);
                break;
            case R.id.aitem2:
                Intent  It1=new Intent(this,arts_Jobs.class);
                startActivity(It1);
                break;
        }
        return true;
    }
}