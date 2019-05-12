package com.company.designpatterns.mediator;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
abstract class User {

    private Chat chat;
    private String name;
    private boolean isEnabled = true;

    User(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    abstract void getMessage(String message);
}
