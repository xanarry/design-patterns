package pattern.creational.builder_pattern;

public class KFCWaiter {
    private AbstractMealBuilder builder;

    public KFCWaiter(AbstractMealBuilder builder) {
        this.builder = builder;
    }

    public Meal construct() {
        builder.buildDrink();
        builder.buildFood();
        return builder.getMeal();
    }
}
