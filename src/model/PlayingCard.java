package model;

/**
 * Cette classe représente une carte de jeu.
 */
public class PlayingCard {
    private Rank rank;       // La valeur de la carte (Deux, Trois, etc.).
    private Suit suit;       // L'enseigne de la carte (Carreaux, Cœurs, etc.).
    private boolean faceUp;  // Indique si la carte est retournée (visible) ou non.

    /**
     * Constructeur de la classe PlayingCard.
     *
     * @param rank La valeur de la carte.
     * @param suit L'enseigne de la carte.
     */
    public PlayingCard(Rank rank, Suit suit) {
        super();
        this.rank = rank;
        this.suit = suit;
    }

    /**
     * Obtient la valeur de la carte.
     *
     * @return La valeur de la carte.
     */
    public Rank getRank() {
        return rank;
    }

    /**
     * Obtient l'enseigne de la carte.
     *
     * @return L'enseigne de la carte.
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * Vérifie si la carte est retournée (visible).
     *
     * @return true si la carte est retournée, sinon false.
     */
    public boolean isFaceUp() {
        return faceUp;
    }

    /**
     * Retourne ou retourne la carte (inverse l'état de visibilité).
     *
     * @return true si la carte est maintenant retournée (visible), sinon false.
     */
    public boolean flip() {
        faceUp = !faceUp;
        return faceUp;
    }
}
