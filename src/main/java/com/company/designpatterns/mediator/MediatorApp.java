package com.company.designpatterns.mediator;

public class MediatorApp {

    public static void main(String[] args) {
        TextChat textChat = new TextChat();

        User admin = new Admin(textChat, "Vanya");
        User user = new SimpleUser(textChat, "Vova");
        User u = new SimpleUser(textChat, "Sasha");

        textChat.setAdmin(admin);
        textChat.addUser(user);
        textChat.addUser(u);

        u.sendMessage("Hi all");
        admin.sendMessage("Admin joined chat");
    }
}
