package com.company.Interface;
import com.company.Table.TableEditor;

import java.sql.Date;
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

  public void begin(){
      System.out.printf("Добро пожаловать.\nКакую операцию вы хотите совершить?\n");
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
      else begin();

  }

  private void editTables() {
      Scanner choose = new Scanner(System.in);
      System.out.println("Что вы хотите изменить?\n1-Информацию о внутр.приказах\n2-Информацию о корреспондетах");
      int number = choose.nextInt();
      switch (number) {
          //внутренние приказы
          case 1: {
              Scanner scanner = new Scanner(System.in);
              System.out.println("Выберите действие:");
              System.out.println("1.Добавление информации о внутр.приказах.");
              System.out.println("2.Редактирование информации о внутр.приказах .");
              System.out.println("3.Удаление информаации о внутр.приказах.");
              int numb = scanner.nextInt();
              switch (numb){
                  //добавление внутренних приказов
                  case 1:{
                      Scanner numberCommand = new Scanner(System.in);
                      System.out.println("Введите номер приказа: ");
                      String  number_command = numberCommand.nextLine();

                      Scanner dateCommand =  new Scanner(System.in);
                      System.out.println("Введите дату приказа: ");
                      String date_command = dateCommand.next();

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

                      TableEditor.addRecordCommand(number_command,date_command,content_command,event_command,responsible_for_implementation,date_performance_event,check_date_performance_event);
                      break;
                  }
                 //изменение внутренних приказов
                  case 2 : {
                      Scanner numberCommand = new Scanner(System.in);
                      System.out.println("Введите номер приказа: ");
                      String number_command = numberCommand.nextLine();

                      Scanner newNumberCommand = new Scanner(System.in);
                      System.out.println("Введите новый номер приказа: ");
                      String newNumber_command = newNumberCommand.nextLine();

                      Scanner dateCommand = new Scanner(System.in);
                      System.out.println("Введите дату приказа: ");
                      String date_command = dateCommand.nextLine();

                      Scanner newDateCommand = new Scanner(System.in);
                      System.out.println("Введите новую дату приказа: ");
                      String newDate_command = newDateCommand.nextLine();

                      Scanner contentCommand = new Scanner(System.in);
                      System.out.println("Введите описание приказа: ");
                      String content_command = contentCommand.nextLine();

                      Scanner newContentCommand = new Scanner(System.in);
                      System.out.println("Введите новое описание приказа: ");
                      String newContent_command = newContentCommand.nextLine();

                      Scanner eventCommand = new Scanner(System.in);
                      System.out.println("Введите место выполнения приказа: ");
                      String event_command = eventCommand.nextLine();

                      Scanner newEventCommand = new Scanner(System.in);
                      System.out.println("Введите новое место выполнения приказа: ");
                      String newEvent_command = newEventCommand.nextLine();

                      Scanner responsibleForImplementation = new Scanner(System.in);
                      System.out.println("Введите отвественный за выполнение приказа: ");
                      String responsible_for_implementation = responsibleForImplementation.nextLine();

                      Scanner newResponsibleForImplementation = new Scanner(System.in);
                      System.out.println("Введите нового отвественного за выполнение приказа: ");
                      String newResponsible_for_implementation = newResponsibleForImplementation.nextLine();


                      Scanner datePerformanceEvent = new Scanner(System.in);
                      System.out.println("Введите дату окончание выполнение приказа: ");
                      String date_performance_event = datePerformanceEvent.nextLine();

                      Scanner newDatePerformanceEvent = new Scanner(System.in);
                      System.out.println("Введите дату окончание выполнение приказа: ");
                      String newDate_performance_event = newDatePerformanceEvent.nextLine();

                      Scanner checkDatePerformanceEvent = new Scanner(System.in);
                      System.out.println("Выполнен ли приказ: ");
                      String check_date_performance_event = checkDatePerformanceEvent.nextLine();

                      Scanner newCheckDatePerformanceEvent = new Scanner(System.in);
                      System.out.println("Выполнен ли приказ: ");
                      String newCheck_date_performance_event = newCheckDatePerformanceEvent.nextLine();

                      TableEditor.UpdateRecordCommand(number_command, newNumber_command, date_command,
                              newDate_command, content_command, newContent_command, event_command, newEvent_command,
                              responsible_for_implementation, newResponsible_for_implementation, date_performance_event,
                              newDate_performance_event, check_date_performance_event, newCheck_date_performance_event);
                      break;
                  }
                  //удаление внутренних приказов
                  case 3: {
                      Scanner numberCommand = new Scanner(System.in);
                      System.out.println("Введите номер приказа: ");
                      String  number_command = numberCommand.nextLine();

                      Scanner dateCommand =  new Scanner(System.in);
                      System.out.println("Введите дату приказа: ");
                      String date_command = dateCommand.next();

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

                      TableEditor.deleteRecordCommand(number_command,date_command,content_command,event_command,responsible_for_implementation,date_performance_event,check_date_performance_event);
                      break;
                      }
                  }
             break;
          }
          case 2: {
                  Scanner scanner = new Scanner(System.in);
              System.out.println("Выберите действие:");
              System.out.println("1.Добавление информации о корресподентах.");
              System.out.println("2.Редактирование информации о корресподентах .");
              System.out.println("3.Удаление информаации о корресподентах.");
              int numb = scanner.nextInt();
              switch (numb){
                  //добавление нового корресподента
                  case 1:{
                      Scanner nameSubdivision = new Scanner(System.in);
                      System.out.println("Введите номер подраздеения: ");
                      String  name_subdivision = nameSubdivision.nextLine();

                      Scanner positionСorrespodent =  new Scanner(System.in);
                      System.out.println("Введите должность корресподента : ");
                      String position_correspodent = positionСorrespodent.next();

                      Scanner surnameName  = new Scanner(System.in);
                      System.out.println("Введите ФИО корресподента: ");
                      String  surname_name = surnameName.nextLine();

                      TableEditor.addCorrespodent(name_subdivision,position_correspodent,surname_name);
                      break;
                  }
                  //изменение корресподента
                  case 2:{
                      Scanner nameSubdivision = new Scanner(System.in);
                      System.out.println("Введите номер приказа: ");
                      String name_subdivision = nameSubdivision.nextLine();

                      Scanner newNameSubdivision = new Scanner(System.in);
                      System.out.println("Введите новый номер приказа: ");
                      String newName_subdivision = newNameSubdivision.nextLine();

                      Scanner positionСorrespodent = new Scanner(System.in);
                      System.out.println("Введите должность корресподента : ");
                      String position_correspodent = positionСorrespodent.nextLine();

                      Scanner newPositionСorrespodent = new Scanner(System.in);
                      System.out.println("Введите новую должность корресподента : ");
                      String newPosition_correspodent = newPositionСorrespodent.nextLine();

                      Scanner surnameName = new Scanner(System.in);
                      System.out.println("Введите ФИО корресподента: ");
                      String surname_name = surnameName.nextLine();

                      Scanner newSurnameName = new Scanner(System.in);
                      System.out.println("Введите новую ФИО корресподента: ");
                      String newSurname_name = newSurnameName.nextLine();
                      TableEditor.updateCorrespodent(name_subdivision,newName_subdivision,position_correspodent,newPosition_correspodent,surname_name,newSurname_name);
                      break;
                  }
                  //удаление корресподента
                  case 3:{
                      Scanner nameSubdivision = new Scanner(System.in);
                      System.out.println("Введите номер подраздеения: ");
                      String  name_subdivision = nameSubdivision.nextLine();

                      Scanner positionСorrespodent =  new Scanner(System.in);
                      System.out.println("Введите должность корресподента : ");
                      String position_correspodent = positionСorrespodent.next();

                      Scanner surnameName  = new Scanner(System.in);
                      System.out.println("Введите ФИО корресподента: ");
                      String  surname_name = surnameName.nextLine();

                      TableEditor.deleteCorrespodent(name_subdivision,position_correspodent,surname_name);
                      break;

                  }
              }
            break;
              }
          default: begin();
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
