package org.phone;

public class PhoneInfo
{
private void phoneName() {System.out.println("name=moto");}
private void phoneMieiNum() {System.out.println("num=09876");}
private void camera() {System.out.println("camera = 100 pixels");}
private void storage() {System.out.println("space = 345 tb");}
private void osName() {System.out.println("software = antroid");}

public void phone() {
	System.out.println("the moblie phone display is curved");
}

public static void main(String[] args) {
	PhoneInfo thiru= new PhoneInfo();
	thiru.phoneName();
	thiru.phoneMieiNum();
	thiru.camera();
	thiru.storage();
	thiru.osName();
	thiru.phone();
}
}
