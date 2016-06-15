package com.visionarysoftwaresolutions.textjustify;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Little Driver program for text justify.
 */
final class Driver {
    public static void main(final String[] args) {
        System.out.println("Welcome to the text justifier. Enter a string/length/mode to see the string justified to that length in that mode. Empty to quit.");
        System.out.println("valid modes are { LEFT, CENTER, RIGHT, FULL} ");
        try (final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String input;
            while(!(input = reader.readLine()).equals("")) {
                final String[] read = input.split("/");
                if (read.length != 3) {
                    throw new IllegalArgumentException("Please pass string/length/mode");
                }
                final JustificationStrategy strat = TextJustifier.valueOf(read[2]);
                final String justify = strat.justify(read[0], Integer.parseInt(read[1]));
                System.out.printf("Original:%s%nJustified:%s%n", read[0], justify);
            }
        } catch (final IOException e) {
            e.printStackTrace();
        }
    }
}
