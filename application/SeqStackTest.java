package cquptzx.statck.application;

import cquptzx.statck.SeqStack;

/**
 * 测试SeqStack.java的实现是否正确.
 * 1.数据入栈.
 * 2.返回栈顶元素
 * 3.数据出栈
 * @author cquptzx
 *
 */
public class SeqStackTest
{
	public static void main(String [] args)
	{
		SeqStack mySeqStk = new SeqStack();
		
		int test [] = {1,3,5,7,9};	
		
		try
		{
			for(int i =0;i<test.length;i++)
			{
				mySeqStk.push(test[i]);
				System.out.println("Current Top Element :" + mySeqStk.getTop());
			}
			
			System.out.println("Pop Seq is  :");
			while(mySeqStk.notEmpty())
			{
				System.out.print(mySeqStk.pop()+" ");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}		
	}
}