import java.util.Scanner;
 
public class Pattern
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         
        //Taking rows value from the user
         
        System.out.println("How many rows you want in this pattern?");
         
        int rows = 5;
         
        System.out.println("\t\tHere are your patterns....!!!\n\n");
		pattern1(rows);
		System.out.println("*******************************************************");
		pattern2(rows);
		System.out.println("*******************************************************");
		pattern3(rows);
		System.out.println("*******************************************************");
		pattern4(rows);
		System.out.println("*******************************************************");
		pattern5(rows);
		System.out.println("*******************************************************");
		pattern6(rows);
		System.out.println("*******************************************************");
		pattern7(rows);
		System.out.println("*******************************************************");
		pattern8(rows);
		System.out.println("*******************************************************");


	}
	
	public static void pattern1(int rows)
	{
		int a1 = rows;
	
		for ( int i = 1; i<=rows ; i++)
		{
			System.out.print("\t\t\t");
			int i1=(rows-i);
			for( int j = 1; j<=rows ; j++)
			{
				if( i1>0 )
				{
					System.out.print("1");
					i1--;
				}
				else if(j<=rows)
				{
					System.out.print(i);
				}
			}
			System.out.println();
		}
	}
	
	public static void pattern2(int rows)
	{
		int i1 = 3;
		System.out.println("\t\t\t1");
		for( int i = 2 ; i<=rows ; i++ )
		{
			System.out.print("\t\t\t");
			int a = 1;
			int b = 1;
			for( int j = i1 ; j>0 ; j-- )
			{
				if(a<i && b==1)
				{	
					System.out.print(a);
					a++;
				}
				else
				{
					System.out.print(a);
					a--;
					b = 0;
				}
				
			}		
			i1 = i1+2;
			System.out.println();
		}
	}
	
	public static void pattern3(int rows)
	{
		int n = 0;
		int s = 0;
		int check = 0;
		for(int r = 1; r < (2*rows); r++)
		{
			System.out.print("\t\t\t");
			if( r>=2 && r<rows )
			{
				n=r;
				s=1;
			}
			else if(r==1 || r==((2*rows)-1))
			{
				n=1;
			}
			else if (r>rows && r<((2*rows)-1))
			{
				n = rows-(r-rows);
				s = n-1;
			}
			check = 0;
			for(int i=1; i<2*rows; i++)
			{
				//	********	for First and Last Line
				// For Numbers
				if((r==1 || r==(2*rows)-1) && check == 0)
				{
					System.out.print(n);
					n++;
					check=1;
				}
				// For Spaces
				else if((r==1 || r==(2*rows)-1) && check == 1)
				{
					System.out.print(" ");
					check=0;
				}
				//	********	From 2 -> Middle-1 Line
				if( r>=2 && r<rows )
				{
					if(s < r)
					{
						System.out.print(" ");
						s++;
					}
					else
					{
						if ( check == 0 && n<=rows)
						{
							System.out.print(n);
							n++;
							check=1;
						}
						else if(check==1)
						{
							System.out.print(" ");
							check=0;
						}
					}
				}
				//	********	For Middle Line
				if(r==rows)
				{
					// For Spaces
					if(i<rows)	
						System.out.print(" ");
					// For Numbers
					else if( i == rows)
						System.out.print(rows);
				}
				//	********	From Middle+1 -> Last-1
				if( r>rows && r<((2*rows)-1))
				{
					if(s > 0)
					{
						System.out.print(" ");
						s--;
					}
					else
					{
						if ( check == 0 && n<=rows)
						{
							System.out.print(n);
							n++;
							check=1;
						}
						else if(check==1)
						{
							System.out.print(" ");
							check=0;
						}
					}
				}
			}
			System.out.println();
		}
	}
	
	public static void pattern4(int rows)
	{
		int n=1;
		int s=0;
		int[][] a=new int[rows][rows];
		for(int r=0; r<rows;r++)
		{
			s=r;
			for(int c=0;c<rows;c++)
			{
				if(s>0)
				{
					a[r][c]=0;
					s--;
				}
				else
				{
					a[r][c]=n;
					n++;
				}
			}
//			System.out.println();
		}
		
		for(int r=0;r<rows;r++)
		{
			System.out.print("\t\t\t");
			for(int c=0;c<rows;c++)
			{
				if(a[c][r] == 0)
					System.out.print(" ");
				else
				{
					System.out.print(a[c][r]);
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void pattern5(int rows)
	{
		int n=0;
		int s=0;
		int s_check=0;
		
		for(int r=1;r<(2*rows);r++)
		{
			System.out.print("\t\t\t");
			if(r<=rows)	
			{
				s=1;
				n=r;
			}
			else if(r>rows)
			{
				n = rows-(r-rows);
				s = n-1;
				s_check=1;
			}
			
			for(int c=1;c<=rows;c++)
			{
				if(s<r && s_check==0)
				{
					System.out.print(" ");
					s++;
				}
				else if(s_check==0)
				{
					System.out.print(n);
					n++;
				}
				if(r>rows)
				{
					if(s>0)
					{
						System.out.print(" ");
						s--;
						s_check=1;
					}
					else
					{
						System.out.print(n);
						n++;
					}
				}
			}
			System.out.println();
		}
	}
	
	public static void pattern6(int rows)
	{
		int s=0;
		int n=1;
		int l = rows;
		int num=0;
		for(int r=rows; r>0;r--)
		{
			System.out.print("\t\t\t");
			s=r-1;
			l++;
			n=1;
			int check=0;
			num++;
			for(int c=1; c<l; c++)
			{
				if(s>0)
				{
					System.out.print(" ");
					s--;
				}
				else if(check==0)
				{
					System.out.print(n);
					if(n==num)
					{
						n--;
						check=1;
					}
					else
						n++;
				}
				else if(check==1)
				{
					System.out.print(n);
					n--;
				}
			}
			System.out.println();
		}
	}

	public static void pattern7(int rows)
	{
		int l=rows;
		int n=1;
		int s=rows;
		int check=0;
		
		for(int r=1;r<2*rows;r++)
		{
			System.out.print("\t\t\t");
			check=0;
			n=1;
			if(r<=rows)
			{
				l++;
				s--;
			}
			else if(r>rows)
			{
				l--;
				s++;
			}
			int s1=s;
			
			for(int c=1;c<l;c++)
			{
				if(s1>0)
				{
					System.out.print(" ");
					s1--;
				}
				else
				{
					if(check==0)
					{
						System.out.print(n);
						n++;
						check=1;
					}
					else if ( check==1)
					{
						System.out.print(" ");
						check=0;
					}
				}
			}
			System.out.println();
		}
	}
	
	
	public static void pattern8(int rows) 
	{
		int l=rows+1;
		int n=1;
		int s=0;
		int s1=0;
		int s2=0;
		int s_l=rows-1;
		int s3=s_l;
		int s4=s_l;
		
		for(int r=1;r<(rows+2);r++)
		{
			System.out.print("\t\t\t");
			l--;
			n=1;
			for(int c=1;c<l+1;c++)
			{
				System.out.print(n);
				n++;
			}
			System.out.print("\t");
			while(s1>0)
			{
				System.out.print("*");
				s1--;
			}
			System.out.print("\t");
			while(s2>0)
			{
				System.out.print("*");
				s2--;
			}
			System.out.print(" \t");
			for(int c=1;c<rows+1;c++)
			{
				if(n==1)
					continue;
				n--;
				System.out.print(n);
			}
			s++;
			s1=s2=s;
			System.out.println();
		}
		
		int c_l=2;
		for(int r=1;r<rows+1;r++)
		{
			System.out.print("\t\t\t");
			for(int c=1;c<c_l;c++)
			{
				System.out.print(c);
			}
			System.out.print("\t");
			while(s3>0)
			{
				System.out.print("*");
				s3--;
			}
			System.out.print("\t");
			while(s4>0)
			{
				System.out.print("*");
				s4--;
			}
			System.out.print("\t");
			for(int c=c_l-1;c>0;c--)
			{
				System.out.print(c);
			}
			s_l--;
			s3=s4=s_l;
			c_l++;
			System.out.println();
		}
		System.out.println();
	}
	

}