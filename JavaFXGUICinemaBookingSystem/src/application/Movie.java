package application;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Movie {

	// Local variables for Movie
	private String title;
	private String hours;
	private String director;
	private String actor;
	private LocalDate date;
	private LocalTime time;
	private static final DateTimeFormatter dateFormat= DateTimeFormatter.ISO_LOCAL_DATE ;
	private static final DateTimeFormatter timeFormat= DateTimeFormatter.ISO_LOCAL_TIME ;
	
	
	// Local variables for Seat
	private boolean[][] seats = new boolean[3][6];
	private int row;
	private int col;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getHours() {
		return hours;
	}
	public void setHours(String hours) {
		this.hours = hours;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	public boolean getSeats(int row, int col) {
		return seats[row][col];
	}
	public void setSeats(int row, int col) {
		seats[row][col] = false;
	}
	
	public void setSeatTrue(boolean b)  
    { 
        for (int i = 0; i < seats.length; i++)  
        { 
            for (int j = 0; j < seats[i].length; j++) 
            { 
                seats[i][j] = b; 
            } 
        } 
  
    } 
	public void printSeats()  
    { 
        for (int i = 0; i < seats.length; i++)  
        { 
            for (int j = 0; j < seats[i].length; j++) 
            { 
                System.out.print(seats[i][j]); 
            } 
        } 
  
    } 
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getCol() {
		return col;
	}
	public void setCol(int col) {
		this.col = col;
	}
	public static DateTimeFormatter getDateformat() {
		return dateFormat;
	}
	public static DateTimeFormatter getTimeformat() {
		return timeFormat;
	}
	
	
	public Movie(String title, String hours, String director, String actor, int row, int col) {
		super();
		this.title = title;
		this.hours = hours;
		this.director = director;
		this.actor = actor;
		this.row = row;
		this.col = col;
	}
	
	
	public Movie(int row, int col) {
		super();
		this.row = row;
		this.col = col;
	}
	public Movie(String title, LocalDate date, LocalTime time, int row, int col) {
		super();
		this.title = title;
		this.date = date;
		this.time = time;
		this.row = row;
		this.col = col;
	}
	
	
	public Movie(String title, String hours, String director, String actor, LocalDate date, LocalTime time, int row,
			int col) {
		super();
		this.title = title;
		this.hours = hours;
		this.director = director;
		this.actor = actor;
		this.date = date;
		this.time = time;
		this.row = row;
		this.col = col;
	}
	
	public Movie(String title, String hours, String director, String actor, String date, String time, int row,
			int col) {
		super();
		this.title = title;
		this.hours = hours;
		this.director = director;
		this.actor = actor;
		this.date = LocalDate.parse(date, dateFormat);
		this.time = LocalTime.parse(time, timeFormat);
		this.row = row;
		this.col = col;
	}
	
	public Movie(String title, String hours, String director, String actor, String date, String time, boolean[][] seats) {
		super();
		this.title = title;
		this.hours = hours;
		this.director = director;
		this.actor = actor;
		this.date = LocalDate.parse(date, dateFormat);
		this.time = LocalTime.parse(time, timeFormat);
		this.seats = seats;
	}
	
	public Movie(String title, String hours, String director, String actor, String date, String time) {
		super();
		this.title = title;
		this.hours = hours;
		this.director = director;
		this.actor = actor;
		this.date = LocalDate.parse(date, dateFormat);
		this.time = LocalTime.parse(time, timeFormat);
	}
	
	
	
}
