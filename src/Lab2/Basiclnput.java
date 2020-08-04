package Lab2;

import  java.util.Scanner;

public class Basiclnput {

    public static  void  main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;
        System.out.println("What is your name? : ");
        name = scanner.nextLine();
        System.out.println("You name is " + name);

        System.out.println("What is your major? : ");
        String major = scanner.nextLine();
        System.out.println("your is major " +major);

        System.out.println("How old are you? : ");
        String old = scanner.nextLine();
        System.out.println("your is old " +old);

        System.out.println("Your email? : ");
        String email = scanner.nextLine();
        System.out.println("your is email " +email);

    }
    }//main
