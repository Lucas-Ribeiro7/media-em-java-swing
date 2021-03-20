import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class MaiorValor extends JFrame{
    
    JPanel contentPane = new JPanel();
    JLabel lblTitulo = new JLabel("DESCUBRA O MAIOR E O MENOR VALOR");
    JLabel lblValor1 = new JLabel("Digite o primeiro valor: ");
    JLabel lblValor2 = new JLabel("Digite o segundo valor: ");
    JLabel lblResultado = new JLabel();
    JTextField txtValor1 = new JTextField();
    JTextField txtValor2 = new JTextField();
    JButton btnButton = new JButton("Descubra");    
    
    public MaiorValor(){
        super("Maior Valor");
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        //Titulo
        lblTitulo.setBounds(1, 10, 250, 25);
        contentPane.add(lblTitulo);
        
        //Valor 1
        lblValor1.setBounds(1, 60, 130, 25);
        contentPane.add(lblValor1);
        
        txtValor1.setBounds(135, 60, 70, 25);
        contentPane.add(txtValor1);
        
        //Valor2
        lblValor2.setBounds(1, 90, 135, 25);
        contentPane.add(lblValor2);
        
        txtValor2.setBounds(135, 90, 70, 25);
        contentPane.add(txtValor2);
        
        //Button em ação
        btnButton.setBounds(1, 150, 135, 30);
        contentPane.add(btnButton);
        
        btnButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                int valor1 = Integer.parseInt(txtValor1.getText());
                int valor2 = Integer.parseInt(txtValor2.getText());
                
                if(valor1 > valor2){
                    lblResultado.setText("O Valor maior é: " + valor1);
                }else if(valor2 > valor1){
                    lblResultado.setText("O Valor maior é: " + valor2);
                }else{
                    lblResultado.setText("Os valores são iguais");
                }
            }
        });
        
        //Resultado
        lblResultado.setBounds(1, 200, 135, 25);
        contentPane.add(lblResultado);
        
    }
    
    public static void main(String[] args){
        MaiorValor mv = new MaiorValor();
        mv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mv.setSize(400, 300);
        mv.setBounds(90,100,400,300);
        mv.setVisible(true);
        
    }
    
}
