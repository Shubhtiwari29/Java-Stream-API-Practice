package practice;

import java.util.Arrays;
import java.util.List;

public class FindLenthOfLongestString {

	public static void main(String[] args) {


		List<String> words = Arrays.asList("Ram","Madhusudan","Madhav","Keshav","Shubham");
		
		int longestLengthStr = words.stream().mapToInt(String::length).max().orElse(0);
		
		System.out.println("Maximum length of the element in the list : "+longestLengthStr);

	}

}
