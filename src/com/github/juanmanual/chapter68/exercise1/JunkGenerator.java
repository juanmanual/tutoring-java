package com.github.juanmanual.chapter68.exercise1;

import java.util.*;

public class JunkGenerator {
    /**
     * Replaces '*' in standard in with the first argument,
     * then prints to standard out
     */
    public static void main (String args[]) {
        // abort if a replacement is not provided
        if(args.length != 1) {
            throw new RuntimeException("args must have length 1");
        }
        // get the first argument
        String name = args[0];

        Scanner reader = new Scanner(System.in);

        // read from standard in until it's done
        while(reader.hasNextLine()) {
            // Get the first line, then replace
            // all of the '*' characters with name.
            // 
            // String#replaceAll is based on regex.
            // since '*' is a special character in regex,
            // we have to escape it with two \\
            String template = reader.nextLine();
            String line = template.replaceAll("\\*", name);
            System.out.println(line);
        }
        // close standard in for reading
        reader.close();
    }
}