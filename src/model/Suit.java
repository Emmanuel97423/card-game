package model;

/**
 * Cette énumération représente les différentes enseignes d'un jeu de cartes.
 */
public enum Suit {
    DIAMONDS(1), // Enseigne "Carreaux"
    HEARTS(2),   // Enseigne "Cœurs"
    SPADES(3),   // Enseigne "Piques"
    CLUBS(4);    // Enseigne "Trèfles"

    int suit; // Valeur numérique de l'enseigne.

    /**
     * Constructeur privé de l'enseigne.
     *
     * @param value La valeur numérique de l'enseigne.
     */
    private Suit(int value) {
        suit = value;
    }

    /**
     * Obtient la valeur numérique de l'enseigne.
     *
     * @return La valeur numérique de l'enseigne.
     */
    public int value() {
        return suit;
    }
}
