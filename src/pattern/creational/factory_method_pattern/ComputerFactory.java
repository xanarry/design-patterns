package pattern.creational.factory_method_pattern;

public class ComputerFactory extends AbstractFactory {
    @Override
    public AbstractProduct produce() {
        return new Computer();
    }
}
