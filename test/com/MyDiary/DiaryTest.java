package com.MyDiary;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testDiaryEntryIsSet(){
        Diary diary = new Diary(5);

        int newDiary = diary.getNumberOfEntries();
        assertEquals(5, newDiary);
    }
    @Test
    void testDiaryEntryIsSNotNull(){
        Diary diary = new Diary(10);

        Entry[] entries = diary.getEntries();
        assertNotNull(entries);
    }

    @Test
    void testViewEntry(){
        //given
        Entry entry = new Entry("My title");
        entry.setEntryBody("Life is good (LG)");
        String preview = entry.viewEntry();
        String expected = ("Title: My title" + "\n"
                + "Entry date: " + LocalDate.now() + "\n" +
                "Entry body: Life is good (LG)");
        //assert
        assertEquals(expected, preview);

        preview = entry.toString();
        assertEquals(expected, preview);
    }
    @Test
    void testDiaryEntryCanBeEntered(){
        //given
        Diary diary = new Diary(5);
        Entry entry = new Entry("My title");
        entry.setEntryBody("Life is good");
        //when
//        diary.addEntry(entry);
//        diary.addEntry(entry);
//        diary.addEntry(entry);

        //assert
//        assertEquals(entry, diary.getEntries());
        Entry[] assertionEntry = new Entry[5];
//        assertionEntry[0] = entry;
//        assertionEntry[1] = entry;
//        assertionEntry[2] = entry;
//        assertArrayEquals(assertionEntry, diary.getEntries());
        for (int i = 0; i < assertionEntry.length; i++) {
            diary.addEntry(entry);
            assertionEntry[i] = entry;
            System.out.println(Arrays.toString(diary.getEntries()));
        } assertArrayEquals(assertionEntry, diary.getEntries());
    }
    @Test
    void testToCheckIfThatTheArrayLengthDoesNotExtendPassItLength(){
        Diary diary = new Diary(5);
        Entry entry = new Entry("My title");
        entry.setEntryBody("Life is good");

        Entry[] assertionEntry = new Entry[5];

        for (int i = 0; i < assertionEntry.length; i++) {
            diary.addEntry(entry);
            assertionEntry[i = 1] = entry;
            System.out.println(Arrays.toString(diary.getEntries()));
        } assertArrayEquals(assertionEntry, diary.getEntries());
    }


}