
package com.company;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String Name;
        String Greetings;
        String message;
        int ageGap;
        int userAge;

        Scanner input = new Scanner(System.in);
        Random generate = new Random();
        Calendar cal = Calendar.getInstance();

        int appAge = generate.nextInt(90-18)+18;

        int Am_Pm = cal.get(Calendar.AM_PM);

        message = "Enter Your Name";

        System.out.println(message);

        Name = input.nextLine();

        if(Am_Pm == 1){

            Greetings = "Good Afternoon";
        }else{

            Greetings = "Good Morning";
        }
        System.out.println(Greetings + " " + Name + " "+ "Provide Your Age.");

        userAge = input.nextInt();

        System.out.println("I am " + userAge + " years old.");

        if(appAge > userAge){

            ageGap = appAge - userAge;

            message = " Older";

            System.out.println("My age is " + appAge + ", Which is " + ageGap+" "+ message+ " than you.");
        }else{

            ageGap = userAge - appAge;

            message = "Younger";

            System.out.println("My age is " + appAge + ", Which is " + ageGap+" "+ message+ " than you.");
        }

        System.out.println("Twice my age would be " + appAge*2);

        if (appAge % 2 == 0){

            message = "even";
        }else{
            message = "odd";
        }

        System.out.println("My age is an "+ message+ " number.");

        System.exit(0);

    }
}
