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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

public class Aspectosoperativos extends JFrame {
	// Declaracion de la variables se puede utilizar en cualquier clase
	private JPanel contentPane;
	public static JTextArea Respuesta21 = new JTextArea();
	public static JTextArea Respuesta22 = new JTextArea();
	public static JTextArea Respuesta23 = new JTextArea();
	public static JTextArea Respuesta24 = new JTextArea();
	public static String[] Resultados4 = new String[4];


	/**
	 * iniciacion de la aplicacion.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aspectosoperativos frame = new Aspectosoperativos();
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
	public Aspectosoperativos() {                        /* configuracion general del frame*/
		setTitle("Aspectos Operativos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_HORIZ);
		setBounds(100, 25, 1447, 847);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JScrollPane ScrollPrincipal3 = new JScrollPane();
		
		JPanel ContenidoPrincipal3 = new JPanel();
		ScrollPrincipal3.setViewportView(ContenidoPrincipal3);
		/*contenido principal del frame,enunciados de cada campo y
        sus respectivo formato para cada campo*/
		JLabel Enunciado24 = new JLabel("<html>4.1.\tEspecificaciones del producto o servicio. Descripción detallada considerar dimensiones, colores, materiales, etc.<html>");
		Enunciado24.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JScrollPane Scroll21 = new JScrollPane();
		
		// Declaracion del formato de los campos 
		Respuesta21.setLineWrap(true);
		Respuesta21.setWrapStyleWord(true);
		Respuesta21.setFont(new Font("Arial", Font.PLAIN, 12));
		Scroll21.setViewportView(Respuesta21);
		
		JPopupMenu Menu21 = new JPopupMenu();
		Menu21.setFont(new Font("Arial", Font.PLAIN, 14));
		addPopup(Respuesta21, Menu21);
		
		JMenuItem menuopcion61 = new JMenuItem("Cortar");  // opcion de cortar
		/* metodo que permite adquirir la accion del atajo cortar con
        el teclado   */
		menuopcion61.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
		menuopcion61.addActionListener(new ActionListener() { // metodo para cortar
			public void actionPerformed(ActionEvent e) {
				Respuesta21.cut();
			}
		});
		menuopcion61.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu21.add(menuopcion61);
		
		JMenuItem menuopcion62 = new JMenuItem("Copiar"); // metodo para copiar
		/* metodo que permite adquirir la accion del atajo copiar con
        el teclado */
		menuopcion62.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
		menuopcion62.addActionListener(new ActionListener() {  // metodo para copiar
			public void actionPerformed(ActionEvent e) {
				 Respuesta21.copy();
			}
		});
		menuopcion62.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu21.add(menuopcion62);
		
		JMenuItem muenuopcion63 = new JMenuItem("Pegar");  // opcion de pegar
		/* metodo que permite adquirir la accion del atajo pegar con
        el teclado */
		muenuopcion63.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
		muenuopcion63.addActionListener(new ActionListener() {     // metodo para pegar
			public void actionPerformed(ActionEvent e) {
				 Respuesta21.paste();
			}
		});
		muenuopcion63.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu21.add(muenuopcion63);
		
		JLabel Enunciado25 = new JLabel("<html>4.2.\tDescripción del proceso de producción o prestación del servicio<p>\r\n4.3.\tDiagrama de flujo del proceso o servicio.<html>\r\n");
		Enunciado25.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JScrollPane Scroll22 = new JScrollPane();
		
		Respuesta22.setLineWrap(true);
		Respuesta22.setWrapStyleWord(true);
		Respuesta22.setFont(new Font("Arial", Font.PLAIN, 12));
		Scroll22.setViewportView(Respuesta22);
		
		JPopupMenu Menu22 = new JPopupMenu();
		Menu22.setFont(new Font("Arial", Font.PLAIN, 14));
		addPopup(Respuesta22, Menu22);
		
		JMenuItem menuopcion64 = new JMenuItem("Cortar");
		menuopcion64.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
		menuopcion64.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
               Respuesta22.cut();
			}
		});
		menuopcion64.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu22.add(menuopcion64);
		
		JMenuItem menuopcion65 = new JMenuItem("Copiar");
		menuopcion65.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
		menuopcion65.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Respuesta22.copy();
			}
		});
		menuopcion65.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu22.add(menuopcion65);
		
		JMenuItem menuopcion66 = new JMenuItem("Pegar");
		menuopcion66.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
		menuopcion66.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta22.paste();
			}
		});
		menuopcion66.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu22.add(menuopcion66);
		
		JLabel Enunciado26 = new JLabel("<html>4.4.\tEquipo e Instalaciones<p>\r\n4.5.\tMateria prima<p>\r\n4.6.\tProveedores<p>\r\n4.7.\tCapacidad instalada<p>\r\n4.10. Mano de obra requerida<html>");
		Enunciado26.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JScrollPane Scroll23 = new JScrollPane();
		
		Respuesta23.setFont(new Font("Arial", Font.PLAIN, 12));
		Respuesta23.setWrapStyleWord(true);
		Respuesta23.setLineWrap(true);
		Scroll23.setViewportView(Respuesta23);
		
		JPopupMenu Menu23 = new JPopupMenu();
		Menu23.setFont(new Font("Arial", Font.PLAIN, 14));
		addPopup(Respuesta23, Menu23);
		
		JMenuItem menuopcion67 = new JMenuItem("Cortar");
		menuopcion67.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
		menuopcion67.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Respuesta23.cut();
			}
		});
		menuopcion67.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu23.add(menuopcion67);
		
		JMenuItem menuopcion68 = new JMenuItem("Copiar");
		menuopcion68.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
		menuopcion68.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Respuesta23.copy();
			}
		});
		menuopcion68.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu23.add(menuopcion68);
		
		JMenuItem menuopcion69 = new JMenuItem("Pegar");
		menuopcion69.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
		menuopcion69.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta23.paste();
			}
		});
		menuopcion69.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu23.add(menuopcion69);
		
		JLabel Enunciado27 = new JLabel("<html>4.8.\tUbicación de la empresa (macrolocalización y microlocalización)<p>\r\n4.9.\tDiseño y distribución de planta y oficinas<html>\r\n");
		Enunciado27.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JScrollPane Scroll24 = new JScrollPane();
		
		
		Respuesta24.setFont(new Font("Arial", Font.PLAIN, 12));
		Respuesta24.setWrapStyleWord(true);
		Respuesta24.setLineWrap(true);
		Scroll24.setViewportView(Respuesta24);
		
		JPopupMenu Menu24 = new JPopupMenu();
		Menu24.setFont(new Font("Arial", Font.PLAIN, 14));
		addPopup(Respuesta24, Menu24);
		
		JMenuItem menuopcion70 = new JMenuItem("Cortar");
		menuopcion70.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
		menuopcion70.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Respuesta24.cut();
			}
		});
		menuopcion70.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu24.add(menuopcion70);
		
		JMenuItem menuopcion71 = new JMenuItem("Copiar");
		menuopcion71.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
		menuopcion71.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Respuesta24.copy();
			}
		});
		menuopcion71.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu24.add(menuopcion71);
		
		JMenuItem menuopcion72 = new JMenuItem("Pegar");
		menuopcion72.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
		menuopcion72.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta24.paste();
			}
		});
		menuopcion72.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu24.add(menuopcion72);
		
		JButton btn7 = new JButton("Atras");// declaracion del boton atras
		btn7.addActionListener(new ActionListener() {   // evento del boton atras
			public void actionPerformed(ActionEvent e) {
				Aspectosmercado ventana6 = new Aspectosmercado(); // retroceder  al anterior frame
				ventana6.setVisible(true);
				// cierra el frame anterior y deja abierto el actual
				dispose();
			}
		});
		btn7.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JButton btn8 = new JButton("Siguiente"); // declaracion del boton siguente
		btn8.addActionListener(new ActionListener() {  // evento del boton siguiente
			public void actionPerformed(ActionEvent e) {
				// condicional por si algun campo se encuentra vacio no se pueda avanzar al siguente frame
				if (Respuesta21.getText().isEmpty() || Respuesta22.getText().isEmpty()
						|| Respuesta23.getText().isEmpty() || Respuesta24.getText().isEmpty()) {
					// mensaje por si aun campo se encuentra vacio
					JOptionPane.showMessageDialog(null, "Llenar los campos");
					} 
				 // condicional cuando hay por lo menos un caracter en todos los campos
				else {
					Aspectosadministrativos ventana8 = new Aspectosadministrativos(); // avanzar al siguiente frame
					ventana8.setVisible(true);
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
					Resultados4[0]= Respuesta21.getText();
					Resultados4[1]= Respuesta22.getText();
					Resultados4[2]= Respuesta23.getText();
					Resultados4[3]= Respuesta24.getText();
				}
				
				
			}
		});
		btn8.setFont(new Font("Arial", Font.PLAIN, 14));
		// tipo de layout grupal del contenido del frame
		GroupLayout gl_ContenidoPrincipal3 = new GroupLayout(ContenidoPrincipal3);
		gl_ContenidoPrincipal3.setHorizontalGroup(
				// tipo de alineacion adaptable del contenido pa cualquier tipo de pantalla
			gl_ContenidoPrincipal3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ContenidoPrincipal3.createSequentialGroup()
					.addGroup(gl_ContenidoPrincipal3.createParallelGroup(Alignment.LEADING, false)
						.addComponent(Scroll21)
						.addComponent(Enunciado24, GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE))
					.addGap(91)
					.addGroup(gl_ContenidoPrincipal3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_ContenidoPrincipal3.createSequentialGroup()
							.addComponent(Scroll23, GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
							.addContainerGap())
						// tamaño adaptable de los campos y contenidos del frame
                        //  Para cualquier pantalla de laptop o computadora de escritorio
						.addComponent(Enunciado26, GroupLayout.PREFERRED_SIZE, 676, GroupLayout.PREFERRED_SIZE)))
				.addGroup(gl_ContenidoPrincipal3.createSequentialGroup()
					.addGroup(gl_ContenidoPrincipal3.createParallelGroup(Alignment.LEADING, false)
						.addComponent(Scroll22)
						.addComponent(Enunciado25, GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE))
					.addGap(93)
					.addGroup(gl_ContenidoPrincipal3.createParallelGroup(Alignment.LEADING, false)
						.addComponent(Enunciado27, GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
						.addGroup(gl_ContenidoPrincipal3.createSequentialGroup()
							.addGap(51)
							.addComponent(btn7, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
							.addGap(23)
							.addComponent(btn8, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
						.addComponent(Scroll24)))
		);
		gl_ContenidoPrincipal3.setVerticalGroup(
			gl_ContenidoPrincipal3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ContenidoPrincipal3.createSequentialGroup()
					.addGroup(gl_ContenidoPrincipal3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_ContenidoPrincipal3.createSequentialGroup()
							.addGap(2)
							.addComponent(Enunciado24, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(Scroll21, GroupLayout.PREFERRED_SIZE, 339, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_ContenidoPrincipal3.createSequentialGroup()
							.addComponent(Enunciado26, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(Scroll23, GroupLayout.PREFERRED_SIZE, 325, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_ContenidoPrincipal3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_ContenidoPrincipal3.createSequentialGroup()
							.addComponent(Enunciado25, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
							.addGap(16)
							.addComponent(Scroll22, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_ContenidoPrincipal3.createSequentialGroup()
							.addGap(8)
							.addGroup(gl_ContenidoPrincipal3.createParallelGroup(Alignment.LEADING)
								.addComponent(Enunciado27, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_ContenidoPrincipal3.createSequentialGroup()
									.addGap(42)
									.addComponent(Scroll24, GroupLayout.PREFERRED_SIZE, 244, GroupLayout.PREFERRED_SIZE)))
							.addGap(33)
							.addGroup(gl_ContenidoPrincipal3.createParallelGroup(Alignment.LEADING)
								.addComponent(btn7, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_ContenidoPrincipal3.createSequentialGroup()
									.addGap(1)
									.addComponent(btn8, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap())
		);
		ContenidoPrincipal3.setLayout(gl_ContenidoPrincipal3);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(ScrollPrincipal3, GroupLayout.DEFAULT_SIZE, 1431, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(ScrollPrincipal3, GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE)
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
