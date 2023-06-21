import java.util.Scanner;
public class search
{
	
		int a[];int flag=0;int n;
		void  ReadArr()
		{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length of Array :\n");
		n=sc.nextInt();
		a=new int[n];
		System.out.print("Enter Element to Store in Array :\n");
        for(int i=0; i<n; i++)
        {
		
           a[i] = sc.nextInt();
        }   
        
        }
        void PrintArr()
		{
			System.out.print("Elements in Array are :\n");
			for(int i=0; i<n; i++)
			{
				System.out.print(a[i] + "  ");
			}
		}
		void search()
		{
			int key;
			System.out.print("\nElements to search:\n");
			Scanner sc=new Scanner(System.in);
			key = sc.nextInt();
			for(int i=0; i<n; i++)
			{
				if(key==a[i])
				{
					System.out.print("Element found\n");
					flag=1;
					break;
					
				}
			}
			if(flag==0)
			{
				{
					System.out.print("Element not found\n");
				}
			}
		}			
		public static void main(String args[])
		{
			search obj=new search();
			obj.ReadArr();
			obj.PrintArr();
			obj.search();
		}
		
	
}