package media;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Media extends JFrame{
    JPanel contentPane;
    float av1, av2, av3, media;

    public static void main(String[] args) {
        Media m = new Media();
        
    }
    
    public Media(){
        //Comandos Padrão
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 300, 450, 500);
        setTitle("Média...");
        setVisible(true);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        //Logo da Estacio
        ImageIcon logo = new ImageIcon("C:\\Users\\Programador\\Documents\\logo\\estacio.png");
        JLabel img = new JLabel(logo);
        img.setBounds(5, 5, 320, 100);
        contentPane.add(img);
        
        //Recebendo os valores
        
        //AV1
        JLabel lblAv1 = new JLabel(" Digite AV1: ");
        lblAv1.setBounds(0, 120, 100, 32);
        contentPane.add(lblAv1);
        
        JTextField txtAv1 = new JTextField();
        txtAv1.setBounds(70, 120, 100, 32);
        contentPane.add(txtAv1);
        
        //AV2
        JLabel lblAv2 = new JLabel(" Digite AV2: ");
        lblAv2.setBounds(0, 160, 100, 32);
        contentPane.add(lblAv2);
        
        JTextField txtAv2 = new JTextField();
        txtAv2.setBounds(70, 160, 100, 32);
        contentPane.add(txtAv2);
        
        //AV3
        JLabel lblAv3 = new JLabel(" Digite AV3: ");
        lblAv3.setBounds(0, 200, 100, 32);
        contentPane.add(lblAv3);
        
        JTextField txtAv3 = new JTextField();
        txtAv3.setBounds(70, 200, 100, 32);
        contentPane.add(txtAv3);
        
        //Botão para chamar ação
        JButton btnMedia = new JButton("Tirar Média");
        btnMedia.setBounds(10, 250, 100, 32);
        contentPane.add(btnMedia);
        
        //Saindo o Resultado
        JLabel lblResultado = new JLabel();
        lblResultado.setBounds(5, 300, 120, 32);
        contentPane.add(lblResultado);
        
        //Executando a Média
        btnMedia.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                float num1 = Float.parseFloat(txtAv1.getText());
                float num2 = Float.parseFloat(txtAv2.getText());
                float num3 = Float.parseFloat(txtAv3.getText());
                float media = (num1 + num2 + num3)/3;
                
                lblResultado.setText("A Média é " + media);
            }
        });
        
    }
    
}
