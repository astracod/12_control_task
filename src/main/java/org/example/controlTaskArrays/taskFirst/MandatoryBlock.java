package org.example.controlTaskArrays.taskFirst;


import java.util.Arrays;

class MandatoryBlock {


    /***
     * Генерирует массив случайных челых чисел в заданном диапазоне
     * @param count - кол-во элементов
     * @param min - минимальное значение
     * @param max - максимальное значение
     * @return сгенерированный массив
     */
    public static int[] randomIntArray(int min, int max, int count) {
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = min + (int) (Math.random() * max);
        }
        return arr;
    }

    public static void testTask1() {
        int[] array = randomIntArray(1, 100, 7);
        System.out.println(Arrays.toString(array)); // массив из семи случайных чисел от 1 до 100
    }

    /***
     * Находит минимальный среди элементов массива
     * @param arr - массив
     * @return значение минимального элемента
     */
    public static int minOfArray(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }

    /***
     * Находит макчимальный среди элементов массива
     * @param arr - массив
     * @return значение максимального элемента
     */
    public static int maxOfArray(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

        public static void testTask2(){
        int[] array = {2,8,6,9,7,4,3,6,9,1,7};
        System.out.println(maxOfArray(array)); // 9
        System.out.println(minOfArray(array)); // 1
    }

    /***
     * Находит индекс минимального среди элементов массива
     * @param arr - массив
     * @return индекс минимального элемента
     */
    public static int minIndexOfArray(int[] arr){
        int min = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] < arr[i+1]) min = i;
        }
        return min;
    }

    /***
     * Находит индекс максимального среди элементов массива
     * @param arr - массив
     * @return индекс максимального элемента
     */
    public static int maxIndexOfArray(int[] arr){
        int max = 0;
        for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] > arr[i+1]) max = i ;
        }
        return max;
    }

        public static void testTask3(){
        int[] array = {2,8,6,9,7,4,3,6,9,1,7};
        System.out.println(maxIndexOfArray(array)); // 8
        System.out.println(minIndexOfArray(array)); // 9
    }

    /***
     * Находит индекс элемента по значению (назвать indexOf)
     * @param arr - массив
     * @param val - искомое значение
     * @return индекс найденого элемента или -1, если значение не найдено
     */
    public static int indexOf(int[] arr,int val){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) return i;
        }
        return -1;
    }
        public static void testTask4(){
        int[] array = {2,8,6,9,7,4,3,6,9,1,7};
        System.out.println(indexOf(array,6)); // 2
        System.out.println(indexOf(array,15)); // -1
    }
}
