package com.company.Interface;

import com.company.DataBase.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Information {

    private static final Configs configs = new Configs();

    //получение списка о о корреспондентах
    public static void getInformationAboutCorrespodentList()  {
        try {
            Connection connection = DriverManager.getConnection(configs.dbConnection + configs.dbHost + configs.dbPort + configs.dbName , configs.dbUser, configs.dbPass);
            System.out.println("Подключение произошло успешно: " + configs.dbConnection + configs.dbHost+ configs.dbPort+configs.dbName + "," + configs.dbUser + "," + configs.dbPass);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(Const.SELECT_CORRESPODENTS);
            while (resultSet.next()) {
            for(int i=1;i<4;i++){
                System.out.print(resultSet.getString(i));
                if( i != 3)
                    System.out.print(", ");
                else
                    System.out.print(";");
            }
            System.out.println();
            }
        }
            catch (SQLException e){ e.printStackTrace(); }
    }

    //получение списка о внутренних приказах
    public static void getInformationAboutCommandList()  {
        try {
            Connection connection = DriverManager.getConnection(configs.dbConnection + configs.dbHost + configs.dbPort + configs.dbName , configs.dbUser, configs.dbPass);
            System.out.println("Подключение произошло успешно: " + configs.dbConnection + configs.dbHost+ configs.dbPort+configs.dbName + "," + configs.dbUser + "," + configs.dbPass);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(Const.SELECT_COMMAND);
            while (resultSet.next()) {
                for (int i = 1; i < 8; i++) {
                    System.out.print(resultSet.getString(i));
                    if( i != 7)
                        System.out.print(", ");
                    else
                        System.out.print(";");
                }
                System.out.println();
            }
        }catch (SQLException e){ e.printStackTrace(); }
    }

    //просмотр списка мероприятий за заданный период
    public static void getInformationListOfEvents() {
        try {
            List<Command> ListOfEvents = new ArrayList<>();
            Connection connection = DriverManager.getConnection(configs.dbConnection + configs.dbHost + configs.dbPort + configs.dbName , configs.dbUser, configs.dbPass);
            System.out.println("Подключение произошло успешно: " + configs.dbConnection + configs.dbHost+ configs.dbPort+configs.dbName + "," + configs.dbUser + "," + configs.dbPass);
            Statement statement = connection.createStatement();

            Scanner sout = new Scanner(System.in);
            System.out.println("Введите начальную дату проверки в формате \'YY-MM-DD\'");
            String beginCheckDate = sout.nextLine();

            Scanner cout = new Scanner(System.in);
            System.out.println("Введите конечную дату проверки в формате \'YY-MM-DD\'");
            String endCheckDate = cout.nextLine();
            //ResultSet resultSet = statement.executeQuery("SELECT date_command,date_performance_event,event_command,check_date_performance_event FROM command WHERE date_command > " + beginCheckDate + " AND date_performance_event < " + endCheckDate + ";" );
            ResultSet resultSet = statement.executeQuery( Const.SELECT_CHECK_DATE_PART1 + beginCheckDate + Const.SELECT_CHECK_DATE_PART2 + endCheckDate + ";" );
            while (resultSet.next()) {
                for (int i = 1; i < 5; i++) {
                    System.out.print(resultSet.getString(i));
                    if( i != 4)
                        System.out.print(", ");
                    else
                        System.out.print(";");
                }
                System.out.println();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    //Просмотр списка исходящих корреспондентов, мероприятия по которым на заданную дату не были выполнены
    public static void getInformationAboutCorrespodentWhichDoesNotCompleteEvent() {
        try {

            Scanner cout = new Scanner(System.in);
            String str;
            List<Command> correspodentList = new ArrayList<>();
            Connection connection = DriverManager.getConnection(configs.dbConnection + configs.dbHost + configs.dbPort + configs.dbName , configs.dbUser, configs.dbPass);
            System.out.println("Подключение произошло успешно: " + configs.dbConnection + configs.dbHost+ configs.dbPort+configs.dbName + "," + configs.dbUser + "," + configs.dbPass);
            Statement statement = connection.createStatement();
            System.out.println("Введите дату проверки в формате \"YY-MM-DD\":\n(Дату необходимо заключить в одинарные кавычки)");
            str = cout.nextLine();
            ResultSet resultSet = statement.executeQuery(Const.SELECT_NOT_COMPLETE_EVENT + str + ";");
            while (resultSet.next()) {
                for (int i = 1; i < 6; i++) {
                    System.out.print(resultSet.getString(i));
                    if( i != 5)
                        System.out.print(", ");
                    else
                        System.out.print(";");
                }
                System.out.println();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    //просмотр списка всех зафиксированных документов заданного типа
    public static void getInformationAboutDocument() {
        try {
            Scanner cout = new Scanner(System.in);
            String str;
            List<Documents> documentsList = new ArrayList<>();
            Connection connection = DriverManager.getConnection(configs.dbConnection + configs.dbHost + configs.dbPort + configs.dbName , configs.dbUser, configs.dbPass);
            System.out.println("Подключение произошло успешно: " + configs.dbConnection + configs.dbHost+ configs.dbPort+configs.dbName + "," + configs.dbUser + "," + configs.dbPass);
            Statement statement = connection.createStatement();
            System.out.println("Какой тип документа вы хотите вывести?\n(Вводимое слово заключить в одинарные кавычки)");
            str = cout.nextLine();
            ResultSet resultSet = statement.executeQuery(Const.SELECT_DIFFERENT_DOCUMENTS + str + ");");
            while (resultSet.next()) {
                for (int i = 1; i < 6; i++) {
                    System.out.print(resultSet.getString(i));
                    if( i != 5)
                        System.out.print(", ");
                    else
                        System.out.print(";");
                }
                System.out.println();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
