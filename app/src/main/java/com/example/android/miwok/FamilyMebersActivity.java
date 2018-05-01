package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMebersActivity extends AppCompatActivity {

    //Create a global variable mediaPlayer
    public MediaPlayer mMediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create an ArrayList of words
        final ArrayList <Word> words = new ArrayList<Word>();

        //words.add(0,"one");
        words.add(new Word("father", "әpә", R.drawable.family_father, R.raw.family_father));
        words.add(new Word("mother", "әṭa", R.drawable.family_mother, R.raw.family_mother));
        words.add(new Word("son", "angsi", R.drawable.family_son, R.raw.family_son));
        words.add(new Word("daughter", "tune", R.drawable.family_daughter, R.raw.family_daughter));
        words.add(new Word("older brother", "taachi", R.drawable.family_older_brother));
        words.add(new Word("younger brother", "chalitti", R.drawable.family_younger_brother));
        words.add(new Word("older sister", "teṭe", R.drawable.family_older_sister));
        words.add(new Word("younger sister", "kolliti", R.drawable.family_younger_sister));
        words.add(new Word("grandmother ", "ama", R.drawable.family_grandmother));
        words.add(new Word("grandfather", "paapa", R.drawable.family_grandfather));



        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_family);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called "list", which is declared in
        // word_list.xml file.
        ListView listView = findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name: "itemsAdapter".
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
                mMediaPlayer = MediaPlayer.create(FamilyMebersActivity.this, word.getmSoundResourceId());
                //Start the mediaPlayer
                mMediaPlayer.start();
            }
        });

    }
}
