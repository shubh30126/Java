package designPattern.BuilderPattern;

public abstract class Burger implements Item {

	public Packaging getPacking(){
		return new Wrapper();
	}
	
}
