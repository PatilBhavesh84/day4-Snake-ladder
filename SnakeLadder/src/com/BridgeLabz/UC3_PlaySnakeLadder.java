package com.BridgeLabz;

public class UC3_PlaySnakeLadder {
	public static final int noPlay=1;
	public static final int ladder=2;
	public static final int snake=3;

	public static void main(String[] args) {

		int s=0;

		while(s<=100) {
			if(s==100) {
				break;
			}
			int dice = (int)Math.floor(Math.random()*10)%6 + 1;
			int instruction = (int)Math.floor(Math.random()*10)%3 + 1;

			//Case Statements
			switch(instruction){
			case noPlay:
				s=s+0;
				break;
			case ladder:
				s=s+dice;
				break;
			case snake:
				s=s-dice;
				break;
			}
			System.out.println("Position of Player is " +s);


		}
	}
}
