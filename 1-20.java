public class Solution
{
	public static void main( String[] argv )
	{
		Solution so = new Solution();
		so.Problem_6();
	}
	public void Problem_1()
	{
		int sum = 0;
		for( int i = 0; i < 1000; ++i )
		{
			if( i % 3 == 0 || i % 5 == 0 )
			{
				sum += i;
			}
		}
		System.out.println(sum);
	}
	public void Problem_2()
	{
		int sum = 0;
		int[] dp = new int[40];
		dp[0] = 0;
		dp[1] = 1;
		for( int i = 2; dp[i-1] <= 4000000; ++i )
		{
			dp[i] = dp[i-1] + dp[i-2];
			if( dp[i] % 2 == 0 )
				sum += dp[i];
		}
		System.out.println(sum);
	}
	public void Problem_6()
	{
		int diff = 0;
		int sum1 = 0;
		int sum2 = 0;
		for( int i = 1; i <= 100; ++i )
		{
			sum1 += i * i;
			sum2 += i;
		}
		diff = sum2 * sum2 - sum1;
		System.out.println( diff );
	}
	public void Problem_5()
	{
		int ans = 1;
		for( int i = 2; i <= 20; ++i )
			ans = lcm( ans, i );
		System.out.println( ans );
	}
	public int gcd( int m, int n )
	{
		if( n == 0 ) return m;
		return gcd( n, m % n );
	}
	public int lcm( int m, int n )
	{
		return m / gcd( m , n ) * n;
	}
}
