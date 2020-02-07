package com.company;

public class Main {

    public static void main(String[] args) {

        Circle c1 = new Circle("Circle",8);
        Circle c2 = new Circle("Circle 2",12);
        Square s1 = new Square("Square", 4);
        Square s2 = new Square("Square 2", 4);
        Triangle t1 = new Triangle("Triangle", 3, 3, 3);
        Rectangle r1 = new Rectangle("Rectangle", 4, 6);


        Figure[] figures = new Figure[] {c1, c2, s1, s2, t1, r1};

        for (int i = 0; i <figures.length ; i++) {
            System.out.println(figures[i].getName() + " "
                    + figures[i].draw() + " " +  figures[i].calculatePerimeter());
        }

        Dog d1 = new Dog(2, "Koki");
        System.out.println(d1.getName() + " возраст " + d1.getAge() + " "
                + d1.callSound() + " " + d1.draw());


    }
}
