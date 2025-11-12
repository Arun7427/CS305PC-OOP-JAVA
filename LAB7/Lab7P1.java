import java.awt.event.*;
import java.awt.*;
class Lab7P1{
	public static void main(String...args){
	
		Frame f = new Frame();
		f.setLayout(new FlowLayout());
		TextField tf = new TextField(40);
		
		Button b = new Button("Click");
		//b.setLable("Click");
		Label l = new Label();
		l.setPreferredSize(new Dimension(100,100));
		
		b.setSize(50,50);
		f.add(b);
		
		f.add(tf);
		
		f.add(l);
		
		f.setSize(600,600);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter(){
			public void Windowclosing(WindowEvent we){	
			}
		});
	}	
}
