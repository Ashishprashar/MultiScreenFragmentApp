package com.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImage = NO_IMAGE;
    private static final int NO_IMAGE=-1;
    private int mAudioId;

    public Word(String mDefaultTranslation, String mMiwokTranslation, int mAudioId) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;

        this.mAudioId = mAudioId;
    }
    public Word(String mDefaultTranslation, String mMiwokTranslation, int mImage, int mAudioId) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mImage = mImage;
        this.mAudioId = mAudioId;
    }

    public int getImage(){
        return mImage;
    }
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
    public boolean hasImage(){
        return mImage!=NO_IMAGE;
    }
    public int getAudioId(){
        return mAudioId;
    }
}
