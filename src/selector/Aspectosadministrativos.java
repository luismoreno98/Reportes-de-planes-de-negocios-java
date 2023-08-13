package selector;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ScrollPaneConstants;


public class Aspectosadministrativos extends JFrame {
	// Declaracion de la variables se puede utilizar en cualquier clase
	private JPanel contentPane;
	private JTable table;
	public static JTextArea Respuesta25 = new JTextArea();
	public static JTextArea Respuesta26 = new JTextArea();
	public static JTextArea Respuesta27 = new JTextArea();
	public static String[] Resultados5 = new String[3];
	public static String[][] Resultadostablas1 = new String[10][5];


	/**
	 *  iniciacion de la aplicacion.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aspectosadministrativos frame = new Aspectosadministrativos();
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
	public Aspectosadministrativos() {          /* configuracion general del frame*/
		setTitle("Aspectos administrativos");
		setExtendedState(JFrame.MAXIMIZED_HORIZ);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 25, 1377, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		
		JScrollPane ScrollPrincipal4 = new JScrollPane();
		ScrollPrincipal4.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(ScrollPrincipal4, GroupLayout.DEFAULT_SIZE, 1351, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(ScrollPrincipal4, GroupLayout.DEFAULT_SIZE, 739, Short.MAX_VALUE)
		);
		
		JPanel ContenidoPrincipal4 = new JPanel();
		ScrollPrincipal4.setViewportView(ContenidoPrincipal4);
		/*contenido principal del frame,enunciados de cada campo y
        sus respectivo formato para cada campo*/
		JLabel Enunciado28 = new JLabel("<html>5.1.\tProcesos operativos. Describir los procesos que se llevarán a cabo en la empresa. Describir los flujogramas.<html>");
		Enunciado28.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JScrollPane Scroll25 = new JScrollPane();
		// Declaracion del formato de los campos 
		Respuesta25.setWrapStyleWord(true);
		Respuesta25.setFont(new Font("Arial", Font.PLAIN, 12));
		Respuesta25.setLineWrap(true);
		
		Scroll25.setViewportView(Respuesta25);
		
		JPopupMenu Menu25 = new JPopupMenu();
		addPopup(Respuesta25, Menu25);
		
		JMenuItem menuopcion73 = new JMenuItem("Cortar");  // opcion de cortar
		/* metodo que permite adquirir la accion del atajo cortar con
        el teclado   */
		menuopcion73.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
		menuopcion73.addActionListener(new ActionListener() {  // metodo para cortar
			public void actionPerformed(ActionEvent e) {
				Respuesta25.cut();
			}
		});
		menuopcion73.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu25.add(menuopcion73);
		
		JMenuItem menuopcion74 = new JMenuItem("Copiar"); // metodo para copiar
		/* metodo que permite adquirir la accion del atajo copiar con
        el teclado */
		menuopcion74.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
		menuopcion74.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {   // metodo para copiar
				Respuesta25.copy();
			}
		});
		menuopcion74.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu25.add(menuopcion74);
		
		JMenuItem menuopcion75 = new JMenuItem("Pegar");   // opcion de pegar
		/* metodo que permite adquirir la accion del atajo pegar con
        el teclado */
		menuopcion75.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
		menuopcion75.addActionListener(new ActionListener() {  // metodo para pegar
			public void actionPerformed(ActionEvent e) {
				Respuesta25.paste();
			}
		});
		menuopcion75.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu25.add(menuopcion75);
		
		JLabel Enunciado29 = new JLabel("<html>5.2.\tDescripción de puestos. Definir los puestos que llevarán a cabo las actividades descritas en los procesos.<p>\r\n5.3.\tDefinir el perfil del puesto. Preparación académica, Habilidades técnicas, Experiencia laboral, etc.<p>\r\n5.4.\tElaborar el organigrama de la empresa, congruente con los puntos anteriores.<html>\r\n");
		Enunciado29.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JScrollPane Scroll26 = new JScrollPane();
		
		Respuesta26.setFont(new Font("Arial", Font.PLAIN, 12));
		Respuesta26.setWrapStyleWord(true);
		Respuesta26.setLineWrap(true);
		Scroll26.setViewportView(Respuesta26);
		
		JPopupMenu Menu26 = new JPopupMenu();
		addPopup(Respuesta26, Menu26);
		
		JMenuItem menuopcion76 = new JMenuItem("Cortar");
		menuopcion76.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
		menuopcion76.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta26.cut();
			}
		});
		menuopcion76.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu26.add(menuopcion76);
		
		JMenuItem menuopcion77 = new JMenuItem("Copiar");
		menuopcion77.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
		menuopcion77.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta26.copy();
			}
		});
		menuopcion77.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu26.add(menuopcion77);
		
		JMenuItem menuopcion78 = new JMenuItem("Pegar");
		menuopcion78.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
		menuopcion78.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta26.paste();
			}
		});
		menuopcion78.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu26.add(menuopcion78);
		
		JLabel Enunciado30 = new JLabel("<html>5.5.\tReclutamiento, selección, contratación<p>\r\n5.6.\tInducción<p>\r\n5.7.\tAdiestramiento y capacitación.<html>\r\n");
		Enunciado30.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JScrollPane Scroll27 = new JScrollPane();
		
		Respuesta27.setWrapStyleWord(true);
		Respuesta27.setLineWrap(true);
		Respuesta27.setFont(new Font("Arial", Font.PLAIN, 12));
		Scroll27.setViewportView(Respuesta27);
		
		JPopupMenu Menu27 = new JPopupMenu();
		Menu27.setFont(new Font("Arial", Font.PLAIN, 14));
		addPopup(Respuesta27, Menu27);
		
		JMenuItem menuopcion79 = new JMenuItem("Cortar");
		menuopcion79.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
		menuopcion79.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta27.cut();
			}
		});
		menuopcion79.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu27.add(menuopcion79);
		
		JMenuItem menuopcion80 = new JMenuItem("Copiar");
		menuopcion80.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
		menuopcion80.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta27.copy();
			}
		});
		menuopcion80.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu27.add(menuopcion80);
		
		JMenuItem menuopcion81 = new JMenuItem("Pegar");
		menuopcion81.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
		menuopcion81.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta27.paste();
			}
		});
		menuopcion81.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu27.add(menuopcion81);
		
		JLabel Enunciado31 = new JLabel("5.8.\tTabulador de sueldos ");
		Enunciado31.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JButton btn9 = new JButton("Atras"); // declaracion del boton atras
		btn9.addActionListener(new ActionListener() {   // evento del boton atras
			public void actionPerformed(ActionEvent e) {
				Aspectosoperativos ventana7 = new Aspectosoperativos();   // retroceder  al anterior frame
				ventana7.setVisible(true);
				// cierra el frame anterior y deja abierto el actual
				dispose();
			}
		});
		btn9.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JButton btn10 = new JButton("Siguiente");   // declaracion del boton siguente
		btn10.addActionListener(new ActionListener() {  // evento del boton siguiente
			public void actionPerformed(ActionEvent e) {
				// condicional por si algun campo se encuentra vacio no se pueda avanzar al siguente frame
				if (Respuesta25.getText().isEmpty() || Respuesta26.getText().isEmpty()
						|| Respuesta27.getText().isEmpty()) {
					// mensaje por si aun campo se encuentra vacio
					 JOptionPane.showMessageDialog(null, "Llenar los espacios en blanco");
				} 
				// condicional cuando hay por lo menos un caracter en todos los campos
				
				else {
					Aspectoslegales ventana9 = new Aspectoslegales(); // avanzar al siguiente frame
					ventana9.setVisible(true);
					// cierra el frame anterior y deja abierto el actual
					dispose();
					
					JOptionPane.showMessageDialog(null, "CONSIDERACIONES: \n \n 1 en caso de no llevar informacion en algun campo generar un espacio en"
							+ "blanco para poder continuar a la siguente seccion \n 2 todos los campos los campos tinen que estar llenados para poder generar el pdf correctamente "
							+ "\n 3 para cada parrafo que lleve punto y aparte generar 2 saltos en lina en blanco con la tecla enter (2 veces)"
							+ "\n \n CONSIDERACIONES DE TABLA: \n \n 1 dar doble clicke a cada celda para introducir la informacion "
							+ "\n 2 muy importante verificar la informacion de la tabla ya que si la informacion esta incompleta o se les ovida informacion al pasar a la "
							+ "siguiente seccion y regresar a esta tabla se tendra que llenar de nuevo la tabla en cuestion"
							+ "\n 3 cada vez que se introduzca informacion en cada celda al terminar darle un enter");
					
					// arreglo que guarda los datos de cada campo 
					Resultados5[0] = Respuesta25.getText();
					Resultados5[1] = Respuesta26.getText();
					Resultados5[2] = Respuesta27.getText();
				}
				
				// arreglo que guarda los datos de la tabla 
				Resultadostablas1[0][0] = (String) table.getValueAt(0, 1);
				Resultadostablas1[1][0] = (String) table.getValueAt(1, 1);
				Resultadostablas1[2][0] = (String) table.getValueAt(2, 1);
				Resultadostablas1[3][0] = (String) table.getValueAt(3, 1);
				Resultadostablas1[4][0] = (String) table.getValueAt(4, 1);
				Resultadostablas1[5][0] = (String) table.getValueAt(5, 1);
				Resultadostablas1[6][0] = (String) table.getValueAt(6, 1);
				Resultadostablas1[7][0] = (String) table.getValueAt(7, 1);
				Resultadostablas1[8][0] = (String) table.getValueAt(8, 1);
				Resultadostablas1[9][0] = (String) table.getValueAt(9, 1);
				
				Resultadostablas1[0][1] = (String) table.getValueAt(0, 2);
				Resultadostablas1[1][1] = (String) table.getValueAt(1, 2);
				Resultadostablas1[2][1] = (String) table.getValueAt(2, 2);
				Resultadostablas1[3][1] = (String) table.getValueAt(3, 2);
				Resultadostablas1[4][1] = (String) table.getValueAt(4, 2);
				Resultadostablas1[5][1] = (String) table.getValueAt(5, 2);
				Resultadostablas1[6][1] = (String) table.getValueAt(6, 2);
				Resultadostablas1[7][1] = (String) table.getValueAt(7, 2);
				Resultadostablas1[8][1] = (String) table.getValueAt(8, 2);
				Resultadostablas1[9][1] = (String) table.getValueAt(9, 2);
				
				Resultadostablas1[0][2] = (String) table.getValueAt(0, 3);
				Resultadostablas1[1][2] = (String) table.getValueAt(1, 3);
				Resultadostablas1[2][2] = (String) table.getValueAt(2, 3);
				Resultadostablas1[3][2] = (String) table.getValueAt(3, 3);
				Resultadostablas1[4][2] = (String) table.getValueAt(4, 3);
				Resultadostablas1[5][2] = (String) table.getValueAt(5, 3);
				Resultadostablas1[6][2] = (String) table.getValueAt(6, 3);
				Resultadostablas1[7][2] = (String) table.getValueAt(7, 3);
				Resultadostablas1[8][2] = (String) table.getValueAt(8, 3);
				Resultadostablas1[9][2] = (String) table.getValueAt(9, 3);
				
				Resultadostablas1[0][3] = (String) table.getValueAt(0, 4);
				Resultadostablas1[1][3] = (String) table.getValueAt(1, 4);
				Resultadostablas1[2][3] = (String) table.getValueAt(2, 4);
				Resultadostablas1[3][3] = (String) table.getValueAt(3, 4);
				Resultadostablas1[4][3] = (String) table.getValueAt(4, 4);
				Resultadostablas1[5][3] = (String) table.getValueAt(5, 4);
				Resultadostablas1[6][3] = (String) table.getValueAt(6, 4);
				Resultadostablas1[7][3] = (String) table.getValueAt(7, 4);
				Resultadostablas1[8][3] = (String) table.getValueAt(8, 4);
				Resultadostablas1[9][3] = (String) table.getValueAt(9, 4);
				
				Resultadostablas1[0][4] = (String) table.getValueAt(0, 5);
				Resultadostablas1[1][4] = (String) table.getValueAt(1, 5);
				Resultadostablas1[2][4] = (String) table.getValueAt(2, 5);
				Resultadostablas1[3][4] = (String) table.getValueAt(3, 5);
				Resultadostablas1[4][4] = (String) table.getValueAt(4, 5);
				Resultadostablas1[5][4] = (String) table.getValueAt(5, 5);
				Resultadostablas1[6][4] = (String) table.getValueAt(6, 5);
				Resultadostablas1[7][4] = (String) table.getValueAt(7, 5);
				Resultadostablas1[8][4] = (String) table.getValueAt(8, 5);
				Resultadostablas1[9][4] = (String) table.getValueAt(9, 5);
				
			//	System.out.println(Resultadostablas1[9][4]);
				
				
			}
		});
		btn10.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JScrollPane Scrolltabla1 = new JScrollPane();
		
		
		table = new JTable(); // Declaracion de la tabla 
		table.setRowHeight(41); // Tamaño se la columna de la tabla 
		table.setCellSelectionEnabled(true); // seleccionador por celda 
		table.setColumnSelectionAllowed(true);
		JTableHeader header = table.getTableHeader(); //tamañp de los encabezados
		 header.setPreferredSize(new Dimension(0, 65));
		table.setFont(new Font("Arial", Font.PLAIN, 12));
		
		table.setModel(new DefaultTableModel(
			new Object[][] {    // Declaracion de las celdas de la tabla
				{"                     1", " ", " ", " ", " ", " "},
				{"                     2", " ", " ", " ", " ", " "},
				{"                     3", " ", " ", " ", " ", " "},
				{"                     4", " ", " ", " ", " ", " "},
				{"                     5", " ", " ", " ", " ", " "},
				{"                     6", " ", " ", " ", " ", " "},
				{"                     7", " ", " ", " ", " ", " "},
				{"                     8", " ", " ", " ", " ", " "},
				{"                     9", " ", " ", " ", " ", " "},
				{"                     10"," ", " ", " ", " ", " "},
			},
			new String[] { // nombre de las columnas 
				"N\u00B0", "Puesto", "<html>Cantidad de personas en el<br> puesto<html>", "<html>Importe<br>sueldo<br>mensual<html>", "<html>Importe<br>Prestaciones<html>", "<html>Descuentos(ISR<br>,AFORE,INFONAVIT<br>,FONACOT,ETC.)<html>"
			} 
		) 
		{
			boolean[] columnEditables = new boolean[] { // condicional para seleccionar para ver que columnas pueden ser editadas 
				false, true, true, true, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		
		table.getColumnModel().getColumn(4).setCellRenderer(new MyCellRenderer());
		Scrolltabla1.setViewportView(table);
		// tipo de layout grupal del contenido del frame
		GroupLayout gl_ContenidoPrincipal4 = new GroupLayout(ContenidoPrincipal4);
		gl_ContenidoPrincipal4.setHorizontalGroup(
				// tipo de alineacion adaptable del contenido pa cualquier tipo de pantalla
			gl_ContenidoPrincipal4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ContenidoPrincipal4.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_ContenidoPrincipal4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_ContenidoPrincipal4.createSequentialGroup()
							.addGap(530)
							// tamaño adaptable de los campos y contenidos del frame
	                        //  Para cualquier pantalla de laptop o computadora de escritorio
							.addComponent(Enunciado30, GroupLayout.PREFERRED_SIZE, 288, GroupLayout.PREFERRED_SIZE))
						.addComponent(Enunciado28, GroupLayout.PREFERRED_SIZE, 550, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_ContenidoPrincipal4.createSequentialGroup()
							.addGroup(gl_ContenidoPrincipal4.createParallelGroup(Alignment.LEADING)
								.addComponent(Enunciado29, GroupLayout.PREFERRED_SIZE, 501, GroupLayout.PREFERRED_SIZE)
								.addComponent(Scroll26, GroupLayout.PREFERRED_SIZE, 464, GroupLayout.PREFERRED_SIZE))
							.addGap(29)
							.addGroup(gl_ContenidoPrincipal4.createParallelGroup(Alignment.LEADING)
								.addComponent(Scrolltabla1, GroupLayout.PREFERRED_SIZE, 780, GroupLayout.PREFERRED_SIZE)
								.addComponent(Enunciado31, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_ContenidoPrincipal4.createSequentialGroup()
									.addGap(388)
									.addComponent(btn9, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
									.addGap(10)
									.addComponent(btn10, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_ContenidoPrincipal4.createSequentialGroup()
							.addGap(530)
							.addComponent(Scroll27, GroupLayout.PREFERRED_SIZE, 735, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_ContenidoPrincipal4.createSequentialGroup()
							.addGap(10)
							.addComponent(Scroll25, GroupLayout.PREFERRED_SIZE, 460, GroupLayout.PREFERRED_SIZE)))
					.addGap(270))
		);
		gl_ContenidoPrincipal4.setVerticalGroup(
			gl_ContenidoPrincipal4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ContenidoPrincipal4.createSequentialGroup()
					.addGap(11)
					.addGroup(gl_ContenidoPrincipal4.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_ContenidoPrincipal4.createSequentialGroup()
							.addGap(3)
							.addComponent(Enunciado30, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(13)
							.addComponent(Scroll27, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
							.addGap(7))
						.addGroup(gl_ContenidoPrincipal4.createSequentialGroup()
							.addComponent(Enunciado28)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(Scroll25, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
							.addGap(11)))
					.addGroup(gl_ContenidoPrincipal4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_ContenidoPrincipal4.createSequentialGroup()
							.addComponent(Enunciado29)
							.addGap(11)
							.addComponent(Scroll26, GroupLayout.PREFERRED_SIZE, 325, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_ContenidoPrincipal4.createSequentialGroup()
							.addGap(4)
							.addComponent(Enunciado31, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(Scrolltabla1, GroupLayout.PREFERRED_SIZE, 275, GroupLayout.PREFERRED_SIZE)
							.addGap(99)
							.addGroup(gl_ContenidoPrincipal4.createParallelGroup(Alignment.LEADING)
								.addComponent(btn9, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
								.addComponent(btn10, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap())
		);
		ContenidoPrincipal4.setLayout(gl_ContenidoPrincipal4);
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
