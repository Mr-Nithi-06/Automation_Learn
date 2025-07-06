package org.example;

public class Classmethod
{
    //global variable
    int a;
    int b;

    void add() {
        int c = a + b;
        System.out.println(a + "sum of the two number add" + b);
        System.out.println(c);
    }

    void sub() {
        int d = a - b;
        System.out.println(a + "sub of the two number" + b);
        System.out.println(d);
    }

    void mult() {
        int e = a * b;
        System.out.println(a + "multiple of the two number" + b);
        System.out.println(e);

    }

    void div() {
        int e = a / b;
        System.out.println(a + "div of the two number" + b);
        System.out.println(e);

    }

    public static void main(String[] args) {


        Classmethod sumadd = new Classmethod();
        sumadd.a = 19;
        sumadd.b = 22;
        sumadd.add();
        Classmethod sumsub = new Classmethod();
        sumsub.a = 33;
        sumsub.b = 22;
        sumsub.sub();
        Classmethod mult = new Classmethod();
        mult.a = 4;
        mult.b = 3;
        mult.mult();
        Classmethod div = new Classmethod();
        div.a = 33;
        div.b = 44;
        div.div();
    }

}
