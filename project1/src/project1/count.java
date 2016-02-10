package project1;

public class count
{

			public static void main(String[] args)
			{
				int count = 0;
						for(int i = 1; i <=1000000 ; i=i+1)
					{
							if((i % 9 == 0) || (i % 13 == 0) ||( i% 27==0) || (i%81==0))
						{
								count = count + 1;
								
							}
					}	
						System.out.println("the count is " +count);

			}	
						}

