package creational.singletone_pattern;

public class RunMe {
    public static void main(String[] args) {
        Singletone obj = Singletone.getInstance();
        obj.print();

        Singletone obj2 = Singletone.getInstance();
        obj2.print();
    }
}
