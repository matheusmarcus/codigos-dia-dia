
package swing;


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


  
public class ExemploBotao implements Runnable {
 /**
 *
 * @author MatheusMarcus
 */
    public static void main(String[] args) {
          SwingUtilities.invokeLater(new ExemploBotao());
    }
  
 @Override 
 public void run(){
     
     JFrame frame = new JFrame ("My Button");
             
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.add(createMainPanel());
     frame.pack();
     frame.setVisible(true);
 }
  private JPanel createMainPanel(){
  
  
  
  JPanel panel = new JPanel();
  panel.setLayout(new BorderLayout());
  
  JButton  botao1  = new JButton("Não Faça isso");
  botao1.addActionListener(new ActionListener(){
  @Override
  
  public void actionPerformed(ActionEvent e){
      JOptionPane.showMessageDialog(null,"$# Se Fudeu Amigão #$");
  
  }
  
  });
  
  botao1.setSize(350,80);
  botao1.setVisible(true);
  panel.add(botao1);
  
     
     
     
     return panel;
     
 }
} 
