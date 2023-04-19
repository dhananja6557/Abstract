abstract class Human {
    Human() {
        System.out.println("Constructor is Running");
    }
    abstract void eat();
    abstract void walk();
    void breathing() {
        System.out.println("Breathing");
    }
}
class Man extends Human {
    @java.lang.Override
    void eat() {
        System.out.println("Man Anything Eat");
    }

    @java.lang.Override
    void walk() {
        System.out.println("Man Running");
    }

    @java.lang.Override
    void breathing() {
        super.breathing();
        System.out.println("Man Breathing");
    }
}
class Dhana extends Man {
    @java.lang.Override
    void eat() {
        System.out.println("Dhana Anything Eat");
    }

    @java.lang.Override
    void walk() {
        System.out.println("Dhana Running");
    }

    @java.lang.Override
    void breathing() {
        super.breathing();
        System.out.println("Dhana Breathing");
    }
}

class Running {
    public static void main(String[] args) {
        Human h1 = new Man();
        Human h2 = new Dhana();
        Man h3 = new Dhana();

        h1.breathing();
        h1.eat();
        h1.walk();
        h2.breathing();
        h2.eat();
        h2.walk();
        h3.breathing();
        h3.eat();
        h3.walk();
    }
}
