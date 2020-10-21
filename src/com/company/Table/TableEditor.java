package com.company.Table;

import com.company.DataBase.Const;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class TableEditor {

    private static Connection connection;

    TableEditor(Connection conn) {
        this.connection = connection;
    }

    public static void addRecordCorrespodents(String number_command, String date_command, String content_command, String event_command, String responsible_for_implementation, String date_performance_event, String check_date_performance_event) {
        PreparedStatement addingRecordCorrespodents = null;
        try {
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
}
