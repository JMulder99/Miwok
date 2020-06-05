package com.example.miwork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create list of Word objects
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("one", "ien"));
        words.add(new Word("two", "twa"));
        words.add(new Word("three", "trije"));
        words.add(new Word("four", "fjouwer"));
        words.add(new Word("five", "fiif"));
        words.add(new Word("six", "seis"));
        words.add(new Word("seven", "sân"));
        words.add(new Word("eight", "acht"));
        words.add(new Word("nine", "njoggen"));
        words.add(new Word("ten", "tsien"));


        WordAdapter Adapter = new WordAdapter(this, words);

        ListView listView = findViewById(R.id.rootView_arrayList);

        listView.setAdapter(Adapter);

        /*ConstraintLayout rootview = findViewById(R.id.rootView);
        ConstraintSet set = new ConstraintSet();

        int id_previous = rootview.getId();
        for (int index=0; index < words.size(); index++) {
            TextView wordview = new TextView(this);
            wordview.setId(index);
            wordview.setText(words.get(index));
            rootview.addView(wordview);
            set.clone(rootview);
            if (index > -1) {
                id_previous = wordview.getId();
                id_previous -= 1;
            }
            set.connect(wordview.getId(), ConstraintSet.TOP, id_previous, ConstraintSet.TOP, 80);
            set.connect(rootview.getId(),ConstraintSet.LEFT,ConstraintSet.PARENT_ID,ConstraintSet.LEFT,0);
            set.applyTo(rootview);

        }*/

        Log.v("NumbersActivity", "This is the number on index [0]" + words.get(0));


    }
}
