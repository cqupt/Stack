package cquptzx.statck.application;

public class CopyOfMid2BackExpTest
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		String str="#+$";
		CopyOfMid2BackExp MBE = new CopyOfMid2BackExp();
		String[] TempStr =	MBE.Mid2BackExp(str);
		System.out.println(TempStr.length);
		for( int i=0;i< TempStr.length;i++)
		{
			System.out.println(i+TempStr[i]);
		}
	}
}
