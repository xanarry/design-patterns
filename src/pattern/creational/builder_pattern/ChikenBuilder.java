package pattern.creational.builder_pattern;

public class ChikenBuilder extends AbstractMealBuilder {
    @Override
    public void buildDrink() {
        meal.setDrink("chiken drink");
    }

    @Override
    public void buildFood() {
        meal.setFood("chiken food");
    }
}
