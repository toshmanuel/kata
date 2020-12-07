package com.MyDiary;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Entry {

    private String title;

    private LocalDateTime localDateTime;
    private String body;

    public Entry(String title) {
        this.title = title;
        localDateTime = LocalDateTime.now();
    }

    public void setEntryTitle(String title) {
        this.title = title;
    }

    public String getEntryTitle() {
        return title;
    }

    public LocalDateTime getEntryDateAndTime() {
        return localDateTime;
    }

    public String getEntryBody() {
        return body;
    }

    public void setEntryBody(String body) {
        this.body = body;
    }

    public String viewEntry() {
        return ("Title: " + getEntryTitle() + "\n"
                + "Entry date: " + LocalDate.now() + "\n" +
                "Entry body: " + getEntryBody());
    }

    @Override
    public String toString(){
        return viewEntry();
    }
}
