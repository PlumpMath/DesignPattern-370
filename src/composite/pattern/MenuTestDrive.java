package composite.pattern;

public class MenuTestDrive {
	public static void main(String args[]){
		MenuComponent pancakeHouseMenu=new Menu("PANCAKE HOUSE MENU","BREAKFAST");
		MenuComponent dinerMenu=new Menu("DINER MENU","LUNCH");
		MenuComponent cafeMenu=new Menu("DESSERT MENU","Dessert of course!");
		MenuComponent dessertMenu=new Menu("DESSERT MENU","Dessert of course!");
		MenuComponent allMenus=new Menu("ALL MENUS","All menus combined");
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);
		
		
		dinerMenu.add(new MenuItem(
				"Pasta","Spaghetti with Marinara Sauce, and a slice of sourdough bread",true,3.89));
		dinerMenu.add(dessertMenu);
		
		dessertMenu.add(new MenuItem("Apple Pie","Apple pie with a flakey crust, topped with vanilla oce cream",true,1.59));
		Waitress waitress=new Waitress(allMenus);
		waitress.printMenu();
		
	}
}
