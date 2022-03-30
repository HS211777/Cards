package com.company;

public class Card {
    private char value; // ace = 1; jack = 11; queen = 12; king = 13
    private char suit; // (S)pades, (C)lubs, (H)earts, (D)iamonds

    public Card(char value, char suit) {
        this.value = value;
        this.suit = suit;
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    public char getSuit() {
        return suit;
    }

    public void setSuit(char suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return ""+value + suit;
    }
}
