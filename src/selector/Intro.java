package selector;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Intro extends JFrame {
	// Declaracion de la variables se puede utilizar en cualquier clase 
	private JPanel contentPane;
	public static String Resultado9 = null;
	public static JTextArea Respuesta38 = new JTextArea();

	/**
	 * iniciacion de la aplicacion.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Intro frame = new Intro();
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
	public Intro() {                                     /* configuracion general del frame*/
		setTitle("Introduccion");
		setExtendedState(JFrame.MAXIMIZED_HORIZ);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 50, 1377, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JScrollPane ScrollPrincipal11 = new JScrollPane();
		
		JPanel ContenidoPrincipal11 = new JPanel();
		ScrollPrincipal11.setViewportView(ContenidoPrincipal11);
		
		JLabel Enunciado43 = new JLabel("Introduccion");             /*contenido principal del frame,enunciados de cada campo y
                                                                      sus respectivo formato para cada campo*/
		Enunciado43.setFont(new Font("Arial", Font.PLAIN, 16));
		
		JScrollPane Scroll30 = new JScrollPane();
		
		Respuesta38.setLineWrap(true);
		Respuesta38.setWrapStyleWord(true);
		Respuesta38.setFont(new Font("Arial", Font.PLAIN, 12));
		Scroll30.setViewportView(Respuesta38);
		
		JPopupMenu Menu38 = new JPopupMenu();    // Declaracion de menu al momento de pulsar click derecho con el mouse
		addPopup(Respuesta38, Menu38);
		
		JMenuItem menuopcion112 = new JMenuItem("Cortar");     // opcion de cortar
		menuopcion112.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {        // metodo para cortar
				Respuesta38.cut();
			}
		});
		menuopcion112.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));  /* metodo que permite adqui
                                                                                                         rir la accion del atajo cortar con
                                                                                                          el teclado   */
		menuopcion112.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu38.add(menuopcion112);
		
		JMenuItem menuopcion113 = new JMenuItem("Copiar");// opcion de copiar
		menuopcion113.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {           // metodo para copiar
				Respuesta38.copy();
			}
		});
		menuopcion113.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));   /* metodo que permite adqui
                                                                                                          rir la accion del atajo copiar con
                                                                                                          el teclado */
		menuopcion113.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu38.add(menuopcion113);
		
		JMenuItem menuopcion114 = new JMenuItem("Pegar");   // opcion de pegar
		menuopcion114.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {  // metodo para pegar
				Respuesta38.paste();
			}
		});
		menuopcion114.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));    /* metodo que permite adqui
                                                                                                             rir la accion del atajo pegar con
                                                                                                               el teclado */
		menuopcion114.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu38.add(menuopcion114);
		
		JButton btn23 = new JButton("Atras");              // declaracion del boton atras
		btn23.addActionListener(new ActionListener() {    // evento del boton atras
			public void actionPerformed(ActionEvent e) {
				
				DatosdePortada ventana2 = new DatosdePortada();   // retroceder  al anterior frame
				ventana2.setVisible(true);
				// cierra el frame anterior y deja abierto el actual
				dispose();
			}
		});
		btn23.setFont(new Font("Arial", Font.PLAIN, 13));
		
		JButton btn24 = new JButton("Siguiente");  // declaracion del boton siguente
		btn24.addActionListener(new ActionListener() {  // evento del boton siguiente 
			public void actionPerformed(ActionEvent e) {
				// condicional por si algun campo se encuentra vacio no se pueda avanzar al siguente frame
				if (Respuesta38.getText().isEmpty()) {
					// mensaje por si aun campo se encuentra vacio
					JOptionPane.showMessageDialog(null, "Llenar los campos vacios");
				}
				// condicional cuando hay por lo menos un caracter en todos los campos  
				else {
					// variable que guarda el dato del campo 
					Resultado9 = Respuesta38.getText();
					
					Modelonegocios ventana4 = new Modelonegocios(); // avanzar al siguiente frame
					ventana4.setVisible(true);
					// cierra el frame anterio y deja abierto el actual
					dispose();
					
					JOptionPane.showMessageDialog(null, "CONSIDERACIONES: \n \n 1 en caso de no llevar informacion en algun campo generar un espacio en"
							+ "blanco para poder continuar a la siguente seccion \n 2 todos los campos los campos tinen que estar llenados para poder generar el pdf correctamente "
							+ "\n 3 para cada parrafo que lleve punto y aparte generar 2 saltos en lina en blanco con la tecla enter (2 veces)");
				}
				
				
			}
		});
		btn24.setFont(new Font("Arial", Font.PLAIN, 14));  // Estilo de texto del boton  
		// tipo de layout grupal del COntenido del frame 
		GroupLayout gl_ContenidoPrincipal11 = new GroupLayout(ContenidoPrincipal11);
		gl_ContenidoPrincipal11.setHorizontalGroup(
			gl_ContenidoPrincipal11.createParallelGroup(Alignment.LEADING)  // tipo de alineacion adaptable del contenido pa cualquier tipo de pantalla
				.addGroup(gl_ContenidoPrincipal11.createSequentialGroup()
					.addGroup(gl_ContenidoPrincipal11.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_ContenidoPrincipal11.createSequentialGroup()
							.addGap(10)
							// tamaño adaptable de los campos y contenidos del frame
                            //  Para cualquier pantalla de laptop o computadora de escritorio 
							.addComponent(Enunciado43, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_ContenidoPrincipal11.createSequentialGroup()
							.addContainerGap()
							.addComponent(Scroll30, GroupLayout.PREFERRED_SIZE, 1301, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
				.addGroup(Alignment.TRAILING, gl_ContenidoPrincipal11.createSequentialGroup()
					.addContainerGap(1046, Short.MAX_VALUE)
					.addComponent(btn23, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btn24, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
					.addGap(91))
		);
		gl_ContenidoPrincipal11.setVerticalGroup(
			gl_ContenidoPrincipal11.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ContenidoPrincipal11.createSequentialGroup()
					.addGap(11)
					.addComponent(Enunciado43, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(Scroll30, GroupLayout.PREFERRED_SIZE, 559, GroupLayout.PREFERRED_SIZE)
					.addGap(27)
					.addGroup(gl_ContenidoPrincipal11.createParallelGroup(Alignment.BASELINE)
						.addComponent(btn24, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(btn23, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(34))
		);
		ContenidoPrincipal11.setLayout(gl_ContenidoPrincipal11);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(ScrollPrincipal11)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(ScrollPrincipal11, GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
					.addGap(1))
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
