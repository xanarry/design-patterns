package pattern.creational.builder_pattern;

public class Test {
    public static void main(String[] args) {
        Meal meal = new KFCWaiter(new BeefBuilder()).construct();
        System.out.println(meal);

        meal = new KFCWaiter(new ChikenBuilder()).construct();
        System.out.println(meal);
    }
}
