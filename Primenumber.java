package week1.day2;

public class Primenumber {
	public static void main(String[] args) {
		int input =12;
		boolean flag=false;
		int n= input/2;
		for (int i = 2; i <= n; i++) {
			if (input%i==0) {
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.println("prime number");
			
		}
		else {
			System.out.println("not a prime number");
		}
}
}
