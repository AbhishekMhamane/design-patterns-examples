package decorator_pattern;

public abstract class CondimentDecorator extends Coffee {
    Coffee beverage;
    public abstract String getDescription();
}
