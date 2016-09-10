package composite2.pattern;

public abstract class Component {
	public void add(Component c){}
	public void remove(Component c){}
	public Component get(int key){return null;}
	public abstract void operation();

}
