package world;
public class Link
{
	public int data;
	public Link previous;
	public Link next;
	
	public Link( Link previous,int data, Link next)
	{
		super();
		this.data = data;
		this.previous = previous;
		this.next = next;
	}

}



