package com.hcl.javabasicadvanced.model;

public class CreatingBoxObjects<T> {
    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        CreatingBoxObjects<Integer> integerBox = new CreatingBoxObjects<Integer>();
        CreatingBoxObjects<String> stringBox = new CreatingBoxObjects<String>();

        integerBox.add(new Integer(10));
        stringBox.add("Hello World");

        System.out.printf("Integer Value :%d\n\n", integerBox.get());
        System.out.printf("String Value :%s\n", stringBox.get());
    }
}