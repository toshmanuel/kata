package com.exercise.chapterFive.ModifiedTriangleProgram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleProgramTest {

    @Test
    void testThatAsteriskPrinterCanCountValues(){
        //given
        TriangleProgram triangleProgram = new TriangleProgram();
        //when
        triangleProgram.printTriangle_onSameLine();
        //assert
        assertEquals(10, triangleProgram.getAsteriskPrinter());
    }
}