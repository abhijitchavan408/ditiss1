// 16. Write a program to check whether a number is a palindrome or not.

import java.util.Scanner;
public class PalindromeNumber {

	public static void main(String[] args) {
		int n,m,d,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number to find out whether it's Palindrome or not: ");
		n=sc.nextInt();
		m=n;
		while(m>0)
		{
			d=m%10;
			m=m/10;
			rev=rev*10+d;
		}
		if(n==rev)
			System.out.println(n+" is a Palindrome number !");
		else 
			System.out.println(n+" is Not a Palindrome number !");
		sc.close();

	}

}
