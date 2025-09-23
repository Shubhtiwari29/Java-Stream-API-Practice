package practice;

import java.util.Arrays;
import java.util.List;

public class CalculateSumOfElements {

	public static void main(String[] args) {
		
	 List<Integer> numbers = Arrays.asList(2,3,4,5,6,7,8,9);
	 
	 int sum = numbers.stream().mapToInt(Integer::intValue).sum();
	 
	 System.out.println("Sum of elements is : "+ sum);
	 
	 //mapToInte = Returns an IntStream consisting of the results of applying thegiven function to the elements of this stream,Converts stream into integer
	 //intValue = Returns the value of this Integer as an int.,Integer class to primitive type.

	}

}
