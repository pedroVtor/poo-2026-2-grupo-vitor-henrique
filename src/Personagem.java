import java.util.ArrayList;

public abstract class Personagem {
    private String nome;
    private int vida;
    private int forca;
    private ArrayList<Item> inventario;

    public Personagem(String nome) {
        this(nome, 100, 10);
    }

    public Personagem(String nome, int vida, int forca) {
        inventario = new ArrayList<>();
        setNome(nome);
        setVida(vida);
        setForca(forca);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("nome não pode ser vazio");
        }
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        if (vida < 0) {
            throw new IllegalArgumentException("vida inválida: " + vida);
        }
        this.vida = vida;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        if (forca < 0) {
            throw new IllegalArgumentException("força inválida: " + forca);
        }
        this.forca = forca;
    }

    public void pegar(Item item) {
        inventario.add(item);
        setForca(forca + item.getBonusForca());
    }

    public void receberDano(int dano) {
        if (dano < 0) {
            throw new IllegalArgumentException("dano não pode ser negativo");
        }
        setVida(Math.max(0, vida - dano));
        System.out.println(nome + " sofreu " + dano + " de dano");
    }

    public void atacar(Personagem alvo) {
        System.out.println(nome + " ataca " + alvo.getNome());
        alvo.receberDano(forca);
    }

    public void curar() {
        curar(10);
    }

    public void curar(int quantidade) {
        if (quantidade < 0) {
            throw new IllegalArgumentException("cura não pode ser negativa");
        }
        setVida(vida + quantidade);
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public String ficha() {
        return nome + " (vida: " + vida + ", forca: " + forca + ")";
    }

    public abstract String habilidade() throws SemManaException;
}
