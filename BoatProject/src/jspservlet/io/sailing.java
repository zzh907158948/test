package jspservlet.io;

public class sailing {
	private int sailingID;
	private int shipID;
	private int userID;
	private String departure;
	private String destination;
	public int getSailingID() {
		return sailingID;
	}
	public void setSailingID(int sailingID) {
		this.sailingID = sailingID;
	}
	public int getShipID() {
		return shipID;
	}
	public void setShipID(int shipID) {
		this.shipID = shipID;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	private String state;
	private String duration;
}
