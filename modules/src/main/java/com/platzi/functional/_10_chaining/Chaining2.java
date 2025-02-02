package com.platzi.functional._10_chaining;

public class Chaining2 {
    public static void main(String[] args) {
        Chainer chainer = new Chainer();
        chainer.sayHi().sayBye();
    }

    static class Chainer{
        public Chainer sayHi(){
            System.out.println("Hola");
            return this;
        }

        public Chainer sayBye(){
            System.out.println("Bye");
            return this;
        }
    }
}
