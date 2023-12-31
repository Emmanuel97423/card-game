package model;

/**
 * Cette énumération représente les différentes valeurs de cartes d'un jeu de cartes.
 */
public enum Rank {
    TWO(2),    // Deux
    THREE(3),  // Trois
    FOUR(4),   // Quatre
    FIVE(5),   // Cinq
    SIX(6),    // Six
    SEVEN(7),  // Sept
    EIGHT(8),  // Huit
    NINE(9),   // Neuf
    TEN(10),   // Dix
    JACK(11),  // Valet
    QUEEN(12), // Dame
    KING(13),  // Roi
    ACE(14);   // As

    int rank; // Valeur numérique de la carte.

    /**
     * Constructeur privé de la valeur de carte.
     *
     * @param value La valeur numérique de la carte.
     */
    private Rank(int value) {
        rank = value;
    }

    /**
     * Obtient la valeur numérique de la carte.
     *
     * @return La valeur numérique de la carte.
     */
    public int value() {
        return rank;
    }
}
