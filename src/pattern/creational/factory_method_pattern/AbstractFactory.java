package pattern.creational.factory_method_pattern;

/*
在工厂方法模式中，工厂方法用来创建客户所需要的产品，同时还向客户隐藏了哪种具体产
品类将被实例化这一细节，用户只需要关心所需产品对应的工厂，无须关心创建细节，甚至
无须知道具体产品类的类名。

基于工厂角色和产品角色的多态性设计是工厂方法模式的关键。它能够使工厂可以自主确定
创建何种产品对象，而如何创建这个对象的细节则完全封装在具体工厂内部。工厂方法模式
之所以又被称为多态工厂模式，是因为所有的具体工厂类都具有同一抽象父类。

使用工厂方法模式的另一个优点是在系统中加入新产品时，无须修改抽象工厂和抽象产品提
供的接口，无须修改客户端，也无须修改其他的具体工厂和具体产品，而只要添加一个具体
工厂和具体产品就可以了。这样，系统的可扩展性也就变得非常好，完全符合“开闭原则”。

每一种具体的产品需要一个具体的工厂对象来进行生产。
 */
public abstract class AbstractFactory {
    public abstract AbstractProduct produce();
}