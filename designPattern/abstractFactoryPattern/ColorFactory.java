package designPattern.abstractFactoryPattern;

public class ColorFactory extends AbstractFactory {
	
	public Shape getShape(String type){
		 return null;	
	}
	
	public Color getColor(String type){
		if(type.equals("Red"))
			return new Red();
		else if(type.equals("Blue"))
			return new Blue();
		else if(type.equals("Green"))
			return new Green();
		else return null;
	}
}
