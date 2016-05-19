package designPattern.abstractFactoryPattern;

public class ShapeFactory extends AbstractFactory{

	public Shape getShape(String type){
		if(type.equals("Square"))
			return new Square();
		else if(type.equals("Circle"))
			return new Circle();
		else if(type.equals("Rectangle"))
			return new Rectangle();
		else return null;	
	}
	
	public Color getColor(String type){
		return null;
	}
}
