import java.util.*;
class SumofDigits 
{
	    

	//reverse logic
		public static void reverse(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int num=sc.nextInt();
		int sum=0, rev=0, rem=0;

		while(num!=0)
		{
			rev=rev*10;
			rev=rev+num%10;
			num=num/10;
		}
		System.out.println("reverse is::"+rev);
	}

	//digit logic
	public static void digit(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int num=sc.nextInt();
		int sum=0, rev=0, rem=0;
		while(num!=0){
		rem=num%10;
		num=num/10;
		sum=rem+sum;
		}
		System.out.println("sum is::"+sum);
	}
	
	public static void main(String[] args) 
	{
		reverse();
		digit();
	}
}
