package test3;

import java.util.Scanner;

public class test_1114 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		xuanze();
	}
//	public static void shuru() {
//		System.out.println("�������һ������");
//		Scanner sc = new Scanner(System.in);
//		int enternumber=sc.nextInt();
//		System.out.println("������ڶ�������");
//		Scanner sa = new Scanner(System.in);
//		int diergeshu=sc.nextInt();
//	}
	public static void xuanze() {
		System.out.println("������1~4ѡ���/��/��/����");
		Scanner sc = new Scanner(System.in);
		int enternumber=sc.nextInt();
		switch(enternumber)
		{
		case 1:
			System.out.println("�ӷ�");
			System.out.println("�������һ������");
			int a1=sc.nextInt();
			System.out.println("������ڶ�������");
			int b1=sc.nextInt();
			System.out.println(a1+"+"+b1+"="+(double)(a1+b1));
			break;
		case 2:
			System.out.println("����");
			System.out.println("�������һ������");
			int a2=sc.nextInt();
			System.out.println("������ڶ�������");
			int b2=sc.nextInt();
			System.out.println(a2+"-"+b2+"="+(double)(a2-b2));
			break;
		case 3:
			System.out.println("�˷�");
			System.out.println("�������һ������");
			int a3=sc.nextInt();
			System.out.println("������ڶ�������");
			int b3=sc.nextInt();
			System.out.println(a3+"*"+b3+"="+(double)(a3*b3));
			break;
		case 4:
			System.out.println("����");
			System.out.println("�������һ������");
			int a4=sc.nextInt();
			System.out.println("������ڶ�������");
			int b4=sc.nextInt();
			if(b4==0) {
				System.out.println("��������Ϊ�㣬���������룺");
				int b_4=sc.nextInt();
				System.out.println(a4+"/"+b_4+"="+(double)(a4/b_4));
			}else {
			int c4=a4/b4;
			System.out.println(a4+"/"+b4+"="+(double)(a4/b4));
			}
			break;
		default:
			System.out.println("��������ֲ���ȷ");
		}
	}

}
