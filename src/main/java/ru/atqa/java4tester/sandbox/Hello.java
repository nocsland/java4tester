package ru.atqa.java4tester.sandbox;

public class Hello {
    public static void main(String[] args) {
        hello("world!");
        hello("user!");
        hello("Anton!");
        double l = 5;
        double a = 3;
        double b = 6;
      System.out.println("Площадь квадрата со стороной " + l + " равна " + area(l));
      System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " равна " + area (a, b));

    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody);
    }
    public static double area (double len){
      return len * len;
    }
    public static double area (double a, double b){
      return a * b;

    }


}
