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
		System.out.println("请输入你的账号");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
	}

	public static void xuanze() {
		for (;;) {
			int i = 0;
			System.out.println("输入1或2选择你要办理的功能：");
			System.out.println("1.存款");
			System.out.println("2.取款");
			System.out.println("3.退出");
			Scanner sc = new Scanner(System.in);
			int number = sc.nextInt();
			switch (number) {
			case 1: {
				System.out.println("1.存款");
				momey.cunkuan();

			}
				break;
			case 2: {
				System.out.println("2.取款");
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
		
		System.out.println("账号：" + a);
		
		System.out.println("余额："+b.sum);
	}
}
class momey {
	static double sum = 0.0;

	public static void cunkuan() {
		System.out.println("请输入你要存入的金额：");
		Scanner sc = new Scanner(System.in);
		double number = sc.nextDouble();
		sum = sum + number;
		System.out.println("你卡上的余额为￥" + sum);
	}

	public static void qukuan() {
		System.out.println("请输入你要取出的金额：");
		Scanner sc = new Scanner(System.in);
		double number = sc.nextDouble();
		
		for(;;) {
		   if(sum<number) {
			 System.out.println("余额不足，请重新输入");
			 
			 break;
		   }else {
			   sum = sum - number;
			   break;
		   }
	    }
		System.out.println("你卡上的余额为￥"+sum);
	}
}