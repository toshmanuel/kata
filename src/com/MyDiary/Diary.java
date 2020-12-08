package com.MyDiary;

public class Diary {

    private Entry[] entries;
    private int entry1;

    public int getNumberOfEntries() {
        return entries.length;
    }

//    public void setNumberOfEntries(int numberOfEntries) {
//        entries = new Entry[numberOfEntries];
//    }

    public Diary(int numberOfEntries) {
        entries = new Entry[numberOfEntries];
    }

    public Entry[] getEntries() {
        return entries;
    }

    public void addEntry(Entry newDiaryEntry) {
            if (entry1 < entries.length) {
                entries[entry1] = newDiaryEntry;
                entry1++;
        }
    }

}
