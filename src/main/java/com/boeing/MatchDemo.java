package com.boeing;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDemo {
    public static ArrayList<String> matchStr(String inputString, String wordToFind)
    {
        Pattern word = Pattern.compile(wordToFind);
        Matcher match = word.matcher(inputString);
        ArrayList<String> foundStr = new ArrayList<>();
        while (match.find()) {
            foundStr.add("Found at: "+ match.start() +" - "+ (match.end()));
        }
        return foundStr;
    }
    public static void main(String [] args){
        System.out.println("Please enter the input");
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();

        System.out.println("Please enter word to find");
        Scanner scanWord = new Scanner(System.in);
        String wordToFind = scanWord.nextLine();

        ArrayList<String> matchStr = matchStr(inputString, wordToFind);
        for (String word: matchStr){
            System.out.println(word);
        }
    }
}

