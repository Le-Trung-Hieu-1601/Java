package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MyColorView;

public class ColorListener implements ActionListener {
	public ColorListener(MyColorView myColorView) {
		
		this.myColorView = myColorView;
	}

	private MyColorView myColorView;

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String src = e.getActionCommand();
		if(src.equals("Red Text")) {
			this.myColorView.changeColorRed();
		}else if(src.equals("Yellow Text")) {
			this.myColorView.changeColorYellow();
		}else if(src.equals("Green Text")) {
			this.myColorView.changeColorGreen();
		}else if(src.equals("Red background")) {
			this.myColorView.changeBackgroundColor(Color.RED);
		}else if(src.equals("Yellow background")) {
			this.myColorView.changeBackgroundColor(Color.YELLOW);
		}
		else if(src.equals("Green background")) {
			this.myColorView.changeBackgroundColor(Color.GREEN);
		}
  	}
}
