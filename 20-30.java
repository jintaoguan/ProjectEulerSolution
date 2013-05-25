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
	public static void main( String[] argv )
	{
		Solution so = new Solution();
		so.Problem_25();
	}
}
