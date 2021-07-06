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

public class non_medical extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    Spinner s;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_non_medical);
        this.setTitle("NON MEDICAL");
        Toast.makeText(this,"CHOOSE YOUR COURSE FROM SPINNER",Toast.LENGTH_LONG).show();
        tv=(TextView)findViewById(R.id.textview1);
        s=(Spinner)findViewById(R.id.spinner1);
        s.setOnItemSelectedListener(this);
    }
    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id)
    {   switch ((int) parent.getItemIdAtPosition(pos)) {
        case 0:tv.setText(R.string.B_tech_IT);
        break;
        case 1:tv.setText(R.string.B_tech_CS);
            break;
        case 2:tv.setText(R.string.B_tech_MC);
            break;
        case 3:tv.setText(R.string.B_tech_CE);
            break;
        case 4:tv.setText(R.string.B_tech_EE);
            break;
        case 5:tv.setText(R.string.B_Sc_IT1);
            break;
        case 6:tv.setText(R.string.BCA2);
            break;
        case 7:tv.setText(R.string.B_Sc_Forensic_Sciences1);
            break;
        case 8:tv.setText(R.string.B_Pharm1);
            break;
        case 9:tv.setText(R.string.B_Sc_Nautical_Science1);
            break;
        case 10:tv.setText(R.string.B_Sc_M_Sc_in_Pure_Sciences1);
            break;
        case 11:tv.setText(R.string.B_Sc_Economics1);
            break;
        case 12:tv.setText(R.string.Bachelor_in_Construction_Technology);
            break;
    }
    }
    public void onNothingSelected(AdapterView<?> parent)
    {
    }
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater Inf=getMenuInflater();
        Inf.inflate(R.menu.menu_enge,menu);
        return true;

    }
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch(item.getItemId())
        {
            case R.id.eitem1:
                Intent It5=new Intent(this,non_medical_colleges.class);
                startActivity(It5);
                break;
            case R.id.eitem2:
                Intent It7=new Intent(this,non_engineering.class);
                startActivity(It7);
                break;
            case R.id.eitem3:
                Intent  It6=new Intent(this,non_medical_jobs.class);
                startActivity(It6);
                break;
        }
        return true;
    }

}


