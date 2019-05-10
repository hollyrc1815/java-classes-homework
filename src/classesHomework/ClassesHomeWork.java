package classesHomeWork;
import java.util.*;

public class ClassesHomeWork {

	public static void main(String[] args) {
		
		// human class
		Human human1 = new Human("holly", "english", "blue", 30, 8);
		
		System.out.println("Hollys wisdom by age is " + human1.humanWisdomByAge());
		System.out.println("Holly has been alive for " + human1.ageInDays(human1.age) + " days");
		System.out.println(human1.name + " is " +  human1.ageInHours(human1.age) + " hours old");
		human1.setAge(35);
		System.out.println((human1.name + "'s eyes are " + human1.whatColorAreYourEyes(human1.eyeColor)));
		Human.eyeballs = 2;
		System.out.println("All humans have " + Human.eyeballs + " eyeballs");
		//car class
		Car car1 = new Car("Scion", "TC", "blue", 30, 2, 2);
		System.out.println("my car gets " + car1.mpgCity(car1.milesPerGallon) + " miles per gallon in the city");
		System.out.println("my car has " + car1.wheelDrive(car1.wheelDrive) + " wheels ");
		System.out.println("I wish I had " +  car1.openDoors(car1.doors) + " doors on my car");
		//Dragon Class
		Dragon dragon1 = new Dragon("red", "fire", "evil", 100000, 6000);
		System.out.println("my dragon will have " + dragon1.howMuchGoldNextYear(dragon1.howMuchGold) + " next year" );
		System.out.println("when my dragon is tired his fly speed is only "+ dragon1.speedWhenTired(dragon1.flySpeed) + " mph");
		System.out.println("I want " + dragon1.howMuchGoldIWant(dragon1.howMuchGold) + " gold from my dragon");
		
	}//end main

}//end public classwork

	class Human {
		String name;
		String language;
		String eyeColor;
		public int age;
		int wisdom;
		static int eyeballs;
		
		
		Human(String n, String l, String ec, int a, int w) {
			name = n;
			language = l;
			eyeColor = ec;
			age = a;
			wisdom = w;
		}
		
		int humanWisdomByAge() {
			int wisdomByAge;
			wisdomByAge = age / wisdom;
			return wisdomByAge;
		
		}//end of humanWisdomByAge
	
		int ageInDays(int age) {
			return age * 365;		
		}//end of age in days
		
		int ageInHours(int age) {
			return (age * 365) * 24;
		}//end ageInHours
		
		void setAge(int x ) {
			if((x >= 0) && (x <= 40))
				{
				age = x;
				System.out.println("revised age is " + x);
				}
			else System.out.println("error setting age");
		}//end of setAge
		String whatColorAreYourEyes(String eyeColor) {
			return (eyeColor);
		}//end of whatcolorareyoureyes
	}//end human

	class Car {
		String make;
		String model;
		String color;
		int milesPerGallon;
		int wheelDrive;
		int doors;
		
		
		Car(String mk, String md, String c, int mpg, int wd, int d) {
			make = mk;
			model = md;
			color = c;
			milesPerGallon = mpg;
			wheelDrive = wd;
			doors = d;
		}
		
		int mpgCity(int milesPerGallon) {
			return milesPerGallon/2;
		
		}//end of mpgCity
	
		int wheelDrive(int wheelDrive) {
			return wheelDrive * 2;		
		}//end wheelDrive
		
		int openDoors(int doors) {
			return doors * 2;
		}
	
	}//end human
	
	class Dragon {
		String color;
		String breathWeapon;
		String alignment;
		int howMuchGold;
		int flySpeed;
		
		Dragon(String c, String bw, String a, int g, int fs) {
			color = c;
			breathWeapon = bw;
			alignment = a;
			howMuchGold = g;
			flySpeed = fs;
			
		}
		
		int howMuchGoldNextYear(int howMuchGold) {
			return howMuchGold*2;
		
		}//end of howMuchGoldNextYear
	
		int speedWhenTired(int flySpeed) {
			return flySpeed / 2;		
		}//end speedWhenTired
		
		int howMuchGoldIWant(int howMuchGold) {
			return howMuchGold / 2;
		}
	
	}//end human
	
