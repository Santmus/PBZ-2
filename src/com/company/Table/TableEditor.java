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

        PreparedStatement addingRecordCommand = null;
        try {
            Connection connection = DriverManager.getConnection(configs.dbConnection + configs.dbHost + configs.dbPort + configs.dbName , configs.dbUser, configs.dbPass);
            System.out.println("Подключение произошло успешно: " + configs.dbConnection + configs.dbHost+ configs.dbPort+configs.dbName + "," + configs.dbUser + "," + configs.dbPass);
            Statement statement = connection.createStatement();
            addingRecordCommand = connection.prepareStatement(Const.INSERT_INTO_COMMAND);
            addingRecordCommand.setString(1, number_command);
            addingRecordCommand.setString(2, date_command);
            addingRecordCommand.setString(3, content_command);
            addingRecordCommand.setString(4, event_command);
            addingRecordCommand.setString(5, responsible_for_implementation);
            addingRecordCommand.setString(6, date_performance_event);
            addingRecordCommand.setString(7, check_date_performance_event);
            addingRecordCommand.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    //обновление
    public static void UpdateRecordCommand(String number_command, String newNumber_command, String date_command, String newDate_command,
                                                 String content_command, String newContent_command, String event_command, String newEvent_command,
                                                 String responsible_for_implementation, String newResponsible_for_implementation, String date_performance_event,
                                                 String newDate_performance_event, String check_date_performance_event, String newCheck_date_performance_event) {
        PreparedStatement updatingRecordCommand = null;
        try {
            Connection connection = DriverManager.getConnection(configs.dbConnection + configs.dbHost + configs.dbPort + configs.dbName , configs.dbUser, configs.dbPass);
            System.out.println("Подключение произошло успешно: " + configs.dbConnection + configs.dbHost+ configs.dbPort+configs.dbName + "," + configs.dbUser + "," + configs.dbPass);
            Statement statement = connection.createStatement();
            updatingRecordCommand = connection.prepareStatement(Const.UPDATE_COMMAND);
            updatingRecordCommand.setString(1, newNumber_command);
            updatingRecordCommand.setString(2, newDate_command);
            updatingRecordCommand.setString(3, newContent_command);
            updatingRecordCommand.setString(4, newEvent_command);
            updatingRecordCommand.setString(5, newResponsible_for_implementation);
            updatingRecordCommand.setString(6, newDate_performance_event);
            updatingRecordCommand.setString(7, newCheck_date_performance_event);
            updatingRecordCommand.setString(8, number_command);
            updatingRecordCommand.setString(9, date_command);
            updatingRecordCommand.setString(10, content_command);
            updatingRecordCommand.setString(11, event_command);
            updatingRecordCommand.setString(12, responsible_for_implementation);
            updatingRecordCommand.setString(13, date_performance_event);
            updatingRecordCommand.setString(14, check_date_performance_event);
            updatingRecordCommand.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public static void deleteRecordCommand(String number_command, String date_command, String content_command,
                                           String event_command, String responsible_for_implementation,
                                           String date_performance_event, String check_date_performance_event) {
        PreparedStatement deletingRecordCommand = null;
        try {
            Connection connection = DriverManager.getConnection(configs.dbConnection + configs.dbHost + configs.dbPort + configs.dbName , configs.dbUser, configs.dbPass);
            System.out.println("Подключение произошло успешно: " + configs.dbConnection + configs.dbHost+ configs.dbPort+configs.dbName + "," + configs.dbUser + "," + configs.dbPass);
            Statement statement = connection.createStatement();
            deletingRecordCommand = connection.prepareStatement(Const.DELETE_COMMAND);
            deletingRecordCommand.setString(1, number_command);
            deletingRecordCommand.setString(2, date_command);
            deletingRecordCommand.setString(3, content_command);
            deletingRecordCommand.setString(4, event_command);
            deletingRecordCommand.setString(5, responsible_for_implementation);
            deletingRecordCommand.setString(6, date_performance_event);
            deletingRecordCommand.setString(7, check_date_performance_event);
            deletingRecordCommand.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
