package com.sqa.logs;


public class Logger {

	public void log(int level, String message){
		switch (level) {
		case 1:
			System.out.print("[TEST] - " + message + "\n");
			break;
			
		case 2:
			System.out.print("[WARNING] - " + message + "\n");
			break;

		default:
			System.out.print("[TEST] - " + message + "\n");
			break;
		}
	}

}
