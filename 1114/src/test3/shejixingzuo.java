package test3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class shejixingzuo {

	public static void main(String[] args) {
		for(;;)
		{
		// TODO Auto-generated method stub
		System.out.println("---����ʱ�˳���---");
		System.out.println("1.��ѯ��ǰ����ʱ����Ϣ");
		System.out.println("2.��ѯ�Լ���������Ϣ");
		System.out.println("3.�˳�");
		System.out.println("������1~3ѡ��");
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
			System.out.println("��ǰ����Ϊ��");
			int y=now.get(Calendar.YEAR);
			int m=now.get(Calendar.MONTH)+1;
			int d=now.get(Calendar.DAY_OF_MONTH);
			System.out.println(y+"��"+"-"+m+"��"+"-"+d+"��");
			System.out.println("������������Ы��");
			System.out.println("�������ѣ��������Ƽѡ���ȥ���������쵼�������������˷�ʱ��");
			System.out.println("���죬��ĺ������ƺܲ����Ƚ����׳�Ϊ�Ŷ��е���ͷ����");
		}
		public static void xingzuo(){
				int i=1;
		    System.out.println("����������·�");
		    Scanner sc=new Scanner(System.in);
		    int m=sc.nextInt();
		    System.out.println("�������������");
		    int d=sc.nextInt();
		    shierxingzuo(m,d);
		  }
		public static void shierxingzuo(int m,int d) {
			int i=1;
		    while(i==1){
				if((m==3&&d>=21) || (m==4&&d<=19))
				{
					System.out.println("������");
					System.out.println("�������ѣ�����ƫ�ѡ���ȥ��������Ϊ�������������嶯����");
					System.out.println("������Ҫ��������ǣ����ƫ���˿�������������������������Լ���Ǯ��");
					break;
				}
				if((m==4&&d>=21) || (m==5&&d<=20))
				{
					System.out.println("��ţ��");
					System.out.println("�������ѣ��ཻ������ȥ��������ǫѷ������������������");
					System.out.println("����Ҫ����Ľ����ǣ�����Կ��ǻ������߳�ȥ����˽��������ܻ��ʶ������");
					break;
				}
				if((m==5&&d>=21) || (m==6&&d<=21))
				{
					System.out.println("˫����");
					System.out.println("�������ѣ��������Ƽѡ���ȥ��������Э�������������¾���ս");
					System.out.println("���죬��Ľ������ƺͺ������Ʒǳ�����������˺�����ʱ�򣬲�ҪƮ");
					break;
				}
				if((m==6&&d>=22) || (m==7&&d<=22))
				{
					System.out.println("��з��");
					System.out.println("�������ѣ��������ջ񡡡�ȥ�����úð��ա�����������ʧ����");
					System.out.println("���죬���������˵ĺ��������ȡ������ĲƸ�����������ջ�");
					break;
				}
				if((m==7&&d>=23) || (m==8&&d<=22))
				{
					System.out.println("ʨ����");
					System.out.println("�������ѣ�ע�⹵ͨ����ȥ�������˼Ұѻ�˵�ꡡ�����������ڱ���Լ�");
					System.out.println("������Ҫ������ע����ǣ�������˹�ͨ��ʱ��һ��Ҫ����˵");
					break;
				}
				if((m==8&&d>=23) || (m==9&&d<=20))
				{
					System.out.println("��Ů��");
					System.out.println("�������ѣ����ܻ����������ȥ�����������ҡ���������̫������");
					System.out.println("�����ǱȽ������ھ��������ǻۺ�������һ�죬���ܻ���ΪС�»������");
					break;
				}
				if((m==9&&d>=23) || (m==10&&d<=23))
				{
					System.out.println("�����");
					System.out.println("�������ѣ��������Ƽѡ���ȥ���������쵼�������������˷�ʱ��");
					System.out.println("���죬��ĺ������ƺܲ����Ƚ����׳�Ϊ�Ŷ��е���ͷ����");
					break;
				}
				if((m==10&&d>=24) || (m==11&&d<=22))
				{
					System.out.println("��Ы��");
					System.out.println("�������ѣ��������Ƽѡ���ȥ���������쵼�������������˷�ʱ��");
					System.out.println("���죬��ĺ������ƺܲ����Ƚ����׳�Ϊ�Ŷ��е���ͷ����");
					break;
				}
				if((m==11&&d>=23) || (m==12&&d<=21))
				{
					System.out.println("������");
					System.out.println("�������ѣ�ְ�����Ƽѡ���ȥ������ʵʵ���ڵĹ���������������ͷ����");
					System.out.println("�����Ƕ�ְ����ʿ�ǳ�������һ�죬ְ���ϵ����ڹ������ܷ�");
					break;
				}
				if((m==12&&d>=22) || (m==1&&d<=19))
				{
					System.out.println("Ħ����");
					System.out.println("�������ѣ�ע����ˡ���ȥ������עǮ�������������嶯����");
					System.out.println("������Ҫ������ע����ǣ�����Ҫ�úù�ע�Լ���Ǯ������Ҫ�嶯����");
					break;
				}
				if((m==01&&d>=20) || (m==2&&d<=18))
				{
					System.out.println("ˮƿ��");
					System.out.println("�������ѣ��ر�������ɡ���ȥ�����滺���������������嶯����");
					System.out.println("��������ƺ��ر�������ɣ�����ѧ������ְ����ʿ��˵");
					break;
				}
				if((m==2&&d>=19) || (d==3&&d<=20))
				{
					System.out.println("˫����");
					System.out.println("�������ѣ��ر�������ɡ���ȥ�����滺���������������嶯����");
					System.out.println("��������ƺ��ر�������ɣ�����ѧ������ְ����ʿ��˵");
					break;
				}
		    }
	}
		
}
