package org.example.controlTaskArrays.taskFirst;


    /* Написать класс Dog (домашний питомец: собака, у питомца есть имя)
    метод "подать голос" (выводит сообщение "Гав")
    метод "подать лапу" (воводит сообщение, что собака с таким то именем подала лапу)
    гетер и сеттер для имени
    */

public class Dog {

    private String name;

    public Dog(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void castVote(){
        System.out.println(" Гав");
    }
    public void givePaw(){
        System.out.println(this.getName()+" подала лапу!");
    }
}
