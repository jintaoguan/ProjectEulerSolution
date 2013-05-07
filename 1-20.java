public class Solution
{
	public static void main( String[] argv )
	{
		Solution so = new Solution();
		so.Problem_8();
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
		String str = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
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
}
