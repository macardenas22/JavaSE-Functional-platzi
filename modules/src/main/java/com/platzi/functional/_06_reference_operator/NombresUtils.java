package com.platzi.functional._06_reference_operator;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class NombresUtils {
    public static void main(String[] args) {
        List<String> profesores = getList("Mauricio","Andrés","Juan");
        System.out.println("Ejecuta Inicio ");
        Consumer <String> printer = text -> System.out.println(text);
        System.out.println("Ejecuta Fin ");
        profesores.forEach(System.out::println);



    }
    public static <T> List<T> getList(T... elements ){
        return Arrays.asList(elements);
    }


}
