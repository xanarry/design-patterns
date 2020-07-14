package pattern.creational.factory_method_pattern;

public class PhoneFactory extends AbstractFactory {

    @Override
    public AbstractProduct produce() {
        return new Phone();
    }
}
