package com.examples.miwok.model;

import java.io.Serializable;

public class Word implements Serializable {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImgeRucersesId = NO_IMAGE_PROVIDED;
    private int mAudioRuceorsesId;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String mDefaultTranslation, String mMiwokTranslation, int mImgeRucersesId, int mAudioRuceorsesId) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mImgeRucersesId = mImgeRucersesId;
        this.mAudioRuceorsesId = mAudioRuceorsesId;
    }

    public Word(String mDefaultTranslation, String mMiwokTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
    }


    public Word(String mDefaultTranslation, String mMiwokTranslation, int mAudioRuceorsesId) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mAudioRuceorsesId = mAudioRuceorsesId;
    }


    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public void setmDefaultTranslation(String mDefaultTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public void setmMiwokTranslation(String mMiwokTranslation) {
        this.mMiwokTranslation = mMiwokTranslation;
    }

    public int getmImgeRucersesId() {
        return mImgeRucersesId;
    }

    public void setmImgeRucersesId(int mImgeRucersesId) {
        this.mImgeRucersesId = mImgeRucersesId;
    }

    public int getmAudioRuceorsesId() {
        return mAudioRuceorsesId;
    }

    public void setmAudioRuceorsesId(int mAudioRuceorsesId) {
        this.mAudioRuceorsesId = mAudioRuceorsesId;
    }

    public boolean hasImage() {
        return mImgeRucersesId != NO_IMAGE_PROVIDED;
    }
}
