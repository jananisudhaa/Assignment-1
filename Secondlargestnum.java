package week1.day2;

import java.util.Arrays;

public class Secondlargestnum {
public static void main(String[] args) {
	int array[]= {23,45,67,32,89,22};
	int length=array.length;
	Arrays.sort(array);
	for(int i=0;i<array.length;i++)
	{
		System.out.println(array[i]);
	}
	System.out.println("second largest num"+array[length-2]);
}
}
