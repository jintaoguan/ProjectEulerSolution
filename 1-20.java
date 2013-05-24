import java.math.BigInteger;

public class Solution
{
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
	public void Problem_3()
	{
		long numm = 600851475143L;
		long largestFact = 0;
		long[] factors = new long[2];

		for (long i = 2; i * i < numm; i++) 
		{
			if (numm % i == 0)
			{
				factors[0] = i;
				factors[1] = numm / i;

				for (int k = 0; k < 2; k++) {
					boolean isPrime = true;
					for (long j = 2; j * j <  factors[k]; j++) {
						if (factors[k] % j == 0) {
							isPrime = false;
							break;
						}
					}
					if (isPrime && factors[k] > largestFact) {
						largestFact = factors[k];
					}
				}
			}
		}
		System.out.println(largestFact);
	}
	public void Problem_4()
	{
		int max = Integer.MIN_VALUE;
		for( int i = 999; i >= 100; --i )
		{
			for( int j = 999; j >= 100; --j )
			{
				int num = i * j ;
				if( isPalindromic( num ) && ( num > max )  )
					max = i * j;
			}
		}
		System.out.println(max);
	}
	public boolean isPalindromic( int n )
	{
		int rev = 0;
		int num = n;
		while( num != 0 )
		{
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
		}
		if( rev == n ) return true;
		return false;
	}
	public void Problem_7()
	{
		final int MAX = 1000000;
		boolean[] prime = new boolean[MAX];
		for( int i = 0; i < MAX; ++i )
			prime[i] = true;
		int cnt = 0;
		int index = 2;
		while( cnt != 10001 )
		{
			if( prime[index] == true )
				cnt++;
			for( int i = 2; index * i < MAX; ++i )
				prime[ index * i ] = false;
			index++;
		}
		System.out.println(index-1);
	}
	public void Problem_8()
	{
		int list[] = new int[1000];
		int max = 0;
		String str = "7316717653133062491922511967442657474235" +
			"5349194934969835203127745063262395783180" +
			"1698480186947885184385861560789112949495" +
			"4595017379583319528532088055111254069874" +
			"7158523863050715693290963295227443043557" +
			"6689664895044524452316173185640309871112" +
			"1722383113622298934233803081353362766142" +
			"8280644448664523874930358907296290491560" +
			"4407723907138105158593079608667017242712" +
			"1883998797908792274921901699720888093776" +
			"6572733300105336788122023542180975125454" +
			"0594752243525849077116705560136048395864" +
			"4670632441572215539753697817977846174064" +
			"9551492908625693219784686224828397224137" +
			"5657056057490261407972968652414535100474" +
			"8216637048440319989000889524345065854122" +
			"7588666881164271714799244429282308634656" +
			"7481391912316282458617866458359124566529" +
			"4765456828489128831426076900422421902267" +
			"1055626321111109370544217506941658960408" +
			"0719840385096245544436298123098787992724" +
			"4284909188845801561660979191338754992005" +
			"2406368991256071760605886116467109405077" +
			"5410022569831552000559357297257163626956" +
			"1882670428252483600823257530420752963450";
		for (int index = 0; index < 1000; index++)
			list[index] = str.charAt(index) - 48;
		for (int count = 0; count < 996; count++)
		{
			int product = list[count] * list[count + 1] * list[count + 2] * list[count + 3] * list[count + 4];
			if (product > max) max = product;
		}
		System.out.println(max);
	}
	public void Problem_9()
	{
		int i, j, k;
		for( i = 1; i <= 1000; ++i )
			for( j = i; i + j <= 1000; ++j )
			{
				k = 1000 - i - j;
				if( i * i + j * j == k * k )
				{
					System.out.println(i);
					System.out.println(j);
					System.out.println(k);
					System.out.println(i*j*k);
				}
			}
	}
	public void Problem_10()
	{
		final int MAX = 2000000;
		boolean[] prime = new boolean[MAX];
		for( int i = 0; i < MAX; ++i )
			prime[i] = true;
		int index = 2;
		long ans = 0;
		while( index < MAX )
		{
			if( prime[index] == true )
				ans += index;
			for( int i = 2; index * i < MAX; ++i )
				prime[ index * i ] = false;
			index++;
		}
		System.out.println(ans);
	}
	public void Problem_16()
	{
		BigInteger n = BigInteger.valueOf(2);
		n = n.pow(1000);
		int sum = 0;
		String s = n.toString();
		for (int i = 0; i < s.length(); i++)
		{
			Character c = new Character(s.charAt(i));
			String z = c.toString();
			int j = Integer.parseInt(z);
			sum += j;
		}
		System.out.println(sum);
	}
	public void Problem_11()
	{
		String str = 
			"0802229738150040007504050778521250779108"+
			"4949994017811857608717409843694804566200"+
			"8149317355791429937140675388300349133665"+
			"5270952304601142692468560132567137023691"+
			"2231167151676389419236542240402866331380"+
			"2447326099034502447533537836842035171250"+
			"3298812864236710263840675954706618386470"+
			"6726206802621220956394396308409166499421"+
			"2455580566739926971778789683148834896372"+
			"2136230975007644204535140061339734313395"+
			"7817532822753167159403800462161409535692"+
			"1639054296353147555888240017542436298557"+
			"8656004835718907054444374460215851541758"+
			"1980816805944769287392138652177704895540"+
			"0452088397359916079757321626267933279866"+
			"8836688757622072034633674655123263935369"+
			"0442167338253911249472180846293240627636"+
			"2069364172302388346299698267598574043616"+
			"2073352978319001743149714886811623570554"+
			"0170547183515469169233486143520189196748";
		int[][] matrix = new int[20][];
		for( int i = 0; i < matrix.length; ++i )
			matrix[i] = new int[20];
		for( int i = 0; i < 20; ++i )
		{
			for( int j = 0; j < 20; ++j )
			{
				int p = i * 40 + j * 2;
				int num = (int)(str.charAt(p)-'0') * 10 + (int)(str.charAt(p+1)-'0');
				matrix[i][j] = num;
			}
		}
		int max = 0;
		//diagonal lefttop to rightbottom
		for( int i = 0; i <= 16; ++i )
		{	
			for( int j = 0; j <= 16; ++j )
			{
				int tmp = matrix[i][j] * matrix[i+1][j+1] * matrix[i+2][j+2] * matrix[i+3][j+3];
				if( tmp > max ) max = tmp;
			}
		}
		//diagonal righttop to leftbottom
		for( int i = 3; i < 20; ++i )
		{	
			for( int j = 0; j <= 16; ++j )
			{
				int tmp = matrix[i][j] * matrix[i-1][j+1] * matrix[i-2][j+2] * matrix[i-3][j+3];
				if( tmp > max ) max = tmp;
			}
		}
		//up down
		for( int i = 0; i <= 16; ++i )
		{	
			for( int j = 0; j < 20; ++j )
			{
				int tmp = matrix[i][j] * matrix[i+1][j] * matrix[i+2][j] * matrix[i+3][j];
				if( tmp > max ) max = tmp;
			}
		}
		//left right
		for( int i = 0; i < 20; ++i )
		{	
			for( int j = 0; j <= 16; ++j )
			{
				int tmp = matrix[i][j] * matrix[i][j+1] * matrix[i][j+2] * matrix[i][j+3];
				if( tmp > max ) max = tmp;
			}
		}
		System.out.println(max);
	}
	public static void main( String[] argv )
	{
		Solution so = new Solution();
		so.Problem_11();
	}
}
