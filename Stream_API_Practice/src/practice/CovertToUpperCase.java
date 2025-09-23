package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CovertToUpperCase {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("ram","Madhav","Keshav");
        List<String> uppercaseWords = words.stream()
                                                    .map(String::toUpperCase)
                                                    .collect(Collectors.toList());
        System.out.println("All words in Uppercase : "+uppercaseWords);
    }
}

/*map = Returns a stream consisting of the results of applying the givenfunction to 
the elements of this stream*/
 