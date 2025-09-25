package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ElementGreaterThan10 {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,-3445,69,12,10,23,45,67);
		List<Integer> greaterNumbers = numbers.stream().filter(i -> i>10).collect(Collectors.toList());
		
		System.out.println("Elements greter than 10 : "+greaterNumbers);

	}

}
