import java.util.Scanner;
import java.lang.Math;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 julian londono
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner (System.in);
        double order;
        double tax = 0;
        String state, county;
        String tax_wi = "Wisconsin";
        String tax_il = "Illinois";
        String tax_dunn = "Dunn";
        String tax_eau = "Eau Claire";

        System.out.println("What is the order amount?");
        order = input.nextDouble();
        System.out.println("What state do you live in?");
        state = input.next();
        System.out.println("What county do you live in?");
        county = input.next();

        if (state.equals(tax_wi)){
            if (county.equals(tax_dunn)) {
                tax = order * 0.05 + (order * 0.005);
                System.out.print("The tax is $"+ tax);
            }
            else if (county.equals(tax_eau)) {
                tax = order * 0.05 + (order * 0.004);
                System.out.println("The tax is $"+ tax);
            }
            else {
                tax = order * 0.05;
                System.out.println("The tax is $"+ tax);
            }
        }
        else if (state.equals(tax_il)) {
            tax = order * 0.08;
            System.out.println(" The is tax is $" + tax );
        }

        System.out.println("The total is $" + (tax + order));
    }
}
