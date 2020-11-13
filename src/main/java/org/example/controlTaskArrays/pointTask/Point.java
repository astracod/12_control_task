package org.example.controlTaskArrays.pointTask;

/*
    Написать класс точка (математическая, двухмерная)
    конструктор принимает координаты
    метод проверки лежит ли точка в начале координат (возвращает true или false)
    гетеры и сеттеры для координат
    метод для вывода точки в консоль
    метод для нахождения расстояния до другой точки (double distanceTo(Point point2))
*/
public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distanceTo(Point point2) {
        int x2 = point2.getX();
        int y2 = point2.getY();
        int x1 = this.getX();
        int y1 = this.getY();
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    public boolean isCenter() {
        return this.getX() == 0 && this.getY() == 0;
    }

    public void show() {
        System.out.println("Координата Х : " + getX() + ", Координата Y : " + getY());
    }
}
