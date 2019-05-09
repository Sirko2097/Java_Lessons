package com.company.designpatterns.prototype;

public class PrototypeApp {

    public static void main(String[] args) {
        Human human = new Human(18, "Arthur");
        System.out.println(human.toString());

        Human copy = (Human) human.copy();
        System.out.println(copy.toString());

        HumanFactory factory = new HumanFactory(copy);
        System.out.println(factory.makeCopy());
    }
}
