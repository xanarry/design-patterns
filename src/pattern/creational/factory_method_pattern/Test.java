package pattern.creational.factory_method_pattern;

public class Test {
    public static void main(String[] args) {
        AbstractFactory factory = new ComputerFactory();
        AbstractProduct computer = factory.produce();
        System.out.println(computer.getName());

        factory = new PhoneFactory();
        AbstractProduct phone = factory.produce();
        System.out.println(phone.getName());
    }
}
