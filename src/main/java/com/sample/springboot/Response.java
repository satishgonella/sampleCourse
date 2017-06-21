package com.sample.springboot;

/**
 * Created by satish on 20/06/17.
 */
public class Response {

    private String message;

    public Response() {}

    public Response(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}