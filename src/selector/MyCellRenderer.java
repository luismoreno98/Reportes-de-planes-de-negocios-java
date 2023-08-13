package selector;

import java.awt.Component;

import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.TableCellRenderer;

// crear una clase para sustituir el componente jtexfild por jtextarea para cada columna de la tabla 
public class MyCellRenderer extends JTextArea implements TableCellRenderer {
    public MyCellRenderer() {  // establecer la configuracion del jtextarea pa hacer salto de linea en cada celda 
      setLineWrap(true);
      setWrapStyleWord(true);
   }

  public Component getTableCellRendererComponent(JTable table, Object // sustituir el jtextfild por una jtextarea en toda la celda
          value, boolean isSelected, boolean hasFocus, int row, int column) { // evaluar cada celda editada
      setText((String) value);// colocar el valor del texto en la celda corespondiente 
      setSize(table.getColumnModel().getColumn(column).getWidth(), // evaluar el tamañp de la columna y hacer el salto de linea antes de sobrepasar el limite de las celdas
              getPreferredSize().height);
      if (table.getRowHeight(row) != getPreferredSize().height) {
              table.setRowHeight(row, getPreferredSize().height);
      }
      return this; // devuelve el jtextarea con el texto y el salto de linea realizado
  }
}