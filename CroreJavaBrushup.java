
public class CroreJavaBrushup {

	public static void main(String[] args) {
		
		 int myNum = 5;
		 String website ="Rahul Shetty Academy";
		 char letter = 'r';
		 double dec = 5.99;
		 boolean card = true;
		 int x=10;
		 int y=++x*2;
		 System.out.println(y);
		 System.out.println(myNum +  "is the Value stored in the MyNum variable");
		 System.out.println(website +  "is the Value stored in the MyNum variable");
		 System.out.println(letter +  "is the Value stored in the MyNum variable");
		 System.out.println(dec +  "is the Value stored in the MyNum variable");
		 System.out.println(card +  "is the Value stored in the MyNum variable");
		 
//ARRAY -
//Declare a integer Array
		 int[] arr = new int[5];//here array memory is fixed ie 5 
//frist  way assiging value to array 
		 arr[0] = 1;
		 arr[1] = 2;
		 arr[2] = 3;
		 arr[3] = 4;
		 arr[4] = 5;
		
//second way of giving array value
		 int[] arr2={1,2,3,4,5};
		 System.out.println(arr2[2]);
		 System.out.println(arr[4]);
		 
		 int[] arr3= {1,2,3,4,5,6,7,8,9,10000,200000}; //Here values also assigned begning only
	    //FOR LOOP CONCEPT 
		// for(int i=0; i<arr.length; i++)
		 //{
			// System.out.println(arr[i]);
		// }
		// System.out.println("THIS IS FOR LOOP arr3");
		 for(int i=0; i<arr3.length; i++)
		 {
			 System.out.println(arr3[i]);
		 }
		 
//Declare a string  Array
		 String[] name = {"Nataraj" , "Shet" ,  "Selenium","Course"};
				for(int i=0; i<name.length; i++)
				{
					System.out.println(name[i]);
				 }
				 
   //Simplified For Loop - enanched for loop syntax write array on right hand side and put a :colon,
		 //then create a variable with correspond datatype
				for( String s:name) 
				{
					System.out.println(s);
				}
				 
				
		 }
	
}
	


