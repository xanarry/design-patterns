package pattern.creational.simple_factory_pattern;

public class Test {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Product pa = factory.create("A");
        System.out.println(pa.getName());

        Product pb = factory.create("B");
        System.out.println(pb.getName());
    }
}
