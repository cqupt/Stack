package cquptzx.statck.application;

import cquptzx.statck.LinkStack;

/**
 * 测试SeqStack.java的实现是否正确.
 * 1.数据入栈.
 * 2.返回栈顶元素
 * 3.数据出栈
 * @author cquptzx
 *
 */
public class LinkStackTest
{
	public static void main(String [] args)
	{
		LinkStack myLnkStk = new LinkStack();
		
		int test [] = {1,3,5,7,9};	
		
		try
		{
			for(int i =0;i<test.length;i++)
			{
				myLnkStk.push(test[i]);
				System.out.println("Current Top Element :" + myLnkStk.getTop());
			}
			
			System.out.println("Pop Seq is  :");
			while(myLnkStk.notEmpty())
			{
				System.out.print(myLnkStk.pop()+" ");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}		
	}
}