package com.visionarysoftwaresolutions.textjustify;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Little Driver program for text justify.
 */
final class Driver {
    public static void main(final String[] args) {
        System.out.println("Welcome to the text justifier. Enter a string/length to see the string justified to that length. Empty to quit.");
        try (final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String input;
            while(!(input = reader.readLine()).equals("")) {
                final String[] read = input.split("/");
                if (read.length != 2) {
                    throw new IllegalArgumentException("Please pass string/length");
                }
                final String justify = TextJustifier.justify(read[0], Integer.parseInt(read[1]));
                System.out.printf("Original:%s%nJustified:%s%n", read[0], justify);
            }
        } catch (final IOException e) {
            e.printStackTrace();
        }
    }
}
