import java.math.BigInteger;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


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
	public void Problem_22()
	{
		String buffer = "";
		try {
			BufferedReader fr = new BufferedReader( new FileReader("/home/jintao/Desktop/names.txt") );
			String line = fr.readLine();
			buffer += line;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String format = buffer.replaceAll("\"", "");
		String[] names = format.split(",");
		Arrays.sort(names);
		long sum = 0;
		for( int i = 0; i < names.length; ++i )
		{
			int tmp = 0;
			String name = names[i];
			for( int j = 0; j < name.length(); ++j )
			{
				int index = name.charAt(j) - 'A';
				tmp += (index+1);
			}
			sum += tmp * (i+1);
		}
		System.out.println(sum);
	}
	public void Problem_28()
	{
		int matrix[][] = new int[1001][1001];
		boolean visit[][] = new boolean[1001][1001];
		for( int i = 0; i < 1001; ++i )
			for( int j = 0; j < 1001; ++j )
				visit[i][j] = false;
		int dir[][] = new int[][]{ {0, 1}, {1, 0}, {0, -1}, { -1, 0} };
		generateMap( matrix, visit, dir, 3, 1001/2, 1001/2, 1 );
		long sum = 1;
		int d = 1;
		while( d <= 500 )
		{
			sum += matrix[500+d][500+d];
			sum += matrix[500-d][500+d]; 
			sum += matrix[500+d][500-d];
			sum += matrix[500-d][500-d];
			d++;
		}
		System.out.println(sum);
	}
	public void generateMap( int[][] map, boolean[][] visit, int[][] dir, 
			int curdir, int x, int y, int depth )
	{
		while( depth <= 1001 * 1001 )
		{
			map[x][y] = depth;
			visit[x][y] = true;
			if( depth == 1001 * 1001 ) 
				return;
			int nx = x + dir[(curdir + 1) % 4][0];
			int ny = y + dir[(curdir + 1) % 4][1];
			int cx = x + dir[curdir][0];
			int cy = y + dir[curdir][1];
			if( visit[nx][ny] == true )
			{
				x = cx;
				y = cy;
			}
			else
			{
				x = nx;
				y = ny;
				curdir = ( curdir + 1 ) % 4;
			}
			depth++;
		}
	}
	public void Problem_24()
	{
		int[] perm = new int[] { 0, 1, 2, 3 };
		int count = 1;
		int numPerm = 1000000;
		while (count < numPerm) {
			int N = perm.length;
			int i = N-1;
			while (perm[i - 1] >= perm[i]) {
				i = i - 1;
			}
			int j = N;
			while (perm[j - 1] <= perm[i - 1]) {
				j = j - 1;
			}
			// swap values at position i-1 and j-1
			int tmp = perm[i-1];
			perm[i-1] = perm[j-1];
			perm[j-1] = tmp;
			i++;
			j = N;
			while (i < j) {
				tmp = perm[i-1];
				perm[i-1] = perm[j-1];
				perm[j-1] = tmp;
				i++;
				j--;
			}
			count++;
		}
		String permNum = "";
		for (int k = 0; k < perm.length; k++) {
			permNum = permNum + perm[k];
		}
		System.out.println(permNum);
	}
	public static void main( String[] argv )
	{
		Solution so = new Solution();
		so.Problem_25();
	}
}
