package practice;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectOddNumbers {

	public static void main(String[] args) {
	
		List<Integer> numbers = Arrays.asList(0,23,45,68,69,43,56);
		
		Set<Integer> oddNumbers = numbers.stream().filter(n ->n %2 !=0).collect(Collectors.toSet());

		System.out.println("Odd numbers from the list : "+oddNumbers);
	}

}
