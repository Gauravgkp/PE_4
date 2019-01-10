package com.boeing;

import java.util.Scanner;

public class FindWord {
    public static void main(String[] args) {
        System.out.println("Please enter the statement");
        Scanner scan = new Scanner(System.in);
        String statement = scan.nextLine();
        String name = "Harry";
        if(statement.contains(name)){
            System.out.println("Is Harry here ? true");
        }else{
            System.out.println("Is Harry here ? false");
        }
    }
}
