package com.company.designpatterns.mediator;

public class Admin extends User {

    public Admin(Chat chat, String name) {
        super(chat, name);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("Admin " + getName() + " received: " + message);
    }
}
