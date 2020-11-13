package org.example.controlTaskArrays.staticTask;

/*
написать класс StringTasks, содержащий статические методы для работы со строками
int countOf(String s, String needle) - посчитать число вхождений заданного фрагмента (needle) в строку (s)

String cesarCrypt(String s, int key) - метод шифрует строку шифром Цезаря (сдвиг каждого символа на ключ),
использовать charAt и создание строки на основе массива

Contact[] parseContacts(String s) - на вход метода подается строка вида "Вася:0490005678;Петя:+380951234567;Леонид:0678899777".
Метод возвращает массив контактов (имя, телефон). Примечание: в классе Contact переопределять методы equals и hashCode
*/

public class StringTask {


    private Contact contact;

    public static int countOf(String s, String needle) {
        int count = 0;
        String newS = s.replace(",", " ");
        String[] myS = newS.toLowerCase().split(" ");
        for (int i = 0; i < myS.length; i++) {
            if (myS[i].equals(needle)) {
                count++;
            }
        }
        if (count > 0) return count;
        else return -1;
    }

    private static String back(char[] arr, int key) {
        char[] buf = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            buf[i] =(char) (arr[i] - key);
        }
        return new String(buf);
    }

    public static String cesarCrypt(String s, int key) {
        char[] newS = s.toCharArray();
        char[] buf = new char[newS.length];
        for (int i = 0; i < newS.length; i++) {
            buf[i] = (char) (newS[i] + key);
        }
        System.out.println("Зашифрованная строка : "+ new String(buf));
        return  back(buf, key);
    }

    public static Contact[] parseContacts(String s) {
        String[] myS = s.split(";");
        String[] buf;
        Contact[] contacts = new Contact[myS.length];
        for (int i = 0; i < myS.length; i++) {
            buf = myS[i].split(":");
            contacts[i] = new Contact(buf[0], Long.parseLong(buf[1]));
        }
        return contacts;
    }
}
