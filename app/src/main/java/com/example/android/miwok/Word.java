package com.example.android.miwok;

import android.support.annotation.VisibleForTesting;
import android.widget.ImageView;

/**
 * Created by SeniKamara on 31.03.2018.
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */


public class Word {

    /** Default translation of the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;


    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    /** Sound resource ID for the word */
    private int mSoundResourceId;

    /**
     * Create a new Word object.
     * @param defaultTranslation
     * @param miwokTranslation
     * @param soundResourceId
     */

    public Word (String defaultTranslation, String miwokTranslation, int soundResourceId) {

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        //Added soundResourceID
        mSoundResourceId = soundResourceId;

    }

    /**
     * Create a new Word object.
     * @param defaultTranslation is the word in a language that is user is using (eg. English)
     * @param miwokTranslation is the word in the Miwok language
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     * @param soundResourceID
     */

    public Word (String defaultTranslation, String miwokTranslation, int imageResourceId, int soundResourceID) {


        //This is to initialize the global variables ("m" for initialisation purposes)
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        //Added the imageResourceId
        mImageResourceId = imageResourceId;
        //Added soundResourceID
        mSoundResourceId = soundResourceID;

    }

    /**
     * Get the default translation method
     */

    public String getDefaultTranslation() {
        return mDefaultTranslation;

    }

    /**
     * Get the Miwok translation of the word
     */

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Return the image resource ID of the word
     */

    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there's an image for this word.
     */

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Create public method here, that returns an Integer Sound Resource ID
     * @return
     */

    public int getmSoundResourceId() {
        return mSoundResourceId;
    }


}

