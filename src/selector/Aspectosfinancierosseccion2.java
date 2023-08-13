package selector;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Aspectosfinancierosseccion2 extends JFrame {
	// Declaracion de la variables se puede utilizar en cualquier clase ( algunas son solo para esta clase)
	private JPanel contentPane;
	private JTable table;
	public static String[][] Resultadostablas4 = new String[13][7];

	/**
	 *  iniciacion de la aplicacion.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aspectosfinancierosseccion2 frame = new Aspectosfinancierosseccion2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Creacion del frame.
	 */
	public Aspectosfinancierosseccion2() {            /* configuracion general del frame*/
		setExtendedState(JFrame.MAXIMIZED_HORIZ);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 25, 1377, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JScrollPane ScrollPrincipal7 = new JScrollPane();
		
		JPanel ContenidoPrincipal7 = new JPanel();
		ScrollPrincipal7.setViewportView(ContenidoPrincipal7);
		/*contenido principal del frame,enunciados de la tabla y
        sus respectivo formato para la tabla */
		JLabel Enunciadotabla2 = new JLabel("Estado de Resultados Presupuestado");
		Enunciadotabla2.setFont(new Font("Arial", Font.BOLD, 14));
		
		JScrollPane Scrolltabla4 = new JScrollPane();
		
		table = new JTable(); // Declaracion de la tabla 
		table.setModel(new DefaultTableModel(
			new Object[][] {   // Declaracion de las celdas de la tabla
				{"Ingresos", "", "", "", "", "", ""},
				{"Otros Ingresos", "", "", "", "", "", ""},
				{"Suma Ingresos", "", "100%", "", "100%", "", "100%"},
				{"Menos: Costo de Ventas", "", "", "", "", "", ""},
				{"Utilidad Bruta", "", "", "", "", "", ""},
				{"Menos: Gastos de operaci\u00F3n", "", "", "", "", "", ""},
				{"Utilidad de Operacion", "", "", "", "", "", ""},
				{"Menos Gastos Financieros", "", "", "", "", "", ""},
				{"Utilidad Financiera", "", "", "", "", "", ""},
				{"Menos: ISR", "", "", "", "", "", ""},
				{"Menos: PTU", "", "", "", "", "", ""},
				{"Utilidad neta d/imptos.", "", "", "", "", "", ""},
			},
			new String[] {  // nombre de las columnas 
				"", "A\u00F1o 1", "Poecentaje", "A\u00F1o 2", "Porcentaje", "A\u00F1o 3", "Porcentaje"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(143);   // Tamaño se la columna de la tabla y su formato
		table.getColumnModel().getColumn(1).setPreferredWidth(99);
		table.getColumnModel().getColumn(2).setPreferredWidth(70);
		table.getColumnModel().getColumn(3).setPreferredWidth(91);
		table.getColumnModel().getColumn(5).setPreferredWidth(91);
		table.getColumnModel().getColumn(6).setPreferredWidth(68);
		Scrolltabla4.setViewportView(table);
		
		JButton btn15 = new JButton("Atras"); // declaracion del boton atras
		btn15.setFont(new Font("Arial", Font.PLAIN, 12));
		btn15.addActionListener(new ActionListener() { // evento del boton atras
			public void actionPerformed(ActionEvent e) {
				Aspectosfinancierosseccion1 ventana10 = new Aspectosfinancierosseccion1(); // retroceder  al anterior frame
				ventana10.setVisible(true);
				// cierra el frame anterior y deja abierto el actual
				dispose();
				
			}
		});
		
		JButton btn16 = new JButton("Siguiente"); // declaracion del boton siguente
		btn16.addActionListener(new ActionListener() { // evento del boton siguiente
			public void actionPerformed(ActionEvent e) {
				Aspectosfinancierosseccion3 ventana12 = new Aspectosfinancierosseccion3(); // avanzar al siguiente frame
				ventana12.setVisible(true);
				// cierra el frame anterior y deja abierto el actual
				dispose();
				
				JOptionPane.showMessageDialog(null,"\n \n CONSIDERACIONES DE TABLA: \n \n 1 dar doble clicke a cada celda para introducir la informacion "
						+ "\n 2 muy importante verificar la informacion de la tabla ya que si la informacion esta incompleta o se les ovida informacion al pasar a la "
						+ "siguiente seccion y regresar a esta tabla se tendra que llenar de nuevo la tabla en cuestion"
						+ "\n 3 cada vez que se introduzca informacion en cada celda al terminar darle un enter");
				// arreglo que guarda los datos de la tabla 
				Resultadostablas4[0][0] = (String) table.getValueAt(0, 1);
				Resultadostablas4[1][0] = (String) table.getValueAt(1, 1);
				Resultadostablas4[2][0] = (String) table.getValueAt(2, 1);
				Resultadostablas4[3][0] = (String) table.getValueAt(3, 1);
				Resultadostablas4[4][0] = (String) table.getValueAt(4, 1);
				Resultadostablas4[5][0] = (String) table.getValueAt(5, 1);
				Resultadostablas4[6][0] = (String) table.getValueAt(6, 1);
				Resultadostablas4[7][0] = (String) table.getValueAt(7, 1);
				Resultadostablas4[8][0] = (String) table.getValueAt(8, 1);
				Resultadostablas4[9][0] = (String) table.getValueAt(9, 1);
				Resultadostablas4[10][0] = (String) table.getValueAt(10, 1);
				Resultadostablas4[11][0] = (String) table.getValueAt(11, 1);
				
				Resultadostablas4[0][1] = (String) table.getValueAt(0, 2);
				Resultadostablas4[1][1] = (String) table.getValueAt(1, 2);
				Resultadostablas4[2][1] = (String) table.getValueAt(2, 2);
				Resultadostablas4[3][1] = (String) table.getValueAt(3, 2);
				Resultadostablas4[4][1] = (String) table.getValueAt(4, 2);
				Resultadostablas4[5][1] = (String) table.getValueAt(5, 2);
				Resultadostablas4[6][1] = (String) table.getValueAt(6, 2);
				Resultadostablas4[7][1] = (String) table.getValueAt(7, 2);
				Resultadostablas4[8][1] = (String) table.getValueAt(8, 2);
				Resultadostablas4[9][1] = (String) table.getValueAt(9, 2);
				Resultadostablas4[10][1] = (String) table.getValueAt(10, 2);
				Resultadostablas4[11][1] = (String) table.getValueAt(11, 2);
			
				Resultadostablas4[0][2] = (String) table.getValueAt(0, 3);
				Resultadostablas4[1][2] = (String) table.getValueAt(1, 3);
				Resultadostablas4[2][2] = (String) table.getValueAt(2, 3);
				Resultadostablas4[3][2] = (String) table.getValueAt(3, 3);
				Resultadostablas4[4][2] = (String) table.getValueAt(4, 3);
				Resultadostablas4[5][2] = (String) table.getValueAt(5, 3);
				Resultadostablas4[6][2] = (String) table.getValueAt(6, 3);
				Resultadostablas4[7][2] = (String) table.getValueAt(7, 3);
				Resultadostablas4[8][2] = (String) table.getValueAt(8, 3);
				Resultadostablas4[9][2] = (String) table.getValueAt(9, 3);
				Resultadostablas4[10][2] = (String) table.getValueAt(10, 3);
				Resultadostablas4[11][2] = (String) table.getValueAt(11, 3);

				Resultadostablas4[0][3] = (String) table.getValueAt(0, 4);
				Resultadostablas4[1][3] = (String) table.getValueAt(1, 4);
				Resultadostablas4[2][3] = (String) table.getValueAt(2, 4);
				Resultadostablas4[3][3] = (String) table.getValueAt(3, 4);
				Resultadostablas4[4][3] = (String) table.getValueAt(4, 4);
				Resultadostablas4[5][3] = (String) table.getValueAt(5, 4);
				Resultadostablas4[6][3] = (String) table.getValueAt(6, 4);
				Resultadostablas4[7][3] = (String) table.getValueAt(7, 4);
				Resultadostablas4[8][3] = (String) table.getValueAt(8, 4);
				Resultadostablas4[9][3] = (String) table.getValueAt(9, 4);
				Resultadostablas4[10][3] = (String) table.getValueAt(10, 4);
				Resultadostablas4[11][3] = (String) table.getValueAt(11, 4);
			
				Resultadostablas4[0][4] = (String) table.getValueAt(0, 5);
				Resultadostablas4[1][4] = (String) table.getValueAt(1, 5);
				Resultadostablas4[2][4] = (String) table.getValueAt(2, 5);
				Resultadostablas4[3][4] = (String) table.getValueAt(3, 5);
				Resultadostablas4[4][4] = (String) table.getValueAt(4, 5);
				Resultadostablas4[5][4] = (String) table.getValueAt(5, 5);
				Resultadostablas4[6][4] = (String) table.getValueAt(6, 5);
				Resultadostablas4[7][4] = (String) table.getValueAt(7, 5);
				Resultadostablas4[8][4] = (String) table.getValueAt(8, 5);
				Resultadostablas4[9][4] = (String) table.getValueAt(9, 5);
				Resultadostablas4[10][4] = (String) table.getValueAt(10, 5);
				Resultadostablas4[11][4] = (String) table.getValueAt(11, 5);
			
				Resultadostablas4[0][5] = (String) table.getValueAt(0, 6);
				Resultadostablas4[1][5] = (String) table.getValueAt(1, 6);
				Resultadostablas4[2][5] = (String) table.getValueAt(2, 6);
				Resultadostablas4[3][5] = (String) table.getValueAt(3, 6);
				Resultadostablas4[4][5] = (String) table.getValueAt(4, 6);
				Resultadostablas4[5][5] = (String) table.getValueAt(5, 6);
				Resultadostablas4[6][5] = (String) table.getValueAt(6, 6);
				Resultadostablas4[7][5] = (String) table.getValueAt(7, 6);
				Resultadostablas4[8][5] = (String) table.getValueAt(8, 6);
				Resultadostablas4[9][5] = (String) table.getValueAt(9, 6);
				Resultadostablas4[10][5] = (String) table.getValueAt(10, 6);
				Resultadostablas4[11][5] = (String) table.getValueAt(11, 6);
		
			//	System.out.println(Resultadostablas4[11][5]);
			}
		});
		btn16.setFont(new Font("Arial", Font.PLAIN, 12));
		// tipo de layout grupal del contenido del frame
		GroupLayout gl_ContenidoPrincipal7 = new GroupLayout(ContenidoPrincipal7);
		gl_ContenidoPrincipal7.setHorizontalGroup(
				// tipo de alineacion adaptable del contenido pa cualquier tipo de pantalla
			gl_ContenidoPrincipal7.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ContenidoPrincipal7.createSequentialGroup()
					.addGap(10)
					// tamaño adaptable de los campos y contenidos del frame
                    //  Para cualquier pantalla de laptop o computadora de escritorio
					.addComponent(Enunciadotabla2, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE))
				.addComponent(Scrolltabla4, GroupLayout.PREFERRED_SIZE, 1321, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_ContenidoPrincipal7.createSequentialGroup()
					.addGap(1061)
					.addComponent(btn15, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(btn16, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
		);
		gl_ContenidoPrincipal7.setVerticalGroup(
			gl_ContenidoPrincipal7.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ContenidoPrincipal7.createSequentialGroup()
					.addGap(11)
					.addComponent(Enunciadotabla2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(Scrolltabla4, GroupLayout.PREFERRED_SIZE, 223, GroupLayout.PREFERRED_SIZE)
					.addGap(447)
					.addGroup(gl_ContenidoPrincipal7.createParallelGroup(Alignment.LEADING)
						.addComponent(btn15)
						.addComponent(btn16)))
		);
		ContenidoPrincipal7.setLayout(gl_ContenidoPrincipal7);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(ScrollPrincipal7, GroupLayout.DEFAULT_SIZE, 1361, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(ScrollPrincipal7, GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
		);
		contentPane.setLayout(gl_contentPane);
	}
}
