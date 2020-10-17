package com.company.DataBase;

public class Const {

    public static final String CORRESPODENTS = "correspodents";
    public static final String COMMAND = "command";

    public static final String SELECT_CORRESPODENTS = "SELECT name_subdivision, position_correspodent, surname_name FROM outgoing_correspondent";
    public static final String SELECT_COMMAND = "SELECT number_command, date_command, content_command,event_command,responsible_for_implementation,date_performance_event,check_date_performance_event FROM command";

    public static final String INSERT = "INSERT INTO ";

    public static final String DELETE = "DELETE FROM ";

    public static final String WHERE = " WHERE ";
    public static final String AND = " AND ";

    public static final String UPDATE = "UPDATE ";
    public static final String SET = " SET ";

    public static final String LEFT_JOIN = "LEFT JOIN ";
    public static final String ON = " ON ";

    public static final String COMMA = ", ";
    public static final String EQUAL = " = ";
    public static final String SEMICOLON = ";";
    public static final String LEFT_BRACKET = "(";
    public static final String RIGHT_BRACKET = ")";



}
