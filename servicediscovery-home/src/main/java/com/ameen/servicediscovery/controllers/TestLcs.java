package com.ameen.servicediscovery.controllers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class TestLcs {
    // Java program to find the stem of given list of
// words


    // function to find the stem (longest common
    // substring) from the string array
    public static String findstem(List<String> input) {
        // Determine size of the array
        int listSize = input.size();

        // Take first word from array as reference
        List<String> sorted = input.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());


        String s = sorted.get(0);
        int len = s.length();

        String res = "";

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; j++) {

                // generating all possible substrings
                // of our reference string arr[0] i.e
                String stem = s.substring(i, j);
                System.out.println("Current stem " + stem);
                int k = 1;
                for (k = 1; k < listSize; k++)

                    // Check if the generated stem is
                    // common to all words
                    if (!sorted.get(k).contains(stem))
                        break;

                // If current substring is present in
                // all strings and its length is greater
                // than current result
                if (k == listSize && res.length() < stem.length())
                    res = stem;
            }
        }

        return res;
    }

    // Driver Code
    public static void main(String args[]) {
        List<String> strList = new ArrayList<String>();
        strList.add("dhameemnnu");
        strList.add("ameennu");
        strList.add("ameenmunnu");

        // Function call
        String stems = findstem(strList);
        System.out.println(stems);
    }
}
