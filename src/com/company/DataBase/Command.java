package com.company.DataBase;

import java.util.Date;

public class Command {

    private String number_command;
    private Date date_command;
    private String content_command;
    private String event_command;
    private String responsible_for_implementation;
    private Date date_performance_event;
    private String check_date_performance_event;

    public String getResponsible_for_implementation() {
        return responsible_for_implementation;
    }

    public void setResponsible_for_implementation(String responsible_for_implementation) {
        this.responsible_for_implementation = responsible_for_implementation;
    }

    public Date getDate_command() {
        return date_command;
    }

    public void setDate_command(Date date_command) {
        this.date_command = date_command;
    }

    public Date getDate_performance_event() {
        return date_performance_event;
    }

    public void setDate_performance_event(Date date_performance_event) {
        this.date_performance_event = date_performance_event;
    }

    public String getCheck_date_performance_event() {
        return check_date_performance_event;
    }

    public void setCheck_date_performance_event(String check_date_performance_event) {
        this.check_date_performance_event = check_date_performance_event;
    }

    public String getContent_command() {
        return content_command;
    }

    public void setContent_command(String content_command) {
        this.content_command = content_command;
    }

    public String getEvent_command() {
        return event_command;
    }

    public void setEvent_command(String event_command) {
        this.event_command = event_command;
    }

    public String getNumber_command() {
        return number_command;
    }

    public void setNumber_command(String number_command) {
        this.number_command = number_command;
    }
}
