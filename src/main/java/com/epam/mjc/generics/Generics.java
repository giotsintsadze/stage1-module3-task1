package com.epam.mjc.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    // Refactor Method-1
    public List<String> boxingMethod(String name) {
        List<String> firstList = new ArrayList<>();
        firstList.add(name);
        return firstList;
    }


    // Refactor Method-2
    public <T> T genericMethod(T data) {
        return data;
    }

    // Refactor Method-3
    public <T> void cloneMethod(List<T> consumer, List<? extends T> producer) {
        consumer.addAll(producer);
    }

    public static void main(String[] args) {
        Generics generics = new Generics();

        List<String> firstList = generics.boxingMethod("Hello");

        String value = generics.genericMethod("Generic Data");

        List<Integer> producerList = new ArrayList<>();
        producerList.add(1);
        producerList.add(2);

        List<Integer> consumerList = new ArrayList<>();
        generics.cloneMethod(consumerList, producerList);
    }
}
