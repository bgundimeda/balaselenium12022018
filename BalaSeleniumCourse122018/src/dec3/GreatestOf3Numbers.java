package dec3;

public class GreatestOf3Numbers {

	public static void main(String[] args) {
		
		int first,second,third;
		
         first = 100;
         second = 10;
         third = 100;
         
         if ((first > second) && (first>third)) {
         
         System.out.println("First number is greatest: "+first);  
         	

	}
         else if ((second>first)&&(second>third)) {
        	 
        	 System.out.println("Second number is greatest : "+second);
         }
         
         else if ((third>first)&&(third>second)) {
        	 
        	 System.out.println("Third number is greatest : "+third);
         }
         
         else if (first==second && first>third) {
        	 
        	 System.out.println("First and Second numbers are greater than Third number");
         }
         
         else if (first==third && first>second) {
        	 
        	 System.out.println("First and Third numbers are greater than Second number");
         }
         
         else if (third==second && third>first) {
	 
	         System.out.println("Third and Second numbers are greater than First number");
}    
         
         else {
        	 
        	 System.out.println("All are equal");
         }
         
}

}