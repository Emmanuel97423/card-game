package model;

import java.util.ArrayList; // Importez la classe ArrayList
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Cette classe représente un jeu de cartes (deck).
 */
public class Deck {
    private List<PlayingCard> cards; // Liste des cartes dans le deck.

    /**
     * Constructeur de la classe Deck. Il initialise le deck avec un ensemble
     * complet de cartes et les mélange.
     */
    public Deck() {
        cards = new ArrayList<PlayingCard>();
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                System.out.println("Création de la carte [" + rank + "][" + suit + "]");
                cards.add(new PlayingCard(rank, suit));
            }
        }
        shuffle(); // Mélange le deck.
    }

    /**
     * Mélange les cartes dans le deck de manière aléatoire.
     */
    private void shuffle() {
        Random random = new Random();
        for (int i = 0; i < cards.size(); i++) {
            Collections.swap(cards, i, random.nextInt(cards.size()));
        }
    }

    /**
     * Retire la carte du dessus du deck.
     *
     * @return La carte du dessus du deck.
     */
    public PlayingCard removeTopCard() {
        return cards.remove(0);
    }

    /**
     * Remet une carte dans le deck.
     *
     * @param pc La carte à retourner dans le deck.
     */
    public void returnCardToDeck(PlayingCard pc) {
        cards.add(pc);
    }

    /**
     * Obtient la liste des cartes dans le deck.
     *
     * @return La liste des cartes dans le deck.
     */
    public List<PlayingCard> getCards() {
        return cards;
    }
}
