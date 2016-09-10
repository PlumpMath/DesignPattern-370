package visitor.pattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StateDiagram implements DiagramElement{

	List components;
	public StateDiagram(){
		components=new ArrayList();
	}
	@Override
	public void accept(Checker c) {
		// TODO Auto-generated method stub
		Iterator it=components.iterator();
		while(it.hasNext()){
			((DiagramElement)it.next()).accept(c);
		}
		
	}
	public void add(DiagramElement de){
		components.add(de);
	}
	//other operations

}
