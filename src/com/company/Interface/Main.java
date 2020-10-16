package com.company.Interface;

import java.util.Scanner;

public class Main {

    private static SystemInterface systemInterface;

    public static void main(String[] args) {
        authorization();
    }

   public static void authorization(){
        Scanner cout = new Scanner(System.in);
        System.out.println("Введите свое ФИО:");
        String str = cout.nextLine();
        systemInterface = new SystemInterface();
        systemInterface.begin(str);
   }


}
