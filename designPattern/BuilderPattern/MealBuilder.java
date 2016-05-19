package designPattern.BuilderPattern;

public class MealBuilder {

	 Meal getVegMeal(){
		Meal m=new Meal();
		m.addItems(new Pepsi());
		m.addItems(new VegBurger());
	return m;	
	}


	 Meal getNonVegMeal(){
		Meal m=new Meal();
		m.addItems(new Coke());
		m.addItems(new NonVegBurger());
	return m;	
	}

	
}
