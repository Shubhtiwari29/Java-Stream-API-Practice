package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElement {

	public static void main(String[] args) {			
	
		List<Integer> numbers = Arrays.asList(23,45,69,65,69,23);
		
		Set<Integer> seen = new HashSet<Integer>();
		
		List<Integer> duplicates = numbers.stream()
											.filter(i -> !seen.add(i))
											.distinct()
											.collect(Collectors.toList());
		
		List<String> words = Arrays.asList("apple","mango","cocnut","kiwi","apple","mango");
		
		List<String> duplicateElements = words.stream().distinct().collect(Collectors.toList());
		
		System.out.println("Duplicates numbers are : "+duplicates);
		
		System.out.println("Duplicates elements are : "+duplicateElements);
		
		
	}

}
