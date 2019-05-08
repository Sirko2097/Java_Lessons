package com.company.myarraylist.arraylist;

import com.company.myarraylist.service.MyArrayIterator;

import java.util.Iterator;

public class MyArrayList<E> implements MyList<E> {

    private E[] arrayValues;

    public MyArrayList() {
        arrayValues = (E[]) new Object[0];
    }

    @Override
    public boolean add(E e) {
        E[] temp = arrayValues;
        try {
            arrayValues = (E[]) new Object[temp.length + 1];
        } catch (ClassCastException ex) {
            return false;
        }
        System.arraycopy(temp, 0, arrayValues, 0, temp.length);
        arrayValues[arrayValues.length - 1] = e;
        return true;
    }

    @Override
    public E get(int index) {
        return arrayValues[index];
    }

    @Override
    public int size() {
        return arrayValues.length;
    }

    @Override
    public void update(int index, E e) {
        arrayValues[index] = e;
    }

    @Override
    public Iterator<E> iterator() {
        return new MyArrayIterator<>(arrayValues);
    }
}
