package designPattern.fatcoryPattern;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			ShapeFactory sf=new ShapeFactory();
			
			Shape shape;
			
			shape=sf.getShape("Rectangle");
			shape.draw();
			shape=sf.getShape("Circle");
			shape.draw();
			shape=sf.getShape("Square");
			shape.draw();
	}

}
