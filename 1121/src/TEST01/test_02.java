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
//		System.out.println("��������Ʒ������");
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
//		System.out.println("����������Ҫ������Ʒ");
//		Scanner s=new Scanner(System.in);
//		String st=s.next();
//		String b=st;
//		rukushuliang();
//		System.out.println("��Ʒ��"+b+"�ѳɹ����");
//		
//	}
//	public void rukushuliang() {
//		System.out.println("����������Ҫ������Ʒ������");
//		Scanner s=new Scanner(System.in);
//		int sp=s.nextInt();
//		System.out.println("��Ʒ�������Ϊ��"+sp);
//		
//	}
//	public void shuchu() {
//		System.out.println("��Ʒ:");
//		System.out.println("����:");
//	}
}
class shop{
	 static int sp;

	//	public void people() {
//		System.out.println("���������������");
//		Scanner sc=new Scanner(System.in);
//		String name=sc.next();
//		System.out.println(name+"����ã�");
//		System.out.println("������1/2/3ѡ����Ҫ���еĲ���");
//		System.out.println("1.������Ʒ");
//		System.out.println("2.�����Ʒ");
//		System.out.println("3.�˳�");
//		Scanner s=new Scanner(System.in);
//		int spp=s.nextInt();
//		switch(spp) {
//		case 1:{
//			System.out.println("1.������Ʒ");
//			goumai();
//		}
//		case 2:{
//			System.out.println("2.�����Ʒ");
//			ruku();
//		}
//		case 3:{
//			System.exit(0);
//		}
//	  }
//	}
	public static void ruku() {
		System.out.println("����������Ҫ������Ʒ");
		Scanner s=new Scanner(System.in);
		String st=s.next();
		shangping.b=st;
		System.out.println("����������Ҫ������Ʒ������");
		Scanner c=new Scanner(System.in);
		sp=c.nextInt();
		System.out.println("��Ʒ��"+shangping.b+"�ѳɹ����"+"\t"+"��Ʒ�������Ϊ��"+sp);
		
	}
	public static void goumai() {
		shangping a=new shangping();
		shop h=new shop();
		
		System.out.println("���������������");
		Scanner scc=new Scanner(System.in);
		String name=scc.next();
		System.out.println(name+"����ã�");
		System.out.println("��������Ҫ�������Ʒ��");
		Scanner sc=new Scanner(System.in);
		String shopping=sc.next();
		while(true) {
		if(shangping.b.equals(shopping)){
			System.out.println("��������Ҫ�����������");
			while(true){
				Scanner sl=new Scanner(System.in);
				int sl1=sl.nextInt();
				int r;
				if(sl1<=sp){
					System.out.println("����ɹ�");
					System.out.println("ʣ����Ϊ��"+(sp-sl1));
					System.exit(0);
				}
				else {
					System.out.println("����ʧ�ܣ�");
					System.out.println("ʣ����Ʒ����Ϊ:"+sp+"��治��");
					System.exit(0);
				}
				break;
			}

		}
		else
		{
			System.out.println("�޴���Ʒ�������²���");
			break;
		}
	  }
		
	}
	
}