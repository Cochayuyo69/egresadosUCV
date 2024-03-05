/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author anton
 */
public class RenderInvitacion  extends DefaultTableCellRenderer{   
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean Selected, boolean hasFocus, int row, int col){
        
        super.getTableCellRendererComponent(table, value, Selected, hasFocus, row, col);
        setBackground(Color.green);
        
        return this;
    }
}
