public class Guerreiro extends Personagem {
    private int defesa;

    public Guerreiro(String nome) {
        super(nome);
        setDefesa(5);
    }

    public Guerreiro(String nome, int vida, int forca) {
        super(nome, vida, forca);
        setDefesa(5);
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        if (defesa < 0) {
            throw new IllegalArgumentException("defesa não pode ser negativa");
        }
        this.defesa = defesa;
    }

    @Override
    public void receberDano(int dano) {
        super.receberDano(Math.max(0, dano - defesa));
    }

    @Override
    public String habilidade() {
        return getNome() + " realizou um golpe!";
    }
}
