package proxy.pattern;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote{
	protected MyRemoteImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public String sayHello(){
		return "Server says, 'Hey'";
	}
	
	public static void main(String[] args){
		try{
			MyRemote service=new MyRemoteImpl();
			Naming.rebind("RemoteHello", service);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
