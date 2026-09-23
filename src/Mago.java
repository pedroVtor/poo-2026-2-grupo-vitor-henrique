public class Mago extends Personagem {
    private int mana;

    public Mago(String nome) {
        super(nome);
        setMana(50);
    }

    public Mago(String nome, int vida, int forca) {
        super(nome, vida, forca);
        setMana(50);
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        if (mana < 0) {
            throw new IllegalArgumentException("mana não pode ser negativa");
        }
        this.mana = mana;
    }

    @Override
    public String ficha() {
        return super.ficha() + " [mana: " + mana + "]";
    }

    @Override
    public String habilidade() throws SemManaException {
        if (mana < 10) {
            throw new SemManaException(mana);
        }
        mana -= 10;
        return getNome() + " lançou uma rajada arcana!";
    }
}
