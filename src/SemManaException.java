public class SemManaException extends Exception {
    public SemManaException(int mana) {
        super("mana insuficiente: " + mana);
    }
}
