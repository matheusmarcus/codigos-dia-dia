/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import com.sun.tools.javac.Main;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class Botao extends JFrame{
    
private JButton ok,cancelar;
 
 public Botao(){
  super("Criando botões");
  setLayout( new FlowLayout() );

  ok = new JButton("OK");
  cancelar = new JButton("Cancelar");
  add(ok);
  add(cancelar);
 }

}
