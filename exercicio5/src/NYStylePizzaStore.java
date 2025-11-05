public class NYStylePizzaStore extends PizzaStore{
    protected Pizza createPizza(String item){
        Pizza pizza = null;
        PizzaIngrededientFactory ingredientFactory = new NYPizzaIngredientFactory();
        new NYPizzaIngredientFactory();

        if (item.equals("queijo")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Queijo");
        } else if (item.equals("vegetariana")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Vegetariana");
        } else if (item.equals("mariscos")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Mariscos");

        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
        }
        return pizza;
    }
}
