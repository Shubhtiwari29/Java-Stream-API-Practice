package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {

    public static void main(String [] args){

        //1 -> TO CREATE AN EMPTY STREAM OBJECT
        Stream<Object> emptyStream = Stream.empty();

        // 2-> TO CREATE A STREAM OBJECT IF YOU ARE HAVING AN ARRAY, COLLECTION OR EVEN AN OBJECT
        String names [] = {"Ram", "Madhav", "Hanuman", "Keshav", "Muralidgar"};
        Stream<String> stream1 = Stream.of(names);
        stream1.forEach(e -> {
            System.out.println(e);
        });

        //3-> TO CREAT A STREAM OBJECT USING STREAM BUILDER
        Stream<Object> streamBuilder = Stream.builder().build();

        //4-> TO CREATE AN OBJECT FROM AN ARRAY
        IntStream stream  = Arrays.stream(new int[] {2,4,5,6,7,8,69});
        stream.forEach(e->{
            System.out.println(e);
        });

        //5-> TO CALL STREAM ON COLLECTION OBJECTS SUCH AS LIST, SET ETC.

        List<Integer> list = new ArrayList<>();
        list.add(69);
        list.add(108);
        list.add(900);

        Stream<Integer> stream2 = list.stream();
        stream2.forEach(i-> {System.out.println(i);});
    }

}
