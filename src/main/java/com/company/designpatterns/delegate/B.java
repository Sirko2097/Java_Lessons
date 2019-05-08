package com.company.designpatterns.delegate;

public class B {
    private A a = new A();

    void f() {
        a.f();
    }
}
