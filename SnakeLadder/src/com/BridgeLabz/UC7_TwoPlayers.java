package com.BridgeLabz;

public class UC7_TwoPlayers {

	public static final int noPlay=1;
	public static final int ladder=2;
	public static final int snake=3;

	public static void main(String[] args) {
		int p1=0,p2=0;//position of player
		int c=0,s=0;//used for counter
		int instruction2=0;
		int instruction1;
		while(p1<=100 && p2<=100) {
			c++;//counter for dice
			if(p1==100 || p2==100) {
				if(p1==100) {
					System.out.println("Player 1 won the Game");}
				else {System.out.print("Player 2 won the Game");
				}
				break;
			}
			instruction1 = (int)Math.floor(Math.random()*10)%3 + 1;
			if(instruction2!=ladder) {
				int p1dice = (int)Math.floor(Math.random()*10)%6 + 1;

				System.out.println("P1:instruction "+instruction1+",Dice = "+p1dice+",dice count "+c+" time");
				switch(instruction1){
				//Case Statements
				case ladder:
					if(p1+p1dice>100){
						break;
					}
					else{
						p1=p1+p1dice;
					}
					System.out.println("Player 1 position is "+p1);
					continue;
				case snake:
					if(p1-p1dice<0){
						break;
					}
					else{
						p1=p1-p1dice;
					}
					break;
				case noPlay:
					p1=p1+0;
					break;
				}
				System.out.println("Player 1 position is "+p1);
			}
			if(instruction1!=ladder) {
				instruction2 = (int)Math.floor(Math.random()*10)%3 + 1;
				int p2dice = (int)Math.floor(Math.random()*10)%6 + 1;
				System.out.println("P2:instruction "+instruction2+",Dice = "+p2dice+",dice count "+s+" time");
				switch(instruction2){
				case ladder:
					if(p2+p2dice>100){
						break;
					}
					else{
						p2=p2+p2dice;
					}
					System.out.println("position is player 2 = "+p2);
					continue;
				case snake:
					if(p2-p2dice<0){
						break;
					}
					else{
						p2=p2-p2dice;
					}
					break;
				case noPlay:
					p2=p2+0;
					break;
				}
				s++;
				System.out.println("position is player2 = "+p2);
			}
		}	
	}	
}