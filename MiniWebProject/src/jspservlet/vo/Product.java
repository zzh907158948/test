package jspservlet.vo;

public class Product {
	private String name;
	private int price;
	private int amount;
	private int proID;
	private String funtion;
	private String picture;
	private int cartID;
	public int getCartID() {
		return cartID;
	}
	public void setCartID(int cartID) {
		this.cartID = cartID;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public int getProID() {
		return proID;
	}
	public void setProID(int proID) {
		this.proID = proID;
	}
	public String getFuntion() {
		return funtion;
	}
	public void setFuntion(String funtion) {
		this.funtion = funtion;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
}
