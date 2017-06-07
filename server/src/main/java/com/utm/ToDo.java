package com.utm;

/**
 * Created by vitiok on 6/7/17.
 */
public class ToDo {

    private final long id;
    private String content;

    public ToDo(long _id, String _content) {
        this.id = _id;
        this.content = _content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
