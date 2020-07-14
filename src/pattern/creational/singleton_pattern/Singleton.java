package pattern.creational.singleton_pattern;

/*
单例模式(Singleton Pattern)：单例模式确保某一个类只有一个实例，而且自
行实例化并向整个系统提供这个实例，这个类称为单例类，它提供全局访问的方法。

单例模式的要点有三个：
一是某个类只能有一个实例；
二是它必须自行创建这个实例；
三是它必须自行向整个系统提供这个实例。单例模式是一种对象创建型模式。单例模式又名单件模式或单态模式。
 */

class SingletonByStaticVar {
    //使用静态变量保存单例，该单例将在类加载的时候被创建，保证了线程的安全
    //缺点是，如果单例没有被用到，系统空间也会一直被这个对象占用
    private static final SingletonByStaticVar instance = new SingletonByStaticVar();
    private SingletonByStaticVar() {}

    public SingletonByStaticVar getInstance() {
        return instance;
    }
}

class SingletonSync {
    private static SingletonSync instance = null;
    private SingletonSync() {}

    /*
    使用同步方法，保证线程安全，否多个进程进入getInstance会导致创建多个对象
    缺点：封锁了整个方法，并发度低
     */
    public static synchronized SingletonSync getInstance() {
        if (instance == null) {
            instance = new SingletonSync();
        }
        return instance;
    }
}

class SingletonSyncAndDoubleCheck {
    /*使用volatile修饰的原因：
    * 首先对象创建分为三个步骤：A分配空间，B初始化，C赋值
    * 没有使用volatile修饰的变量，B和C的操作可能会被重排序，导致变量instance被赋值
    * 不为null了，但实际客户拿到的对象还是未初始化的对象。
    * 所以使用volatile进制指令重排序。
    * */

    private static volatile SingletonSyncAndDoubleCheck instance = null;
    private SingletonSyncAndDoubleCheck() {}

    /*
    使用双重检查，避免在instance不为null的时候也竞争锁。
     */
    public static SingletonSyncAndDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (SingletonSyncAndDoubleCheck.class) {
                /*再次检查的原因是，可能两个线程同时进入了第一个if，那么这两个线程一定会先后
                * 进入临界区，先进入的线程会创建实例对象，那么后来的线程必须先判断是否实例已经
                * 被前面的线程创建了*/
                if (instance == null) {
                    instance = new SingletonSyncAndDoubleCheck();
                }
            }
        }
        return instance;
    }
}


class SingletonInnerStaticClass {
    private SingletonInnerStaticClass() {}
    public static SingletonInnerStaticClass getInstance() {
        return Holder.instance;
    }

    /*静态类Holder在没有被使用前不会被虚拟机加载，内部保持的变量也就不会被初始化
    * 当首次被使用的时候才会被初始化，同时保证了线程安全*/
    static class Holder {
        final static SingletonInnerStaticClass instance = new SingletonInnerStaticClass();
    }
}



public class Singleton {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(SingletonInnerStaticClass.getInstance());
        }
    }
}
