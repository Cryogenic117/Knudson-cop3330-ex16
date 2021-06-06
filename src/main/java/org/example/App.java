/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Brandon Knudson
 */
package org.example;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        String userInput, result;
        int age, reqAge = 16;
        System.out.print("What is your age? ");
        userInput = input.nextLine();
        age = Integer.parseInt(userInput);

        result = age >= reqAge ? "You are old enough to legally drive." : "You are not old enough to legally drive.";
        System.out.println(result);



    }
}
