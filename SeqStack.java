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
	 * ���캯��:�޲���,Ĭ�ϳ�ʼ��Ϊ10������Ķ�ջ.
	 */
	public SeqStack()
	{
		initiate(defaultSize);
	}
	/**
	 * ���캯��:�в���,��ָ����С��ʼ����ջ.
	 * @param sz ��ʼ����ջ�Ĵ�С.
	 */
	public SeqStack( int sz)
	{
		initiate(sz);
	}
	
	/**
	 * ��ʼ����ջ�Ĺ���:
	 * 1.��ջ��������Ϊ��ʼ��ָ���Ĳ���.
	 * 2.�����ͱ���topΪ0�����ָ��ջ��.
	 * 3.�½�һ������sz��Ԫ�صĶ�������.
	 * @param sz
	 */
	private void initiate(int sz)
	{
		maxStackSize = sz;
		top=0;
		stack= new Object[sz];
	}

	/**
	 * ��ջ��ʵ��:
	 * 1.����Ƿ��ջΪ��.
	 * 2.Ԫ�ز���ջ��.��top��ָ���Ԫ����ԶΪ��....(��ͼ���.)��
	 * 3.topָ��ջ��.��top��ָ���Ԫ����ԶΪ��....(��ͼ���.)��
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
	 * ��ջ��ʵ��:
	 * 1.ջ�Ƿ�Ϊ��?
	 * 2.topָ���µ�ջ��.��top��ָ���Ԫ����ԶΪ��....(��ͼ���.)��
	 * 3.���س�ջ��Ԫ��.��top��ָ���Ԫ����ԶΪ��....(��ͼ���.)��
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
	 * ����ջ��Ԫ��:
	 * 1.�ж�ջ�Ƿ�Ϊ��.
	 * 2.����Ԫ��.
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