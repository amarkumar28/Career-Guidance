
package com.example.amar.careercounseling;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Toast;

public class Home extends AppCompatActivity{
ImageView I1,I2,I3,I4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        this.setTitle("Career Guidance");
        Toast.makeText(this,"CHOOSE YOUR STREAM BY TAPPING ON IMAGES",Toast.LENGTH_LONG).show();
        I1=(ImageView)findViewById(R.id.nonmedical);
        I2=(ImageView)findViewById(R.id.arts);
        I3=(ImageView)findViewById(R.id.commerce);
        I4=(ImageView)findViewById(R.id.medical);
    }
    public void nonmedical(View view)
    {   Toast.makeText(this,"YOU OPTED NON-MEDICAL",Toast.LENGTH_SHORT).show();
        Intent I3=new Intent(this,non_medical.class);
        startActivity(I3);
    }
    public void medical(View view)
    {   Toast.makeText(this,"YOU OPTED MEDICAL",Toast.LENGTH_SHORT).show();
        Intent I3=new Intent(this,medical.class);
        startActivity(I3);
    }
    public void commerce(View view)
    {   Toast.makeText(this,"YOU OPTED COMMERCE",Toast.LENGTH_SHORT).show();
        Intent I3=new Intent(this,commerce.class);
        startActivity(I3);
    }
    public void arts(View view)
    {   Toast.makeText(this,"YOU OPTED HUMANITIES",Toast.LENGTH_SHORT).show();
        Intent I4=new Intent(this,Scroll.class);
        startActivity(I4);
    }
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_home,menu);
        return true;

    }
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch(item.getItemId())
        {
            case R.id.item1:
                Intent i=new Intent(this,Before_10th.class);
                startActivity(i);
                break;
            case R.id.item2:
                Intent j=new Intent(this,chart.class);
                startActivity(j);
                break;
            case R.id.item3:
                Intent k=new Intent(this,career_general.class);
                startActivity(k);
                break;
            case R.id.item4:
                Intent k1=new Intent(this,FeedBack.class);
                startActivity(k1);
                break;
            case R.id.item5:
                Intent k2=new Intent(this,help.class);
                startActivity(k2);
                break;
        }
        return true;
    }
}
