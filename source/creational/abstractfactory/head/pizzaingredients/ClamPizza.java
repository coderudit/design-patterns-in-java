package creational.abstractfactory.head.pizzaingredients;

public class ClamPizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;

	public ClamPizza(PizzaIngredientFactory ingredientFactory) {
		super();
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	void prepare() {
		System.out.println("Preparing " + name);
		dough = this.ingredientFactory.createDough();
		sauce = this.ingredientFactory.createSauce();
		cheese = this.ingredientFactory.createCheese();
	}
	
}
