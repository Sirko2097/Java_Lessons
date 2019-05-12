package com.company.designpatterns.mediator;


import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public class TextChat implements Chat {

    private User admin;
    private List<User> users = new ArrayList<>();

    public void setAdmin(User admin) {
        if (admin instanceof Admin) {
            this.admin = admin;
        } else {
            throw new RuntimeException("forbidden");
        }
    }

    public void addUser(User user) {
        if (admin == null) {
            throw new RuntimeException("There are no admins");
        }

        if (user instanceof SimpleUser) {
            users.add(user);
        } else {
            throw new RuntimeException("Runtime");
        }
    }

    @Override
    public void sendMessage(String message, User user) {
        if (user instanceof Admin) {
            users.forEach(u -> u.getMessage(u.getName() + ": " + message));
        }
        if (user instanceof SimpleUser) {
            users.forEach(u -> {
                if (u != user && u.isEnabled()) {
                    u.getMessage(u.getName() + ": " + message);
                }
            });
            if (admin.isEnabled()) {
                admin.getMessage(user.getName() + ": " + message);
            }
        }
    }
}
