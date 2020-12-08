package com.MyDiary;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class EntryTest {

    private Entry entry;

    @BeforeEach
    void setUp() {
        entry = new Entry("");

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatDateExists(){
        //given
//        Entry entry;
        //when
        entry = new Entry("New Entry Title");
        //assert
        assertEquals("New Entry Title", entry.getEntryTitle());
    }

    @Test
    void testDateOfEntryIsCreatedAfterConstruction(){
        entry = new Entry("My Title");

        LocalDateTime localDateTime = entry.getEntryDateAndTime();
        assertNotNull(localDateTime);
        System.out.println(localDateTime);
        LocalDate entryDate = localDateTime.toLocalDate();
        assertEquals(LocalDate.now(), entryDate);
        System.out.println(localDateTime.toString());
    }
    @Test
    void testEntryBodyCanBeEdited(){
        Entry entry = new Entry("New Entry");
        entry.setEntryBody("This is the methods body");
        String bodyEntry = entry.getEntryBody();
        assertEquals("This is the methods body", bodyEntry);
    }

}