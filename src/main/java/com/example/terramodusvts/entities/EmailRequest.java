package com.example.terramodusvts.entities;

import jakarta.persistence.Column;

public class EmailRequest {

    private String to;
    private String subject;
    @Column(name = "besoin",columnDefinition = "TEXT")
    private String text;

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
