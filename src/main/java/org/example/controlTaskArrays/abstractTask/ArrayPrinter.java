package org.example.controlTaskArrays.abstractTask;

/*
        Описать абстрактный класс ArrayPrinter, содержащий 2 метода
        1) публичный метод print(int[] array) выводящий массив
        2) защищенный абстрактный метод printElem(int elem) для вывода одного элемента
        Определить минимум 2 наследника этого класса в которых перегрузить абстрактный метод
        Объявить в методе main 3 произвольных массива,
        предоставить пользователю возможность выбрать какой из реализаций пользоваться для вывода и поочередно вывести эти массивы используя arrayPrinter
        Код выбора принтера должен быть примерно таким:

        if(choice == 1) arrayPrinter = new PrettyArrayPrinter();
        else arrayPrinter = new DefaultArrayPrinter()
 */

public abstract class ArrayPrinter {

    public void print(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(printElem(array[i]));
        }
    }

    protected abstract String printElem(int elem);
}
