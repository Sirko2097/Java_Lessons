package com.company.designpatterns.command;

import com.company.designpatterns.command.comands.ResetCommand;
import com.company.designpatterns.command.comands.StartCommand;
import com.company.designpatterns.command.comands.StopCommand;

public class CommandApp {

    public static void main(String[] args) {
        Computer computer = new Computer();
        User user = new User(new StartCommand(computer), new StopCommand(computer), new ResetCommand(computer));

        user.startComputer();
        user.stopComputer();
        user.resetComputer();
    }
}
