package singleton.pattern;

public class Singleton {
	//Version one
//	private static Singleton uniqueInstance=new Singleton();
//	
//	private Singleton(){}
//	public static Singleton getInstance(){
//		return uniqueInstance;
//	}
	
	
	//version 2 used for multiple thread
	private volatile static Singleton uniqueInstance;
	private Singleton(){}
	public static Singleton getInstance(){
		if(uniqueInstance==null){
			synchronized (Singleton.class){
				if(uniqueInstance==null){
					uniqueInstance=new Singleton();
				}
			}
		}
		return uniqueInstance;
	}
}
