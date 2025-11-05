public class ClamPizza extends Pizza {
    PizzaIngrededientFactory ingrededientFactory;

    public ClamPizza(PizzaIngrededientFactory ingrededientFactory) {
        this.ingrededientFactory = ingrededientFactory;
    }

    void prepare() {
        System.out.println("Preparando Clam Pizza");
        dough = ingrededientFactory.createDough();
        sauce = ingrededientFactory.createSauce();
        cheese = ingrededientFactory.createCheese();
        clam = ingrededientFactory.createClam();
        pepperoni = ingrededientFactory.createPepperoni();
    }
}
