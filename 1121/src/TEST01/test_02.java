package TEST01;

import java.util.Scanner;

public class test_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	shangping p=new shangping();
	shop d=new shop();
	d.ruku();
	d.goumai();
	}
}
class shangping{
//	static String name;
//	private int total;
//	static double count;
	static String b;
//	public double shangping() {
//		System.out.println("请输入商品的数量");
//		Scanner sc=new Scanner(System.in);
//		int count=sc.nextInt();
//		return count;
//	}
//	public shangping(int count) {
//		this();
//		System.out.println(count);
//	}
//	public void ruku() {
//		
//		System.out.println("请输入你需要入库的商品");
//		Scanner s=new Scanner(System.in);
//		String st=s.next();
//		String b=st;
//		rukushuliang();
//		System.out.println("商品："+b+"已成功入库");
//		
//	}
//	public void rukushuliang() {
//		System.out.println("请输入你需要入库的商品的数量");
//		Scanner s=new Scanner(System.in);
//		int sp=s.nextInt();
//		System.out.println("商品入库数量为："+sp);
//		
//	}
//	public void shuchu() {
//		System.out.println("商品:");
//		System.out.println("数量:");
//	}
}
class shop{
	 static int sp;

	//	public void people() {
//		System.out.println("请输入你的姓名：");
//		Scanner sc=new Scanner(System.in);
//		String name=sc.next();
//		System.out.println(name+"，你好！");
//		System.out.println("请输入1/2/3选择你要进行的操作");
//		System.out.println("1.购买商品");
//		System.out.println("2.入库商品");
//		System.out.println("3.退出");
//		Scanner s=new Scanner(System.in);
//		int spp=s.nextInt();
//		switch(spp) {
//		case 1:{
//			System.out.println("1.购买商品");
//			goumai();
//		}
//		case 2:{
//			System.out.println("2.入库商品");
//			ruku();
//		}
//		case 3:{
//			System.exit(0);
//		}
//	  }
//	}
	public static void ruku() {
		System.out.println("请输入你需要入库的商品");
		Scanner s=new Scanner(System.in);
		String st=s.next();
		shangping.b=st;
		System.out.println("请输入你需要入库的商品的数量");
		Scanner c=new Scanner(System.in);
		sp=c.nextInt();
		System.out.println("商品："+shangping.b+"已成功入库"+"\t"+"商品入库数量为："+sp);
		
	}
	public static void goumai() {
		shangping a=new shangping();
		shop h=new shop();
		
		System.out.println("请输入你的姓名：");
		Scanner scc=new Scanner(System.in);
		String name=scc.next();
		System.out.println(name+"，你好！");
		System.out.println("请输入你要购买的商品：");
		Scanner sc=new Scanner(System.in);
		String shopping=sc.next();
		while(true) {
		if(shangping.b.equals(shopping)){
			System.out.println("请输入您要购买的数量：");
			while(true){
				Scanner sl=new Scanner(System.in);
				int sl1=sl.nextInt();
				int r;
				if(sl1<=sp){
					System.out.println("购买成功");
					System.out.println("剩余库存为："+(sp-sl1));
					System.exit(0);
				}
				else {
					System.out.println("购买失败！");
					System.out.println("剩余商品数量为:"+sp+"库存不足");
					System.exit(0);
				}
				break;
			}

		}
		else
		{
			System.out.println("无此商品，请重新操作");
			break;
		}
	  }
		
	}
	
}