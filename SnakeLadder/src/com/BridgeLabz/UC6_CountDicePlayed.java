package com.BridgeLabz;

public class UC6_CountDicePlayed {
	public static final int ladder=1;
	public static final int snake=2;
	public static final int noPlay=3;

	public static void main(String[] args) {

		int s=0;
		int c=0;

		while(s<=100) {
			c++;
			int dice = (int)Math.floor(Math.random()*10)%6 + 1;
			int instruction = (int)Math.floor(Math.random()*10)%3 + 1;
			if(s==100) {
				break;
			}
			System.out.println("instruction "+instruction+",Dice = "+dice+",dice count "+c+" time");
			switch(instruction){
	
			case ladder:
				if(s+dice>100){
					break;
				}
				s=s+dice;
				break;
			case snake:
				if(s-dice<0){
					break;
				}
				s=s-dice;
				break;
			case noPlay:
				s=s+0;
				break;
			}
			System.out.println("Position of Player is "+s);
		}

	}

}
