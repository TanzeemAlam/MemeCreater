package com.example.tanzeem.memecreater;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;

//import static com.example.tanzeem.memecreater.R.id.main_view;

public class MainActivity extends AppCompatActivity implements TopSectionFragment.TopSectionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        RelativeLayout main_view = findViewById(R.id.fragment3);

        switch (item.getItemId()){
            case R.id.menu_tanzeem:
                if(item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                 main_view.setBackgroundResource(R.drawable.image_1);
                 return true;
            case R.id.menu_ayushi:
                if(item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                main_view.setBackgroundResource(R.drawable.image_2);
                return true;
            case R.id.menu_vadali:
                if(item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                main_view.setBackgroundResource(R.drawable.image_3);
                return true;
                default:
                    return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void createMeme(String top, String bottom) {
        BottomSectionFragment bottomFragment = (BottomSectionFragment) getSupportFragmentManager().findFragmentById(R.id.fragment3);
        bottomFragment.setMemeText(top,bottom);
    }

}
