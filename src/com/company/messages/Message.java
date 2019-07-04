package com.company.messages;

public class Message {
    private String messageContent;

    public Message(){}

    public Message(String messageContent) {
        this.messageContent = messageContent;

    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    @Override
    public String toString() {
        return '\n'+ messageContent;

    }
}
