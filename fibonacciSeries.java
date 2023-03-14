// Program to find out the Fibonacci series
public class fibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,num,temp1,temp2,temp3;
		
		num=10;
		temp2=0;
		temp3=1;
		
		for(i=0; i < num; i++) 
		{
			System.out.println(temp3);
			temp1 = temp2;
			temp2=temp3;
			temp3=temp1+temp2; // adding previous 2 numbers and storing it in Temp3
				
		}		
		
	}

}
