package com.company.Interface;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        authorization();
    }

   public static void authorization(){
        Scanner cout = new Scanner(System.in);
        Scanner passw = new Scanner(System.in);
        System.out.println("Введите свое ФИО:");
        String str = cout.nextLine();
        System.out.println("Введите пароль:");
        String passwStr = passw.nextLine();
        checkAuthorization(str,passwStr);
        SystemInterface systemInterface = new SystemInterface();
        systemInterface.begin(str);
   }

    public static void checkAuthorization(String str, String passwStr) {
        if((str.length() <= 3 || str.length() > 60) || (passwStr.length() <= 6)){
            System.out.println("Имя пользователя или пароль неверны. Попробуйте еще раз");
            authorization();
        }
   }


}
