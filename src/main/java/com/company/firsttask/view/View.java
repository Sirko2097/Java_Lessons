package com.company.firsttask.view;

import com.company.firsttask.controller.Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class View {

    public void printMenu() {
        String firstWord;
        String secondWord;

        Controller controller = new Controller();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.print("Input first word: ");
                firstWord = reader.readLine().trim();
                if (!controller.setFirstWord(firstWord)) {
                    System.err.println("Wrong word. Try again.");
                } else {
                    break;
                }
            }

            while (true) {
                System.out.print("Input second word: ");
                secondWord = reader.readLine().trim();
                if (!controller.setSecondWord(secondWord)) {
                    System.err.println("Wrong word. Try again.");
                } else {
                    break;
                }
            }

            controller.wordProcessing();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printResult(String result) {
        System.out.println(result);
    }
}
