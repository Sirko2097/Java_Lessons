package com.company.firsttask.model;

public class Model {

    private String helloWord;
    private String worldWord;

    public Model(String helloWord, String worldWord) {
        this.helloWord = helloWord;
        this.worldWord = worldWord;
    }

    public String getConcatWords() {
        return helloWord + " " + worldWord;
    }
}
