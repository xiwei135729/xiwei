package test3;
import java.util.Scanner;
public class paixu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,temp=0;
		int [] score1=new int[10];
		System.out.println("ÇëÊäÈë10¸öÊı£º");
		Scanner input =new Scanner(System.in);
		for(i=0;i<10;i++)
		{
			score1[i]=input.nextInt();
		}
		for(i=0;i<10;i++){
			
			for(j=0;j<10-i-1;j++)
			{
				if(score1[j]<score1[j+1]) {
					temp=score1[j];
					score1[j]=score1[j+1];
					score1[j+1]=temp;
				}
			}
		}
		for(i=0;i<10;i++) {
		System.out.println(score1[i]);
		}
	}
}
