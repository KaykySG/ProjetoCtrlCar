/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.VPFK.ferramentas;

import java.awt.Component;
import static javax.swing.GroupLayout.Alignment.CENTER;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author kayky
 */
public class JCellRenderMarca extends DefaultTableCellRenderer {
     JLabel jLabelLogoDaMArca = new JLabel();

    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col){
           if(isSelected){
            this.setBackground(table.getBackground());
            this.setForeground(table.getForeground());
            
            }else{
            this.setBackground(table.getBackground());
            this.setForeground(table.getForeground());
            }
            ImageIcon logo = new ImageIcon(table.getValueAt(row, col).toString());
            jLabelLogoDaMArca.setText("");
            logo.setImage(logo.getImage().getScaledInstance(table.getRowHeight(), table.getRowHeight(), 1));
            jLabelLogoDaMArca.setIcon(logo);   
            jLabelLogoDaMArca.setHorizontalAlignment(CENTER);
            return jLabelLogoDaMArca;
    }
}
