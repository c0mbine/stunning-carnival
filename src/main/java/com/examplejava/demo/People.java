package com.examplejava.demo;

import java.util.List;

public class People {

    private final long id;
    private final List<String> content;

    public People(long id, List<String> content) {
        this.id = id;
        this.content = content;
    }

    public long getID() {
        return id;
    }

    public List<String> getContent() {
        return content;
    }
}