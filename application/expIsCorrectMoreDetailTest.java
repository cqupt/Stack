package cquptzx.statck.application;
import cquptzx.statck.SeqStack;

public class expIsCorrectMoreDetailTest 
{		
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
	
	/**
	 * @author cquptzx
	 * ����ƥ�����:		
	 * 		1.����ƥ����ȷ.--------------pop
	 * 		2.����������������.-----------Less
	 * 		3.�����Ŷ���������.-----------More
	 * 		4.���ʣ�¾���ƥ����----------Correct
	 * ����ƥ��˼·:	
	 * 	ѭ��ɨ��ʱ:�����������,��ô��ջ.
	 * 			     �����������,��ô��ջ���Ƚ�,���ƥ��,��ջ,��������:	---pop
	 * 							 		      �����ƥ��,��ô�����Ŷ���.-----Less
	 * ѭ��ɨ����ɺ�:	�����ջ�ǿ�(��ջ���ŵ�ʼ��ֻ��һ����ʽ:������),��ô�����Ŷ���.----More
	 * 					����ܺ�sum=flag+sumΪ0,��ô����ƥ����.(�޹ص�����,��ĸflagΪ0)-----Correct						 	
	 */
	public  static void expIsCorrect (String[] exp,int n) throws Exception
	{
	//��ջ���ŵ�ʼ��ֻ��һ����ʽ:������;
	//��ջ�ǿ�,��ô����˵�����Ŷ���.....
	//�����Ŷ��˵Ļ�,��ջ�ﵱȻ�ǿյ�.
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
					//��һ�����----->ƥ��
				{
					mySeqStk.pop();
					break;
				}
				else
					// exp[i].equals(new String (")")) && mySeqStk.notEmpty()&& !mySeqStk.getTop().equals(new String("("))
					//�ڶ������----->��ƥ��		
				{
					System.out.println("INDEX "+(i+1)+" UnMatch--> no bracket to match ) ");
					break ;
				}
		else
			// exp[i].equals(new String (")")) && !mySeqStk.notEmpty()
			//���������----->����������������
			{
				System.out.println("INDEX "+(i+1)+" Less (--> no bracket to match )");
				break;									
			}										
		case -2:
			if (mySeqStk.notEmpty() )
				if (mySeqStk.getTop().equals(new String("[")))
					// exp[i].equals(new String ("]")) && mySeqStk.notEmpty()&& mySeqStk.getTop().equals(new String("["))
					//��һ�����----->ƥ��
				{
					mySeqStk.pop();
					break;
				}
				else
					// exp[i].equals(new String ("]")) && mySeqStk.notEmpty()&& !mySeqStk.getTop().equals(new String("["))
					//�ڶ������----->��ƥ��		
				{
					System.out.println("INDEX "+(i+1)+" UnMatch--> no bracket to match ] ");
					break ;
				}
		else
			// exp[i].equals(new String ("]")) && !mySeqStk.notEmpty()
			//���������----->����������������
			{
				System.out.println("INDEX "+(i+1)+" Less[--> no bracket to match ]");
				break;									
			}				
		case -3:
			if (mySeqStk.notEmpty() )
				if (mySeqStk.getTop().equals(new String("{")))
					// exp[i].equals(new String ("}")) && mySeqStk.notEmpty()&& mySeqStk.getTop().equals(new String("{"))
					//��һ�����----->ƥ��
				{
					mySeqStk.pop();
					break;
				}
				else
					// exp[i].equals(new String ("}")) && mySeqStk.notEmpty()&& !mySeqStk.getTop().equals(new String("{"))
					//�ڶ������----->��ƥ��		
				{
					System.out.println("INDEX "+(i+1)+" UnMatch--> no bracket to match }  ");
					break ;
				}
		else
			// exp[i].equals(new String ("}")) && !mySeqStk.notEmpty()
			//���������----->����������������
			{
				System.out.println("INDEX "+(i+1)+" Less { --> no bracket to match }");
				break;									
			}				
		default:	
			break;
			//doNothing.
		}
		
		
	}
	//ѭ����ɺ������ջ�ǿ�,��ô���������Ŷ���.
	if(mySeqStk.notEmpty())
	{
		//���������----->�����Ŷ���������
		while(mySeqStk.notEmpty())
		{
			System.out.println("More Left bracket,no bracket to match "+mySeqStk.pop()+" ");
		}
	}
	//ѭ����ɺ�����ܺ�sumΪ0,��ô��Ȼ���ʽΪƥ���.
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
