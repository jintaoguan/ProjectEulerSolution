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
	public void Problem_13()
	{
		String str = 
			"37107287533902102798797998220837590246510135740250"+
			"46376937677490009712648124896970078050417018260538"+
			"74324986199524741059474233309513058123726617309629"+
			"91942213363574161572522430563301811072406154908250"+
			"23067588207539346171171980310421047513778063246676"+
			"89261670696623633820136378418383684178734361726757"+
			"28112879812849979408065481931592621691275889832738"+
			"44274228917432520321923589422876796487670272189318"+
			"47451445736001306439091167216856844588711603153276"+
			"70386486105843025439939619828917593665686757934951"+
			"62176457141856560629502157223196586755079324193331"+
			"64906352462741904929101432445813822663347944758178"+
			"92575867718337217661963751590579239728245598838407"+
			"58203565325359399008402633568948830189458628227828"+
			"80181199384826282014278194139940567587151170094390"+
			"35398664372827112653829987240784473053190104293586"+
			"86515506006295864861532075273371959191420517255829"+
			"71693888707715466499115593487603532921714970056938"+
			"54370070576826684624621495650076471787294438377604"+
			"53282654108756828443191190634694037855217779295145"+
			"36123272525000296071075082563815656710885258350721"+
			"45876576172410976447339110607218265236877223636045"+
			"17423706905851860660448207621209813287860733969412"+
			"81142660418086830619328460811191061556940512689692"+
			"51934325451728388641918047049293215058642563049483"+
			"62467221648435076201727918039944693004732956340691"+
			"15732444386908125794514089057706229429197107928209"+
			"55037687525678773091862540744969844508330393682126"+
			"18336384825330154686196124348767681297534375946515"+
			"80386287592878490201521685554828717201219257766954"+
			"78182833757993103614740356856449095527097864797581"+
			"16726320100436897842553539920931837441497806860984"+
			"48403098129077791799088218795327364475675590848030"+
			"87086987551392711854517078544161852424320693150332"+
			"59959406895756536782107074926966537676326235447210"+
			"69793950679652694742597709739166693763042633987085"+
			"41052684708299085211399427365734116182760315001271"+
			"65378607361501080857009149939512557028198746004375"+
			"35829035317434717326932123578154982629742552737307"+
			"94953759765105305946966067683156574377167401875275"+
			"88902802571733229619176668713819931811048770190271"+
			"25267680276078003013678680992525463401061632866526"+
			"36270218540497705585629946580636237993140746255962"+
			"24074486908231174977792365466257246923322810917141"+
			"91430288197103288597806669760892938638285025333403"+
			"34413065578016127815921815005561868836468420090470"+
			"23053081172816430487623791969842487255036638784583"+
			"11487696932154902810424020138335124462181441773470"+
			"63783299490636259666498587618221225225512486764533"+
			"67720186971698544312419572409913959008952310058822"+
			"95548255300263520781532296796249481641953868218774"+
			"76085327132285723110424803456124867697064507995236"+
			"37774242535411291684276865538926205024910326572967"+
			"23701913275725675285653248258265463092207058596522"+
			"29798860272258331913126375147341994889534765745501"+
			"18495701454879288984856827726077713721403798879715"+
			"38298203783031473527721580348144513491373226651381"+
			"34829543829199918180278916522431027392251122869539"+
			"40957953066405232632538044100059654939159879593635"+
			"29746152185502371307642255121183693803580388584903"+
			"41698116222072977186158236678424689157993532961922"+
			"62467957194401269043877107275048102390895523597457"+
			"23189706772547915061505504953922979530901129967519"+
			"86188088225875314529584099251203829009407770775672"+
			"11306739708304724483816533873502340845647058077308"+
			"82959174767140363198008187129011875491310547126581"+
			"97623331044818386269515456334926366572897563400500"+
			"42846280183517070527831839425882145521227251250327"+
			"55121603546981200581762165212827652751691296897789"+
			"32238195734329339946437501907836945765883352399886"+
			"75506164965184775180738168837861091527357929701337"+
			"62177842752192623401942399639168044983993173312731"+
			"32924185707147349566916674687634660915035914677504"+
			"99518671430235219628894890102423325116913619626622"+
			"73267460800591547471830798392868535206946944540724"+
			"76841822524674417161514036427982273348055556214818"+
			"97142617910342598647204516893989422179826088076852"+
			"87783646182799346313767754307809363333018982642090"+
			"10848802521674670883215120185883543223812876952786"+
			"71329612474782464538636993009049310363619763878039"+
			"62184073572399794223406235393808339651327408011116"+
			"66627891981488087797941876876144230030984490851411"+
			"60661826293682836764744779239180335110989069790714"+
			"85786944089552990653640447425576083659976645795096"+
			"66024396409905389607120198219976047599490197230297"+
			"64913982680032973156037120041377903785566085089252"+
			"16730939319872750275468906903707539413042652315011"+
			"94809377245048795150954100921645863754710598436791"+
			"78639167021187492431995700641917969777599028300699"+
			"15368713711936614952811305876380278410754449733078"+
			"40789923115535562561142322423255033685442488917353"+
			"44889911501440648020369068063960672322193204149535"+
			"41503128880339536053299340368006977710650566631954"+
			"81234880673210146739058568557934581403627822703280"+
			"82616570773948327592232845941706525094512325230608"+
			"22918802058777319719839450180888072429661980811197"+
			"77158542502016545090413245809786882778948721859617"+
			"72107838435069186155435662884062257473692284509516"+
			"20849603980134001723930671666823555245252804609722"+
			"53503534226472524250874054075591789781264330331690";
		BigInteger sum = new BigInteger("0"); 
		for( int i = 0; i < 100; ++i )
		{
			String num = str.substring( i*50, (i+1)*50-1 );
			sum = sum.add( new BigInteger(num) );
		}
		String ans = sum.toString(10);
		ans = ans.substring(0, 10);
		System.out.println(ans);
	}
	public static void main( String[] argv )
	{
		Solution so = new Solution();
		so.Problem_11();
	}
}
