package designPattern.BuilderPattern;

public abstract class ColdDrinks implements Item{

	public Packaging getPacking(){
		return new Bottle();
	}
}
