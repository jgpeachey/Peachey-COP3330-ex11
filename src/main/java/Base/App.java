/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 John Peachey
 */

package Base;

/*
Write a program that converts currency. Specifically, convert euros to U.S.
dollars. Prompt for the amount of money in euros you have, and prompt for
the current exchange rate of the euro. Print out the new amount in U.S. dollars.

The formula for currency conversion is:
amount_to = (amount_from * rate_from) / rate_to

where:
amount_to is the amount in U.S. dollars.
amount_from is the amount in euros.
rate_from is the current exchange rate in euros.
rate_to is the current exchange rate of the U.S. dollar.

Example Output:
How many euros are you exchanging? 81
What is the exchange rate? 137.51
81 euros at an exchange rate of 137.51 is
111.38 U.S. dollars.

Constraints:
Ensure that fractions of a cent are rounded up to the next penny.
Use a single output statement.

Challenges:
*Build a dictionary of conversion rates and prompt for the countries
instead of the rates.
*Wire up your application to an external API that provides the current
exchange rates.
 */

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("How many euros are you exchanging?");
        double eamount = in.nextDouble();
        System.out.println("What is the exchange rate?");
        double rate = in.nextDouble();

        double damount = Math.round(eamount*rate)/100.0; //instead of Math.round(eamount*(rate/100)) this allows for the pennies to be whole numbers for easier rounding
        //You don't need the rate_to for calculation since you just convert the rate to its percent value

        System.out.println(eamount+" euros at an exchange rate of "+rate+" is "+damount+" U.S. dollars.");
    }
}
