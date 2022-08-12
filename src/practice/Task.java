package practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task {
	LocalDate date;
	String thing;
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	
	public Task(String dateString,String thing) {
		this.date = LocalDate.parse(dateString,dtf);
		this.thing =thing;
	}
	
	public String getDateString() {
		return date.format(dtf);
	}

}
