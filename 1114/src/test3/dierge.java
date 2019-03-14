package test3;
import java.util.Scanner;
public class dierge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
//		int [] score1=new int[]{1,2,3,4};
		int [] score1=new int[4];
		Scanner input =new Scanner(System.in);
		for(i=0;i<4;i++) {
			score1[i]=input.nextInt();
			System.out.println(score1[i]);
		}

	}

}
