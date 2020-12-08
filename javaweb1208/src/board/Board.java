package board;

import java.util.Date;

public class Board {
	private String writer;
	private String title;
	private int price;
	private Date writedate;
	public String getWriter() {
		return writer;
	}
	public void setWriter(String write) {
		this.writer = write;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getWritedate() {
		return writedate;
	}
	public void setWritedate(Date writedate) {
		this.writedate = writedate;
	}
	@Override
	public String toString() {
		return "Board [writer=" + writer + ", title=" + title + ", price=" + price + ", writedate=" + writedate + "]";
	}

}
