import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InvestiparGui {
    private JTextField txtBitcoins;
    private JTextField txtUnicoins;
    private JTextField txtEthereum;
    private JButton RealizarCotacaoBtn;
    private JButton LimparBtn;
    private JTextField txtMyBit;
    private JTextField txtMyUni;
    private JTextField txtMyEthe;
    private JTextField txtResultado;
    private JPanel PainelPrincipal;
    private JLabel InvestiparLabel;
    private JLabel BitcoinsLabel;
    private JLabel UnicoinsLabel;
    private JLabel EthereumLabel;
    private JLabel ValorBitLabel;
    private JLabel ValorUniLabel;
    private JLabel ValorEtheLabel;
    private JLabel MyBitLabel;
    private JLabel MyUniLabel;
    private JLabel MyEtheLabel;
    private JLabel ResultadoLabel;
    private JTextField txtBitCoin;
    private JTextField txtUniCoins;
    private JTextField txtValorEhetereum;
    private String bitcoin = "";
    private String texto = "";


    public static void main(String[] args) {
        JFrame frame = (new JFrame("InvestiPar"));
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new InvestiparGui().PainelPrincipal);
        frame.setVisible(true);
    }


    public InvestiparGui() {


        JButton[] lista de botoes = {LimparBtn, RealizarCotacaoBtn}
        PainelPrincipal.add(LimparBtn);
        PainelPrincipal.add(RealizarCotacaoBtn);

        RealizarCotacaoBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(botoes )

                    //eu desisto professor me perdoa eu não sei como fazer esta lógica de o usuario colocar algo e funcionar de forma coerente me perdoa :'( me ajuda pfv.
            }
        });
    }
}
