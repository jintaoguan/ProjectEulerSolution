public class Solution 
{	
	public void Problem_67()
	{
		int[][] triangle = new int[101][101];
		int ans = 0;
		int cnt = 0;
		try {
			BufferedReader fr = new BufferedReader( new FileReader("/home/jintao/Desktop/triangle.txt") );
			String line = "";
			while( (line = fr.readLine()) != null )
			{
				String[] split = line.split(" ");
				for( int i = 0; i < split.length; ++i )
					triangle[cnt][i] = Integer.parseInt( split[i] );
				cnt++;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for( int i = 1; i < cnt; ++i )
		{
			for( int j = 0; j <= i; ++j )
			{
				if( j == 0 ) 
					triangle[i][j] += triangle[i-1][j];
				else if( j == i )
					triangle[i][j] += triangle[i-1][j-1];
				else
					triangle[i][j] = triangle[i][j] + Math.max(triangle[i-1][j], triangle[i-1][j-1]); 
			}
		}
		for( int i = 0 ; i < cnt; ++i )
		{
			if( ans < triangle[cnt-1][i] )
				ans = triangle[cnt-1][i];
		}
		System.out.println(ans);
	}
	public static void main( String[] argv )
	{
		Solution so = new Solution();
		so.Problem_67();
	}
}
