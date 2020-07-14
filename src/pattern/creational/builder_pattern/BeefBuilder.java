package pattern.creational.builder_pattern;

public class BeefBuilder extends AbstractMealBuilder {
    @Override
    public void buildDrink() {
        meal.setDrink("beef drink");
    }

    @Override
    public void buildFood() {
        meal.setFood("beef food");
    }
}
