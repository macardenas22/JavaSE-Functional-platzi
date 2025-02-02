package com.platzi.functional._11_composition;

import java.util.function.Function;

public class MathOperations2 {
    public static void main(String[] args) {
        Function<Integer,Integer> multiplyBy3 = x -> {
            System.out.println("Multiplicando x: "+ x +" por 3");
            return x * 3;
        };

        Function<Integer,Integer> add1multiplyBy3 =
                multiplyBy3.compose(y ->{
                    System.out.println("Add 1 to: "+y);
                    return y + 1;
                });

        Function<Integer, Integer> andSquare = add1multiplyBy3.andThen( x -> {
            System.out.println("Estoy elevando "+x + " al cuadrado" );
            return x*x;
                });

        System.out.println(add1multiplyBy3.apply(5));
        System.out.println(andSquare.apply(3));
    }
}
