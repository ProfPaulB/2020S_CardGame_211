package cardgame;

import java.util.Random;
import java.util.Scanner;

/**
 * This class +++Insert Description Here+++
 *
 * @author Paul Bonenfant
 */
public class CardGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        Card[] cardHand = new Card[7];
        
        for (int i = 0; i < cardHand.length; i++) {
        
            int value = random.nextInt(13) + 1;
            String suit = Card.SUITS[random.nextInt(4)];
            
            Card card = new Card(value, suit);            
            cardHand[i] = card;
        }
        
        String format = "%d of %s\n";
        for (Card card: cardHand) {
            System.out.printf(format, card.getValue(), card.getSuit());
        }
        
        System.out.println("");
        
        System.out.println("Please choose a suit");
        for (int i = 0; i < Card.SUITS.length; i++) {
            System.out.println((i + 1) + ": " +Card.SUITS[i]);
        } 
        
        int suit = input.nextInt();
        
        System.out.println("Please choose the value (1 to 13)");
        int value = input.nextInt();
        
        Card userGuess = new Card(value, Card.SUITS[suit - 1]);
        
        boolean match = false;
        
        for (Card card: cardHand) {
        
            if (card.getValue() == userGuess.getValue() && 
                    card.getSuit().equals(userGuess.getSuit())) {
                match = true;
                break;
            }
        }
        
        System.out.println("You got a match: " + match);
    }

}

