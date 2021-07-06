package com.example.amar.careercounseling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class chart extends AppCompatActivity {
ImageView iv;
int z=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart);
        iv=(ImageView)findViewById(R.id.ima);
        this.setTitle("CAREER CHART");
    }
    public void clicked(View view)
    {   z=(z+1)%3;
        switch(z){
            case 0:iv.setImageResource(R.drawable.scienclenewchart);
                break;
            case 1:iv.setImageResource(R.drawable.mka);
                break;
            case 2:iv.setImageResource(R.drawable.atrschartsz);
                break;

        }
    }
}
