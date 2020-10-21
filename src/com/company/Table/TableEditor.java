package com.company.Table;

import com.company.DataBase.Configs;
import com.company.DataBase.Const;

import java.sql.*;


public class TableEditor {

    private static Connection connection;
    private static final Configs configs = new Configs();

    TableEditor(Connection conn) {
        this.connection = connection;
    }
    //добавление
    public static void addRecordCommand(String number_command, String date_command, String content_command,
                                              String event_command, String responsible_for_implementation,
                                              String date_performance_event, String check_date_performance_event) {

        PreparedStatement addingRecordCorrespodents = null;
        try {
            Connection connection = DriverManager.getConnection(configs.dbConnection + configs.dbHost + configs.dbPort + configs.dbName , configs.dbUser, configs.dbPass);
            System.out.println("Подключение произошло успешно: " + configs.dbConnection + configs.dbHost+ configs.dbPort+configs.dbName + "," + configs.dbUser + "," + configs.dbPass);
            Statement statement = connection.createStatement();
            addingRecordCorrespodents = connection.prepareStatement(Const.INSERT_INTO_COMMAND);
            addingRecordCorrespodents.setString(1, number_command);
            addingRecordCorrespodents.setString(2, date_command);
            addingRecordCorrespodents.setString(3, content_command);
            addingRecordCorrespodents.setString(4, event_command);
            addingRecordCorrespodents.setString(5, responsible_for_implementation);
            addingRecordCorrespodents.setString(6, date_performance_event);
            addingRecordCorrespodents.setString(7, check_date_performance_event);
            addingRecordCorrespodents.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    //обновление
    public static void UpdateRecordCommand(String number_command, String newNumber_command, String date_command, String newDate_command,
                                                 String content_command, String newContent_command, String event_command, String newEvent_command,
                                                 String responsible_for_implementation, String newResponsible_for_implementation, String date_performance_event,
                                                 String newDate_performance_event, String check_date_performance_event, String newCheck_date_performance_event) {
        PreparedStatement addingRecordCorrespodents = null;
        try {
            Connection connection = DriverManager.getConnection(configs.dbConnection + configs.dbHost + configs.dbPort + configs.dbName , configs.dbUser, configs.dbPass);
            System.out.println("Подключение произошло успешно: " + configs.dbConnection + configs.dbHost+ configs.dbPort+configs.dbName + "," + configs.dbUser + "," + configs.dbPass);
            Statement statement = connection.createStatement();
            addingRecordCorrespodents = connection.prepareStatement(Const.UPDATE_COMMAND);
            addingRecordCorrespodents.setString(1, newNumber_command);
            addingRecordCorrespodents.setString(2, newDate_command);
            addingRecordCorrespodents.setString(3, newContent_command);
            addingRecordCorrespodents.setString(4, newEvent_command);
            addingRecordCorrespodents.setString(5, newResponsible_for_implementation);
            addingRecordCorrespodents.setString(6, newDate_performance_event);
            addingRecordCorrespodents.setString(7, newCheck_date_performance_event);
            addingRecordCorrespodents.setString(8, number_command);
            addingRecordCorrespodents.setString(9, date_command);
            addingRecordCorrespodents.setString(10, content_command);
            addingRecordCorrespodents.setString(11, event_command);
            addingRecordCorrespodents.setString(12, responsible_for_implementation);
            addingRecordCorrespodents.setString(13, date_performance_event);
            addingRecordCorrespodents.setString(14, check_date_performance_event);
            addingRecordCorrespodents.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
