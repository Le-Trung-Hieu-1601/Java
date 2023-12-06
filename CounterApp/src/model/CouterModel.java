package model;

public class CouterModel {
 private int value;

public int getValue() {
	return value;
}

public void setValue(int value) {
	this.value = value;
}

public CouterModel() {
	
	this.value = 0;
}
public void incresment() {
	this.value++;
}
public void decrement() {
	this.value--;
}
public void reset() {
	this.value= 0;
}

 
}
