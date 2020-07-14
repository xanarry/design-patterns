package pattern.creational.abstract_factory_pattern;


/*
抽象工厂模式包含四个角色：
    抽象工厂:用于声明生成抽象产品的方法；
    具体工厂:实现了抽象工厂声明的生成抽象产品的方法，生成一组具体产品，这些产品构成了一个产品族，每一个产品都位于某个产品等级结构中；
    抽象产品:为每种产品声明接口，在抽象产品中定义了产品的抽象业务方法；
    具体产品:定义具体工厂生产的具体产品对象，实现抽象产品接口中定义的业务方法。

在这个示例中，抽象工厂可以生产手机与电脑，手机和电脑可以分为华为的和小米的。手机和电脑在这里就是抽象产品
因此，定义两个具体工厂，华为工厂专门生成华为手机和电脑，小米工厂专门生成小米手机和电脑。这里的手机和电脑就是具体产品

 */
public abstract class AbstractFactory {
    public abstract AbstractPhoneProduct producePhone();

    public abstract AbstractComputerProduct produceComputer();
}
