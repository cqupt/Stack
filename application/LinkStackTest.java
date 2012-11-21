package cquptzx.statck.application;

import cquptzx.statck.LinkStack;

/**
 * ����SeqStack.java��ʵ���Ƿ���ȷ.
 * 1.������ջ.
 * 2.����ջ��Ԫ��
 * 3.���ݳ�ջ
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