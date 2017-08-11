package com.company;

public class Blackjack {
    public static void main(String[] args){
        System.out.println(blackJackNumber(10,9));
        System.out.println(blackJackNumber(10,12));
    }

    private static int blackJackNumber(int card1, int card2){
        int cards = card1 + card2;
        if(cards > 21){
            cards = 0;
            return cards;
        }
        else{
            return cards;
        }
    }
}
