package ru.messenger;

public class Message {
    private User sender;
    private User recipient;
    private String text;
    private String dateTime;

    public Message() {}

    public Message(User sender, User recipient, String text, String dateTime) {
        this.sender = sender;
        this.recipient = recipient;
        this.text = text;
        this.dateTime = dateTime;
    }

    public User getSender() {
        return sender;
    }

    public User getRecipient() {
        return recipient;
    }

    public String getText() {
        return text;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public void setRecipient(User recipient) {
        this.recipient = recipient;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
}
