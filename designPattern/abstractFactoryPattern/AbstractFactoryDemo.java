package designPattern.abstractFactoryPattern;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractFactory af=FactoryProducer.getFactory("Shape");
		Shape s=af.getShape("Circle");
		s.draw();
		s=af.getShape("Square");
		s.draw();
		s=af.getShape("Rectangle");
		s.draw();
		af=FactoryProducer.getFactory("Color");
		Color c=af.getColor("Green");
		c.fill();
		c=af.getColor("Red");
		c.fill();
		c=af.getColor("Blue");
		c.fill();
	}

}
