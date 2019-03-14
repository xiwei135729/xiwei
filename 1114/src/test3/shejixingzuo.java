package test3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class shejixingzuo {

	public static void main(String[] args) {
		for(;;)
		{
		// TODO Auto-generated method stub
		System.out.println("---星座时运程序---");
		System.out.println("1.查询当前星座时运信息");
		System.out.println("2.查询自己的星座信息");
		System.out.println("3.退出");
		System.out.println("请输入1~3选择");
		Scanner sc=new Scanner(System.in);
		int numbe=sc.nextInt();
		switch(numbe){
		case 1:
			riqi();
			break;
		case 2:
			xingzuo();
			break;
		case 3:
			System.exit(0);
			}
		}
	}
		public static void riqi(){
			Calendar now=Calendar.getInstance();
			System.out.println("当前日期为：");
			int y=now.get(Calendar.YEAR);
			int m=now.get(Calendar.MONTH)+1;
			int d=now.get(Calendar.DAY_OF_MONTH);
			System.out.println(y+"年"+"-"+m+"月"+"-"+d+"日");
			System.out.println("今日星座：天蝎座");
			System.out.println("今日提醒：合作运势佳　　去做：发挥领导力　　别做：浪费时机");
			System.out.println("今天，你的合作运势很不错，比较容易成为团队中的领头人物");
		}
		public static void xingzuo(){
				int i=1;
		    System.out.println("请输入你的月份");
		    Scanner sc=new Scanner(System.in);
		    int m=sc.nextInt();
		    System.out.println("请输入你的日期");
		    int d=sc.nextInt();
		    shierxingzuo(m,d);
		  }
		public static void shierxingzuo(int m,int d) {
			int i=1;
		    while(i==1){
				if((m==3&&d>=21) || (m==4&&d<=19))
				{
					System.out.println("白羊座");
					System.out.println("今日提醒：财运偏佳　　去做：量入为出　　别做：冲动消费");
					System.out.println("今天需要提醒你的是，你的偏财运看起来不错，不过，如果不看紧自己的钱包");
					break;
				}
				if((m==4&&d>=21) || (m==5&&d<=20))
				{
					System.out.println("金牛座");
					System.out.println("今日提醒：多交流　　去做：保持谦逊　　别做：过于自我");
					System.out.println("今天要给你的建议是，你可以考虑积极的走出去与别人交流，可能会结识新朋友");
					break;
				}
				if((m==5&&d>=21) || (m==6&&d<=21))
				{
					System.out.println("双子座");
					System.out.println("今日提醒：合作运势佳　　去做：齐心协力　　别做：孤军奋战");
					System.out.println("今天，你的交际运势和合作运势非常不错，在与别人合作的时候，不要飘");
					break;
				}
				if((m==6&&d>=22) || (m==7&&d<=22))
				{
					System.out.println("巨蟹座");
					System.out.println("今日提醒：有意外收获　　去做：好好把握　　别做：错失良机");
					System.out.println("今天，借由与他人的合作，你会取得意外的财富或者意外的收获");
					break;
				}
				if((m==7&&d>=23) || (m==8&&d<=22))
				{
					System.out.println("狮子座");
					System.out.println("今日提醒：注意沟通　　去做：听人家把话说完　　别做：急于表达自己");
					System.out.println("今天需要提醒你注意的是，在与别人沟通的时候，一定要听人说");
					break;
				}
				if((m==8&&d>=23) || (m==9&&d<=20))
				{
					System.out.println("处女座");
					System.out.println("今日提醒：可能获得启发　　去做：提升自我　　别做：太过刻意");
					System.out.println("今天是比较容易在精神方面获得智慧和启发的一天，可能会因为小事获得启发");
					break;
				}
				if((m==9&&d>=23) || (m==10&&d<=23))
				{
					System.out.println("天秤座");
					System.out.println("今日提醒：合作运势佳　　去做：发挥领导力　　别做：浪费时机");
					System.out.println("今天，你的合作运势很不错，比较容易成为团队中的领头人物");
					break;
				}
				if((m==10&&d>=24) || (m==11&&d<=22))
				{
					System.out.println("天蝎座");
					System.out.println("今日提醒：合作运势佳　　去做：发挥领导力　　别做：浪费时机");
					System.out.println("今天，你的合作运势很不错，比较容易成为团队中的领头人物");
					break;
				}
				if((m==11&&d>=23) || (m==12&&d<=21))
				{
					System.out.println("射手座");
					System.out.println("今日提醒：职场运势佳　　去做：做实实在在的工作　　别做：虚头巴脑");
					System.out.println("今天是对职场人士非常有利的一天，职场上的你在工作中能飞");
					break;
				}
				if((m==12&&d>=22) || (m==1&&d<=19))
				{
					System.out.println("摩羯座");
					System.out.println("今日提醒：注意财运　　去做：关注钱包　　别做：冲动消费");
					System.out.println("今天需要提醒你注意的是，你需要好好关注自己的钱包，不要冲动购物");
					break;
				}
				if((m==01&&d>=20) || (m==2&&d<=18))
				{
					System.out.println("水瓶座");
					System.out.println("今日提醒：特别渴望自由　　去做：舒缓情绪　　别做：冲动决定");
					System.out.println("今天的你似乎特别渴望自由，对于学生党和职场人士来说");
					break;
				}
				if((m==2&&d>=19) || (d==3&&d<=20))
				{
					System.out.println("双鱼座");
					System.out.println("今日提醒：特别渴望自由　　去做：舒缓情绪　　别做：冲动决定");
					System.out.println("今天的你似乎特别渴望自由，对于学生党和职场人士来说");
					break;
				}
		    }
	}
		
}
