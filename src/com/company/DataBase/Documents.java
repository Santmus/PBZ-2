package com.company.DataBase;

import java.util.Date;

public class Documents {
    private String name_company;
    private String type_of_document;
    private String number_command;
    private Date date_command;
    private String check_date_performance_event;

    public Date getDate_command() {
        return date_command;
    }

    public String getCheck_date_performance_event() {
        return check_date_performance_event;
    }

    public String getName_company() {
        return name_company;
    }

    public String getNumber_command() {
        return number_command;
    }

    public String getType_of_document() {
        return type_of_document;
    }

    public void setNumber_command(String number_command) {
        this.number_command = number_command;
    }

    public void setCheck_date_performance_event(String check_date_performance_event) {
        this.check_date_performance_event = check_date_performance_event;
    }

    public void setDate_command(Date date_command) {
        this.date_command = date_command;
    }

    public void setName_company(String name_company) {
        this.name_company = name_company;
    }

    public void setType_of_document(String type_of_document) {
        this.type_of_document = type_of_document;
    }
}
