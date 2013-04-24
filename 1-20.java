public class Solution
{
	public static void main( String[] argv )
	{
		Solution so = new Solution();
		so.Problem_1();
	}
	public void Problem_1()
	{
		int sum = 0;
		for( int i = 0; i < 1000; ++i )
		{
			if( i % 3 == 0 || i % 5 == 0 )
				sum += i;
		}
		System.out.println(sum);
	}
}
