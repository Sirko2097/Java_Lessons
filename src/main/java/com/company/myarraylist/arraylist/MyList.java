package com.company.myarraylist.arraylist;

public interface MyList<E> extends Iterable<E> {

    boolean add(E e);

    E get(int index);

    int size();

    void update(int index, E e);
}
