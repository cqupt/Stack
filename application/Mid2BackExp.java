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
		//���ַ���ת��Ϊ���ַ�����.
		for( i=0;i<n;i++)
		{
			TempStr[j]=((Character)CharInput[i]).toString();
			
			if(Character.isDigit(CharInput[i]))
			{	
				//System.out.println("������-->���뵽����������.");
				SB.append(TempStr[j]);				
			}
			else
			{
				//System.out.println("��������");
				if(!SB.equals(""))
				{
					//System.out.println("�������ǿ�");
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
			//		System.out.println("��");
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
