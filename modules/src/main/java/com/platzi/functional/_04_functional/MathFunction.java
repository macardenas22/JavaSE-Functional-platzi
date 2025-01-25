package com.platzi.functional._04_functional;

import java.util.function.Function;
import java.util.function.Predicate;

public class MathFunction {
    public static void main(String[] args) {
        Function<Integer,Integer> squareFunction =  new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x*x;
            }
        };

        System.out.println(squareFunction.apply(5));
        Function<Integer,Integer> sqrt = x -> x*x;
        System.out.println(sqrt.apply(5));

        Predicate<Integer> isEven = x -> x%2==0;
        System.out.println(isEven.test(4));
        System.out.println(isEven.test(5));

        Student mauro = new Student(6.1);
        Predicate<Student> isApprove  = Student -> Student.getScore() > 6.0;

        System.out.println(isApprove.test(mauro));



    }

    static class Student{
        private Double score;

        public Student(Double score) {
            this.score = score;
        }

        public Double getScore() {
            return score;
        }
    }



}
