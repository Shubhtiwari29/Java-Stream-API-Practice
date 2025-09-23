package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveNullValue {

	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("Ram","Madhav",null,"Keshav","Raghav");
		
		List<String> onlyWords = words.stream()
											  .filter(word -> word != null)
											  .collect(Collectors.toList());
		System.out.println("Only Words from the list : "+onlyWords);

	}

}
