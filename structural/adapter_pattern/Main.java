package adapter_pattern;

public class Main {
  public static void main(String args[]){

    Duck duck = new MallardDuck();
    Turkey turkey = new WildTurkey();

    duck.quack();
    duck.fly();

    turkey.gobble();
    turkey.fly();

    Duck turkeyAdapter = new TurkeyAdapter(turkey);
    turkeyAdapter.quack();
    turkeyAdapter.fly();
  }
}
