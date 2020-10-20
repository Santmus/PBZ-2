package com.company.DataBase;

public class Const {

    public static final String SELECT_CORRESPODENTS = "SELECT name_subdivision, position_correspodent, surname_name FROM outgoing_correspondent";
    public static final String SELECT_COMMAND = "SELECT number_command, date_command, content_command, event_command,responsible_for_implementation, date_performance_event, check_date_performance_event FROM command";

    public static final String SELECT_CHECK_DATE_PART1 = "SELECT date_command,date_performance_event,event_command,check_date_performance_event FROM command WHERE date_command > ";
    public static final String SELECT_CHECK_DATE_PART2 = " AND date_performance_event < ";

}
