package loop;

import java.util.Scanner;

public class LoopSample {
	public static void main(String ar[]) {
	System.out.println("Enter the numbers");
	Scanner sc=new Scanner(System.in);
	int i=sc.nextInt();
	int sum=0;
	for(int n=0;n<i;n++) {
		sum=sum+n;
	}
	System.out.println("sum:"+sum);
	}
	
	
	

}
