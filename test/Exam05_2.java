package test;

import java.util.Scanner;

public class Exam05_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int i = 1;
		int sum = 0;
		
		System.out.print("숫자입력:");
		num = sc.nextInt();
		
		while(i<=num) {
			if(i%2==0) {
				sum -= i;
				System.out.print("-" + i);
			}
			else {
				sum += i;
				System.out.print("+" + i);
			}
			i++;
		}
		System.out.print("=" + sum);
		

	}

}
