package net.codejava.swing;
/*
Making a calendar of month june.
 */
import java.util.Scanner;

public class Mai {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println();
        System.out.print("Please enter the number of days in the month: ");
        int days = console.nextInt();
        System.out.print("Please enter the number of the day of the first Sunday: ");
        int sunday = console.nextInt();
        System.out.println();

        calendarHeader();
        borderTopBottom();
        calendarBody(sunday, days);
        borderTopBottom();
    }

    static double getInt(Scanner sc, String s) {
        int d = 0;
        System.out.print(s);
        d = sc.nextInt();

        return d;
    }

    static void calendarBody(int sunday, int days) {
        int temp = 8 - sunday;
        if (sunday == 1) {
            System.out.printf(""); // if sunday is on 1st day, then do not print any spaces
        } else
            for (int space = 1; space <= temp; space++) { // Prints spaces to the first row if no days are listed
                System.out.print("|");
                System.out.printf("%6s", " ");
            }

        for (int i = 1; i <= days; i++) { // Printing the days
            temp++;
            if (temp % 7 == 0)
                System.out.println("|" + padded(i, 4) + " " + "|");
            else
                System.out.print("|" + padded(i, 4) + " ");

        }

        for (int j = days; j < 35; j++) {
            System.out.print("|");
            System.out.printf("%6s", " ");
        }

        sunday = (sunday + days) % 7;
    }

    static void calendarHeader() {
        System.out.print(" Sun ");
        System.out.print("Mon ");
        System.out.print("Tue ");
        System.out.print("Wed ");
        System.out.print("Thu ");
        System.out.print("Fri ");
        System.out.print("Sat");
    }

    static void borderTopBottom() {
        System.out.println();
        for (int i = 1; i <= 7; i++) {
            System.out.print("+");
            for (int j = 1; j <= 6; j++) {
                System.out.print("-");
            }
        }

        System.out.print("+");
        System.out.println();
    }

    public static String padded(int n, int width) {
        String s = "" + n;
        for (int i = s.length(); i < width; i++) {
            s = " " + s;
        }

        return s;
    }
}