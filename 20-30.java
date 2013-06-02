import java.math.BigInteger;

public class Solution
{
	public void Problem_25()
	{
		BigInteger fn1 = new BigInteger("1");
		BigInteger fn2 = new BigInteger("1");
		BigInteger tmp = null;
		int cnt = 2;
		while( true )
		{
			cnt++;
			tmp = new BigInteger( fn1.add(fn2).toString(10) );
			if( tmp.toString(10).length() >= 1000 ) break;
			fn1 = fn2;
			fn2 = tmp;
		}
		System.out.println(cnt);
	}
	public void Problem_21()
	{
		int sum = 0;
		for( int i = 2; i <= 10000; ++i )
		{
			int sod = sumOfDivisor(i);
			if( sod > i && sumOfDivisor(sod) == i) 
				sum = sum + i + sod;
		}
		System.out.println(sum);
	}
	public int sumOfDivisor( int n )
	{
		int sum = 0;
		for( int i = 1; i <= n/2 ; ++i )
			if( n % i == 0 )
				sum += i;
		return sum;
	}
	public static void main( String[] argv )
	{
		Solution so = new Solution();
		so.Problem_25();
	}
}
