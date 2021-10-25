package ua.kovalev;

public class Main {
    public static void main(String[] args) {
        DemoDeque demoDeque = new DemoDeque();
        System.out.println("demoDeque = " + demoDeque);
        demoDeque.drink();
        demoDeque.drink();
        System.out.println("demoDeque = " + demoDeque);
    }
}
