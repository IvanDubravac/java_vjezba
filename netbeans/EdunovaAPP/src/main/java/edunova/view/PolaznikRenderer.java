/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.view;

import edunova.model.Polaznik;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author dell
 */
// https://www.codejava.net/java-se/swing/jlist-custom-renderer-example
public class PolaznikRenderer extends JLabel implements ListCellRenderer<Polaznik> {

    public PolaznikRenderer() {
        setOpaque(true);
    }

    
    
    @Override
    public Component getListCellRendererComponent(
            JList<? extends Polaznik> list,
            Polaznik polaznik,
            int index,
            boolean isSelected,
            boolean cellHasFocus) {
        
   
        setText(polaznik.getIme() + " " + polaznik.getPrezime());

        boolean neMozeBrisati=polaznik.getGrupe()!=null && !polaznik.getGrupe().isEmpty();
        
        if (isSelected) {
            setBackground(Color.BLUE);
            if(neMozeBrisati){
                setForeground(Color.GRAY);
            }else{
                setForeground(Color.WHITE);
            }
            
        } else {
            setBackground(Color.WHITE);
            if(neMozeBrisati){
                setForeground(Color.GRAY);
            }else{
                setForeground(Color.BLACK);
            }
        }
        
       
        
        

        return this;
    }

}
