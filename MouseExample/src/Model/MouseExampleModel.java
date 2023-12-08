package Model;

public class MouseExampleModel {
     private int x,y;
     private int count;
     private String chekIn;
	public MouseExampleModel() {
		this.x=0;
	     this.y=0;
	     this.count=0;
	     this.chekIn="No";
			 
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getChekIn() {
		return chekIn;
	}
	public void setChekIn(String chekIn) {
		this.chekIn = chekIn;
	}
	public void addClick() {
		this.count++;
		
	}
	public void enter()
	{
		this.chekIn="yes";
	}
	public void exit() {
		this.chekIn="no";
	}
     
     
}
