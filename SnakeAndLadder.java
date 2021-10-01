package com.campany;
public class SnakeAndLadder {
     public static void main(String[] args) {
     System.out.println( "Snake and Ladder game played with single player at start postion 0");
     int diceNumber=(int) (Math.floor(Math.random() * 10) % 6 +1);
     System.out.println( "Dice On Number: " +diceNumber);
     }
}
