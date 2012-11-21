package cquptzx.statck;

public class LinkStack implements Stack
{
	private Node head;
	private int size;
	public LinkStack()
	{
		head = null;
		size =0;
	}

	/**
	 * ��ջ:
	 * 1.����һ���µĽڵ�,
	 * 2.ջ��Ԫ��+1
	 */
	public void push(Object obj) throws Exception
	{
		head = new Node(obj,head);
		size++;
	}

	/**
	 * ��ջ:
	 * 1.�Ƿ�Ϊ��?
	 * 2.ͷָ��ָ������һ��Ԫ��.
	 * 3.ջ��Ԫ��-1.
	 */
	public Object pop() throws Exception
	{
		if(size==0)
		{
			throw new Exception("ERROR-->LinkStack is EMPTY!");
		}
		Object obj = head.getElement();
		head = head.getNext();
		size--;
		return obj;
	}

	public Object getTop() throws Exception
	{

		return head.getElement();
	}

	public boolean notEmpty()
	{

		return (head!=null);
	}

}
