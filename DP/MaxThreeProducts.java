
public class MaxThreeProducts {
	
	
	public int max(int a ,int b)
	{
		if(a>b)
			return a;
		else
			return b;
	}
	
	private int findMax(int[] arr1) {
		int maxA=Integer.MIN_VALUE;
		int maxB=Integer.MIN_VALUE;
		int maxC=Integer.MIN_VALUE;
		
		int minA=Integer.MAX_VALUE;
		int minB=Integer.MAX_VALUE;
		
		if(arr1.length<3)
			return -1;
		
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]>maxA)
			{
                 maxC=maxB;
                 maxB=maxA;
                 maxA=arr1[i];
			}
			else if(arr1[i]>maxB)
			{
				maxC=maxB;
				maxB=arr1[i];
				
			}
			else if(arr1[i]>maxC)
				maxC=arr1[i];
			
			//check for min 2 integers
			if(arr1[i]<minA)
			{
				minB=minA;
				minA=arr1[i];
				
			}
			else if(arr1[i]<minB)
				minB=arr1[i];
			
		}
	    int a=maxA*minA*minB;
	    int b=maxA*maxB*maxC;
		return max(a,b);
	}

	public static void main(String[] args) {
		

		
		
		
		MaxThreeProducts m=new MaxThreeProducts();
		int arr1[]={7,-8,2,3,1,-5};
		int maxprod=m.findMax(arr1);
		
		if(maxprod==-1)
		{
			System.out.println("No triplets found");
		}
		else
		{
		System.out.println(maxprod);
		}
		// TODO Auto-generated method stub

	}

	

}
