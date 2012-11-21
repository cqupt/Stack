package cquptzx.statck;
public class  Node
{
	private Object element;
	private Node next;
	//***/
	public Node(Node nextval)
	{
		next = nextval;
	}
    public Node(Object obj,Node nextval)
	{
		element = obj;
		next = nextval;
	}
	public Node getNext()
	{
		return next;
	}
	private void setNext(Node nextval)
	{
		next = nextval;
	}
	public Object getElement()
	{
		return element;
	}
	private  void setElement(Object obj)
	{
		element = obj;
	}
	public String toString()
	{
		return element.toString();
	}
}
