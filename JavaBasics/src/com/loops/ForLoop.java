package com.loops;

public class ForLoop {

	public static void main(String[] args) {
		
		//initial variable, condition, increment
		for(int i=0; i<10; i++){
			System.out.println(i);
		}
		
		String [] str = new String[] {"hello","world"};
		
		for (String string : str) {
			System.out.println(string);
		}

	}

}
