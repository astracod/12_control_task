package org.example.controlTaskArrays.taskFirst;

/*
    Создать массив из 10 элементов (произвольных)
    добавить между 5м и 6м еще один элемент со значением 72
    удалить элемент под номером 3
    сформировать новый массив, который будет содержать с 4го по 7й элементы исходного

    Task 2 :

    Создать массив задач (массив строк с текстом задач)
    вывести все задачи в виде списка с номерами, например
    Посмотреть видео
    Решить домашнее задание
    Получить оценку
    Затем предложить пользователю добавить задачу, если он согласится - считать и добавить в конец, после чего вывести список
    Затем предложить пользователю удалить задачу, если он согласится, спросить, какую задачу по номеру он хочет удалить и удалить этот элемент из массива
    После вывести список вновь

 */

import java.util.Arrays;
import java.util.Scanner;

public class Task_1 {

    private int[] arr;
    private int[] arr2;
    private String[] tasks;
    public Scanner sc;

    public Task_1() {
        sc = new Scanner(System.in);
        arr = new int[0];
        tasks = new String[]{"Посмотреть видео", "Решить домашнее задание", "Получить оценку"};
    }

    public void addElem(int a) {
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = a;
    }

    public void formedArray(int a, int b) {
        arr2 = new int[0];
        arr2 = Arrays.copyOfRange(arr, a, b);
        System.out.println("Сформированный массив : " + Arrays.toString(arr2));
    }

    public void addingToPlace(int a, int b, int c) {
        arr2 = new int[0];
        arr2 = Arrays.copyOfRange(arr, 0, a);
        arr2 = Arrays.copyOf(arr2, arr2.length + 1);
        arr2[arr2.length - 1] = c;
        for (int i = 0; i < arr.length; i++) {
            int trigger = arr[i];
            if (trigger == b) {
                for (int j = i; j < arr.length; j++) {
                    arr2 = Arrays.copyOf(arr2, arr2.length + 1);
                    arr2[arr2.length - 1] = arr[j];
                }
            }
        }
        arr = arr2;
    }

    public void removeElem(int a) {
        arr2 = new int[0];
        arr2 = Arrays.copyOfRange(arr, 0, a - 1);

        for (int i = 0; i < arr.length; i++) {
            int trigger = arr[i];
            if (trigger == a + 1) {
                for (int j = i; j < arr.length; j++) {
                    arr2 = Arrays.copyOf(arr2, arr2.length + 1);
                    arr2[arr2.length - 1] = arr[j];
                }
            }
        }
        arr = arr2;
    }

    public void showArr() {
        for (int i : arr) {
            System.out.print(i + "  ");
        }
        System.out.println();
    }

    private void addStringElem(String elem) {
        tasks = Arrays.copyOf(tasks, tasks.length + 1);
        tasks[tasks.length - 1] = elem;
    }

    /**
     * Затем предложить пользователю добавить задачу, если он согласится - считать и добавить в конец, после чего вывести список
     *
     * @param task
     */
    public void addTask(String task) {
        System.out.println("Если вы хотите добавить задачу то нажмите 1");
        int answer = Integer.parseInt(sc.nextLine());
        if (answer != 1) return;
        else if (answer == 1) {
            for (int i = 0; i < tasks.length; i++) {

                if (tasks[i].equals(task)) {
                    System.out.println(" Такая задача уже есть!");
                    break;
                }
            }
            addStringElem(task);
        }
        showTaskString();
    }

    /**
     * Затем предложить пользователю удалить задачу, если он согласится, спросить, какую задачу по номеру он хочет удалить и удалить этот элемент из массива
     * После вывести список вновь
     */
    public void removeTask() {
        String[] buf = new String[0];
        showTaskString();
        System.out.println(" Вы хотите удалить задачу? Если да, то нажмите 1");
        int answer = Integer.parseInt(sc.nextLine());
        if (answer != 1) return;
        else {
            System.out.println(" Укажите номер задачи для удаления");
            int answer2 = Integer.parseInt(sc.nextLine());

            for (int i = 0; i < tasks.length; i++) {
                if (i == answer2 - 1) continue;
                buf = Arrays.copyOf(tasks, buf.length + 1);
                buf[buf.length - 1] = tasks[i];
            }
            tasks = buf;
            showTaskString();
        }
    }

    public void showTaskString() {
        int num = 0;
        for (String task : tasks) {
            System.out.println((++num) + " ) " + task);
        }
    }
}
