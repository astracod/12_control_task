package org.example.controlTaskArrays;


import org.example.controlTaskArrays.abstractTask.СhoiceArrayPrinter;
import org.example.controlTaskArrays.staticTask.Contact;
import org.example.controlTaskArrays.staticTask.StringTask;

public class Main {


    public static void main(String[] args) {
  /*      Task_1 task1 = new Task_1();
        task1.addElem(1);
        task1.addElem(2);
        task1.addElem(3);
        task1.addElem(4);
        task1.addElem(5);
        task1.addElem(6);
        task1.addElem(7);
        task1.addElem(8);
        task1.addElem(9);
        task1.addElem(10);
        task1.showArr();
        task1.formedArray(4, 7);
        task1.addingToPlace(5, 6, 72);
        task1.showArr();
        task1.removeElem(3);
        task1.showArr();*/
        System.out.println("----------------------------------------");
//        task1.addTask("Выпить чай");
//        task1.removeTask();

   /*     MandatoryBlock.testTask1();
        System.out.println("----------------------------------------");
        MandatoryBlock.testTask2();
        System.out.println("----------------------------------------");
        MandatoryBlock.testTask3();
        System.out.println("----------------------------------------");
        MandatoryBlock.testTask4();*/
  /*      System.out.println("----------------------------------------");
        AdditionalTask task = new AdditionalTask();
        task.run2();
        System.out.println("----------------------------------------");*/
       /* Dog dog = new Dog("Jack");
        dog.castVote();
        dog.givePaw();*/
  /*       System.out.println("----------------------------------------");
       Point point = new Point(0,0);
        System.out.println(point.distanceTo(new Point(3,4)));
        point.show();
        System.out.println("Принадлежность к началу координат : "+point.isCenter());*/
          System.out.println("----------------------------------------");
      int[] arr = new int[]{1, 2, 3, 4};
        СhoiceArrayPrinter choice = new СhoiceArrayPrinter();
        choice.operationSelectedPrinter(arr);
        System.out.println("----------------------------------------");

      /*  String firstTask = "дом , милый дом, мой Дом";
                System.out.println("Число вхождений : "+StringTask.countOf(firstTask,"дом"));*/

       /* String secondTask = "Вася:0490005678;Петя:+380951234567;Леонид:0678899777";
          Contact[] contacts = StringTask.parseContacts(secondTask);
        for (Contact contact : contacts) {
            System.out.println(contact.getName()+" "+contact.getPhone());
        }*/

        /*String thirdTask = "Познание";
        System.out.println("Дешифрованная строка : "+StringTask.cesarCrypt(thirdTask, 5));*/

    }
}
