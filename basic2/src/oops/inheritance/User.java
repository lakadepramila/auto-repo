package oops.inheritance;

public class User {
public static void main(String[] args) {
	Smartphone phone=new Smartphone();
	phone.internet();
	phone.Texting();
	
	Telephone phone2=new Telephone();
	phone2.calling();
	
	phone2=new Mobile();//object of mobile reference form parent class
	phone2.calling();
	}


}
