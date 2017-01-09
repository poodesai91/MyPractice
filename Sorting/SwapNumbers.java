
public class SwapNumbers {
	

	
	
	
	public  void change(int a,int b)
	{
		int temp=a;
		a=b;
		b=temp;
		 
	}

	public static void main(String[] args) {
		
		
		int a=2;
		int b=4;
		SwapNumbers swap=new SwapNumbers();
       swap.change(a,b);
	    
	    System.out.println(a+" "+b);
	  
		// TODO Auto-generated method stub

	}

}
