package com.ameen.servicediscovery.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestLcsFinal {
    private static void findLcs(List<String> list){
        list.sort((s1, s2) -> s1.length() - s2.length());
        //List<String> possibleSubStrings = findPossibleSubStrings(list.get(0));
        List<String> lcsList = findLcs(list.get(0), list);
        System.err.println(lcsList);
    }

    private static List<String> findLcs(String inputString, List<String> sortedList) {
        List<String> subStrings = new ArrayList<>();
        int length = inputString.length();
        String response = "";

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j <= length; j++) {
                String substring = inputString.substring(i, j);
                int k = 1;
                for (k = 1; k < sortedList.size(); k++) {
                    if (!sortedList.get(i).contains(substring)) {
                        break;
                    }

                    if (k == sortedList.size() && response.length() < substring.length())
                        response = substring;

                }
            }
        }

        return subStrings;
    }



    public static void main(String[] args) {
        List<String> strList = new ArrayList<String>();
        strList.add("dhameemnnu");
        strList.add("ameennu");
        strList.add("ameenmunnu");

        // Function call
         findLcs(strList);
    }
}
