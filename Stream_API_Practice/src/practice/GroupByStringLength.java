package practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByStringLength {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("Ram","Krishna","Shiv","Madhav","Bhim","Shubham");
  Map<Integer,List<String>> groupByLength = 
		  words.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(groupByLength);
    }

}
