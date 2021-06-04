package com.example.notekeeper;

import android.os.Bundle;

import androidx.lifecycle.ViewModel;

public class NoteListActivityViewModel extends ViewModel {
    public String mOriginalCourseId;
    public String mOriginalNoteTitle;
    public String mOriginalNoteText;
    public static final String  ORIGINAL_NOTE_COURSE_ID = "com.example.ORIGINAL_NOTE_COURSE_ID";
    public static final String  ORIGINAL_NOTE_TITLE = "com.example.ORIGINAL_NOTE_TITLE";
    public static final String  ORIGINAL_NOTE_TEXT = "com.example.ORIGINAL_NOTE_TEXT";
    public boolean mIsNewlyCreated=true;

    public void restoreState(Bundle savedInstanceState) {
        mOriginalCourseId = savedInstanceState.getString(ORIGINAL_NOTE_COURSE_ID);
        mOriginalNoteTitle = savedInstanceState.getString(ORIGINAL_NOTE_TITLE);
        mOriginalNoteText = savedInstanceState.getString(ORIGINAL_NOTE_TEXT);

    }

    public void saveState(Bundle outState) {
        outState.putString(ORIGINAL_NOTE_COURSE_ID,mOriginalCourseId);
        outState.putString(ORIGINAL_NOTE_TITLE,mOriginalNoteTitle);
        outState.putString(ORIGINAL_NOTE_TEXT,mOriginalNoteText);

    }
}
