package selector;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.print.DocFlavor.STRING;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

import java.awt.Point;
import java.awt.Dimension;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;
import javax.swing.KeyStroke;
import java.awt.event.InputEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Aspectoslegales extends JFrame {
	// Declaracion de la variables se puede utilizar en cualquier clase
	private JPanel contentPane;
	private JTable table;
	public static JTextArea Respuesta28 = new JTextArea();
	public static String Resultado6 = null;
	public static String[][] Resultadostablas2 = new String[6][6];
	public static String[][] Resultadostablas2_1 = new String[8][6];
	private JTable table_1;
	

	/**
	 *  iniciacion de la aplicacion.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aspectoslegales frame = new Aspectoslegales();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 *  Creacion del frame.
	 */
	public Aspectoslegales() {                                 /* configuracion general del frame*/
		setTitle("Aspectos legales");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_HORIZ);
		setBounds(100, 25, 1377, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JScrollPane ScrollPrincipal5 = new JScrollPane();
		
		JPanel ContenidoPrincipal5 = new JPanel();
		ScrollPrincipal5.setViewportView(ContenidoPrincipal5);
		ContenidoPrincipal5.setAlignmentY(Component.TOP_ALIGNMENT);
		ContenidoPrincipal5.setAlignmentX(Component.RIGHT_ALIGNMENT);
		/*contenido principal del frame,enunciados de cada campo y
        sus respectivo formato para cada campo*/
		JLabel Enunciado32 = new JLabel("<html>6.1.\tConstitución legal de la empresa. Definir si la figura legal de la empresa será persona física o persona moral, en el caso de elegir persona moral identificar el tipo de sociedad que sea la más adecuada para su empresa; ya sean sociedades mercantiles, civiles, asociaciones civiles, cooperativas, etc. Para hacer este análisis efectúa lo siguiente:\r\nAnalizar las principales características de las sociedades mercantiles en México según la Ley de Sociedades Mercantiles. Como síntesis elabora una tabla comparativa con los tipos de sociedades que piensas que podría crearse tu negocio. Derivado del análisis y síntesis elige la que consideres la más idónea para tu empresa y describe las características principales por las cuales la elegiste. Poner el nombre que adoptará la empresa incluyendo las siglas del tipo de sociedad elegido.<html>");
		Enunciado32.setFont(new Font("Arial", Font.PLAIN, 12));
		
		JLabel Enunciado33 = new JLabel("<html>6.2 Trámites para registro ante la SHCP.<p> \r\n6.3 Legislación laboral. Trámites para registro de la empresa ante el IMSS, INFONAVIT, HACIENDA ESTATAL (pago del 2% s/nómina).\r\npara que revises los artículos de la Ley Federal del Trabajo que se usan en un contrato laboral (prestaciones: días de descanso, 7º.día, vacaciones, prima vacacional, aguinaldo, prima dominical, etc.). También el trabajador tiene derecho a seguridad social (Ley del IMSS).<p>\r\n6.4 Trámite de alta ante hacienda estatal y municipal (Licencia de funcionamiento).<p>\r\n6.5.\tEn su caso trámites ante la Secretaría de Salud (licencia de salubridad)<p>\r\n6.6 En su caso solicitud de registro de patente, modelo de utilidad, signos distintivos, etc.<p> \r\n6.7.\tOtros trámites para cumplir con los aspectos legales de la empresa.<html>");
		Enunciado33.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JScrollPane Scroll28 = new JScrollPane();
		// Declaracion del formato de los campos 
		Respuesta28.setWrapStyleWord(true);
		Respuesta28.setLineWrap(true);
		Respuesta28.setFont(new Font("Arial", Font.PLAIN, 14));
		Scroll28.setViewportView(Respuesta28);
		
		JPopupMenu Menu28 = new JPopupMenu();
		Menu28.setFont(new Font("Arial", Font.PLAIN, 14));
		addPopup(Respuesta28, Menu28);
		
		JMenuItem menuopcion82 = new JMenuItem("Cortar");   // opcion de cortar
		/* metodo que permite adquirir la accion del atajo cortar con
        el teclado   */
		menuopcion82.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
		menuopcion82.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {   // metodo para cortar
				Respuesta28.cut();
			}
		});
		menuopcion82.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu28.add(menuopcion82);
		
		JMenuItem menuopcion83 = new JMenuItem("Copiar");  // metodo para copiar
		/* metodo que permite adquirir la accion del atajo copiar con
        el teclado */
		menuopcion83.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
		menuopcion83.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // metodo para copiar
				Respuesta28.copy();
			}
		});
		menuopcion83.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu28.add(menuopcion83);
		
		JMenuItem menuopcion84 = new JMenuItem("Pegar"); // opcion de pegar
		/* metodo que permite adquirir la accion del atajo pegar con
        el teclado */
		menuopcion84.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
		menuopcion84.addActionListener(new ActionListener() {   // metodo para pegar
			public void actionPerformed(ActionEvent e) {
				Respuesta28.paste();
			}
		});
		menuopcion84.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu28.add(menuopcion84);
		
		JButton btn11 = new JButton("Atras"); // declaracion del boton atras
		btn11.addActionListener(new ActionListener() {  // evento del boton atras
			public void actionPerformed(ActionEvent e) {
				Aspectosadministrativos ventana8 = new Aspectosadministrativos(); // retroceder  al anterior frame
				ventana8.setVisible(true);
				// cierra el frame anterior y deja abierto el actual
				dispose();
				}
		});
		btn11.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JButton btn12 = new JButton("Siguiente"); // declaracion del boton siguente
		btn12.addActionListener(new ActionListener() {  // evento del boton siguiente
			public void actionPerformed(ActionEvent e) {
				// condicional por si algun campo se encuentra vacio no se pueda avanzar al siguente frame
				if (Respuesta28.getText().isEmpty()) {
					// mensaje por si aun campo se encuentra vacio
					JOptionPane.showMessageDialog(null, "Llenar los campos vacios");
				} 
				// condicional cuando hay por lo menos un caracter en todos los campos
				else {
					Aspectosfinancierosseccion1 ventana10 = new Aspectosfinancierosseccion1();  // avanzar al siguiente frame
					ventana10.setVisible(true);
					// cierra el frame anterior y deja abierto el actual
					dispose();
					
					JOptionPane.showMessageDialog(null,"\n \n CONSIDERACIONES DE TABLA: \n \n 1 dar doble click a cada celda para introducir la informacion "
							+ "\n 2 muy importante verificar la informacion de la tabla ya que si la informacion esta incompleta o se les ovida informacion al pasar a la "
							+ "siguiente seccion y regresar a esta tabla se tendra que llenar de nuevo la tabla en cuestion"
							+ "\n 3 cada vez que se introduzca informacion en cada celda al terminar darle un enter");
					// variable que guarda los datos del campo  
					Resultado6= Respuesta28.getText();
				//	System.out.println(Resultados6[0]);
				}
				
				// arreglo que guarda los datos de la tabla 
				Resultadostablas2[0][0] = (String) table.getValueAt(4, 0);
				Resultadostablas2[1][0] = (String) table.getValueAt(5, 0);
				Resultadostablas2[2][0] = (String) table.getValueAt(0, 1);
				Resultadostablas2[3][0] = (String) table.getValueAt(1, 1);
				Resultadostablas2[4][0] = (String) table.getValueAt(2, 1);
				Resultadostablas2[5][0] = (String) table.getValueAt(3, 1);
				
				Resultadostablas2[0][1] = (String) table.getValueAt(4, 1);
				Resultadostablas2[1][1] = (String) table.getValueAt(5, 1);
				Resultadostablas2[2][1] = (String) table.getValueAt(0, 2);
				Resultadostablas2[3][1] = (String) table.getValueAt(1, 2);
				Resultadostablas2[4][1] = (String) table.getValueAt(2, 2);
				Resultadostablas2[5][1] = (String) table.getValueAt(3, 2);
				
				Resultadostablas2[0][2] = (String) table.getValueAt(4, 2);
				Resultadostablas2[1][2] = (String) table.getValueAt(5, 2);
				Resultadostablas2[2][2] = (String) table.getValueAt(0, 3);
				Resultadostablas2[3][2] = (String) table.getValueAt(1, 3);
				Resultadostablas2[4][2] = (String) table.getValueAt(2, 3);
				Resultadostablas2[5][2] = (String) table.getValueAt(3, 3);
				
				Resultadostablas2[0][3] = (String) table.getValueAt(4, 3);
				Resultadostablas2[1][3] = (String) table.getValueAt(5, 3);
				Resultadostablas2[2][3] = (String) table.getValueAt(0, 4);
				Resultadostablas2[3][3] = (String) table.getValueAt(1, 4);
				Resultadostablas2[4][3] = (String) table.getValueAt(2, 4);
				Resultadostablas2[5][3] = (String) table.getValueAt(3, 4);
				
				Resultadostablas2[0][4] = (String) table.getValueAt(4, 4);
				Resultadostablas2[1][4] = (String) table.getValueAt(5, 4);
				Resultadostablas2[2][4] = (String) table.getValueAt(0, 5);
				Resultadostablas2[3][4] = (String) table.getValueAt(1, 5);
				Resultadostablas2[4][4] = (String) table.getValueAt(2, 5);
				Resultadostablas2[5][4] = (String) table.getValueAt(3, 5);
				Resultadostablas2[0][5] = (String) table.getValueAt(4, 5);
				Resultadostablas2[1][5] = (String) table.getValueAt(5, 5);
				
				System.out.println(Resultadostablas2[1][5]);
				// arreglo que guarda los datos de la tabla 
				Resultadostablas2_1[0][0] = (String) table_1.getValueAt(0, 2);
				Resultadostablas2_1[1][0] = (String) table_1.getValueAt(1, 2);
				Resultadostablas2_1[2][0] = (String) table_1.getValueAt(2, 2);
				Resultadostablas2_1[3][0] = (String) table_1.getValueAt(3, 2);
				Resultadostablas2_1[4][0] = (String) table_1.getValueAt(4, 2);
				Resultadostablas2_1[5][0] = (String) table_1.getValueAt(5, 2);
				Resultadostablas2_1[6][0] = (String) table_1.getValueAt(6, 2);
				Resultadostablas2_1[7][0] = (String) table_1.getValueAt(7, 2);

				Resultadostablas2_1[0][1] = (String) table_1.getValueAt(0, 3);
				Resultadostablas2_1[1][1] = (String) table_1.getValueAt(1, 3);
				Resultadostablas2_1[2][1] = (String) table_1.getValueAt(2, 3);
				Resultadostablas2_1[3][1] = (String) table_1.getValueAt(3, 3);
				Resultadostablas2_1[4][1] = (String) table_1.getValueAt(4, 3);
				Resultadostablas2_1[5][1] = (String) table_1.getValueAt(5, 3);
				Resultadostablas2_1[6][1] = (String) table_1.getValueAt(6, 3);
				Resultadostablas2_1[7][1] = (String) table_1.getValueAt(7, 3);
				
				Resultadostablas2_1[0][2] = (String) table_1.getValueAt(0, 4);
				Resultadostablas2_1[1][2] = (String) table_1.getValueAt(1, 4);
				Resultadostablas2_1[2][2] = (String) table_1.getValueAt(2, 4);
				Resultadostablas2_1[3][2] = (String) table_1.getValueAt(3, 4);
				Resultadostablas2_1[4][2] = (String) table_1.getValueAt(4, 4);
				Resultadostablas2_1[5][2] = (String) table_1.getValueAt(5, 4);
				Resultadostablas2_1[6][2] = (String) table_1.getValueAt(6, 4);
				Resultadostablas2_1[7][2] = (String) table_1.getValueAt(7, 4);
				
				Resultadostablas2_1[0][3] = (String) table_1.getValueAt(0, 5);
				Resultadostablas2_1[1][3] = (String) table_1.getValueAt(1, 5);
				Resultadostablas2_1[2][3] = (String) table_1.getValueAt(2, 5);
				Resultadostablas2_1[3][3] = (String) table_1.getValueAt(3, 5);
				Resultadostablas2_1[4][3] = (String) table_1.getValueAt(4, 5);
				Resultadostablas2_1[5][3] = (String) table_1.getValueAt(5, 5);
				Resultadostablas2_1[6][3] = (String) table_1.getValueAt(6, 5);
				Resultadostablas2_1[7][3] = (String) table_1.getValueAt(7, 5);
				
				Resultadostablas2_1[0][4] = (String) table_1.getValueAt(0, 6);
				Resultadostablas2_1[1][4] = (String) table_1.getValueAt(1, 6);
				Resultadostablas2_1[2][4] = (String) table_1.getValueAt(2, 6);
				Resultadostablas2_1[3][4] = (String) table_1.getValueAt(3, 6);
				Resultadostablas2_1[4][4] = (String) table_1.getValueAt(4, 6);
				Resultadostablas2_1[5][4] = (String) table_1.getValueAt(5, 6);
				Resultadostablas2_1[6][4] = (String) table_1.getValueAt(6, 6);
				Resultadostablas2_1[7][4] = (String) table_1.getValueAt(7, 6);
				
				Resultadostablas2_1[0][5] = (String) table_1.getValueAt(0, 7);
				Resultadostablas2_1[1][5] = (String) table_1.getValueAt(1, 7);
				Resultadostablas2_1[2][5] = (String) table_1.getValueAt(2, 7);
				Resultadostablas2_1[3][5] = (String) table_1.getValueAt(3, 7);
				Resultadostablas2_1[4][5] = (String) table_1.getValueAt(4, 7);
				Resultadostablas2_1[5][5] = (String) table_1.getValueAt(5, 7);
				Resultadostablas2_1[6][5] = (String) table_1.getValueAt(6, 7);
				Resultadostablas2_1[7][5] = (String) table_1.getValueAt(7, 7);
				
				System.out.println(Resultadostablas2_1[7][5]);
			}

			
		});
		btn12.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JScrollPane Scrolltabla2 = new JScrollPane();
		
		table = new JTable();  // Declaracion de la tabla 
		table.setCellSelectionEnabled(true);
		table.setColumnSelectionAllowed(true);   // seleccionador por celda 
		table.setFillsViewportHeight(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {  // Declaracion de las celdas de la tabla
				{"         Producto", " ", " ", " ", " ", " "},
				{"         Precio", " ", " ", " ", " ", " "},
				{"   Punto de venta", " ", " ", " ", " "," "},
				{"       Publicidad", " ", " ", " ", " ", " "},
				{" ", " ", " ", " ", " ", " "},
				{" ", " ", " ", " ", " ", " "},
			},
			new String[] {  // nombre de las columnas 
				" ", "Mi propuesta", "A", "B", "C", "D"
			}
		));
		table.setFont(new Font("Arial", Font.PLAIN, 12)); 
		table.getColumnModel().getColumn(1).setCellRenderer(new MyCellRenderer()); // Metodo que hace un salto de linea para cada columna 
		table.getColumnModel().getColumn(2).setCellRenderer(new MyCellRenderer());
		table.getColumnModel().getColumn(3).setCellRenderer(new MyCellRenderer());
		table.getColumnModel().getColumn(4).setCellRenderer(new MyCellRenderer());
		table.getColumnModel().getColumn(5).setCellRenderer(new MyCellRenderer());
		Scrolltabla2.setViewportView(table);
		
		JScrollPane scrollPane = new JScrollPane();
		
		table_1 = new JTable();  // Declaracion de la tabla 
		table_1.setModel(new DefaultTableModel(
			new Object[][] {   // Declaracion de las celdas de la tabla
				{" ", " ", " ", " ", " ", " ", " ", " "},
				{"1", "Responsabilidades socios", " ", " ", " ", " ", " ", " "},
				{"2", "Raz\u00F3n social o denominaci\u00F3n", " ", " ", " ", " ", " ", " "},
				{"3", "Tipo de socios", " ", " ", " ", " ", " ", " "},
				{"4", "Administraci\u00F3n", " ", " ", " ", " ", " ", " "},
				{"5", "Vigilancia", " ", " ", " ", " ", " ", " "},
				{"6", "L\u00EDmite de socios", " ", " ", " ", " ", " ", " "},
				{"7", "Caracter\u00EDsticas del capital", " ", " ", " ", " ", " ", " "},
			},
			new String[] { // nombre de las columnas 
				"", "", "", "", "", "", "", ""
			}
		));
		table_1.getColumnModel().getColumn(1).setPreferredWidth(201); // Tamaño se la columna de la tabla 
		table_1.setFont(new Font("Arial", Font.PLAIN, 12));
		table_1.getColumnModel().getColumn(1).setCellRenderer(new MyCellRenderer()); // Metodo que hace un salto de linea para cada columna 
		table_1.getColumnModel().getColumn(2).setCellRenderer(new MyCellRenderer());
		table_1.getColumnModel().getColumn(3).setCellRenderer(new MyCellRenderer());
		table_1.getColumnModel().getColumn(4).setCellRenderer(new MyCellRenderer());
		table_1.getColumnModel().getColumn(5).setCellRenderer(new MyCellRenderer());
		table_1.getColumnModel().getColumn(6).setCellRenderer(new MyCellRenderer());
		table_1.getColumnModel().getColumn(7).setCellRenderer(new MyCellRenderer());
		scrollPane.setViewportView(table_1);
		
		JLabel lblNewLabel = new JLabel("TIPOS DE SOCIEDADES"); // Declaracion para el titulo de la tabla 
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		// tipo de layout grupal del contenido del frame
		GroupLayout gl_ContenidoPrincipal5 = new GroupLayout(ContenidoPrincipal5);
		gl_ContenidoPrincipal5.setHorizontalGroup(
				// tipo de alineacion adaptable del contenido pa cualquier tipo de pantalla
			gl_ContenidoPrincipal5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ContenidoPrincipal5.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_ContenidoPrincipal5.createParallelGroup(Alignment.LEADING)
							// tamaño adaptable de los campos y contenidos del frame
	                        //  Para cualquier pantalla de laptop o computadora de escritorio
						.addComponent(Enunciado32, GroupLayout.PREFERRED_SIZE, 672, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_ContenidoPrincipal5.createSequentialGroup()
							.addGap(10)
							.addComponent(Scrolltabla2, GroupLayout.PREFERRED_SIZE, 612, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_ContenidoPrincipal5.createSequentialGroup()
							.addGap(20)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_ContenidoPrincipal5.createSequentialGroup()
							.addGap(10)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 631, GroupLayout.PREFERRED_SIZE)))
					.addGap(10)
					.addGroup(gl_ContenidoPrincipal5.createParallelGroup(Alignment.LEADING)
						.addComponent(Scroll28, GroupLayout.PREFERRED_SIZE, 613, GroupLayout.PREFERRED_SIZE)
						.addComponent(Enunciado33, GroupLayout.PREFERRED_SIZE, 639, GroupLayout.PREFERRED_SIZE)))
				.addGroup(gl_ContenidoPrincipal5.createSequentialGroup()
					.addGap(692)
					.addComponent(btn11, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addGap(27)
					.addComponent(btn12, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
		);
		gl_ContenidoPrincipal5.setVerticalGroup(
			gl_ContenidoPrincipal5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ContenidoPrincipal5.createSequentialGroup()
					.addGap(11)
					.addGroup(gl_ContenidoPrincipal5.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_ContenidoPrincipal5.createSequentialGroup()
							.addComponent(Enunciado32, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
							.addComponent(Scrolltabla2, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
							.addGap(20)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_ContenidoPrincipal5.createSequentialGroup()
							.addGap(6)
							.addComponent(Enunciado33, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
							.addGap(13)
							.addComponent(Scroll28, GroupLayout.PREFERRED_SIZE, 474, GroupLayout.PREFERRED_SIZE)))
					.addGap(25)
					.addGroup(gl_ContenidoPrincipal5.createParallelGroup(Alignment.LEADING)
						.addComponent(btn11, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_ContenidoPrincipal5.createSequentialGroup()
							.addGap(1)
							.addComponent(btn12, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))))
		);
		ContenidoPrincipal5.setLayout(gl_ContenidoPrincipal5);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(ScrollPrincipal5, GroupLayout.DEFAULT_SIZE, 1361, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(ScrollPrincipal5, GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
		);
		contentPane.setLayout(gl_contentPane);
		
	}

	/*  Metodo que ubica menu de click derecho del mouse segun en la posion del cursor tu mouse */
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
