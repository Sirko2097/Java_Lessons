package com.company.designpatterns.command.comands;

import com.company.designpatterns.command.Command;
import com.company.designpatterns.command.Computer;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ResetCommand implements Command {

    private Computer computer;

    @Override
    public void execute() {
        computer.reset();
    }
}
