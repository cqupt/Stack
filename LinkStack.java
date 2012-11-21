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
	 * 入栈:
	 * 1.创建一个新的节点,
	 * 2.栈总元素+1
	 */
	public void push(Object obj) throws Exception
	{
		head = new Node(obj,head);
		size++;
	}

	/**
	 * 出栈:
	 * 1.是否为空?
	 * 2.头指针指向想下一个元素.
	 * 3.栈总元素-1.
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
