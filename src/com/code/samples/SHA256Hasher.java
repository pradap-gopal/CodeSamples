package com.code.samples;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA256Hasher {

	public static String hashString(String input) {
        try {
            // Get an instance of the SHA-256 algorithm MessageDigest object
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            // Convert the input string to bytes using UTF-8 encoding
            byte[] hashBytes = digest.digest(input.getBytes(StandardCharsets.UTF_8));

            // Convert the byte array to a hexadecimal string representation
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            // Handle the case where SHA-256 is not available (highly unlikely in standard Java)
            throw new RuntimeException("SHA-256 algorithm not found", e);
        }
    }

    // Example of how to use the method
    public static void main(String[] args) {
        String originalString = "Hello, World!";
        String hashedString = hashString(originalString);
        System.out.println("Original: " + originalString);
        System.out.println("Hashed (SHA-256): " + hashedString);
    }
}
