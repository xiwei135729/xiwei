package test_01;

import java.util.Scanner;

public class test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank p=new bank();
		p.cunru();
	}

}
class user{
	int zhanghao,password;
	String name,dizhi;
	double yue;
	
}
class bank{
	String name,jiedao;
	public static void cunru(){
//		int i;
//		int [] name=new int[20];
//		System.out.println("请输入账号");
//		Scanner sc=new Scanner(System.in);
//		for(i=0;i<20;i++)
//		{
//			name[i]=sc.nextInt();
//			if(name[i]==name[i+1])
//			{
//				System.out.println("账号重复，请重新输入：");
//				Scanner s=new Scanner(System.in);
//				name[i]=sc.nextInt();
//			}	
//		}
	}
	static double balance;
	public static void cunqian(double m) {
		balance=balance+m;
		System.out.println("该用户存款金额为:"+m);
	}
	public static boolean quqian(float m) {
		if(m<=balance)
		{	
			balance-=m;	
			System.out.println("成功取款:"+m);	
			return true;	
		}
		else		
		{			
			System.out.println("所取金额数大于账户余额:");
			return false;		
		}
	}
	public double select() {
		System.out.println("账户余额为："+balance);
		return balance;
		
	}
}
