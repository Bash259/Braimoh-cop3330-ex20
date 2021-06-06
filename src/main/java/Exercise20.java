/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
                System.out.println("What is the order amount?");
                Scanner UserInput = new Scanner(System.in);
                double OA = UserInput.nextDouble();
                String state = UserInput.nextLine();

                System.out.println("What is the state?");
                String stateA = UserInput.nextLine();

                if (stateA.equals("Wisconsin")){
                    System.out.println("What county do you live in?");
                    String county = UserInput.nextLine();
                    if (county.equals("Eau Claire")){
                        double tax = 0.050005 * OA;
                        System.out.println("The tax is $"+tax);
                        double total = tax + OA;
                        double money_rounded = Math.floor(total * 100.0 + .5) / 100.0;
                        System.out.println("The total is $"+money_rounded);
                        return;
                    }else if(county.equals("Dunn")){
                        double tax = 0.050004 * OA;
                        System.out.println("The tax is $"+tax);
                        double total = tax + OA;
                        double money_rounded = Math.floor(total * 100.0 + .5) / 100.0;
                        System.out.println("The total is $"+money_rounded);
                        return;
                    }
                    double tax = 0.05 * OA;
                    System.out.println("The tax is $"+tax);
                    double total = tax + OA;
                    double money_rounded = Math.floor(total * 100.0 + .5) / 100.0;
                    System.out.println("The total is $"+money_rounded);
                    return;
                }
        if(stateA.equals("Illinois")){
            double tax = 0.08 * OA;
            System.out.println("The tax is $"+tax);
            double total = tax + OA;
            System.out.println("The total is $"+total);
            return;
        }
        System.out.println("The total is $"+OA);
            }
        }

