/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Khoa Phan
 */
package org.cop3330;

import java.util.Scanner;

public class account {
    private String username;
    private String password;
    public Scanner input = new Scanner(System.in);

    public void create() {
        System.out.print("Enter a username: ");
        this.username = input.nextLine();
        System.out.print("Enter a password: ");
        this.password = input.nextLine();
        System.out.printf("Account successfully create! Please login again below...%n%n");
    }

    public boolean verify() {
        System.out.print("Enter your username: ");
        String username = input.nextLine();
        if (username.equals(this.username)) {
            System.out.print("Enter your password: ");
            String password = input.nextLine();
            if (password.equals(this.password)) {
                return true;
            }
            else {
                System.out.println("Invalid password.");
                return false;
            }
        }
        else {
            System.out.println("Invalid username.");
            return false;
        }
    }
}
