package Test;

import javax.swing.UIManager;

import control.ThucDonControll;
import view.ThucDonView;

public class test {
  public static void main(String[] args) {
	try {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		new ThucDonView();
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
}
