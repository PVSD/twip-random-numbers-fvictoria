package com.company;
import java.util.Random;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Random rndm = new Random();
        int count = 0;
        int total = 0;
        Scanner kbReader = new Scanner(System.in);
        System.out.println("Would you like to run the loop 10x, 100x, or 1000x?");
        int loopNum = kbReader.nextInt();
        for(int i = 0;i <=loopNum ;i++)
        {
            int a = 1+rndm.nextInt(100);
            System.out.println(a);
            count++;
            total+= count;

        }
        int Avg = total/loopNum;
        System.out.println("\n"+"The average for "+loopNum+" runs is "+Avg);
    }
}
