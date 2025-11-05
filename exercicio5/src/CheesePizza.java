public class CheesePizza extends Pizza {
    PizzaIngrededientFactory ingrededientFactory;
    public CheesePizza(PizzaIngrededientFactory ingrededientFactory) {
        this.ingrededientFactory = ingrededientFactory;
    }

    void prepare() {
        System.out.println("Preparing cheese pizza...");
        dough = ingrededientFactory.createDough();
        sauce = ingrededientFactory.createSauce();
        cheese = ingrededientFactory.createCheese();
        pepperoni = ingrededientFactory.createPepperoni();
    }
}
