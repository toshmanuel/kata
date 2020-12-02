package com.exercise.chapterThree;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class HealthProfileTest {

    HealthProfile profile;

    @BeforeEach
    void setUp() {
        profile = new HealthProfile();
    }

    @AfterEach
    void tearDown() {
    }
}