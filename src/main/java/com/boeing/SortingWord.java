package com.boeing;

import java.util.Scanner;

public class SortingWord {
    public static void main(String[] args){
        System.out.println("Please enter the statement");
        Scanner scan = new Scanner(System.in);
        String statement = scan.nextLine();
        String [] wordArray = statement.split(" ");
        String temp;
        for(int i = 0; i < wordArray.length; i++){
            for (int j = i + 1; j < wordArray.length; j++)
            {
                if (wordArray[i].compareTo(wordArray[j])>0)
                {
                    temp = wordArray[i];
                    wordArray[i] = wordArray[j];
                    wordArray[j] = temp;
                }
            }
        }
        for(int i = 0; i < wordArray.length; i++){
            System.out.println(wordArray[i]);
        }
    }
}
