package com.example.notesapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Date;
import java.util.ArrayList;

public class Note {
    public static ArrayList<Note> noteArrayList = new ArrayList<>();
    public static String NOTE_EDIT_EXTRA =  "noteEdit";

    private int id;
    private String title;
    private String DateTime;
    private String CourseId;
    private String Description;
    private Date deleted;

    public Note(int id, String title, String DateTime,String CourseId,String Description, Date deleted)
    {
        this.id = id;
        this.title = title;
        this.DateTime = DateTime;
        this.CourseId = CourseId;
        this.Description = Description;
        this.deleted = deleted;
    }

    public Note(int id, String title, String DateTime, String CourseId, String Description)
    {
        this.id = id;
        this.title = title;
        this.DateTime = DateTime;
        this.CourseId = CourseId;
        this.Description = Description;
        deleted = null;
    }

    @Nullable
    public static Note getNoteForID(int passedNoteID) {
        for (Note note : noteArrayList)
        {
            if(note.getId() == passedNoteID)
                return note;
        }

        return null;
    }

    @NonNull
    public static ArrayList<Note> nonDeletedNotes()
    {
        ArrayList<Note> nonDeleted = new ArrayList<>();
        for(Note note : noteArrayList)
        {
            if(note.getDeleted() == null)
                nonDeleted.add(note);
        }

        return nonDeleted;
    }


    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String getDateTime() {

        return DateTime;
    }

    public void setDateTime(String DateTime) {

        this.DateTime = DateTime;
    }

    public String getCourseId() {

        return CourseId;
    }

    public void setCourseId(String CourseId) {

        this.CourseId = CourseId;
    }

    public String getDescription() {

        return Description;
    }

    public void setDescription(String Description) {

        this.Description = Description;
    }

    public Date getDeleted() {

        return deleted;
    }

    public void setDeleted(Date deleted) {

        this.deleted = deleted;
    }
}
