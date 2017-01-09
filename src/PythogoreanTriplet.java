import java.util.Arrays;
import java.util.Scanner;

public class PythogoreanTriplet {
	
	
	static Boolean isTriplet(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			arr[i]=arr[i]*arr[i];
			
		}
		Arrays.sort(arr);
		for(int i=n-1;i>=2;i--)
		{
			int l=0;
			int h=i;
			while(l<h)
			{
				if(arr[l]+arr[h]==arr[i])
					return true;
				if(arr[l]+arr[h]<arr[i])
					l++;
				else
					h--;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		
		int arr[]={3,1,2,6,5};
		int n=arr.length;
		if(isTriplet(arr,n)==true){
			System.out.println("Yes");}
		else
		{
			System.out.println("No");
		}
		// TODO Auto-generated method stub

	}

}
