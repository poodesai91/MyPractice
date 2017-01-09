import java.util.Scanner;

public class MatrixMatching {
	
	
	
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		//Enter the rows and columns of first matrix
		System.out.println("Enter the number of rows and columns of first matrix");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int first[][]=new int[m][n];
		
		System.out.println("Enter first matrix rows and colums");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				first[i][j]=sc.nextInt();
			}
		}
		//Enter the rows and columns of second matrix
		System.out.println("Enter the number of rows and columns of second matrix");
		int p=sc.nextInt();
		int q=sc.nextInt();
		int second[][]=new int[p][q];
		System.out.println("Enter the second matrix rows and columns");
		for(int i=0;i<p;i++)
		{
			for(int j=0;j<q;j++)
			{
				second[i][j]=sc.nextInt();
			}
		}
		//Intialize the third matrix
		int third[][]=new int[m][q];
		//check if the columns of first equals rows of second matrix
		if(n!=p)
		{
			System.out.println("The matrix multipliaction cannot be done as the rows and columns do not match");
			
		}
		
		for(int a=0;a<m;a++)
		{
			for(int b=0;b<n;b++)
			{
				third[a][b]=0;
			
				for(int c=0;c<p;c++)
				{
					third[a][b]+=first[a][c]*second[c][b];
				}
			}
		}
		
		System.out.println("Product of entered matrices");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<q;j++)
			{
				System.out.print(third[i][j]+"\t");
			}
			System.out.println();
		}
	}	

}
