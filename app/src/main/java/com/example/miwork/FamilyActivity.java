package com.example.miwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create list of Word objects
        ArrayList<Word> family = new ArrayList<>();
        family.add(new Word("father", "әpә"));
        family.add(new Word("mother", "әṭa"));
        family.add(new Word("son", "angsi"));
        family.add(new Word("daughter", "tune"));
        WordAdapter Adapter = new WordAdapter(this, family);

        ListView listView = findViewById(R.id.rootView_arrayList);

        listView.setAdapter(Adapter);


        Log.v("NumbersActivity", "This is the number on index [0]" + family.get(0));


    }
}
