package cquptzx.statck;
/**
 * @author cquptzx
 *
 */
public class SeqStack implements Stack
{
	final int defaultSize = 10;
	int top;
	Object [] stack;
	int maxStackSize;
	
	/**
	 * 构造函数:无参数,默认初始化为10个对象的堆栈.
	 */
	public SeqStack()
	{
		initiate(defaultSize);
	}
	/**
	 * 构造函数:有参数,按指定大小初始化堆栈.
	 * @param sz 初始化堆栈的大小.
	 */
	public SeqStack( int sz)
	{
		initiate(sz);
	}
	
	/**
	 * 初始化堆栈的过程:
	 * 1.堆栈最大的容量为初始化指定的参数.
	 * 2.用整型变量top为0来标记指向栈顶.
	 * 3.新建一个包含sz个元素的对象数组.
	 * @param sz
	 */
	private void initiate(int sz)
	{
		maxStackSize = sz;
		top=0;
		stack= new Object[sz];
	}

	/**
	 * 入栈的实现:
	 * 1.检查是否堆栈为满.
	 * 2.元素插入栈顶.【top所指向的元素永远为空....(画图理解.)】
	 * 3.top指向栈顶.【top所指向的元素永远为空....(画图理解.)】
	 */
	public void push(Object obj) throws Exception 
	{
		if(top == maxStackSize)
		{
			throw new Exception("ERROR-->SeqStack is Full!");
		}
		stack[top]=obj;
		top++;	
	}

	/**
	 * 出栈的实现:
	 * 1.栈是否为空?
	 * 2.top指向新的栈顶.【top所指向的元素永远为空....(画图理解.)】
	 * 3.返回出栈的元素.【top所指向的元素永远为空....(画图理解.)】
	 */
	public Object pop() throws Exception 
	{
		if(top == 0)
		{
			throw new Exception("ERROR-->SeqStack is EMPETY!");
		}
		top--;
		return stack[top];
	}

	/**
	 * 返回栈顶元素:
	 * 1.判断栈是否为空.
	 * 2.返回元素.
	 */
	public Object getTop() throws Exception 
	{
		if(top == 0)
		{
			throw new Exception("ERROR-->SeqStack is EMPETY!");
		}
		return stack[top-1];
	}
	public boolean notEmpty()
	{
		return (top>0);
	}

}