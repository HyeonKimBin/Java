package test;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num[] = new int[5];
		int i = 0;
		int max = 0;
		
		System.out.println("���� 5���� �Է����ּ���.");
		
		while(i<5)
		{
			System.out.print((i+1) + "��° ���� : ");
			num[i] = sc.nextInt();
			
			if(max < num[i])
				max = num[i];
			i++;
		}	
		System.out.print("�Է��� ���� �� �ִ밪�� " + max + "�Դϴ�.");
	}
}
