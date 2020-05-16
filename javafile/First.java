import java.awt.*;  
import java.awt.event.*;
class First extends Frame implements ActionListener{  
TextField tf;
Button b;
public void exe(){
	tf=new TextField();
	tf.setBounds(60,50,170,20);
	b=new Button("ClickMe");
	b.setBounds(100,120,80,30);
	b.addActionListener(this);
	
	
	
	add(b); add(tf);
	setSize(300,300);
	setLayout(null);
	setVisible(true);

 
}
public void actionPerformed(ActionEvent f){
	tf.setText("Welcome");
}
public static void main(String args[]){  
First f=new First();
f.exe();

}}  