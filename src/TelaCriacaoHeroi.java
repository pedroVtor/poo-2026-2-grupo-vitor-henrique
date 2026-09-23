import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class TelaCriacaoHeroi extends JFrame {
    private JTextField campoNome;
    private JTextField campoVida;
    private JButton botaoCriar;

    public TelaCriacaoHeroi() {
        super("IF Quest");
        setLayout(new BorderLayout());

        JLabel titulo = new JLabel("Criação de Herói", JLabel.CENTER);

        campoNome = new JTextField();
        campoVida = new JTextField();
        botaoCriar = new JButton("Criar herói");

        JPanel painel = new JPanel(new GridLayout(2, 2, 5, 5));
        painel.add(new JLabel("Nome:"));
        painel.add(campoNome);
        painel.add(new JLabel("Vida:"));
        painel.add(campoVida);

        add(titulo, BorderLayout.NORTH);
        add(painel, BorderLayout.CENTER);
        add(botaoCriar, BorderLayout.SOUTH);

        setSize(350, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void abrir() {
        TelaCriacaoHeroi tela = new TelaCriacaoHeroi();
        tela.setVisible(true);
    }
}
