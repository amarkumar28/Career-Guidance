package com.example.amar.careercounseling;

import android.content.Intent;
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

public class commerce extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    Spinner s;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commerce);
        this.setTitle("COMMERCE");
        Toast.makeText(this,"CHOOSE YOUR COURSE FROM SPINNER",Toast.LENGTH_SHORT).show();
        tv=(TextView)findViewById(R.id.textview1);
        s=(Spinner)findViewById(R.id.spinner1);
        s.setOnItemSelectedListener(this);
    }
    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id)
    {   switch ((int) parent.getItemIdAtPosition(pos))
    { case 0:tv.setText(R.string.B_comp);
        break;
        case 1:tv.setText(R.string.B_comh);
            break;
        case 2:tv.setText(R.string.Eco);
            break;
        case 3:tv.setText(R.string.BBA);
            break;
        case 4:tv.setText(R.string.BMS);
            break;
        case 5:tv.setText(R.string.CA);
            break;
        case 6:tv.setText(R.string.CS);
            break;
        case 7:tv.setText(R.string.CMA);
            break;
        case 8:tv.setText(R.string.CFP);
            break;
        case 9:tv.setText(R.string.LLB);
            break;
    }
    }
    public void onNothingSelected(AdapterView<?> parent)
    {
    }
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater Inf=getMenuInflater();
        Inf.inflate(R.menu.menu_commerce,menu);
        return true;

    }
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch(item.getItemId())
        {
            case R.id.citem1:
                Intent It2=new Intent(this,commerce_college.class);
                startActivity(It2);
                break;
            case R.id.citem2:
                Intent  It3=new Intent(this,commerce_jobs.class);
                startActivity(It3);
                break;
        }
        return true;
    }

}