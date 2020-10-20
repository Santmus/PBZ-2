package com.company.Interface;
import com.company.Table.TableEditor;

import java.util.Scanner;
/*
SET @@global.time_zone = '+00:00'; - при запуске в mysql
 */
public class SystemInterface {

  public void begin(String str){
      
      System.out.printf("Добро пожаловать %s.\nКакую операцию вы хотите совершить?\n",str);
      System.out.println("0. Выход");
      System.out.println("1. Вывод информации о внутренних приказах,\n" +
              "распоряжениях или других подобных документах.");
      System.out.println("2. Вывод информации о корреспондентам.");
      System.out.println("3. Просмотр списка исходящих корреспондентов, мероприятия по которым на\n" +
              "заданную дату не были выполнены");
      System.out.println("4. Просмотр списка мероприятий за заданный период");
      System.out.println("5. Просмотр списка всех зафиксированных документов заданного типа (например,\n" +
              "приказов) на текущую дату, отсортированных по дате документа");
      System.out.println("6. Добавление/редактирование/удаление информации");
      Scanner sout = new Scanner(System.in);
      int operation = sout.nextInt();
      operation(operation);
  }

  public void operation(int operation) {
      if(operation == 0) System.exit(-0);
      else if(operation == 1) getInformationAboutCommand();
      else if(operation == 2) getInformationAboutCorrespodent();
      else if(operation == 3) getInformationAboutCorrespodentWhichDoesNotCompleteEvent();
      else if(operation == 4) getInformationListOfEvents();
      else if (operation == 5) getInformationAboutDocument();
      //else if (operation == 6) editTables();
  }

    /*private void editTables() {
      Scanner cout = new Scanner(System.in);
      Scanner sout = new Scanner(System.in);
      System.out.println("Что вы хотите сделать:\n1-Добавить информацию\n2-Удалить пользователя\n3-Изменить информацию ");
      int x = cout.nextInt();
      System.out.println("Какую таблицу вы хотите изменить?\n1-Корреспондентов\n2-Приказах");
      int table = sout.nextInt();
      switch (x){
          case 1:{
              TableEditor.addRecord(table);
              break;
          }
          case 2:{
              TableEditor.changeRecord(table);
              break;
          }
          case 3:{
              TableEditor.deleteRecord(table);
              break;
          }
      }
    }*/
    private void getInformationAboutDocument() {
      Information.getInformationAboutDocument();
    }
    private void getInformationListOfEvents() {
      Information.getInformationListOfEvents();
    }
    private void getInformationAboutCorrespodentWhichDoesNotCompleteEvent() {
    Information.getInformationAboutCorrespodentWhichDoesNotCompleteEvent();
    }
    private void getInformationAboutCorrespodent()  {
      Information.getInformationAboutCorrespodentList();
    }
    private void getInformationAboutCommand() {
        Information.getInformationAboutCommandList();
    }


}
