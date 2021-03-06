package iterator.pattern;

public class DinerMenu {

	static final int MAX_ITEMS=6;
	int numberOfItems=0;
	MenuItem[] menuItems;
	
	public DinerMenu(){
		menuItems=new MenuItem[MAX_ITEMS];
		addItem("K&B's Pancake Breakfast","Pancakes with scrambled eggs,and toast", true, 2.99);
		addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false,2.99);
		addItem("Blueberry Pancakes","Walffles, with your choice of blueberries or strawberries",true,3.59);
		addItem("Soup of the day","Soup of the day, with a side of potato salad",false,3.29);
		addItem("Hotdog","A hot dog, with saurkraut, relish, onions, topped with cheese",false,3.05);
		addItem("BLT","Bacon with lettuce & tomato on whole wheat", false,2.99);
	}
	public void addItem(String name,String description, boolean vegetarian,double price){
		MenuItem menuItem=new MenuItem(name,description,vegetarian,price);
		if(numberOfItems>=MAX_ITEMS){
			System.err.println("Sorry, menu is full! Can't add item to menu");
		}
		else{
			menuItems[numberOfItems]=menuItem;
			numberOfItems=numberOfItems+1;
		}
	}

	public Iterator createIterator(){
		return new DinerMenuIterator(menuItems);
	}
}
