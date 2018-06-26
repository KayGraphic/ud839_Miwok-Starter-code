package com.example.android.miwok;

import android.content.Context;

public class Word {
    private static final int NO_IMAGE_STATE = -1;
    private String mdefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_STATE;
    //the m stands for "member variable"
//constructor for the Activity that doesn't have an IMG associated with it.
    public Word(String defaultTranslation, String miwokTranslation) {
        mdefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }
//constructor for activities that have an IMG associated with it.
    public Word(String defaultTranslation, String miwokTranslation, int ImageResourceId) {
        mdefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = ImageResourceId;
    }

    public String getMdefaultTranslation() {
        return mdefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }


    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_STATE;


    }
}
