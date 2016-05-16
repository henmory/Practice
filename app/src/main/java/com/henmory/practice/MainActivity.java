package com.henmory.practice;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private static final String ACTIVITY_TAG = "MainActivity_tag";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        toolbar.setNavigationIcon(android.R.drawable.ic_menu_more);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Log.d(ACTIVITY_TAG, "action_more");

            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);


        MenuItem mi = menu.findItem(R.id.action_search_other);
        SearchView sv = (SearchView) MenuItemCompat.getActionView(mi);
        //设置控件属性
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Log.d(ACTIVITY_TAG, "action_setting");
            return true;
        }
        else if(id == R.id.action_share){
            Log.d(ACTIVITY_TAG, "action_share");
            return true;
        }else if(id == R.id.action_info){
            Log.d(ACTIVITY_TAG, "action_info");
            return true;
        }else if(id == R.id.action_search_other){
            Log.d(ACTIVITY_TAG, "action_search");
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void  startNextActivity(View view){
        startActivity(new Intent(MainActivity.this, Main2Activity.class));
    }
}
