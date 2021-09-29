package com.dz;

public class Main {

    public static void main(String[] args) {
        MovablePoints rectangle = new MovablePoints(2, 1, 4, 6);
        System.out.println(rectangle);
        rectangle.move(2, 4, -2, 1);
        System.out.println(rectangle);
        // со скоростью точек
        MovablePoints srectangle = new MovablePoints(1, 1, 3, 6, 7, 2);
        System.out.println(srectangle);
        srectangle.move(2, 3, -2, 1);
        System.out.println(srectangle);
        if (srectangle.Is_speed_the_same())
            System.out.println("Скорость точек одинакова");
        else
            System.out.println("Скорость точек разная");
    }
}
