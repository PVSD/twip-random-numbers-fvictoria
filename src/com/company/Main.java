package com.company;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
	Random rndm = new Random();
	Int a = 0; int count = 0;
	for(int 0 = 1;i < 100;i++)
	{
	Int a = 1+rndm.nextInt(100);
	System.out.println(a+" ");
	count++;
	if(count > 10)
	{
	System.out.println(" ");
	count = 0;	
	}
		
	}
    }
}
