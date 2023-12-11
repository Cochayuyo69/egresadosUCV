
package metodos;

import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class Render extends DefaultTableCellRenderer{
    
    public Component getTableCellRenderComponent(JTable table,Object value,boolean isSelected,boolean hasFocus,int row, int Column){
    if(value instanceof JCheckBox){
        JCheckBox jCheckBox= (JCheckBox) value;
        return jCheckBox;
    }
    return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, Column);}
}
