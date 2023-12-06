package Test;

import model.CouterModel;
import view.CouterView;

public class Test {
  public static void main(String[] args) {
	  CouterModel ct =new CouterModel();
	 ct.decrement();
	 ct.incresment();
	 System.out.println(ct.getValue());
	 
	 CouterView ctv =new CouterView();
	 
	  
}
}
