abstract class School {
    void teaching() {
        System.out.println("Teaching");
    }
    abstract void learning();
}
class Grade11 extends School {
    @Override
    void learning() {
        System.out.println("Grade 11 Students Learning Well");
    }

    @Override
    void teaching() {
        super.teaching();
        System.out.println("Teachers Teaching Well");
    }
}
class RunSchool {
    public static void main(String[] args) {
        School s1 = new Grade11();
        s1.teaching();
        System.out.println("------");
        s1.learning();
    }
}