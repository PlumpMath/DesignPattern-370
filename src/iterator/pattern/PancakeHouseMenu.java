package iterator.pattern;

import java.util.ArrayList;

public class PancakeHouseMenu {
		ArrayList menuItems;
		int position=0;
	
	public PancakeHouseMenu(){
		menuItems=new ArrayList();
		addItem("K&B's Pancake Breakfast","Pancakes with scrambled eggs,and toast", true, 2.99);
		addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false,2.99);
		addItem("Blueberry Pancakes","Walffles, with your choice of blueberries or strawberries",true,3.59);
		
	}
	public void addItem(String name,String description, boolean vegetarian,double price){
		MenuItem menuItem =new MenuItem(name,description,vegetarian,price);
		menuItems.add(menuItem);
	}
	public Iterator createIterator(){
		return new PancakeHouseMenuIterator(menuItems);
	}
}
