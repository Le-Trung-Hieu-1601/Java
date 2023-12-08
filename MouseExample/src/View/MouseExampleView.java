package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Controller.MouseExempleController;
import Model.MouseExampleModel;

public class MouseExampleView extends JFrame {
private MouseExampleModel model;
private JPanel jPanel_mouse;
private JLabel jLabel_x;
private JLabel jLabel_y;
private JLabel jLabel_count;
private JLabel jLabel_count_value;
private JLabel jLabel_check_in;
private JLabel jLabel_check_in_value;
private JLabel jLabel_empty1;
private JLabel jLabel_empty2;

public MouseExampleView() throws HeadlessException {
	this.model=new MouseExampleModel();
	this.init();
}

private void init() {
	// TODO Auto-generated method stub
	this.setTitle("Mouse Example");
	this.setSize(600, 500);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLocationRelativeTo(null);
	
	MouseExempleController mouseEmxempleController =new MouseExempleController(this);
	
	jPanel_mouse=new JPanel();
	jPanel_mouse.setBackground(Color.CYAN);
	jPanel_mouse.addMouseListener(mouseEmxempleController);
	jPanel_mouse.addMouseMotionListener(mouseEmxempleController);
	
	JPanel jPanel_info =new JPanel();
	jPanel_info.setLayout(new GridLayout(3,3));
	JLabel jLabel_position =new JLabel("Position: ");
	 jLabel_x =new JLabel("x= ");
	 jLabel_y =new JLabel("y= ");
	 jLabel_count =new JLabel("Number of clicks: ");
	 jLabel_count_value =new JLabel("n");
	 jLabel_check_in=new JLabel("Mouse is in component: ");
	 jLabel_check_in_value =new JLabel("no");
	 jLabel_empty1 =new JLabel();
	 jLabel_empty2 =new JLabel();
	
	jPanel_info.add(jLabel_position);
	jPanel_info.add(jLabel_x);
	jPanel_info.add(jLabel_y);
	jPanel_info.add(jLabel_count);
	jPanel_info.add(jLabel_count_value);
	jPanel_info.add(jLabel_empty1);
	jPanel_info.add(jLabel_check_in);
	jPanel_info.add(jLabel_check_in_value);
	jPanel_info.add(jLabel_empty2);
	
	
	
	this.setLayout(new BorderLayout());
	this.add(jPanel_mouse,BorderLayout.CENTER);
	this.add(jPanel_info,BorderLayout.SOUTH);
	
	
	
	
	this.setVisible(true);
}
public void Click() {
	this.model.addClick();
	this.jLabel_count_value.setText(this.model.getCount()+"");
}

public void enter()
{
	this.model.enter();
	this.jLabel_check_in_value.setText(this.model.getChekIn());
	
}
public void exit() {

	this.model.exit();
	this.jLabel_check_in_value.setText(this.model.getChekIn());
}
public void updatex_y(int x, int y) {
	this.model.setX(x);
	this.model.setY(y);
	this.jLabel_x.setText(this.model.getX()+"");
	this.jLabel_y.setText(this.model.getY()+"");
	
}

}
