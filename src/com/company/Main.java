package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static ArrayList<Card> cards = new ArrayList();

    public static void main(String[] args) {
	    createArray();
        //printArray();
        for (int i = 0; i < 51; i++){
            drawCard();
        }
        printArray();
    }
    public static void createArray(){
        for (int i = 1; i < 14; i++){
            char value;
            if (i >1 && i < 10){
                value = (char)(i+'0');
            }
            else if (i ==1){
                value = 'A';
            }
            else if (i==10){
                value = 'X';
            }
            else if (i==11){
                value = 'J';
            }
            else if (i==12){
                value = 'Q';
            }
            else{
                value = 'K';
            }
            Card myCard = new Card(value,'S');
            Card myCard1 = new Card(value,'C');
            Card myCard2 = new Card(value,'H');
            Card myCard3 = new Card(value,'D');
            cards.add(myCard);
            cards.add(myCard1);
            cards.add(myCard2);
            cards.add(myCard3);
        }
        Collections.shuffle(cards);
    }

    public static void printArray(){
        for (int i = 0; i < cards.size(); i++){
            System.out.println(cards.get(i).toString());
        }
    }
    public static Card drawCard(){
        Card out = cards.get(0);
        cards.remove(0);
        return out;
    }
}
