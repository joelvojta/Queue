public class Driver 
{
	public static void main(String[] args) throws Exception
	{
		TheQueue q= new TheQueue();
		for(int i = 1; i < 101; i++) //the enqueue process
		{
			Person p = new Person("Person " + i);
			q.enqueue(p);
		}
		for (int j = 1; j < 101; j++)  //the dequeue process
		{
			q.dequeue().display();
		}
		q.dequeue().display();
	}
}