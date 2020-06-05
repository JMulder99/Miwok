package com.example.miwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create list of Word objects
        ArrayList<Word> color = new ArrayList<>();
        color.add(new Word("red", "weṭeṭṭi"));
        color.add(new Word("green", "chokokki"));
        color.add(new Word("brown", "ṭakaakki"));
        color.add(new Word("gray", "ṭopoppi"));
        color.add(new Word("black", "kululli"));
        color.add(new Word("white", "kelelli"));
        color.add(new Word("yellow", "ṭopiisә"));

        WordAdapter Adapter = new WordAdapter(this, color);

        ListView listView = findViewById(R.id.rootView_arrayList);

        listView.setAdapter(Adapter);

        Log.v("NumbersActivity", "This is the number on index [0]" + color.get(0));


    }
}
