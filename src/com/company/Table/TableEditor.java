package com.company.Table;

import com.company.DataBase.Const;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class TableEditor {

    private static Connection connection;

    public static void deleteRecord(int table) {
    }

    public static void changeRecord(int table) {
    }

   /* public static void addRecord(int table) {
        try {
            if (table == 1){
                Scanner scanner=new Scanner(System.in);
                Statement statement = connection.createStatement();
                StringBuilder statementBuilder = new StringBuilder(Const.INSERT_INTO_CORRESPODENT);
                for(int i=0;i<3;i++){
                    System.out.println(columnsName[i]);
                    statementBuilder.append("'").append(scanner.nextLine()).append("'").append(",");
                }
                System.out.println(columnsName[columns-1]);
                statementBuilder.append("'").append(scanner.nextLine()).append("'").append(")");
                statement.executeUpdate(statementBuilder.toString());
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }*/
}
