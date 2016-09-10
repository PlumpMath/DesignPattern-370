package composite2.pattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CompositeComponent extends Component{
	List children;
	
	public CompositeComponent(){
		this.children=new ArrayList();
	}
	public void add(Component c){
		children.add(c);
	}
	public void remove(Component c){
		children.remove(c);
	}
	public Component get(int key){
		return (Component) children.get(key);
	}
	
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("Composite component:");
		Iterator iterator=children.iterator();
		while(iterator.hasNext()){
			((Component) iterator.next()).operation();
		}
	}
	
}
