package com.model;

//pojo class with required attributes,getters and setters 
//Use Appropriate Annotation
public class AgroProduct {
	
private String productId; 	
private String productName;
// fill the code
private int quantity;
private double costPerKg;
private boolean isOrganic;

public boolean isOrganic() {
	return isOrganic;
}
public void setOrganic(boolean isOrganic) {
	this.isOrganic = isOrganic;
}
public String getProductId() {
	return productId;
}
public void setProductId(String productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public double getCostPerKg() {
	return costPerKg;
}
public void setCostPerKg(double costPerKg) {
	this.costPerKg = costPerKg;
}
public AgroProduct(String productId, String productName, int quantity, double costPerKg,boolean isOrganic) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.quantity = quantity;
	this.costPerKg = costPerKg;
	this.isOrganic=isOrganic;
}
public AgroProduct() {}

}
