package com.company.myarraylist.service;

import java.util.Iterator;

public class MyArrayIterator<E> implements Iterator<E> {

    private int index = 0;
    private E[] values;

    public MyArrayIterator(E[] values) {
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        return index < values.length;
    }

    @Override
    public E next() {
        return values[index++];
    }
}
