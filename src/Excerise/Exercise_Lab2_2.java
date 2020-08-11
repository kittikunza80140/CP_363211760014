package Excerise;

import java.util.Scanner;

//triangle area = 0.5*base*high
public  class  Exercise_Lab2_2 {
    public  static  void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("ฺBase:");
        double base = scanner.nextDouble();
        System.out.print("high:");
        double high = scanner.nextDouble();

        double area = 0.5 * base * high;
        System.out.println("Triangle area"+area);



        }
    }
