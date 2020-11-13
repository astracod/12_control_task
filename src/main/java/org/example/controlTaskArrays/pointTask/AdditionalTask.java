package org.example.controlTaskArrays.pointTask;

/*Сначала пользователь вводит координаты 10ти точек на плоскости
 Затем программа спрашивает у него координаты центра и радиус окружности
 После выводи только те точки, которые лежат в этой окружности
 */

import java.util.Arrays;
import java.util.Scanner;

public class AdditionalTask {

    private Scanner sc;
    private Point[] points;


    public AdditionalTask() {
        sc = new Scanner(System.in);
        points = new Point[3];
    }

    public Point[] readPointsFromUser2() {
        for (int i = 0; i < points.length; i++) {
            points[i] = readOnePointFromUser2();
        }
        return points;
    }

    private Point readOnePointFromUser2() {
        System.out.println(" Введите координату по X");
        int x = Integer.parseInt(sc.nextLine());
        System.out.println(" Введите координату по Y");
        int y = Integer.parseInt(sc.nextLine());
        return new Point(x,y);
    }

    public boolean isPointInCircle2(int radius, Point center, Point point) {
        double dis =center.distanceTo(point);
        return dis < radius;
    }

    private Point readCenterCircleFromUser() {
        System.out.println(" Координата центра окружности Х :");
        int x = Integer.parseInt(sc.nextLine());
        System.out.println(" Координата центра окружности Y :");
        int y = Integer.parseInt(sc.nextLine());
        return new Point(x,y);
    }
    public Point[] getPointsInCircle2(Point[] points, int radius, Point center) {
        Point[] result = new Point[0];
        for (Point point : points) {
            if (isPointInCircle2(radius, center, point)) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = point;
            }
        }
        return result;
    }

    public void show2(Point[] points) {
        for (Point point : points) {
            System.out.println(point.getX() + " " + point.getY());
        }
    }

    public void run2() {
        Point[] sourcesPoints = readPointsFromUser2();
        Point pointCenterCircle = readCenterCircleFromUser();
        System.out.println(" Укажите радиус проверяемой окружности : ");
        int radius = Integer.parseInt(sc.nextLine());
        Point[] result = getPointsInCircle2(sourcesPoints, radius, pointCenterCircle);
        show2(result);
    }
}
