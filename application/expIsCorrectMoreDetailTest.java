package cquptzx.statck.application;
import cquptzx.statck.SeqStack;

public class expIsCorrectMoreDetailTest 
{		
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
	
	/**
	 * @author cquptzx
	 * 括号匹配情况:		
	 * 		1.括号匹配正确.--------------pop
	 * 		2.左括号少于右括号.-----------Less
	 * 		3.左括号多余右括号.-----------More
	 * 		4.最后剩下就是匹配了----------Correct
	 * 括号匹配思路:	
	 * 	循环扫描时:如果是左括号,那么入栈.
	 * 			     如果是右括号,那么与栈顶比较,如果匹配,出栈,继续向下:	---pop
	 * 							 		      如果不匹配,那么右括号多了.-----Less
	 * 循环扫描完成后:	如果堆栈非空(堆栈里存放的始终只有一类表达式:左括号),那么左括号多了.----More
	 * 					如果总和sum=flag+sum为0,那么就是匹配了.(无关的数字,字母flag为0)-----Correct						 	
	 */
	public  static void expIsCorrect (String[] exp,int n) throws Exception
	{
	//堆栈里存放的始终只有一类表达式:左括号;
	//堆栈非空,那么就是说左括号多了.....
	//右括号多了的话,堆栈里当然是空的.
	SeqStack mySeqStk = new SeqStack(n);
	int sum=0;
	for( int i=0;i<n;i++)
	{
		int flag =0;
		if(exp[i].equals(new String ("("))) flag = 1; 
		if(exp[i].equals(new String ("["))) flag = 2; 	
		if(exp[i].equals(new String ("{"))) flag = 3; 	
		
		if(exp[i].equals(new String (")"))) flag = -1; 
		if(exp[i].equals(new String ("]"))) flag = -2;
		if(exp[i].equals(new String ("}"))) flag = -3;
		sum = flag+sum;
		switch(flag)
		{
		case 1:
		case 2:
		case 3:
			mySeqStk.push(exp[i]);
			break;
		case -1:				
		if (mySeqStk.notEmpty() )
				if (mySeqStk.getTop().equals(new String("(")))
					// exp[i].equals(new String (")")) && mySeqStk.notEmpty()&& mySeqStk.getTop().equals(new String("("))
					//第一种情况----->匹配
				{
					mySeqStk.pop();
					break;
				}
				else
					// exp[i].equals(new String (")")) && mySeqStk.notEmpty()&& !mySeqStk.getTop().equals(new String("("))
					//第二种情况----->不匹配		
				{
					System.out.println("INDEX "+(i+1)+" UnMatch--> no bracket to match ) ");
					break ;
				}
		else
			// exp[i].equals(new String (")")) && !mySeqStk.notEmpty()
			//第三种情况----->左括号少于右括号
			{
				System.out.println("INDEX "+(i+1)+" Less (--> no bracket to match )");
				break;									
			}										
		case -2:
			if (mySeqStk.notEmpty() )
				if (mySeqStk.getTop().equals(new String("[")))
					// exp[i].equals(new String ("]")) && mySeqStk.notEmpty()&& mySeqStk.getTop().equals(new String("["))
					//第一种情况----->匹配
				{
					mySeqStk.pop();
					break;
				}
				else
					// exp[i].equals(new String ("]")) && mySeqStk.notEmpty()&& !mySeqStk.getTop().equals(new String("["))
					//第二种情况----->不匹配		
				{
					System.out.println("INDEX "+(i+1)+" UnMatch--> no bracket to match ] ");
					break ;
				}
		else
			// exp[i].equals(new String ("]")) && !mySeqStk.notEmpty()
			//第三种情况----->左括号少于右括号
			{
				System.out.println("INDEX "+(i+1)+" Less[--> no bracket to match ]");
				break;									
			}				
		case -3:
			if (mySeqStk.notEmpty() )
				if (mySeqStk.getTop().equals(new String("{")))
					// exp[i].equals(new String ("}")) && mySeqStk.notEmpty()&& mySeqStk.getTop().equals(new String("{"))
					//第一种情况----->匹配
				{
					mySeqStk.pop();
					break;
				}
				else
					// exp[i].equals(new String ("}")) && mySeqStk.notEmpty()&& !mySeqStk.getTop().equals(new String("{"))
					//第二种情况----->不匹配		
				{
					System.out.println("INDEX "+(i+1)+" UnMatch--> no bracket to match }  ");
					break ;
				}
		else
			// exp[i].equals(new String ("}")) && !mySeqStk.notEmpty()
			//第三种情况----->左括号少于右括号
			{
				System.out.println("INDEX "+(i+1)+" Less { --> no bracket to match }");
				break;									
			}				
		default:	
			break;
			//doNothing.
		}
		
		
	}
	//循环完成后如果堆栈非空,那么就是左括号多了.
	if(mySeqStk.notEmpty())
	{
		//第四种情况----->左括号多于右括号
		while(mySeqStk.notEmpty())
		{
			System.out.println("More Left bracket,no bracket to match "+mySeqStk.pop()+" ");
		}
	}
	//循环完成后如果总和sum为0,那么自然表达式为匹配的.
	if(sum==0 )
		System.out.println("Correct");
 }
	public static void main(String [] args)
	{
		String str;
		int n;
		try
		{
			str = "()(]";
			n = str.length();
			String[] a;
			a = str2String(str);
			System.out.println(str+ "\n");
			expIsCorrect(a,n);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
