package proxy.pattern;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;

import javax.swing.*;

public class ImageProxyTestDrive {
	ImageComponent imageComponent;
	JFrame frame=new JFrame("CD Cover viewer");
	JMenuBar menuBar;
	JMenu menu;
	Hashtable cds=new Hashtable();
	
	public static void main(String[] args) throws Exception{
		ImageProxyTestDrive testDrive=new ImageProxyTestDrive();
	}
	public ImageProxyTestDrive()throws Exception{
		cds.put("Ambit: Music", "http://auto.takungpao.com/play/q/2013/0424/1298601_5.html");
		cds.put("Buddha bar","http://auto.takungpao.com/play/q/2013/0424/1298601_6.html");
		cds.put("IMa", "http://image.baidu.com/detail/index?from=1&pn=2&picture_id=4815803425&album_id=318295139&app_id=578130&user_id=778653918&column=%E7%BE%8E%E5%A5%B3&tag=%E5%B0%8F%E6%B8%85%E6%96%B0&sort=1#pn1&-1&id4815803425");
		cds.put("Karma", "http://image.baidu.com/detail/index?from=1&pn=3&picture_id=6644391061&album_id=329810178&app_id=578130&user_id=850119961&column=%E7%BE%8E%E5%A5%B3&tag=%E5%B0%8F%E6%B8%85%E6%96%B0&sort=1");
		
		URL initialURL=new URL((String)cds.get("IMa"));
		menuBar=new JMenuBar();
		menu=new JMenu("Favorite");
		menuBar.add(menu);
		frame.setJMenuBar(menuBar);
		
		for(Enumeration e=cds.keys();e.hasMoreElements();){
			String name=(String) e.nextElement();
			JMenuItem menuItem=new JMenuItem(name);
			menu.add(menuItem);
			menuItem.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent event){
					imageComponent.setIcon(new ImageProxy(getCDUrl(event.getActionCommand())));
					frame.repaint();
				}
			});
		}
		
		Icon icon=new ImageProxy(initialURL);
		imageComponent=new ImageComponent(icon);
		frame.getContentPane().add(imageComponent);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,600);
		frame.setVisible(true);
	}
	URL getCDUrl(String name){
		try{
			return new URL((String)cds.get(name));
		}catch(MalformedURLException e){
			e.printStackTrace();
			return null;
		}
	}
}
