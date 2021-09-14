/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Emilly Wasson
 */

import java.util.Objects;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.math.RoundingMode;

public class prog20 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        double tax_wi = 0.50;
        double tax_il = 0.80;
        double total;
        Scanner in = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        double amount = in.nextDouble();
        System.out.print("What state do you live in? ");
        in.nextLine();
        String state = in.nextLine();

        if (state.equals("WI")) {
            amount = amount + tax_wi;

            System.out.print("What county do you live in? ");
            String county = in.nextLine();

            if (Objects.equals(county, "Eau Claire")) {
                amount = amount + tax_wi + 0.005;
            } else if (Objects.equals(county, "Dunn")) {
                amount = amount + tax_wi + 0.004;
            }
        } else if (state.equals("IL")) {
            amount = amount + tax_il;
        }
        
        df.setRoundingMode(RoundingMode.UP);
        System.out.println("The total is $" + df.format(amount));
    }
}
