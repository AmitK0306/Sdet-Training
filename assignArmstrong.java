// program for finding whether the number is Armstrong 
public class assignArmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cnt,i,num, result, result1;
		cnt=0;
		num = 407;
		result=0;
		result1=num;
		
		int arr[] = new int[10];
	//  to count the length of an integer and also splitting each element in to array
		while(num != 0) {
			arr[cnt]=num%10;
			cnt++;
			num=num/10;
			}
		
		// finding the power of each element as per the length and adding them and storing in result
		for (i=0;i<cnt;i++) {
			//System.out.println(arr[i]);
			arr[i]= (int)Math.pow(arr[i],cnt);	
			result = result + arr[i];
		}
		
		// if the addition of all element is same as the original number then display it as armstrong
		if (result==result1)
			System.out.println(result1 + " This is a armstrong number");
		else
			System.out.println(result1 + " This is not a armstrong number");
		
}
}


