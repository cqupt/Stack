package cquptzx.statck.application;
import cquptzx.statck.SeqStack;

public class expIsCorrectTest 
{	/**
	 * @author cquptzx
	 * ����ƥ�����:
	 * 		1.��������ƥ�������ȷ.-----UnMatch 	
	 * 		2.����������������.-----------Less
	 * 		3.�����Ŷ���������.-----------More
	 * 		4.����ƥ����ȷ.---------------pop-->Correct
	 * ����ƥ��˼·:
	 * 		1.�����Ž�ջ.
	 * 		2.��������ջ��Ԫ�ؽ���ƥ���ж�,1)��ƥ����ջ��Ԫ�س�ջ.Correct
	 * 									 2)����ƥ���������Ž�ջ,
	 * 															����ջΪ��:Less;
	 * 															����ջ�ǿ�:UnMatch.
	 * 		3.ɨ�����,����ջΪ��:Correct.
	 * 				       ����ջ�ǿ�,More
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
					}//                 ��)��ƥ��.
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
								}//                 ��]��ƥ��.
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
									}//                 ��}��ƥ��.
											
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
	 * ���ַ���ת��ΪString��������.
	 * @param str ��ת�����ַ���.
	 * @return String��������
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
