/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Khoa Phan
 */
package org.cop3330;

public class App 
{
    public static void main( String[] args )
    {
        account account = new account();
        System.out.printf("*** Account Creation ***%n");
        account.create();
        boolean verify = account.verify();
        if (verify) {
            System.out.println("Login successful!");
        }
        else {
            System.out.println("You have 2 minutes until the cops get there.");
        }
    }
}
