package Controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import View.MouseExampleView;

public class MouseExempleController implements MouseListener,MouseMotionListener {
private MouseExampleView mouseExempleView;
	public MouseExempleController(MouseExampleView mouseExempleView) {
	
	this.mouseExempleView = mouseExempleView;
}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		this.mouseExempleView.Click();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		this.mouseExempleView.enter();
		int x= e.getX();
		int y=e.getY();
		this.mouseExempleView.updatex_y(x, y);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		this.mouseExempleView.exit();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		int x= e.getX();
		int y=e.getY();
		this.mouseExempleView.updatex_y(x, y);
	}

}
