package cquptzx.statck.application;

public class Mid2BackExpTest
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		String str="33+44*(55-66/77)";
		Mid2BackExp MBE = new Mid2BackExp();
		String[] TempStr =	MBE.Mid2BackExp(str);
		for( int i=0;i< TempStr.length;i++)
		{
			System.out.println(TempStr[i]);
		}
	}
}
