package cardgame;

import java.util.Random;

public class CardHandGenerator {

    /**
     *
     * @param numCards
     */
    public static Card[] generateHand(int numCards) {

        Random random = new Random();

        Card[] cardHand = new Card[numCards];

        for (int i = 0; i < cardHand.length; i++) {

            Card.Value value = Card.Value.values()[random.nextInt(Card.Value.values().length)];

            Card.Suit suit = Card.Suit.values()[random.nextInt(Card.Suit.values().length)];

            Card card = new Card(value, suit);
            cardHand[i] = card;
        }

        return cardHand;
    }

}
