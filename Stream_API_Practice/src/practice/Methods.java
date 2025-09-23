package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class  Methods {

        // NOTE -> FILTER CONSUMES PREDICATE, WHICH RETURNS A BOOLEAN VALUE.
        //NOTE -> MAP IS USED WHEN WE REQUIRE TO PERFORM SOME OPERATION,
    //              IT ACCEPTS FUNCTION AS A PARAMETER AND RETURNS A VALUE

    public static void main(String[] args) {

        List<String> names = List.of("Ram", "Keshav", "Madhav", "Brignath", "Muralidhar");
        names.stream().forEach(e->{
            System.out.println(e);
        });

        List<String> newName = names.stream().filter(e->e.startsWith("M")).collect(Collectors.toList());
       // System.out.println(newName);
        newName.stream().forEach(System.out::println);

        List<Integer> number = List.of(9,10,2,8);
        List<Integer>squareOfNumber = number.stream().map(i-> i * i).collect(Collectors.toList());
        System.out.println("Square of all number from list : "+ squareOfNumber);

        // SORT METHOD TO SORT NUMBERS
        number.stream().sorted().forEach(System.out::println);

        // TO FIND MINIMUM NUMBER
        Integer  integer = number.stream().min((x,y)-> x.compareTo(y)).get();
        System.out.println("Minimum number from numbers is : "+ integer);

        Integer  maximumNumber = number.stream().max((x,y)-> x.compareTo(y)).get();
        System.out.println("maximum number from numbers is : "+ maximumNumber);
    }
}