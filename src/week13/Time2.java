package week13;

public class Time2 {
	private int hour;
	private int minute;
	private int second;
	
	// All constructor combinations
	public Time2() {
		this(0, 0, 0);
	}
	
	public Time2(int h) {
		this(h, 0, 0);
	}
	
	public Time2(int h, int m) {
		this(h, m, 0);
	}
	
	public Time2(int h, int m, int s) {
		setTime(h,m,s);
	}
	
	// Actual implementation
	public void setTime(int h, int m, int s) {
		setHour(h);
		setMinute(m);
		setSecond(s);
	}
	
	// Setters and getters with input validation
	public int getHour() {
		return hour;
	}
	
	public void setHour(int hour) {
		if(hour >= 0 && hour < 24) {
			this.hour = hour;
		} else {
			throw new IllegalArgumentException("Hour must be between 0 - 23");
		}
	}
	
	public int getMinute() {
		return minute;
	}
	
	public void setMinute(int minute) {
		if(minute >= 0 && minute < 60) {
			this.minute = minute;
		} else {
			throw new IllegalArgumentException("Minute must be between 0 - 59");
		}
	}
	
	public int getSecond() {
		return second;
	}
	
	public void setSecond(int second) {
		if(second >= 0 && second < 60) {
			this.second = second;
		} else {
			throw new IllegalArgumentException("Second must be between 0 - 59");
		}
	}
}
