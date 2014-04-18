
public class Duplication {

	public static void main(String[] args) 
	{
		Duplication dObj = new Duplication();
		int Array[] = {0,1,2,3,4,4};
		try
		{
			System.out.println(dObj.duplicate(Array));
		}
		catch(IllegalArgumentException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	public int duplicate(int []Array)
	{
		int sum1=0,sum2 = 0;
		sum1  = (Array.length-1)*(Array.length-2) >> 1;
		for(int i=0;i<Array.length;i++)
		{
			if(Array[i]<0 || Array[i]>Array.length-2)
				throw new IllegalArgumentException("Invalid Exception");
			
			sum2 = sum2 + Array[i];
		}			
		
		return sum2 - sum1;
	}

}
