package week12;

import java.lang.Runnable;

public class ArrayWriter implements Runnable {

	private final SimpleArray sharedSimpleArray;
	private final int startValue;
	
	public ArrayWriter(int value, SimpleArray array) {
		startValue = value;
		sharedSimpleArray = array;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = startValue; i < startValue + 3; i++) {
			sharedSimpleArray.add(i);
		}
	}
}
