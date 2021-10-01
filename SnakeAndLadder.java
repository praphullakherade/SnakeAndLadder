package com.campany;
public class SnakeAndLadder {
     public static void main(String[] args) {
     System.out.println( "Snake and Ladder game played with single player at start postion 0");
     int diceNumber=(int) (Math.floor(Math.random() * 10) % 6 +1);
     int startPosition = 0;
     int endPosition = 100;
     System.out.println( "Dice On Number: " +diceNumber);
     int checkOption = (int) (Math.floor((Math.random() * 10) %3));
		switch(checkOption){
			case 1:
			startPosition += 0;
			break;
			case 2:
			startPosition += diceNumber;
			break;
			default:
			startPosition -= diceNumber;
		}
		System.out.println("option Number:" +checkOption);
		System.out.println("Position of the player: " +startPosition);
			
     }
}
