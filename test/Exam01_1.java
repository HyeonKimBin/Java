package test;

import java.util.Scanner;

public class Exam01_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[5];
		int max = 0;
		
		System.out.println("���� 5���� �Է����ּ���.");
		
		for(int i=0;i<5;i++) {
			System.out.print((i+1) + "��° ���� : ");
			num[i] = sc.nextInt();
			
			if(max < num[i])
				max = num[i];
		}
		System.out.print("�Է��� ���� �� �ִ밪�� " + max + "�Դϴ�.");

	}

}
