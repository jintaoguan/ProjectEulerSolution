public class Solution
{
	public void Problem_48()
	{
		long MOD = 10000000000L;
		long sum = 0;
		long pow = 1;
 		for( int i = 1; i <= 1000; ++i )
		{
 			long tmp = 1;
 			int num = i;
			for( int j = 1; j <= i; ++j )
				tmp = tmp * num % MOD;
			sum = ( sum % MOD + tmp % MOD ) % MOD;
		}
		System.out.println(sum);
	}
	public static void main( String[] argv )
	{
		Solution so = new Solution();
		so.Problem_48();
	}
}
