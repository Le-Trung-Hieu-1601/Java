package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.CouterView;

public class CounterListener implements ActionListener {
     private CouterView ctv;
		// TODO Auto-generated method stub

	
	public CounterListener(CouterView ctv) {
		this.ctv=ctv;
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String src =e.getActionCommand();
		System.out.println("ban da nhan nut!" +src);
		if(src.equals("UP")) {
			this.ctv.increment();
			
		}
		 else if(src.equals("down")) {
			this.ctv.decrement();
		}else if(src.equals("Reset")) {
			this.ctv.reset();
		}
		
	}

}
