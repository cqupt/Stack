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
			System.out.println("ѭ������Ϊ--->"+i);
			tempStr=((Character)CharInput[i]).toString();
			if(Character.isDigit(CharInput[i]))
			{					
				SB.append(tempStr);		
				System.out.println("����Ϊ����:j����--->"+j);
			}
			else
			{
				if(!SB.equals(""))
				{
					System.out.println("SB�ǿ�,����Ϊ����,�������"+j);
					BackStr[j]=SB.toString();
					j++;
					System.out.println("SB�ǿ�,����Ϊ����,�������"+j);
					SB =SB.delete(0, SB.length());					
				}
				SB.append(tempStr);	
				System.out.println("�������"+j);
				BackStr[j]=tempStr;
				j++;
				System.out.println("�������"+j);
				SB =SB.delete(0, SB.length());
			}
			
		}
		return BackStr;		
	}
}
