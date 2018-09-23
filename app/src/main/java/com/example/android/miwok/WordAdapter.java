package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * {@link WordAdapter} is an {@link android.widget.ArrayAdapter} that can provide the layout for each list
 * based on a data source, which is a list of {@link com.example.android.miwok.Word} objects
 * Created by SeniKamara on 31.03.2018.
 **/

/**
 * This is our own custom constructor (it doesn't mirror a superclass constructor).
 * The context is used to inflate the layout file, and the list is the data we want
 * to populate into the lists.
 *
// *@param context The current context used to inflate the layout file
// *@param Word A list of Word objects to display in a list
 */

public class WordAdapter extends RecyclerView.Adapter<WordAdapter.WordAdapterViewholder>{

    private String mWordData;

    /** Resource ID for the background color for this list of words */
    private int mColorResourceID;

    private int mWordItems;

    public WordAdapter(int wordItems, int colorResourceID) {

        mWordItems = wordItems;
        mColorResourceID = colorResourceID;
    }

    public class WordAdapterViewholder extends RecyclerView.ViewHolder {

        public final TextView mWordTextView;

        public WordAdapterViewholder(View view) {

            super(view);

            mWordTextView = view.findViewById(R.id.text_container);

        }
    }


    @NonNull
    @Override
    public WordAdapterViewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        Context context = viewGroup.getContext();
        int layoutIdForListItem = R.layout.list_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, viewGroup, shouldAttachToParentImmediately);
        return new WordAdapterViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WordAdapterViewholder holder, int position) {

        String w

    }

    @Override
    public int getItemCount() {
        return 0;
    }




//    /**
//     * Provides a view of an AdapterView (ListView, GridView, etc.)
//     *
//     * @param position The position is the list of data that should be displayed in the
//     *                 list item view
//     * @param convertView The recycled view to populate
//     * @param parent The parent ViewGroup that is used for inflation
//     * @return The View for the position in the AdapterView.
//     */

//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//
//        //Check if the existing View is being reused, otherwise inflate the view
//        View listItemView = convertView;
//
//        if (listItemView == null) {
//            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
//        }
//
//
//        //Get the {@link Word} object located at this position in the list
//        Word currentWord = getItem(position);
//
//        //Find the TextView in the list_item.xml layout with the ID miwok_tv
//        TextView miwokTextView = listItemView.findViewById(R.id.miwok_tv);
//
//        //Get the Miwok version from the current Word object and set this text
//        // on the miwokTextView
//        miwokTextView.setText(currentWord.getMiwokTranslation());
//
//        //Find the TextView in the list_item.xml layout with the ID english_tv
//        TextView englishTextView = listItemView.findViewById(R.id.english_tv);
//
//        //Get the English version from the current Word object and set this text
//        //on the englishTextView
//        englishTextView.setText(currentWord.getDefaultTranslation());
//
////        Get the Image for the word from the current Word object and set this image
////        on the wordImageView.
////        wordImageView.setImageResource(currentWord.getImageResourceId());
//
//        //Find the ImageView in the list_item.xml layout with the ID miwok_image
//        ImageView wordImageView = listItemView.findViewById(R.id.miwok_image);
//
//        Log.v("my_tag", "Images present is: "+currentWord.hasImage());
//
//        if (currentWord.hasImage()) {
//            //Set the ImageView to the image resource specified in the current Word
//            wordImageView.setImageResource(currentWord.getImageResourceId());
//
//            //Make sure the view is visible (because the views get reused and maybe set to invisible)
//            wordImageView.setVisibility(View.VISIBLE);
//        }
//        else {
//            //Otherwise hide the ImageView (set visibility to GONE)
//            wordImageView.setVisibility(View.GONE);
//        }
//
//        //Set the theme color for the list item
//        View textContainer = listItemView.findViewById(R.id.text_container);
//
//        //Find the color that the resource ID maps to
//        int color = ContextCompat.getColor(getContext(), mColorResourceID);
//
//        //Set the background color of the text container View
//        textContainer.setBackgroundColor(color);
//
//
//        //Return the whole list item layout (containing 2 TextViews)
//        //so that it can be shown in the ListView
//        return listItemView;
//
//    }



}























