package com.newtutotrialslab.listview;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;


    public class MainActivity extends ActionBarActivity {
    private ListView lv;
    private String[] mobileOs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=(ListView)findViewById(R.id.listView);
        mobileOs=new String[]{"iOS","android","windows phone","blackberry"};
        /*ArrayAdapter<String> adapter=new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,mobileOs);*/

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getApplicationContext(),
               R.layout.list_item,
               R.id.textView,mobileOs);
                  lv.setAdapter(adapter);

    }

}
