package com.messaging.dto.email;

public class ContactReplyEmailPayload {
    private String recipientName;
    private String body;

    public ContactReplyEmailPayload() {
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
