package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    //Create a global variable mediaPlayer
    public MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        /** This a good place to initialize our MediaPlayer.
         */



        //Create an ArrayList of words
        //!!!We'll need to add the word "final" in front of the declaration.
        // And that way you can reference the words arraylist within the onItemClick method!!!
        final ArrayList <Word> words = new ArrayList<>();

        //words.add(0, "one", "lutti");
        words.add(new Word("one", "lutti", R.drawable.number_one, R.raw.number_one));
        words.add(new Word("two", "otiiko", R.drawable.number_two, R.raw.number_two));
        words.add(new Word("three", "tolookosu", R.drawable.number_three, R.raw.number_three));
        words.add(new Word("four", "oyyisa", R.drawable.number_four, R.raw.number_four));
        words.add(new Word("five", "massokka", R.drawable.number_five, R.raw.number_five));
        words.add(new Word("six", "temmokka", R.drawable.number_six, R.raw.number_six));
        words.add(new Word("seven", "kenekaku", R.drawable.number_seven, R.raw.number_seven));
        words.add(new Word("eight", "kawinta", R.drawable.number_eight, R.raw.number_eight));
        words.add(new Word("nine", "wo'e", R.drawable.number_nine, R.raw.number_nine));
        words.add(new Word("ten", "na'aacha", R.drawable.number_ten, R.raw.number_ten));


        // Find th root view of the whole layout
//        LinearLayout rootView = findViewById(R.id.rootView);

        // Create a variable to keep track of the current index position
//        int index = 0;

//        TextView wordView = new TextView(this);
//        wordView.setText(words.get(index));
//        rootView.addView(wordView);
//
//        index = index +1;
//
//        TextView wordView2 = new TextView(this);
//        wordView2.setText(words.get(index));
//        rootView.addView(wordView2);


//        while (index<words.size()) {
//            // Create a new {@link TextView} that displays the word at
//            // and add the View as the child to the rootView
//            TextView wordView = new TextView(this);
//            wordView.setText(words.get(index));
//            rootView.addView(wordView);
//
//            // Update counter variable
//            index ++; //index = index =1
//        }

//        for (int index = 0; index<words.size(); index ++) {
//
//            TextView wordView = new TextView(this);
//            wordView.setText(words.get(index));
//            rootView.addView(wordView);
//
//        }

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called "list", which is declared in
        // word_list.xml file.
        ListView listView = findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name: "adapter".
        listView.setAdapter(adapter);


        /** We start at: listView.setAdapter, because this is where we bind our word adapter to our list view.
         * So it will be a good place for us to configure our onClickListener.
         */

        //So we use a ListView object and call a setOnClickListener method on it.
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                //So from the onItemClick method position parameter, I can check the words array list
                //to get the word that was clicked on.
                Word word = words.get(position);

                //Initialize the MediaPlayer (!use correct autofill!)
                //Modify for the word to get the correct AudioResourceId
                mMediaPlayer = MediaPlayer.create(NumbersActivity.this, word.getmSoundResourceId());
                //Start the mediaPlayer
                mMediaPlayer.start();
            }
        });

    }
}
