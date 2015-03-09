public class TheQueue
{
	private Person leadPerson;
	private Person tailPerson;
	private int count;
	
	public TheQueue()
	{
		this.leadPerson = null;
		this.tailPerson = null;
		this.count = 0;
	}

	public void enqueue(Person p)  //similar to addEnd method
	{		
		Person currPerson = p;
		if(this.leadPerson == null) //if queue is empty
		{
			this.leadPerson = currPerson;
			this.tailPerson = currPerson;
		}
		else     //otherwise, set currPerson to follow tailPerson
		{
			this.tailPerson.setNextPerson(currPerson);
			currPerson.setPrevPerson(this.tailPerson);
			this.tailPerson = currPerson;			
		}
		this.count++;
	}
	
	public Person dequeue() throws Exception //similar to removeFront method
	{
		if (leadPerson == null)  //in case of empty queue
		{
			throw new Exception("The Queue is Now Empty.  Have a Nice Day!");  //The last message
		}
		else if(this.count == 1)  //in case there is only one person left in the queue
		{
			Person currPerson = leadPerson;   //save the last person in currPerson
			this.leadPerson = null;   //Set leadPerson and tailPerson to null to finish it off
			this.tailPerson = null;
			this.count--;
			return currPerson;
		}
		else  //there is more than one person left in the queue
		{
			Person currPerson = leadPerson;  //currPerson is now leadPerson
			currPerson.getNextPerson().setPrevPerson(null);  //the position where currPerson was in now null
			leadPerson = currPerson.getNextPerson();  //leadPerson is now the next Person in line
			currPerson.setNextPerson(null);  //the Person next to currPerson is now null, separating it from the queue
			this.count--;
			return currPerson;
		}
	}

}