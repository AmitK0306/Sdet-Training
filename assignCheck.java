// program for checking Number is prime number or not
public class assignCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,temp1,cnt,flag=0;
		cnt=111; // this value will be checked whether it is prime or not
		temp1=cnt/2; // taking the half of its count
	
		for (i=2;i<=temp1; i++)
		{
			
			if (cnt%i==0) { 
				System.out.println("Not a prime no " +cnt );
				flag=1;
				break;
			}
			
			if (flag==0) {
				System.out.println("Prime No " + cnt);
				break;
			}
			
			
			
		}

	}

}
