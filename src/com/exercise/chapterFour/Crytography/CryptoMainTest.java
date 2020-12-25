package com.exercise.chapterFour.Crytography;

public class CryptoMainTest {
    public static void main(String[] args) {
        Cryptography crypto = new Cryptography();
        crypto.setPin();

        System.out.println("Pin is: " + crypto.getPin());
        System.out.println("Encrypted pin is: " + crypto.getEncryptedPin());
        System.out.println("Decrypted pin is: " + crypto.getDecryptedPin());
    }
}
