// program for finding final destination
public class AssignTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// multi dimensional array for storing city names
		String[][] city1 = {{"Pune","Nashik"},{"Goa","Nagpur"},{"Nashik","Tirupati"},{"Tirupati","Rameshwaram"}};
		int i,j;
		i=1;j=0;
		String destination;
		destination = city1[0][1]; // assigning first destination city 
		// while loop to find out the final destination
		while (i<city1.length) 
		{
			if (destination == city1[i][j]) 
				destination = city1[i][j+1];
			else
				i++;	
		}
			
		System.out.println("Destination city is "+destination);
		
		
		
	}

}
