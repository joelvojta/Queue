import java.util.Random;

public class Person 
{
	private String name;
	private int walletBalance;
	private static Random r = new Random();
	private Person nextPerson;//added here
	//private int count;
	
	public Person(String name)
	{
		this.name = name;
		this.walletBalance = Person.r.nextInt(10);
		this.nextPerson = null;//added here
	}
	
	public void display()
	{
		System.out.println("Hi, my name is: " + this.name + " and I have: $" + this.walletBalance + " on me!");
		this.walletBalance = Person.r.nextInt(10);//changes wallet every time 
		
	}
	
	
	// setters and getters
	/**
	public Disc(int size)
	{
		this.size = size;
		this.nextDisc = null;
	}
	 
	public String toString()
	{
		return "" + this.size;
	}
	*/
	public Person getNextPerson() {
		return nextPerson;
	}

	public void setNextPerson(Person nextPerson) {
		this.nextPerson = nextPerson;
	}
	
	public String getPerson() 
	{
		return name ;
	}
/**
	public int getSize() {
		return size;
	}
	*/
}