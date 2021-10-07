package com.campany;
public class SnakeAndLadder {
     public static void main(String[] args) {
     System.out.println( "Welcome To Snake And Ladder Simulator" );
     int startPosition = 0;
		int finalPosition = 100;
		System.out.println("stating position of player is " + startPosition);
		while(startPosition <= finalPosition)
		{
			int diceValue = (int) Math.floor((Math.random() * 10) %6) + 1;
			System.out.println("dice value is " + diceValue);
			int checkOption = (int) Math.floor((Math.random() * 10) %3);
			switch(checkOption){
				case 1:
				startPosition += 0;
				break;
				case 2:
				startPosition += diceValue;
				break;
				default:
				startPosition -= diceValue;
			}
			if(startPosition < 0){
			startPosition = 0;
			}
			System.out.println("option value is " +checkOption);
		
			
			System.out.println("Position of the player is at " +startPosition);
		}
     }
}
