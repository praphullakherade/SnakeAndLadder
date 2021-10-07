package com.campany;
public class SnakeAndLadder {
     public static void main(String[] args) {
     System.out.println( "Welcome To Snake And Ladder Simulator" );
     int startPosition = 0;
		int finalPosition = 100;
		int count_dice_roll = 0;
		System.out.println("stating position of player is " + startPosition);
		while(startPosition != finalPosition)
		{
			int diceValue = (int) Math.floor((Math.random() * 10) %6) + 1;
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
			System.out.println("dice value : " + diceValue + " || option value : " +checkOption);
			if(startPosition < 0)
			{
				startPosition = 0;
			}
			else if(startPosition > 100)
			{
				startPosition -= diceValue;
			}
			System.out.println("Position of the player : " +startPosition);
			count_dice_roll++;
		}	
		System.out.println("Number of times the dice was rolled to win the game is " +count_dice_roll);
     }
}
