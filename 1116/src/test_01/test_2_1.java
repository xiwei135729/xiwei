package test_01;

import java.util.Scanner;

public class test_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person o = new person();
		o.denglu();
		o.xuanze();
	}
}
class person {
	static int number=0;
	public static void denglu() {
		System.out.println("����������˺�");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
	}

	public static void xuanze() {
		for (;;) {
			int i = 0;
			System.out.println("����1��2ѡ����Ҫ����Ĺ��ܣ�");
			System.out.println("1.���");
			System.out.println("2.ȡ��");
			System.out.println("3.�˳�");
			Scanner sc = new Scanner(System.in);
			int number = sc.nextInt();
			switch (number) {
			case 1: {
				System.out.println("1.���");
				momey.cunkuan();

			}
				break;
			case 2: {
				System.out.println("2.ȡ��");
				momey.qukuan();

			}
				;
				break;
			case 3: {
				message();
				System.exit(0);
			}
				;
				break;
			}
		}
	}

	public static void message() {
		int a = number;
		momey b = new momey();
		
		System.out.println("�˺ţ�" + a);
		
		System.out.println("��"+b.sum);
	}
}
class momey {
	static double sum = 0.0;

	public static void cunkuan() {
		System.out.println("��������Ҫ����Ľ�");
		Scanner sc = new Scanner(System.in);
		double number = sc.nextDouble();
		sum = sum + number;
		System.out.println("�㿨�ϵ����Ϊ��" + sum);
	}

	public static void qukuan() {
		System.out.println("��������Ҫȡ���Ľ�");
		Scanner sc = new Scanner(System.in);
		double number = sc.nextDouble();
		
		for(;;) {
		   if(sum<number) {
			 System.out.println("���㣬����������");
			 
			 break;
		   }else {
			   sum = sum - number;
			   break;
		   }
	    }
		System.out.println("�㿨�ϵ����Ϊ��"+sum);
	}
}