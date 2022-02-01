package enumeradores;

public enum Palo{

    ESPADA, ORO, BASTO, COPA;

    public static Palo getRandom() {

        return values()[(int) (Math.random() * values().length)];

    }
}
