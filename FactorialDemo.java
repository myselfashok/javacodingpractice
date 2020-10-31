//factorial of no.

import java.util.*;
class  FactorialDemo
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int num=sc.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++){
			fact=fact*i;
		}
		System.out.println("Fact"+fact);
	}
}
