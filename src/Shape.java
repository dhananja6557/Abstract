abstract class Shape {
    abstract void draw();
}
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}
class Test {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        s1.draw();
        Shape s2 = new Rectangle();
        s2.draw();
    }
}