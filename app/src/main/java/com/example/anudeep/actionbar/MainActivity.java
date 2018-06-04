package com.example.anudeep.actionbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

import java.sql.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ListView listView;

    DataAdapter adapter;
    ArrayList<Datamodel> arraylist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listview);
        arraylist = new ArrayList<>();

        arraylist.add(new Datamodel("sachin","http://www.mobignosis.com/wp-content/uploads/2013/04/logo_new.jpg"));
        arraylist.add(new Datamodel("sachin","http://www.mobignosis.com/wp-content/uploads/2013/04/logo_new.jpg"));

        arraylist.add(new Datamodel("sachin","http://www.mobignosis.com/wp-content/uploads/2013/04/logo_new.jpg"));
        arraylist.add(new Datamodel("sachin","http://www.mobignosis.com/wp-content/uploads/2013/04/logo_new.jpg"));

        adapter = new DataAdapter(arraylist,getApplicationContext());
listView.setAdapter(adapter);




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.item1 :
                Toast.makeText(getApplicationContext(),"settings",Toast.LENGTH_LONG).show();
                break;

            case R.id.item2 :
                Toast.makeText(getApplicationContext(),"profile",Toast.LENGTH_LONG).show();
                break;
        }
        return true;
    }
}
