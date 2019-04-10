package com.company.firsttask.controller;

import com.company.firsttask.model.Model;
import com.company.firsttask.view.View;

public class Controller {

    private String firstWord;
    private String secondWord;

    public boolean setFirstWord(String firstWord) {
        if (firstWord.equals("Hello")) {
            this.firstWord = firstWord;

            return true;
        } else {
            return false;
        }
    }

    public boolean setSecondWord(String secondWord) {
        if (secondWord.equals("world!")) {
            this.secondWord = secondWord;

            return true;
        } else {
            return false;
        }
    }

    public void wordProcessing() {
        Model model = new Model(firstWord, secondWord);
        new View().printResult(model.getConcatWords());
    }
}
