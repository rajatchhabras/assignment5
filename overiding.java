package assignment5;

import java.util.Scanner;

class Animal
{
	private String name;
	private int legs;
	private int age;
	private String color;
	private String speak;
	public Animal()
	{
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		this.name=name;
		int legs=sc.nextInt();
		this.legs=legs;
		int age=sc.nextInt();
		this.age=age;
		String color=sc.next();
		this.color=color;
	}
	public void getname()
	{
		System.out.println("name of the animal "+name);
		System.out.println("number of the legs  "+legs);
		System.out.println("age of the animal "+age);
		System.out.println("color of the animal "+color);
	}
	public void spaek()
	{
		System.out.println("Every Animal Ha its Own voice ");
	}
	

}
class Dog extends Animal
{
	private String names;
	private String breed;
	Dog()
	{
		super();
		Scanner sc=new Scanner(System.in);
		String names=sc.next();
		this.names=names;
		String breed=sc.next();
		this.breed=breed;
		
		
		}
	
	public void spaek()
	{
		System.out.println("BOO BOOO BOOO");
	}
	public void aname()
	{
		System.out.println("name of the animal "+names);
		System.out.println("number of the legs  "+breed);
	}
	
	
}
class Cat extends Animal
{
	private String names;
	private String breed;
	Cat()
	{
		super();
		Scanner sc=new Scanner(System.in);
		String names=sc.next();
		this.names=names;
		String breed=sc.next();
		this.breed=breed;
		
		
		}
	public void aname()
	{
		System.out.println("name of the animal "+names);
		System.out.println("number of the legs  "+breed);
	}
	
	public void spaek()
	{
		System.out.println("me aa hoo me aa hoo");
	}
	
	
}
public class overiding {

	public static void main(String[] args) {
		Dog a=new Dog();
		a.spaek();
		a.getname();
		a.aname();
		Cat c=new Cat();
		c.spaek();
		c.getname();
		c.aname();
}

}

