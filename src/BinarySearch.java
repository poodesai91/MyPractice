import java.lang.annotation.Target;

public class BinarySearch {
	
	
    static int recursiveBinarySearch(int arr[],int l,int h,int target)
    {
    	if(h<l)
    	{
    		return -1;
    	}

 
    		int mid=(l+h)/2;
    		if(target==arr[mid])
    		return mid;
    		else
    			if(target<arr[mid]){
    				h=mid-1;
    			return recursiveBinarySearch(arr, l,h,target);}
    			else{
    				l=mid+1;
    		  return recursiveBinarySearch(arr,l,h, target);
    	}
    		
    	
    	
    }
	public static void main(String[] args) {
		int a[]={2,3,4,5,6,7,8,9};
		int n=a.length;
		int ele=9;
		int found=recursiveBinarySearch(a,0,a.length-1,ele);
		System.out.println("The element is found at location"+found);
		// TODO Auto-generated method stub

	}

}
