package com.company.DataBase;

public class Correspodent {

    private String name_subdivision;
    private String surname_name;
    private String position_correspodent;

    Correspodent(String name_subdivision,String position_correspodent,String surname_name){
        this.name_subdivision = name_subdivision;
        this.position_correspodent = position_correspodent;
        this.surname_name = surname_name;
    }

    public String getName_subdivision() {
        return name_subdivision;
    }

    public void setName_subdivision(String name_subdivision) {
        this.name_subdivision = name_subdivision;
    }

    public String getPosition_correspodent() {
        return position_correspodent;
    }

    public void setPosition_correspodent(String position_correspodent) {
        this.position_correspodent = position_correspodent;
    }

    public String getSurname_name() {
        return surname_name;
    }

    public void setSurname_name(String surname_name) {
        this.surname_name = surname_name;
    }
}
