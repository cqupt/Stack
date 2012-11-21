package cquptzx.statck.application;

import cquptzx.statck.SeqStack;

/**
 * ����SeqStack.java��ʵ���Ƿ���ȷ.
 * 1.������ջ.
 * 2.����ջ��Ԫ��
 * 3.���ݳ�ջ
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