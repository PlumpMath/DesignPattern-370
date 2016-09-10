package template.pattern;

public class BeverageTeasDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tea tea=new Tea();
		Coffee coffee=new Coffee();
		
		System.out.println("\nMaking tea...");
		tea.prepareRecipe();
		
		System.out.println("\nMaking coffee...");
		coffee.prepareRecipe();
	}

}
