public class Item {
    private String nome;
    private int bonusForca;

    public Item(String nome) {
        this(nome, 0);
    }

    public Item(String nome, int bonusForca) {
        setNome(nome);
        setBonusForca(bonusForca);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("nome do item não pode ser vazio");
        }
        this.nome = nome;
    }

    public int getBonusForca() {
        return bonusForca;
    }

    public void setBonusForca(int bonusForca) {
        if (bonusForca < 0) {
            throw new IllegalArgumentException("bônus de força não pode ser negativo");
        }
        this.bonusForca = bonusForca;
    }
}
