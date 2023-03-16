
public class assignArmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cnt,i,num, result, result1;
		cnt=0;
		num = 153;
		result=0;
		result1=0;
		//  to count the length of an integer
		int arr[] = new int[10];
		
		while(num != 0) {
			cnt++;
			num=num/10;
			arr[cnt]=num;
			
		}
		
		System.out.println(arr);
		
		for (i=0; i < cnt; i++) {
			result=num/10;
			result1=result*result;	
		}
		
		System.out.println(result1);
	}
	

}
