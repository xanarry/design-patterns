package xanarry.simple_factory_pattern;

/*
简单工厂模式包含三个角色：
工厂角色负责实现创建所有实例的内部逻辑；抽象产品角色是所创建的所有对象的父类，
负责描述所有实例所共有的公共接口；具体产品角色是创建目标，所有创建的对象都充当这个角色的某个具体类的实例。

简单工厂模式的要点在于：
当你需要什么，只需要传入一个正确的参数，就可以获取你所需要的对象，而无须知道其创建细节。

工厂可以生产多中产品，用户通过对应的名字来获取不同的对象
 */
public class Factory {
    public Product create(String type) {
        switch (type) {
            case "A":
                return new ProductA();
            case "B":
                return new ProductB();
        }
        return null;
    }
}
