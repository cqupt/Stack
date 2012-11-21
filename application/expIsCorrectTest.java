package cquptzx.statck.application;
import cquptzx.statck.SeqStack;

public class expIsCorrectTest 
{	/**
	 * @author cquptzx
	 * 括号匹配情况:
	 * 		1.左右括号匹配次序不正确.-----UnMatch 	
	 * 		2.左括号少于右括号.-----------Less
	 * 		3.左括号多余右括号.-----------More
	 * 		4.括号匹配正确.---------------pop-->Correct
	 * 括号匹配思路:
	 * 		1.左括号进栈.
	 * 		2.右括号与栈顶元素进行匹配判断,1)若匹配则栈顶元素出栈.Correct
	 * 									 2)若不匹配则右括号进栈,
	 * 															若堆栈为空:Less;
	 * 															若堆栈非空:UnMatch.
	 * 		3.扫描结束,若堆栈为空:Correct.
	 * 				       若堆栈非空,More
	 * 									 	
	 */
	public  static void expIsCorrect (String[] exp,int n) throws Exception
	{
		SeqStack mySeqStk = new SeqStack();
		for(int i=0;i<n;i++)
		{
			if( exp[i].equals(new String ("(")) 
			||	exp[i].equals(new String("["))
			||  exp[i].equals(new String("{"))
			  )
				mySeqStk.push(exp[i]);
			else
				if ( exp[i].equals(new String (")")) 
				 && mySeqStk.notEmpty()
				 && mySeqStk.getTop().equals(new String("("))
					)
					mySeqStk.pop();
				else
					if ( exp[i].equals(new String (")"))
					 && mySeqStk.notEmpty()
					 && ! mySeqStk.getTop().equals(new String("("))
						)
					{
						System.out.println("UnMatch");
						return ;
					}//                 对)的匹配.
					else
						if( exp[i].equals(new String ("]"))
						&& mySeqStk.notEmpty()
						&& mySeqStk.getTop().equals(new String("["))						
						  )
						mySeqStk.pop();
						else
							if ( exp[i].equals(new String ("]"))
							&& mySeqStk.notEmpty()
						     && ! mySeqStk.getTop().equals(new String("["))
								)
								{
									System.out.println("UnMatch");
									return ;
								}//                 对]的匹配.
							else 
								if( exp[i].equals(new String ("}"))
									&& mySeqStk.notEmpty()
									&& mySeqStk.getTop().equals(new String("{"))						
									)
									mySeqStk.pop();
								else
									if ( exp[i].equals(new String ("}"))
									  && mySeqStk.notEmpty()
									&& ! mySeqStk.getTop().equals(new String("{"))
										)
									{
										System.out.println("UnMatch");
										return ;
									}//                 对}的匹配.
											
									else
										if(
											exp[i].equals(new String (")"))
										||  exp[i].equals(new String ("]"))
										||  exp[i].equals(new String ("}"))
										&&  !mySeqStk.notEmpty()
											)
										{
											System.out.println("Less");
											return ;										
										}
	
		}
	 if(mySeqStk.notEmpty())
		 System.out.println("More");
	 else
		 System.out.println("Correct");
	}	
	/**
	 * 将字符串转换为String类型数组.
	 * @param str 待转换的字符串.
	 * @return String类型数组
	 */
	private static String [] str2String(String str)
	{
		int n = str.length();
		String [] a;
		a = new String[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=str.substring(i,i+1);
		}
		return a;
	}
	public static void main(String [] args)
	{
		String str;
		int n;
		try
		{
			str = "(([]){})";
			n = str.length();
			String[] a;
			a = str2String(str);
			expIsCorrect(a,n);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
