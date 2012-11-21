package cquptzx.statck.application;

import cquptzx.statck.LinkStack;
/**
 * 详细说明见{@link 表达式遍历}
 * @author cquptzx
 *
 */
public class PostException
{

	public static void postExp(LinkStack LS) throws Exception
	{
		char ch;
		int x1,x2;
		
		System.out.println("input expresstion end with # :");
		while((ch=(char)(System.in.read()))!='#')
		{
			if(Character.isDigit(ch))
			{
				LS.push(new Integer(Character.toString(ch)));
				
			}
			else
			{
				x2=((Integer)LS.pop()).intValue();
				x1=((Integer)LS.pop()).intValue();
				switch(ch)
				{
				case '+':
					x1=x1+x2;
					break;
				case '-':
					x1=x1-x2;
					break;
				case '*':
					x1=x1*x2;
					break;
				case '/':
					if(x2==0)
					{
						throw new Exception("ERROR-->/0");
					}
					else
					{
						x1=x1/x2;
						break;
					}
				}
				LS.push(new Integer(x1));
			}
		}
		System.out.println("results is :"+ LS.pop());
	}
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		LinkStack mLS = new LinkStack();
		try
		{
			postExp(mLS);
		}
		catch(Exception e)
		{
			System.out.print(e.getMessage());
		}
	}

}
