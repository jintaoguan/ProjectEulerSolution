public class Solution
{
	public void Problem_30()
	{
		int sum = 0;
		for( int i = 2; i < Math.pow( 9, 5 ) * 6; ++i )
		{
			int num = i;
			int tmpsum = 0;
			while( num != 0 )
			{
				int digit = num % 10;
				tmpsum += (int)(Math.pow(digit,5));
				num = num / 10;
			}
			if( tmpsum == i )
				sum += i;
		}
		System.out.println(sum);
	}
	public static void main( String[] argv )
	{
		Solution so = new Solution();
		so.Problem_30();
	}
}
