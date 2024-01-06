package creational.singletone_pattern;

public class Singletone {

    private static volatile Singletone obj;

    private Singletone() {
    }

    public static Singletone getInstance()
    {
        if(obj == null){
            synchronized (Singletone.class){
                obj = new Singletone();
            }
        }
        return obj;
    }

    public void print(){
        System.out.println("This is singletone object " + this.toString());
    }
}
