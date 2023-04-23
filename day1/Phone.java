package week1.day1;

public class Phone{
	
	public void makecall(){
		System.out.println("make a call");
	}
	String model="galaxy12";
	float weight=12.4f;
	public void sendmsg(){
System.out.println("allow to send msg");
	}
	int cost= 10000;
	boolean fullycharged=true;
public static void main(String[] args) {
	Phone obj =new Phone();
	obj.makecall();
	obj.sendmsg();
	}
	
}
	
	


