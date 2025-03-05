package org.springboot.greetingapp.Model;

public class MailDTO {
    String to;
    String subject;
    String message;
    public MailDTO(String to, String subject, String message) {
        this.to = to;
        this.subject = subject;
        this.message = message;
    }
    public String getTo() {
        return to;
    }
    public String getSubject() {
        return subject;
    }
    public String getMessage() {
        return message;
    }
    public void setTo(String to) {
        this.to = to;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
