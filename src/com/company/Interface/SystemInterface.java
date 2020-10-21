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
      else if (operation == 6) editTables();
  }

  private void editTables() {
      Scanner choose = new Scanner(System.in);
      System.out.println("Что вы хотите изменить?\n1-Информацию о внутр.приказах\n2-Информацию о корреспондетах");
      int number = choose.nextInt();
      switch (number) {
          case 1: {
              Scanner scanner = new Scanner(System.in);
              System.out.println("Выберите действие:");
              System.out.println("1.Добавление информации о внутр.приказах.");
              System.out.println("2.Редактирование информации о внутр.приказах .");
              System.out.println("3.Удаление информаации о внутр.приказах.");
              int numb = scanner.nextInt();
              switch (numb){
                  case 1:{
                      Scanner numberCommand = new Scanner(System.in);
                      System.out.println("Введите номер приказа: ");
                      String  number_command = numberCommand.nextLine();

                      Scanner dateCommand =  new Scanner(System.in);
                      System.out.println("Введите дату приказа: ");
                      String  date_command = dateCommand.nextLine();

                      Scanner contentCommand  = new Scanner(System.in);
                      System.out.println("Введите описание приказа: ");
                      String  content_command = contentCommand.nextLine();

                      Scanner eventCommand = new Scanner(System.in);
                      System.out.println("Введите место выполнения приказа: ");
                      String  event_command = eventCommand.nextLine();

                      Scanner responsibleForImplementation  = new Scanner(System.in);
                      System.out.println("Введите отвественный за выполнение приказа: ");
                      String  responsible_for_implementation = responsibleForImplementation.nextLine();

                      Scanner datePerformanceEvent = new Scanner(System.in);
                      System.out.println("Введите дату окончание выполнение приказа: ");
                      String  date_performance_event = datePerformanceEvent.nextLine();

                      Scanner checkDatePerformanceEvent = new Scanner(System.in);
                      System.out.println("Выполнен ли приказ: ");
                      String  check_date_performance_event = checkDatePerformanceEvent.nextLine();
                      TableEditor.addRecordCorrespodents(number_command,date_command,content_command,event_command,responsible_for_implementation,date_performance_event,check_date_performance_event);
                      break;
                  }
                  case 2 :{
                      break;
                  }
              }
          }
      }
   }

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
