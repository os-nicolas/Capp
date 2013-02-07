package net.connivance.capp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends Activity {
	ListView cappList;
	Button left,right;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cappList = (ListView) findViewById(R.id.cap_holder);
        
        String[] values = new String[] { "Android", "iPhone", "WindowsMobile",
        		  "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
        		  "Linux", "OS/2" };

        		// Define a new Adapter
        		// First parameter - Context
        		// Second parameter - Layout for the row
        		// Third parameter - ID of the TextView to which the data is written
        		// Forth - the Array of data

        		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
        		  android.R.layout.simple_list_item_1, android.R.id.text1, values);


        		// Assign adapter to ListView
        		cappList.setAdapter(adapter); 
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
