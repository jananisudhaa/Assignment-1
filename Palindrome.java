package week1.day2;

public class Palindrome {
	public static void main(String[] args) {
		int x ,sum=0,temp;
		int n = 34343;
          temp =n;
		for (int i=0;i<5;i++) {
			x = n%10;
			sum=(sum*10) + x;
		n=n/10;
			
		}
		if (temp==sum)
			System.out.println("palindrome");
		else
			System.out.println("not a palindrome");
	}

}
