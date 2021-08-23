package com.ameen.servicediscovery.controllers;

import java.util.ArrayList;
import java.util.List;

public class TestAllSubStrings {
    public static void main(String args[]){
        String s = "Ameen1";
        List<String> sList = new ArrayList<String>();
        for(int i =0; i< s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String temp = s.substring(i,j);
                sList.add(temp);

            }
        }

        System.err.println(sList);
    }
}
