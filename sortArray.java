//1.Write a Java program to sort following numeric array
//[23,12,45,67,90,23,54,67,8,1,14]
package Practice_Array;
   
public class sortArray {   
	public static void main(String[] args)   
	{   
	   
	int [] array = new int [] {23,12,45,67,90,23,54,67,8,1,14};  
	  
	for (int i = 0; i < array.length; i++)   
	{  
	for (int j = i + 1; j < array.length; j++)   
	{  
	int tmp = 0;  
	if (array[i] > array[j])   
	{  
	tmp = array[i];  
	array[i] = array[j];  
	array[j] = tmp;  
	}  
	}  
 
	      
	System.out.println(array[i]);   
	}   
} 
}
	 
		    
		

  
	  






