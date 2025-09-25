package practice;

import java.util.Arrays;
import java.util.List;

public class CheckIfElemntOfListPositive {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,34,69,96,54);
		boolean numberPositive = numbers.stream().allMatch(n -> n>0);
		System.out.println("Are All elemnts from the list positive? : "+numberPositive);
	}

}
