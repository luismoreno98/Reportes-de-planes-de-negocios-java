package selector;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Aspectosfinancierosseccion3 extends JFrame {
	// Declaracion de la variables se puede utilizar en cualquier clase ( algunas son solo para esta clase)
	private JPanel contentPane;
	private JTable table;
	public static String[][] Resultadostablas5 = new String[20][3];

	/**
	 *  *  iniciacion de la aplicacion.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aspectosfinancierosseccion3 frame = new Aspectosfinancierosseccion3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 *  iniciacion de la aplicacion.
	 */
	public Aspectosfinancierosseccion3() {  /* configuracion general del frame*/
		setTitle("Aspectos financieros seccion 3");
		setExtendedState(JFrame.MAXIMIZED_HORIZ);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 25, 1377, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JScrollPane ScrollPrincipal8 = new JScrollPane();
		
		JPanel ContenidoPrincipal8 = new JPanel();
		ScrollPrincipal8.setViewportView(ContenidoPrincipal8);
		/*contenido principal del frame,enunciados de la tabla y
        sus respectivo formato para la tabla */
		JLabel Enunciadotabla3 = new JLabel("Flujo de efectivo presupuestado");
		Enunciadotabla3.setFont(new Font("Arial", Font.BOLD, 14));
		
		JScrollPane Scrolltabla5 = new JScrollPane();
		
		table = new JTable(); // Declaracion de la tabla 
		table.setModel(new DefaultTableModel(
			new Object[][] {  // Declaracion de las celdas de la tabla
				{"Ventas ", " ", " ", " "},
				{"Aportacion a socios", " ", " ", " "},
				{"Prestamo pyme", " ", " ", " "},
				{"Suma de entradas", " ", " ", " "},
				{"SALIDAS (S)", " ", " ", " "},
				{"Maquinaria", " ", " ", " "},
				{"Mobiliario", " ", " ", " "},
				{"Eq. De comp.", " ", " ", " "},
				{"Herram.", " ", " ", " "},
				{"Compras materiales", " ", " ", " "},
				{"Maquila", " ", " ", " "},
				{"Gastos de operaci\u00F3n", " ", " ", " "},
				{"Gastos financieros", " ", " ", " "},
				{"Devoluci\u00F3n de pr\u00E9stamo", " ", " ", " "},
				{"Pago de impuestos", " ", " ", " "},
				{"Otros", " ", " ", " "},
				{"SUMA DE SALIDAS", " ", " ", " "},
				{"DIFERENCIA: E-S", " ", " ", " "},
				{"Mas: saldo inicial", " ", " ", " "},
				{"SALDO FINAL DE EFECTIVO", " ", " ", " "},
			},
			new String[] {  // nombre de las columnas 
				"Entradas (E)", "A\u00F1o 1", "A\u00F1o 2", "A\u00F1o 3"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(141);  // Tamaño se la columna de la tabla y su formato
		Scrolltabla5.setViewportView(table);
		
		JButton btn17 = new JButton("Atras "); // declaracion del boton atras
		btn17.addActionListener(new ActionListener() {  // evento del boton atras
			public void actionPerformed(ActionEvent e) {
				
				Aspectosfinancierosseccion2 ventana11 = new Aspectosfinancierosseccion2(); // retroceder  al anterior frame
				ventana11.setVisible(true);
				// cierra el frame anterior y deja abierto el actual
				dispose();
			}
		});
		btn17.setFont(new Font("Arial", Font.PLAIN, 12));
		
		JButton btn18 = new JButton("Siguiente");  // declaracion del boton siguente
		btn18.addActionListener(new ActionListener() { // evento del boton siguiente
			public void actionPerformed(ActionEvent e) {
				
				Resumenejecutivo ventana13 = new Resumenejecutivo();  // avanzar al siguiente frame
				ventana13.setVisible(true);
				// cierra el frame anterior y deja abierto el actual
				dispose();
				
				JOptionPane.showMessageDialog(null, "CONSIDERACIONES: \n \n 1 en caso de no llevar informacion en algun campo generar un espacio en"
						+ "blanco para poder continuar a la siguente seccion \n 2 todos los campos los campos tinen que estar llenados para poder generar el pdf correctamente "
						+ "\n 3 para cada parrafo que lleve punto y aparte generar 2 saltos en lina en blanco con la tecla enter (2 veces)"
						+ "\n 4 si algun campo de texto o tabla no lleno de informacion el pdf no se abrira "
						+ "\n 5 el pdf estara en el escritorio con el nombre plan de negocios ");
				// arreglo que guarda los datos de la tabla 
				Resultadostablas5[0][0] = (String) table.getValueAt(0, 1);
				Resultadostablas5[1][0] = (String) table.getValueAt(1, 1);
				Resultadostablas5[2][0] = (String) table.getValueAt(2, 1);
				Resultadostablas5[3][0] = (String) table.getValueAt(3, 1);
				Resultadostablas5[4][0] = (String) table.getValueAt(4, 1);
				Resultadostablas5[5][0] = (String) table.getValueAt(5, 1);
				Resultadostablas5[6][0] = (String) table.getValueAt(6, 1);
				Resultadostablas5[7][0] = (String) table.getValueAt(7, 1);
				Resultadostablas5[8][0] = (String) table.getValueAt(8, 1);
				Resultadostablas5[9][0] = (String) table.getValueAt(9, 1);
				Resultadostablas5[10][0] = (String) table.getValueAt(10, 1);
				Resultadostablas5[11][0] = (String) table.getValueAt(11, 1);
				Resultadostablas5[12][0] = (String) table.getValueAt(12, 1);
				Resultadostablas5[13][0] = (String) table.getValueAt(13, 1);
				Resultadostablas5[14][0] = (String) table.getValueAt(14, 1);
				Resultadostablas5[15][0] = (String) table.getValueAt(15, 1);
				Resultadostablas5[16][0] = (String) table.getValueAt(16, 1);
				Resultadostablas5[17][0] = (String) table.getValueAt(17, 1);
				Resultadostablas5[18][0] = (String) table.getValueAt(18, 1);
				Resultadostablas5[19][0] = (String) table.getValueAt(19, 1);
				
				Resultadostablas5[0][1] = (String) table.getValueAt(0, 2);
				Resultadostablas5[1][1] = (String) table.getValueAt(1, 2);
				Resultadostablas5[2][1] = (String) table.getValueAt(2, 2);
				Resultadostablas5[3][1] = (String) table.getValueAt(3, 2);
				Resultadostablas5[4][1] = (String) table.getValueAt(4, 2);
				Resultadostablas5[5][1] = (String) table.getValueAt(5, 2);
				Resultadostablas5[6][1] = (String) table.getValueAt(6, 2);
				Resultadostablas5[7][1] = (String) table.getValueAt(7, 2);
				Resultadostablas5[8][1] = (String) table.getValueAt(8, 2);
				Resultadostablas5[9][1] = (String) table.getValueAt(9, 2);
				Resultadostablas5[10][1] = (String) table.getValueAt(10, 2);
				Resultadostablas5[11][1] = (String) table.getValueAt(11, 2);
				Resultadostablas5[12][1] = (String) table.getValueAt(12, 2);
				Resultadostablas5[13][1] = (String) table.getValueAt(13, 2);
				Resultadostablas5[14][1] = (String) table.getValueAt(14, 2);
				Resultadostablas5[15][1] = (String) table.getValueAt(15, 2);
				Resultadostablas5[16][1] = (String) table.getValueAt(16, 2);
				Resultadostablas5[17][1] = (String) table.getValueAt(17, 2);
				Resultadostablas5[18][1] = (String) table.getValueAt(18, 2);
				Resultadostablas5[19][1] = (String) table.getValueAt(19, 2);
				
				Resultadostablas5[0][2] = (String) table.getValueAt(0, 3);
				Resultadostablas5[1][2] = (String) table.getValueAt(1, 3);
				Resultadostablas5[2][2] = (String) table.getValueAt(2, 3);
				Resultadostablas5[3][2] = (String) table.getValueAt(3, 3);
				Resultadostablas5[4][2] = (String) table.getValueAt(4, 3);
				Resultadostablas5[5][2] = (String) table.getValueAt(5, 3);
				Resultadostablas5[6][2] = (String) table.getValueAt(6, 3);
				Resultadostablas5[7][2] = (String) table.getValueAt(7, 3);
				Resultadostablas5[8][2] = (String) table.getValueAt(8, 3);
				Resultadostablas5[9][2] = (String) table.getValueAt(9, 3);
				Resultadostablas5[10][2] = (String) table.getValueAt(10, 3);
				Resultadostablas5[11][2] = (String) table.getValueAt(11, 3);
				Resultadostablas5[12][2] = (String) table.getValueAt(12, 3);
				Resultadostablas5[13][2] = (String) table.getValueAt(13, 3);
				Resultadostablas5[14][2] = (String) table.getValueAt(14, 3);
				Resultadostablas5[15][2] = (String) table.getValueAt(15, 3);
				Resultadostablas5[16][2] = (String) table.getValueAt(16, 3);
				Resultadostablas5[17][2] = (String) table.getValueAt(17, 3);
				Resultadostablas5[18][2] = (String) table.getValueAt(18, 3);
				Resultadostablas5[19][2] = (String) table.getValueAt(19, 3);
				
			
				
			//	System.out.println(Resultadostablas5[19][2]);
				
			}
		});
		btn18.setFont(new Font("Arial", Font.PLAIN, 12));
		// tipo de layout grupal del contenido del frame
		GroupLayout gl_ContenidoPrincipal8 = new GroupLayout(ContenidoPrincipal8);
		gl_ContenidoPrincipal8.setHorizontalGroup(
				// tipo de alineacion adaptable del contenido pa cualquier tipo de pantalla
			gl_ContenidoPrincipal8.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ContenidoPrincipal8.createSequentialGroup()
					.addGap(10)
					.addComponent(Enunciadotabla3))
				.addGroup(gl_ContenidoPrincipal8.createSequentialGroup()
					.addGap(10)
					// tamaño adaptable de los campos y contenidos del frame
                    //  Para cualquier pantalla de laptop o computadora de escritorio
					.addComponent(Scrolltabla5, GroupLayout.PREFERRED_SIZE, 1279, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_ContenidoPrincipal8.createSequentialGroup()
					.addGap(988)
					.addComponent(btn17, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(btn18, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
		);
		gl_ContenidoPrincipal8.setVerticalGroup(
			gl_ContenidoPrincipal8.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ContenidoPrincipal8.createSequentialGroup()
					.addGap(11)
					.addComponent(Enunciadotabla3, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(Scrolltabla5, GroupLayout.PREFERRED_SIZE, 349, GroupLayout.PREFERRED_SIZE)
					.addGap(293)
					.addGroup(gl_ContenidoPrincipal8.createParallelGroup(Alignment.LEADING)
						.addComponent(btn17)
						.addComponent(btn18)))
		);
		ContenidoPrincipal8.setLayout(gl_ContenidoPrincipal8);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(ScrollPrincipal8, GroupLayout.DEFAULT_SIZE, 1361, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(ScrollPrincipal8, GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
		);
		contentPane.setLayout(gl_contentPane);
	}
}
