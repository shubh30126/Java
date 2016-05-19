package designPattern.BuilderPattern;
import java.util.*;

public class Meal {

	List<Item> items;
	
	Meal(){
		items=new ArrayList<Item>();
	}
	
	void addItems(Item i){
		items.add(i);
	}
	
	void showItems(){
		int count=0;
		for(Item i:items){
			System.out.println("Item "+(count++));
			System.out.println(i.name());
			System.out.println(i.getPacking().showPackage());
			System.out.println(i.price());
			System.out.println();
		}
	}
	
}
