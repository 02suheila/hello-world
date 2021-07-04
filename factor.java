package example;

public class factor {
			public static void main(String [] args)
		{
			long n = 20;
			long p = 4;
			long k = 0;
			for(long i =1;i<=n; i++)
			{
				if(n%i == 0)
					k = k+1;
				if(k ==p)
				{
					System.out.println(i);
		break;
				}}
				if(p>k)
				{System.out.println(0);
				}
			}
		}
		
