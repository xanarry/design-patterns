package pattern.creational.abstract_factory_pattern;


public class HuaweiFactory extends AbstractFactory {
    @Override
    public AbstractComputerProduct produceComputer() {
        return new HuaweiComputer();
    }

    @Override
    public AbstractPhoneProduct producePhone() {
        return new HuaweiPhone();
    }
}
