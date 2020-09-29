package Lab6;

import java.util.StringTokenizer;

public class Ex_StrToken {

    public static void main(String[] args) {

        String msg = "It may take only a minute to like someone, only an hour to have a crush on someone and only a day to love someone but it will take a lifetime to forget someone.";

        System.out.println(msg.length());

        StringTokenizer myToken = new StringTokenizer(msg);
        System.out.println(myToken.countTokens());  // return word count as integer


        while (myToken.hasMoreTokens()){
            System.out.println(myToken.nextToken());
        }
    }
}