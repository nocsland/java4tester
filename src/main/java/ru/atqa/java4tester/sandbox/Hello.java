package ru.atqa.java4tester.sandbox;

public class Hello {
    public static void main(String[] args) {
        hello("world!");
        hello("user!");
        hello("Anton!");

        Square s = new Square(5);

        System.out.println("Площадь квадрата со стороной " + s.l + " равна " + s.area());

        Rectangle r = new Rectangle(3, 6);

        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " равна " + r.area());

    }

    public static void hello(String somebody) {

        System.out.println("Hello, " + somebody);
    }


}
