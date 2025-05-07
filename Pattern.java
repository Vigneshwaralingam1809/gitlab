package first;

public class Pattern {

		public static void main(String[]args)
		{
int i=1;
int s=1;
		for(int r=1;r<=5;r++)
		    {
		        int no =6-r;
		for( s=1;s<=r;s++)
		        {
		            System.out.print(" ");
		           
		        }

		        
		        
		for(int c=1;c<=6-r;c++)
		        {
		            System.out.print(no);
		           
		            no--;
		        }

		System.out.println();
		    }
		}
		}