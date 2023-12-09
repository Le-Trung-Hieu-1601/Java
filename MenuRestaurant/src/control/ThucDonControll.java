package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import model.ThucDonModel;
import view.ThucDonView;

public class ThucDonControll implements ActionListener {
  private ThucDonView thucDonView;

public ThucDonControll(ThucDonView thucDonView) {
	
	this.thucDonView = thucDonView;
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	String monChinh =thucDonView.jComboBox_monChinh.getSelectedItem().toString();
	
	
	String monPhu ="";
	Object[] luachonMonPhu =thucDonView.jList_MonPhu.getSelectedValues();
	for (Object c : luachonMonPhu) {
		 
			monPhu= monPhu + c.toString()+", ";
		
	}
	
	thucDonView.thucDonModel.setLuaChon_monChinh(monChinh);
	thucDonView.thucDonModel.setLuaChon_monPhu(monPhu);
	
	thucDonView.thucDonModel.tinhTongTien();
	thucDonView.hienThiKetQua();
	String soTien_chuoi = (String)  JOptionPane.showInputDialog(
			thucDonView,
			thucDonView.jLabel_thongTin.getText()+""+
			"\nEnter the amount ",
			
			JOptionPane.PLAIN_MESSAGE);
			
	try {
		double soTien = Double.valueOf(soTien_chuoi);
		JOptionPane.showMessageDialog(thucDonView,
				"change money back "+(soTien-thucDonView.thucDonModel.getTongTien()),
				"",
				JOptionPane.INFORMATION_MESSAGE);
	} catch (Exception e2) {
		
		JOptionPane.showMessageDialog(thucDonView,
				"Enter wrong data",
				"Inane error",
				JOptionPane.ERROR_MESSAGE);
		
	}		
			
			
			
	
}
}
