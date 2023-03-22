/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herancadeobjetos;

import java.awt.FlowLayout; // layout
import javax.swing.JFrame; // características da janela
import javax.swing.JLabel; // exibir texto e imagem
import javax.swing.SwingConstants; // contantes comuns usadas com Swing
import javax.swing.Icon; // interface usada para manipular imagens
import javax.swing.ImageIcon; // carregar uma imagem
import javax.swing.JButton;
/**
 *
 * @author 2021100481
 */
public class RotuloFrame extends JFrame {
     
    private final JLabel rotulo1; 
    private final JLabel rotulo2;
    private final JButton imagemJButton;
    
    public RotuloFrame()
    {
        super("Testando JLabel");
        setLayout(new FlowLayout()); 
        rotulo1 = new JLabel("Rótulo com texto");
        rotulo1.setToolTipText("Este é o rótulo 1");
        add(rotulo1); 
        Icon bug = new ImageIcon(getClass().getResource("bug1.jfif"));
        rotulo2 = new JLabel("Rótulo com texto e imagem", bug, 
        SwingConstants.LEFT);
        rotulo2.setToolTipText("Este é o rótulo 2");
        
//        Icon bug1 = new ImageIcon(getClass().getResource("bug1.gif"));
//        Icon bug2 = new ImageIcon(getClass().getResource("bug2.gif"));
        imagemJButton = new JButton("Botão Ícone", bug); 
//        imagemJButton.setRolloverIcon(bug2); 
        add(imagemJButton); 

    }
}
