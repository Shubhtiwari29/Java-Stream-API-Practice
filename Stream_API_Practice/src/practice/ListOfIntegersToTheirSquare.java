package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*HOW TO SQUARE ELEMENTS FROM THE LIST USING JAVA 8
 HOW TO APPLY THE MAP() TO TRANSFORM A LIST USING JAVA 8
 HOW TO USE STREAM API TO GENERATE LIST OF SQUARE ELEMENTS IN A LIST  
 */

public class ListOfIntegersToTheirSquare {

	public static void main(String[] args) {
	List<Integer> list = Arrays.asList(11,12,13,55,10,69);
	
List<Integer> elementsSquare = list.stream().map(n->n*n).collect(Collectors.toList());
System.out.println("Square of all elements from the list : "+elementsSquare);
			
	}

}
