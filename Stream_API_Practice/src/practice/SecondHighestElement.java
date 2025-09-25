package practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SecondHighestElement {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,23,-8989,69,34,78);
		
		Optional<Integer> secondHighest = numbers.stream().sorted((a,b)-> b.compareTo(a)).skip(1).findFirst();
		secondHighest.ifPresent(System.out::println);
		//System.out.println("Second Highest Element is :"+secondHighest);

	}

}
