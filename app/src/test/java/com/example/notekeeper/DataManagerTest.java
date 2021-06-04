package com.example.notekeeper;

import android.provider.ContactsContract;

import junit.framework.TestCase;

public class DataManagerTest extends TestCase {

    public void testCreateNewNote() {
        final CourseInfo course = DataManager.getInstance().getCourse("android_async");
        final  String noteTitle = "Test not title";
        final  String noteText = "This is the body text of my test note";

        int noteIndex = DataManager.getInstance().createNewNote();
        NoteInfo newNote = DataManager.getInstance().getNotes().get(noteIndex);
        newNote.setCourse(course);
        newNote.setTitle(noteTitle);
        newNote.setText(noteText);

        NoteInfo compareNote = DataManager.getInstance().getNotes().get(noteIndex);
        assertEquals(course,compareNote.getCourse());
        assertEquals(noteTitle,compareNote.getTitle());
        assertEquals(noteText,compareNote.getText());

    }
}