package net.shakuro.pinion.selenium.model;

public class SomeData {
    private final String to;
    private final String subject;

    public SomeData(String to, String subject) {
        this.to = to;
        this.subject = subject;
    }

    public String getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }
}
