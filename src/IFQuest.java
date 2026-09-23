import java.util.ArrayList;

public class IFQuest {
    public static void main(String[] args) {
        ArrayList<Personagem> herois = new ArrayList<>();

        try {
            Mago mago = new Mago("Yennefer");
            Guerreiro guerreiro = new Guerreiro("Geralt");

            Item espada = new Item("Espada de Aço", 3);
            guerreiro.pegar(espada);

            herois.add(mago);
            herois.add(guerreiro);

            System.out.println("=== IF QUEST ===");
            System.out.println("Heróis criados:");

            mago.setMana(5);
            Personagem chefe = new Guerreiro("Chefe Orc", 30, 8);

            for (Personagem heroi : herois) {
                System.out.println(heroi.ficha());
                try {
                    System.out.println(heroi.habilidade());
                } catch (SemManaException e) {
                    System.out.println("Erro: " + e.getMessage());
                }
                heroi.atacar(chefe);
            }

            System.out.println("Chefe vivo? " + chefe.estaVivo());

            System.out.println("\n=== TESTE DE EXCEÇÃO ===");
            try {
                new Guerreiro("Herói Inválido", -10, 10);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro tratado: " + e.getMessage());
            }

            System.out.println("\n=== ABRINDO TELA ===");
            TelaCriacaoHeroi.abrir();

        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar o jogo: " + e.getMessage());
        }
    }
}
