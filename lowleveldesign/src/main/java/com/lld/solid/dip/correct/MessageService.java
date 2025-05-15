package com.lld.solid.dip.correct;

public class MessageService {
    private MessageSender messageSender;

    public MessageService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void sendMessage(String message) {
        messageSender.sendMessage(message);
    }

    public MessageSender getMessageSender() {
        return messageSender;
    }

    public void setMessageSender(MessageSender messageSender) {
        this.messageSender = messageSender;
    }
}
