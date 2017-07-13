package com.messaging.dto.email;

public class ContactReplyEmailPayload {
    private String email;
    private String body;

    public ContactReplyEmailPayload(String email, String body) {
        this.email = email;
        this.body = body;
    }

    public ContactReplyEmailPayload() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
