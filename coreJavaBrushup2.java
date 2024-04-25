
public class coreJavaBrushup2 {

	public static void main(String[] args) {
	 
//Learning if and Else 
 
		int a= 100;
		System.out.println(++a);
		
		 int[] arr3= {1,2,3,4,5,6,7,8,9,10000,200000,30};
		// Show the values multiply by 2 
		//output= 2,4,6,8,10,122
		 for(int i=0;i<arr3.length; i++)
		 {
			 if (arr3[i] % 2 ==0)
			 {
				 System.out.println(arr3[i]+ "  is   multiply by 2");
				// break;
			 }
			 else
			 {
				 System.out.println(arr3[i] + "  is not multiply by 2 ");
			 }
		 }
		 
	}

}
