package cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by xcptan on 12/08/2016.
 */
public class Main {
    public static void main (String[] args){
        Main main = new Main();
        Card[] deck = main.generateDeck();

        for (int i = 0; i < deck.length; i++) {
            System.out.println(deck[i].toString());
        }

        //Think of a way to permute 52 card deck

        double random = Math.random();
        System.out.println(random);

        String s =  "PAYPALISHIRING";
        List<Character> list = new ArrayList<Character>();
        list.add
    }



    public Card[] generateDeck(){

        //Treat as a stack
        int top = 0;
        Card[] deck = new Card[52];
        for (int a = 0; a < Rank.values().length; a++) {
            for (int b = 0; b < Suit.values().length; b++) {
                deck[top] = new Card(Rank.values()[a],Suit.values()[b]);
                top++;
            }
        }



        return deck;
    }
}
