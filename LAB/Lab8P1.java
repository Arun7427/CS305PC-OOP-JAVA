import java.awt.*;
import java.awt.event.*;

class Lab8P1 extends Frame{
	Lab8P1(){
		super("Demonstration of MenuBar");
		MenuBar mb = new MenuBar();
		setMenuBar(mb);
		String[] menus = {"File", "Edit", "Help"};
		String[][] mi = {
					{"Open","Save","Close"},
					{"Cut","Copy","Paste"},
					{"About","Update","License"},
		};			
		int x = 0 , y =0;
		for(String s : menus ){
			y = 0;
			Menu m = new Menu(s);
			
			for(int i=0; i<3; i++){
				MenuItem mmi = new MenuItem(mi[x][y]);
				mmi.addItemListener(this);
				m.add(mmi);
				y++;
			}
			x++;
			mb.add(m);
		}
		
		
		setSize(500, 400);
		setVisible(true);
		addWindowListener(
			new WindowAdapter(){
				public void windowClosing(WindowEvent we){
					dispose();
				}
			}
		);
	}
	public voidactionPerformed(ActonEvent ae){
		String mstr = ae.getActionCommand();
		if(mstr.equals("Close")){
			System.exit(0);		
		}else
	}	
}
