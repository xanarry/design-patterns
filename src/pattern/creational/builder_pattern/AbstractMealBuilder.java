package pattern.creational.builder_pattern;

/*
建造者模式将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
建造者模式是一步一步创建一个复杂的对象，它允许用户只通过指定复杂对象的类型和内容就
可以构建它们，用户不需要知道内部的具体构建细节。建造者模式属于对象创建型模式。


建造者模式包含如下四个角色：
抽象建造者:为创建一个产品对象的各个部件指定抽象接口；
具体建造者:实现了抽象建造者接口，实现各个部件的构造和装配方法，定义并明确它所创建的复杂对象，
          也可以提供一个方法返回创建好的复杂产品对象；
产品角色:是被构建的复杂对象，包含多个组成部件；
指挥者:负责安排复杂对象的建造次序，指挥者与抽象建造者之间存在关联关系，可以在其construct()
       建造方法中调用建造者对象的部件构造与装配方法，完成复杂对象的建造


在建造者模式的结构中引入了一个指挥者类，该类的作用主要有两个：
一方面它隔离了客户与生产过程；另一方面它负责控制产品的生成过程。指挥者针对抽象建造者编程，客
户端只需要知道具体建造者的类型，即可通过指挥者类调用建造者的相关方法，返回一个完整的产品对象。

 */

public abstract class AbstractMealBuilder {
    protected Meal meal = new Meal();
    public abstract void buildDrink();
    public abstract void buildFood();
    public Meal getMeal() {
        return meal;
    }
}