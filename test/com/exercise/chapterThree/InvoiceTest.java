package com.exercise.chapterThree;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {
    Invoice newInvoice;

    @BeforeEach
    void setUp() {
        System.out.println("Starting from:");
        newInvoice = new Invoice("10112", "Engine", 10, 12.2);
//        System.out.printf("%s%n%s%n%d%n%f%n",newInvoice.getPartNumber(),newInvoice.getPartDescription(), newInvoice.getQuantityOfItemsPurchased(),newInvoice.getPricePerItem());
    }

    @AfterEach
    void tearDown() {
        newInvoice = null;
        System.out.println("Ending this line of test:");
    }
    @Test
    void testIfProductPartNumberCanBeSet(){
        newInvoice.setPartNumber("10021");
        assertEquals("10021", newInvoice.getPartNumber());
        System.out.println("part number is "+newInvoice.getPartNumber());
    }
    @Test
    void testIfProductPartDescriptionCanBeInputted(){
        newInvoice.setPartDescription("This is the Engine");
        assertEquals("This is the Engine", newInvoice.getPartDescription());
        System.out.println(newInvoice.getPartDescription());
    }
    @Test
    void testIfQuantityOfItemsPurchasedCanBeInputted(){
        newInvoice.setQuantityOfItemsPurchased(2);
        assertEquals(2, newInvoice.getQuantityOfItemsPurchased());
        System.out.println(newInvoice.getQuantityOfItemsPurchased());
    }
    @Test
    void testIfPricePerItemCanBeSet(){
        newInvoice.setPricePerItem(10);
        assertEquals(10.0, newInvoice.getPricePerItem());
        System.out.println(newInvoice.getPricePerItem());
    }
    @Test
    void testForInvoiceAmount(){
        newInvoice.setPartDescription("This is the Engine");
        newInvoice.setPartNumber("11023");
        newInvoice.setPricePerItem(1500.0);
        newInvoice.setQuantityOfItemsPurchased(10);
        newInvoice.setAmount();
        assertEquals(15000, newInvoice.getInvoiceAmount());
        System.out.println(newInvoice.getInvoiceAmount());

        newInvoice.setPricePerItem(200);
        newInvoice.setQuantityOfItemsPurchased(100);
        newInvoice.setAmount();
        assertEquals(20000, newInvoice.getInvoiceAmount());
        System.out.println(newInvoice.getInvoiceAmount());
    }

    @Test
    void testIfThePricePerItemCannotBeLessThanOrEqualToZero(){
        newInvoice.setPricePerItem(-2);
        newInvoice.setQuantityOfItemsPurchased(100);
        newInvoice.setAmount();
        assertEquals(0, newInvoice.getInvoiceAmount());
        System.out.println(newInvoice.getInvoiceAmount());

        newInvoice.setPricePerItem(-100);
        newInvoice.setQuantityOfItemsPurchased(100);
        newInvoice.setAmount();
        assertEquals(0, newInvoice.getInvoiceAmount());
        System.out.println(newInvoice.getInvoiceAmount());
    }
    @Test
    void testIfTheQuantityOfItemsPurchasedCannotBeLessThanOrEqualToZero(){
        newInvoice.setPricePerItem(100);
        newInvoice.setQuantityOfItemsPurchased(-2);
        newInvoice.setAmount();
        assertEquals(0, newInvoice.getInvoiceAmount());
        System.out.println(newInvoice.getInvoiceAmount());

        newInvoice.setPricePerItem(100);
        newInvoice.setQuantityOfItemsPurchased(-100);
        newInvoice.setAmount();
        assertEquals(0, newInvoice.getInvoiceAmount());
        System.out.println(newInvoice.getInvoiceAmount());
    }
}
