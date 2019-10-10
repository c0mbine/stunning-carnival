package com.examplejava.demo;

public class Goodbye {

    private final long id;
    private final String content;

    public Goodbye(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getID(){
        return id;
    }

    public String getContent() {
        return content;
    }
}