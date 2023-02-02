package classes;

public class Room {
	private String roomName;
	private int rate;
	private int price;
	private String img;
	private String description;
	
	public Room(String roomName, int rate, int price, String img, String description) {
		super();
		this.roomName = roomName;
		this.rate = rate;
		this.price = price;
		this.img = img;
		this.description = description;
	}
	
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}