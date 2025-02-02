package com.platzi.functional._15_streams_intro;

import com.platzi.functional._06_reference_operator.NombresUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<String> courseList = NombresUtils.getList("Java SE", "Java!","FrontEnd","BackEnd","FullStack");

        //recorre cada elemento de la colección courseList, siendo course la variable que representa
        // cada elemento sin usar un indice
        for (String course: courseList) {
            String newCourseName = course.toLowerCase().replace("!","!!");
            System.out.println("Platzi " + newCourseName);
        }

        Stream<String> coursesStream = Stream.of("Java!","FrontEnd","BackEnd","FullStack");
        coursesStream.forEach(System.out::println);

        //Stream<Integer>courseLenght = coursesStream.map(course -> course.length());

       // Optional<Integer> longest = courseLenght.max((x,y) -> y - x);

       // Stream<String> emphasisCourses = coursesStream.map(course-> course + "!");
       // Stream<String> justJavaCourses = coursesStream.filter(course-> course.contains("Java"));
       // emphasisCourses.forEach(System.out::println);

        Stream<String> coursesStream2 = courseList.stream();
        coursesStream2.map(course-> course + "!!")
                .filter(course -> course.contains("Java"))
                .forEach(System.out::println);

        Stream<String> coursesStream3 = courseList.stream();
        addOperator(
                coursesStream3.map(course-> course + "!!")
                .filter(course -> course.contains("Java"))
        ).forEach(System.out::println);


        List<Integer> number = Arrays.asList(2,3,4,5);
        Stream<Integer> square = number.stream();
        square.map(x -> x+x).forEach(System.out::println);



    }

    static <T> Stream<T> addOperator (Stream<T> stream){
        return  stream.peek(data -> System.out.println("Dato :"+data));
    }


}
