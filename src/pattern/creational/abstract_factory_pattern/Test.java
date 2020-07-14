package pattern.creational.abstract_factory_pattern;

public class Test {
    public static void main(String[] args) {
        AbstractFactory hwFactory = new HuaweiFactory();
        AbstractFactory xmFactory = new XiaomiFactory();
        System.out.println(hwFactory.produceComputer().getName());
        System.out.println(hwFactory.producePhone().getName());

        System.out.println(xmFactory.produceComputer().getName());
        System.out.println(xmFactory.producePhone().getName());
    }
}
