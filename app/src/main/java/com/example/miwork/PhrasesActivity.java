package com.example.miwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create list of Word objects
        ArrayList<Word> color = new ArrayList<>();
        color.add(new Word("Where are you going?", "minto wuksus"));

        WordAdapter Adapter = new WordAdapter(this, color);

        ListView listView = findViewById(R.id.rootView_arrayList);

        listView.setAdapter(Adapter);

        Log.v("NumbersActivity", "This is the number on index [0]" + color.get(0));


    }
}