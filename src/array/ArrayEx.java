package array;

import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		
		long cd[][]=new long[4][4];
		long kotak[][]=new long[4][];
		
	
			
				for(int j=0;j<4;j++)
				{
			System.out.println("enter the accNo:");
			long accNo=s.nextLong();
			cd[i][j]=accNo;
			
			System.out.println("enter adharrNo:");
			long adhaarno=s.nextLong();
			cd[i][j]=adhaarno;
			
			System.out.println("enter bal");
			long bal=s.nextLong();
			cd[i][j]=bal;
			
			
			System.out.println("enter mobile no");
			long phnnum=s.nextLong();
			cd[i][]=phnnum;
			    
			
			}
			
			for(int i=0;i<4;i++)
			{
				for(int j=0;j<4;j++)
			
			System.out.println(kotak[i][j]);
			
			}
		   
		
	}

}
