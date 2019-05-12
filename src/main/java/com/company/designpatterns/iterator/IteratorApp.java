package com.company.designpatterns.iterator;

public class IteratorApp {

    public static void main(String[] args) {
        Task aggregate = new Task();
        Iterator it = aggregate.getIterator();

        while (it.hasNext()) {
            System.out.println((String) it.next());
        }
    }
}
