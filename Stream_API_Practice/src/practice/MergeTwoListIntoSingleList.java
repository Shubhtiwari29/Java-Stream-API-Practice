package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* BELOW CODE IS AN ANSWER FOR FOLLWOING QUESTIONS
 * 1) MERGE TWO LISTS USING STREAM API
 * 2) CONCAT TWO LISTS IN JAVA USING STREAM API
 * 3) COMBINING TWO LISTS USING STREAM API
 * 4) JAVA PROGRAM TO MERGER TWO STRINGS USING STREAM API
 * 5) COLLECTING ELEMENTS FROM MULTIPLE LIST INTO ONE LIST USING TREAM API
 * 6) MERGING TWO LISTS AND COLLECTING RESULTS INTO A NEW LIST
 * 7) USING JAVA 8 STREAM TO MERGE AND COLLECT LISTS
 */

public class MergeTwoListIntoSingleList {

	public static void main(String[] args) {
		
	List<String> list1 = Arrays.asList("Apple", "Mango","Banana","Strawberry");	
	List<String> list2 = Arrays.asList("Kiwi","Orange","watermelon","cocnut");
		
List<String> finalList = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
		
		System.out.println("Final List is : "+finalList);
	}

}
