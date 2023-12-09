package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import control.ThucDonControll;
import model.ThucDonModel;

public class ThucDonView extends JFrame {
  public ThucDonModel thucDonModel;
 
  public ButtonGroup buttonGroup_monPhu;
  public JLabel jLabel_thongTin;
public ButtonGroup buttonGroup_MonChinh;
public ArrayList<JCheckBox> lis_buttonGroup_monPhu;
public JComboBox<String> jComboBox_monChinh;
public JList<String> jList_MonPhu;

public ThucDonView() throws HeadlessException {
	this.thucDonModel= new ThucDonModel();
	init();
}

private void init() {
	// TODO Auto-generated method stub
	this.setTitle("MENU");
	this.setSize(600, 600);
	this.setLocationRelativeTo(null);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLayout(new BorderLayout());
	Font font =new Font("Arial", Font.BOLD, 40);
	JLabel header =new JLabel("MENU RESTAURANT");
	header.setFont(font);
	JPanel jPanel_tieuDe =new JPanel();
	jPanel_tieuDe.add(header);
	this.add(jPanel_tieuDe,BorderLayout.NORTH);
	
	JPanel jPanel_monChinh =new JPanel();
	
	jPanel_monChinh.setLayout(new FlowLayout());
	String[] CacMonChinh =new String[] {"Ride","Pho","Banh Mi"};
	 jComboBox_monChinh =new JComboBox<String>(CacMonChinh);
	 jComboBox_monChinh.setFont(font);
	jPanel_monChinh.add(jComboBox_monChinh);
	
	
	
	
	
	
	
	JPanel jPanel_monPhu =new JPanel();

	jPanel_monPhu.setLayout(new GridLayout(2,2));
	
	String[] CacMonPhu =new String[] {"MilkTea","Cake","Cocacola","Nem"};
	jList_MonPhu =new JList<String>(CacMonPhu);
	
	jList_MonPhu.setFont(font);
	jPanel_monPhu.add(jList_MonPhu);
	
	
	
	JPanel jPanel_luaChon =new JPanel();
	jPanel_luaChon.setLayout(new BorderLayout());
	jPanel_luaChon.add(jPanel_monChinh,BorderLayout.CENTER);
	jPanel_luaChon.add(jPanel_monPhu,BorderLayout.SOUTH);
	this.add(jPanel_luaChon,BorderLayout.CENTER);
	
	
	JPanel jPanel_ThanhToan =new JPanel();
	jPanel_ThanhToan.setLayout(new GridLayout(1,2));
	jLabel_thongTin=new JLabel();
	
	
	ActionListener ac =new ThucDonControll(this);
	JButton jButton_ThanhToan=new JButton("Pay");
	jButton_ThanhToan.addActionListener(ac);
	jButton_ThanhToan.setFont(font);
	jPanel_ThanhToan.add(jLabel_thongTin);
	jPanel_ThanhToan.add(jButton_ThanhToan);
	this.add(jPanel_ThanhToan,BorderLayout.SOUTH);
	
	
	
	this.setVisible(true);
}

public void hienThiKetQua() {
	// TODO Auto-generated method stub
	String kq="Mon Chinh "+ this.thucDonModel.getLuaChon_monChinh()+
			" Mon Phu "+this.thucDonModel.getLuaChon_monPhu()+" tongTien "+this.thucDonModel.getTongTien();
	this.jLabel_thongTin.setText(kq);
}
   
}
