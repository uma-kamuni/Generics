package com.bridgelabz;

import java.util.Scanner;

public class Comparison {
	public static void max_int() {
		int num1,num2,num3;
		Scanner sc = new Scanner(System.in);
				System.out.println("Enter First Number:");
				num1=sc.nextInt();
				System.out.println("Enter Second Number:");
				num2=sc.nextInt();
				System.out.println("Enter Third Number:");
				num3=sc.nextInt();
				if(num1>num2 && num1>num3)
				System.out.println("The Maximun Number Among 3 Numbers Is:"+num1);
				else if(num2>num1 && num2>num3)
					System.out.println("The Maximun Number Among 3 Numbers Is:"+num2);
				else
					System.out.println("The Maximun Number Among 3 Numbers Is:"+num3);	
	}


}
