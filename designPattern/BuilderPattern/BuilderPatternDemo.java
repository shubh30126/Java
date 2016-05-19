package designPattern.BuilderPattern;

public class BuilderPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MealBuilder mealBuilder=new MealBuilder();
		
		Meal vegMeal=mealBuilder.getVegMeal();
		System.out.println("Veg meals details are as below :\n");
		vegMeal.showItems();
		
		Meal nonVegMeal=mealBuilder.getNonVegMeal();
		System.out.println("NonVeg meals details are as below :\n");
		nonVegMeal.showItems();
		
	}

}
