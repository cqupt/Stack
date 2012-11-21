package cquptzx.statck.application;

public class Mid2BackExp
{
	public String[] Mid2BackExp(String InputStr)
	{
		int i,j=0;
		int n = InputStr.length();
		char[] CharInput = new char [n];
		String [] TempStr = new String [n];
		String []BackStr = new String [n];
		CharInput=InputStr.toCharArray();	
		StringBuffer SB=new StringBuffer("");
		//将字符串转换为了字符数组.
		for( i=0;i<n;i++)
		{
			TempStr[j]=((Character)CharInput[i]).toString();
			
			if(Character.isDigit(CharInput[i]))
			{	
				//System.out.println("是数字-->加入到还缓冲区中.");
				SB.append(TempStr[j]);				
			}
			else
			{
				//System.out.println("不是数字");
				if(!SB.equals(""))
				{
					//System.out.println("缓冲区非空");
					//System.out.println("BackStr["+j+"]-->"+BackStr[j]);
					BackStr[j]=SB.toString();
					//System.out.println("BackStr["+j+"]-->"+BackStr[j]);
					
				//	System.out.println("SB--->"+SB);
					SB =SB.delete(0, SB.length());	
				//	System.out.println("SB--->"+SB);
				}
				else
				if(SB.equals(""))
				{
			//		System.out.println("空");
			//		System.out.println("BackStr["+j+"]-->"+BackStr[j]);
					BackStr[j]=TempStr[j];	
			//		System.out.println("BackStr["+j+"]-->"+BackStr[j]);
				}
				j++;
			}		
		}
		return BackStr;		
	}
}
