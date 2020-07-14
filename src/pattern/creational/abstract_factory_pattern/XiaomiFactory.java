package pattern.creational.abstract_factory_pattern;

public class XiaomiFactory extends AbstractFactory {
    @Override
    public AbstractComputerProduct produceComputer() {
        return new XiaomiComputer();
    }

    @Override
    public AbstractPhoneProduct producePhone() {
        return new XiaomiPhone();
    }
}
