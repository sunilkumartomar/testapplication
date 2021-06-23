package com.company;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample<T> {
    T ob;

    GenericsExample(T ob) {
        this.ob = ob;
    }

    public void show() {
        System.out.println("type of objest is  " + ob.getClass().getName());
    }

    public T get() {
        return ob;
    }
}

class Test {

    public static void main(String[] args) {
        GenericsExample<String> gn = new GenericsExample<String>("Sunil");
        gn.show();
        System.out.println(gn.get());

    }
}