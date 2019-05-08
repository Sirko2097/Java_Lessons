package com.company.myarraylist;

import com.company.myarraylist.arraylist.MyArrayList;
import com.company.myarraylist.arraylist.MyList;

public class Main {

    public static void main(String[] args) {
        MyList<String> list = new MyArrayList<>();
        list.add("first");
        list.add("second");

        list.forEach(System.out::println);
        System.out.println(list.size());
        System.out.println(list.get(list.size() - 1));
        list.update(0, "updated");
        System.out.println(">>>updated:");
        list.forEach(System.out::println);
    }
}
