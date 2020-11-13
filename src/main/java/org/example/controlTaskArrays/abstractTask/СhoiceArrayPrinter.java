package org.example.controlTaskArrays.abstractTask;

import java.util.Scanner;

public class СhoiceArrayPrinter {

    private ArrayPrinter arrayPrinter;
    private ArrayPrinter secondArrayPrinter;
    private Scanner sc;

    public СhoiceArrayPrinter() {
        this.arrayPrinter = new ExclamationOutputArrayPrinter();
        this.secondArrayPrinter = new TildeOutputArrayPrinter();
        this.sc = new Scanner(System.in);
    }

    private int userChoice() {
        System.out.println("Сделайте выбор принтера введя 1 или 2 :");
        return Integer.parseInt(sc.nextLine());
    }

    public void operationSelectedPrinter(int[] arr) {
        while (true) {
            int answer = userChoice();
            if (answer == 1) arrayPrinter.print(arr);
            else if (answer == 2) secondArrayPrinter.print(arr);
            else {
                System.out.println("Bay Bay !!!");
                break;
            }
        }
    }

}
