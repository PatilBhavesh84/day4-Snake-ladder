package com.BridgeLabz;

public class UC4_Position {

	public static final int noPlay=1;
	public static final int ladder=2;
	public static final int snake=3;

	public static void main(String[] args) {

		int s = 0;
		while (s <= 100)
		{
			int dice = (int)Math.floor(Math.random() * 10.0D) % 6 + 1;
			int instruction = (int)Math.floor(Math.random() * 10.0D) % 3 + 1;
			if (s == 100)
			{
				System.out.println("You Won");
				break;
			}
			switch (instruction)
			{
			case 1: 
				if (s + dice <= 100) {
					s += dice;
				}
				break;
			case 2: 
				if (s - dice >= 0) {
					s -= dice;
				}
				break;
			case 3: 
				s += 0;
			}
			System.out.println("Position of Player is: " + s);	
		}

	}
}
