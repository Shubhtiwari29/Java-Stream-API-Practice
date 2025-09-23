package practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMaximumNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,3,78,69,99,121,232,-6969);
        Optional<Integer> maxValue = numbers.stream().max(Integer::compareTo);
        System.out.println("Maximum number is : " +maxValue);
    }

}

/* NOTE -> So when you pass Integer::compareTo to .max(...),
it's like telling Java:"Compare the elements in natural (ascending) order — 
keep the largest."*/