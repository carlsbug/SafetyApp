package com.example.test;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends WearableActivity {

    //    private TextView mTextView;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list_view);

//        mTextView = (TextView) findViewById(R.id.text);

        updateUI();
        // Enables Always-on
//        setAmbientEnabled();
    }
    public void updateUI(){
        ArrayList<Note> notes = Helper.getAllNotes(this);

        notes.add(0, new Note("",""));
        listView.setAdapter(new ListViewAdapter(this, 0, notes));
    }
}
