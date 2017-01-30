package week4;

public class Time1 {
	private int hour = 0; 	// 0 - 23
	private int minute = 0; // 0 - 59
	private int second = 0; // 0 - 59
	
	public void setTime(int hour, int minute, int second) {
		if (hour < 0 || hour >= 24 || 		// Hour check
			minute < 0 || minute >= 60 || 	// Minute check
			second < 0 || second >= 60) 	// Second check
		{
			throw new IllegalArgumentException("Hour, minute and/or second was out of range");
		}
		
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	// Convert to string in universal-time format (HH:MM:SS)
	public String toUniversalString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	// Convert to String in standard time format (H:MM:SS AM or PM)
	public String toString() {
		return String.format("%d:%02d:%02d %s", 
				((hour == 0 || hour == 12) ? 12 : hour % 12), 
				minute, 
				second,
				(hour < 12 ? "AM" : "PM"));
	}
}













