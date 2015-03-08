
public class TheQueue 
{
	private Person head;
	private int count;
	
	public TheQueue()
	{
		this.head = null;
		this.count = 0;
	}
	
	public void play()
	{
		Person p = new Person("Person " + this.count);
		
		while(count <= 100)
		{
			
			p.setNextPerson(this.head);
			this.head = p;
			this.count++;
			p = new Person("Person " + this.count);
			
		}
		
		while(count > 0)
		{
			//String valToReturn = this.head.getPerson();
			this.head = this.head.getNextPerson();
			this.count--;
			p.display();
		}
	}
}
