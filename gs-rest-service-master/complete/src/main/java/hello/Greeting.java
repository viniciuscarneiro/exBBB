package hello;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Greeting {

	private final long id;

	private final String content;

	private String date;

	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
		this.date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss"));
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
