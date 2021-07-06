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

public class medical extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    Spinner s;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical);
        this.setTitle("MEDICAL");
        Toast.makeText(this,"CHOOSE YOUR COURSE FROM SPINNER",Toast.LENGTH_SHORT).show();
        tv=(TextView)findViewById(R.id.textview1);
        s=(Spinner)findViewById(R.id.spinner1);
        s.setOnItemSelectedListener(this);
    }
    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id)
    {   switch ((int) parent.getItemIdAtPosition(pos))
    { case 0:tv.setText(R.string.MBBS1);
        break;
        case 1:tv.setText(R.string.BHMS1);
            break;
        case 2:tv.setText(R.string.BAMS1);
            break;
        case 3:tv.setText(R.string.BUMS1);
            break;
        case 4:tv.setText(R.string.BDS1);
            break;
        case 5:tv.setText(R.string.B_Sc_Nursing1);
            break;
        case 6:tv.setText(R.string.B_Sc_Microbiology1);
            break;
        case 7:tv.setText(R.string.B_Sc_Biotechnology1);
            break;
        case 8:tv.setText(R.string.B_Sc_Agriculture1);
            break;
        case 9:tv.setText(R.string.B_Sc_Botany1);
            break;
        case 10:tv.setText(R.string.B_Sc_Zoology1);
            break;
        case 11:tv.setText(R.string.B_Sc_Anthropology1);
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
                Intent It2=new Intent(this,medical_college.class);
                startActivity(It2);
                break;
            case R.id.citem2:
                Intent  It3=new Intent(this,medical_jobs.class);
                startActivity(It3);
                break;
        }
        return true;
    }

}
