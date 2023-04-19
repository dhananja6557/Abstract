abstract class CentralBank {
    abstract int interestRate();
}
class BOC extends CentralBank {
    int interestRate() {
        return 5;
    }
}
class NDB extends CentralBank {
    int interestRate() {
        return 10;
    }
}
class Run {
    public static void main(String[] args) {
        CentralBank cb;
        cb = new BOC();
        System.out.println("Rate of interest is : " + cb.interestRate() + "%" );
        cb = new NDB();
        System.out.println("Rate of interest is : " + cb.interestRate() + "%" );
    }
}