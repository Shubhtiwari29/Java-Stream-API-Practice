package practice;

import java.util.Arrays;
import java.util.List;

public class FindFirstElementOfList {

	public static void main(String[] args) {
	
		List<String> words = Arrays.asList("Ram","Madhav","Keshav","Raghav");
		
			words.stream().findFirst().ifPresent(System.out::println);

	}

}
