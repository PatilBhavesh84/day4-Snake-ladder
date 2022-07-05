package com.BridgeLabz;

public class UC2_DiceRoll {

	public static void main(String[] args) {

		int dice=(int)Math.floor(Math.random()*10%6+1);
		System.out.println("Number="+dice);
	}

}

