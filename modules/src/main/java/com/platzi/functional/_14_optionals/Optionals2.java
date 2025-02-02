package com.platzi.functional._14_optionals;

import java.util.*;

public class Optionals2 {

    public static void main(String[] args) {
        List<String> names = getNames();
        if (names != null) {
            //1
        }

        Optional<List<String>> optionalNames = getOptionalNames();
        if (optionalNames.isPresent()){
            //operación
        }

        optionalNames.ifPresent(nameValue -> nameValue.forEach(System.out::println));

    }


    static List<String> getNames() {
        List<String> list = new LinkedList<>();
        return Collections.emptyList();
    }

    static String mostValuablePlayers(){
        return null;
    }

    static Optional<List<String>> getOptionalNames(){
        List<String> namesList = new LinkedList<>();
        return Optional.of(namesList);
    }

    static Optional<String> OptionalValuablePlayer(){
        return Optional.ofNullable(String.valueOf(2));
    }


}


