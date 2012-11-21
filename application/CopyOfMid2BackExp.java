package cquptzx.statck.application;

import java.util.logging.Logger;

public class CopyOfMid2BackExp
{
	public String[] Mid2BackExp(String InputStr)
	{
		int i,j=0;
		int n = InputStr.length();
		char[] CharInput=InputStr.toCharArray();
		String tempStr=null;
		StringBuffer SB=new StringBuffer("");
		String []BackStr =new String[2*n];
		System.out.println(n);
		for( i=0;i<n;i++)
		{
			System.out.println("循环次数为--->"+i);
			tempStr=((Character)CharInput[i]).toString();
			if(Character.isDigit(CharInput[i]))
			{					
				SB.append(tempStr);		
				System.out.println("输入为数字:j不变--->"+j);
			}
			else
			{
				if(!SB.equals(""))
				{
					System.out.println("SB非空,输入为符号,输出数字"+j);
					BackStr[j]=SB.toString();
					j++;
					System.out.println("SB非空,输入为符号,输出数字"+j);
					SB =SB.delete(0, SB.length());					
				}
				SB.append(tempStr);	
				System.out.println("输出符号"+j);
				BackStr[j]=tempStr;
				j++;
				System.out.println("输出符号"+j);
				SB =SB.delete(0, SB.length());
			}
			
		}
		return BackStr;		
	}
}
