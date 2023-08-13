package selector;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

public class Aspectosmercado extends JFrame {

	private JPanel contentPane;
	// Declaracion de la variables se puede utilizar en cualquier clase
	public static JTextArea Respuesta17 = new JTextArea();
	public static JTextArea Respuesta18 = new JTextArea();
	public static JTextArea Respuesta19 = new JTextArea();
	public static JTextArea Respuesta20 = new JTextArea();
	public static String[] Resultado3 = new String[4];

	/**
	 * iniciacion de la aplicacion.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aspectosmercado frame = new Aspectosmercado();
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
	public Aspectosmercado() {            /* configuracion general del frame*/
		setTitle("Aspectos de Mercado");
		setExtendedState(JFrame.MAXIMIZED_HORIZ);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 25, 1377, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JScrollPane Scrollprincipal2 = new JScrollPane();
		
		JPanel ContenidoPrincipal2 = new JPanel();
		Scrollprincipal2.setViewportView(ContenidoPrincipal2);
		/*contenido principal del frame,enunciados de cada campo y
        sus respectivo formato para cada campo*/
		JLabel Enunciado20 = new JLabel("<html>Investigar en diferentes fuentes lo siguiente:<p>\r\n3.1.1.\tTamaño del mercado. Cuantificar el segmento de mercado: ¿Cuántos son los posibles clientes? ¿Quiénes son? ¿Dónde están?<p>\r\n3.1.2.\tConsumo aparente. Estimación del consumo del producto o servicio que la empresa ofrece. Una fuente directa para estimar este dato es la encuesta a los posibles clientes (4.2.4).<p>\r\n3.1.3.\tDemanda potencial. Proyección del crecimiento promedio del mercado en el corto y mediano plazo (teniendo en cuenta el consumo aparente).<p>\r\n3.1.4.\tParticipación de la competencia en el mercado.<html>\r\n");
		Enunciado20.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JScrollPane Scroll17 = new JScrollPane();
		// Declaracion del formato de los campos 
		Respuesta17.setWrapStyleWord(true);
		Respuesta17.setLineWrap(true);
		Respuesta17.setFont(new Font("Arial", Font.PLAIN, 12));
		Scroll17.setViewportView(Respuesta17);
		
		JPopupMenu Menu17 = new JPopupMenu();
		Menu17.setFont(new Font("Arial", Font.PLAIN, 14));
		addPopup(Respuesta17, Menu17);
		
		JMenuItem menuopcion49 = new JMenuItem("Cortar"); // opcion de cortar
		/* metodo que permite adquirir la accion del atajo cortar con
        el teclado   */
		menuopcion49.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
		menuopcion49.addActionListener(new ActionListener() { // metodo para cortar
			public void actionPerformed(ActionEvent e) {
				Respuesta17.cut();
			}
		});
		menuopcion49.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu17.add(menuopcion49);
		
		JMenuItem menuopcion50 = new JMenuItem("Copiar");  // opcion de copiar
		/* metodo que permite adquirir la accion del atajo copiar con
        el teclado */
		menuopcion50.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
		menuopcion50.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // metodo para copiar
				Respuesta17.copy();
			}
		});
		menuopcion50.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu17.add(menuopcion50);
		
		JMenuItem menuopcion51 = new JMenuItem("Pegar");  // opcion de pegar
		/* metodo que permite adquirir la accion del atajo pegar con
        el teclado */
		menuopcion51.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
		menuopcion51.addActionListener(new ActionListener() { // metodo para pegar
			public void actionPerformed(ActionEvent e) {
				Respuesta17.paste();
			}
		});
		menuopcion51.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu17.add(menuopcion51);
		
		JLabel Enunciado21 = new JLabel("<html>3.2.1. Población y muestra. Conforme al segmento de mercado definido para la empresa, cuantificar el mercado total; contando con el dato de la población total aplica la fórmula para determinar la muestra para población finita (nivel de confianza: 95%, Margen de error 5%).<html>");
		Enunciado21.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JScrollPane Scroll18 = new JScrollPane();
		
		Respuesta18.setWrapStyleWord(true);
		Respuesta18.setLineWrap(true);
		Respuesta18.setFont(new Font("Arial", Font.PLAIN, 12));
		Scroll18.setViewportView(Respuesta18);
		
		JPopupMenu Menu18 = new JPopupMenu();
		addPopup(Respuesta18, Menu18);
		
		JMenuItem menuopcion52 = new JMenuItem("Cortar");
		menuopcion52.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
		menuopcion52.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta18.cut();
			}
		});
		menuopcion52.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu18.add(menuopcion52);
		
		JMenuItem menuopcion53 = new JMenuItem("Copiar");
		menuopcion53.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
		menuopcion53.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta18.copy();
			}
		});
		menuopcion53.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu18.add(menuopcion53);
		
		JMenuItem menuopcion54 = new JMenuItem("Pegar");
		menuopcion54.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
		menuopcion54.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta18.paste();
			}
		});
		menuopcion54.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu18.add(menuopcion54);
		
		JLabel Enunciado22 = new JLabel("<html>3.2.2.\tEncuesta tipo. La encuesta se diseña conforme a los objetivos planteados (¿qué respuestas espero obtener?)<html>");
		Enunciado22.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JScrollPane Scroll19 = new JScrollPane();
		
		Respuesta19.setWrapStyleWord(true);
		Respuesta19.setFont(new Font("Arial", Font.PLAIN, 12));
		Respuesta19.setLineWrap(true);
		Scroll19.setViewportView(Respuesta19);
		
		JPopupMenu Menu19 = new JPopupMenu();
		addPopup(Respuesta19, Menu19);
		
		JMenuItem menuopcion55 = new JMenuItem("Cortar");
		menuopcion55.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
		menuopcion55.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta19.cut();
			}
		});
		menuopcion55.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu19.add(menuopcion55);
		
		JMenuItem menuopcion56 = new JMenuItem("Copiar");
		menuopcion56.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
		menuopcion56.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta19.copy();
			}
		});
		menuopcion56.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu19.add(menuopcion56);
		
		JMenuItem menuopcion57 = new JMenuItem("Pegar");
		menuopcion57.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
		menuopcion57.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta19.paste();
			}
		});
		menuopcion57.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu19.add(menuopcion57);
		
		JLabel Enunciado23 = new JLabel("<html>3.2.3. Aplicación de la encuesta. Primero planear cuidadosamente la estrategia para obtener las opiniones del segmento de clientes elegido. Luego elegir el medio más adecuado para hacer llegar la encuesta.<p>\r\n3.2.4.\tResultados y conclusiones. Presentar el análisis y la síntesis de la información conforme a las preguntas de investigación. <html>\r\n");
		Enunciado23.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JScrollPane Scroll20 = new JScrollPane();
		
		Respuesta20.setWrapStyleWord(true);
		Respuesta20.setLineWrap(true);
		Respuesta20.setFont(new Font("Arial", Font.PLAIN, 12));
		Scroll20.setViewportView(Respuesta20);
		
		JPopupMenu Menu20 = new JPopupMenu();
		addPopup(Respuesta20, Menu20);
		
		JMenuItem menuopcion58 = new JMenuItem("Cortar");
		menuopcion58.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
		menuopcion58.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta20.cut();
			}
		});
		menuopcion58.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu20.add(menuopcion58);
		
		JMenuItem menuopcion59 = new JMenuItem("Copiar");
		menuopcion59.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
		menuopcion59.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta20.copy();
			}
		});
		menuopcion59.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu20.add(menuopcion59);
		
		JMenuItem menuopcion60 = new JMenuItem("Pegar");
		menuopcion60.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
		menuopcion60.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta20.paste();
			}
		});
		menuopcion60.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu20.add(menuopcion60);
		
		JButton btn6 = new JButton("Siguente\r\n"); // declaracion del boton siguente
		btn6.addActionListener(new ActionListener() { // evento del boton siguiente 
			public void actionPerformed(ActionEvent e) {
				// condicional por si algun campo se encuentra vacio no se pueda avanzar al siguente frame
				if (Respuesta17.getText().isEmpty() || Respuesta18.getText().isEmpty() 
						|| Respuesta19.getText().isEmpty() || Respuesta20.getText().isEmpty()) {
					// mensaje por si aun campo se encuentra vacio
					JOptionPane.showMessageDialog(null, "LLenar los campos vacios");
					
				} 
				 // condicional cuando hay por lo menos un caracter en todos los campos
				else {
					Aspectosoperativos ventana7 = new Aspectosoperativos(); // avanzar al siguiente frame
					ventana7.setVisible(true);
					// cierra el frame anterior y deja abierto el actual
					dispose();
					
					JOptionPane.showMessageDialog(null, "CONSIDERACIONES: \n \n 1 en caso de no llevar informacion en algun campo generar un espacio en"
							+ "blanco para poder continuar a la siguente seccion \n 2 todos los campos los campos tinen que estar llenados para poder generar el pdf correctamente "
							+ "\n 3 para cada parrafo que lleve punto y aparte generar 2 saltos en lina en blanco con la tecla enter (2 veces)");
					
					// arreglo que guarda los datos de cada campo 
					Resultado3[0]=Respuesta17.getText();
					Resultado3[1]=Respuesta18.getText();
					Resultado3[2]=Respuesta19.getText();
					Resultado3[3]=Respuesta20.getText();
					//System.out.println(Resultado3[0]);
				}
				
				
			}
		});
		btn6.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JButton bn5 = new JButton("Atras"); // declaracion del boton atras
		bn5.addActionListener(new ActionListener() {  // evento del boton atras
			public void actionPerformed(ActionEvent e) {
				Generalidadesnegocios ventana5 = new Generalidadesnegocios(); // retroceder  al anterior frame
				ventana5.setVisible(true);
				// cierra el frame anterior y deja abierto el actual
				dispose();
			}
		});
		bn5.setFont(new Font("Arial", Font.PLAIN, 14));
		 // tipo de layout grupal del contenido del frame
		GroupLayout gl_ContenidoPrincipal2 = new GroupLayout(ContenidoPrincipal2);
		gl_ContenidoPrincipal2.setHorizontalGroup(
				// tipo de alineacion adaptable del contenido pa cualquier tipo de pantalla
			gl_ContenidoPrincipal2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ContenidoPrincipal2.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_ContenidoPrincipal2.createParallelGroup(Alignment.LEADING)
							// tamaño adaptable de los campos y contenidos del frame
                            //  Para cualquier pantalla de laptop o computadora de escritorio
						.addComponent(Enunciado21, GroupLayout.PREFERRED_SIZE, 515, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_ContenidoPrincipal2.createParallelGroup(Alignment.TRAILING, false)
							.addGroup(Alignment.LEADING, gl_ContenidoPrincipal2.createSequentialGroup()
								.addGap(10)
								.addComponent(Scroll17))
							.addComponent(Enunciado20, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 481, GroupLayout.PREFERRED_SIZE))
						.addComponent(Scroll18, GroupLayout.PREFERRED_SIZE, 493, GroupLayout.PREFERRED_SIZE))
					.addGap(23)
					.addGroup(gl_ContenidoPrincipal2.createParallelGroup(Alignment.LEADING, false)
						.addComponent(Enunciado22, GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
						.addComponent(Enunciado23, GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
						.addGroup(gl_ContenidoPrincipal2.createSequentialGroup()
							.addGap(287)
							.addComponent(bn5, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(btn6, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
						.addComponent(Scroll19)
						.addGroup(gl_ContenidoPrincipal2.createSequentialGroup()
							.addGap(10)
							.addComponent(Scroll20))))
		);
		gl_ContenidoPrincipal2.setVerticalGroup(
			gl_ContenidoPrincipal2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ContenidoPrincipal2.createSequentialGroup()
					.addGroup(gl_ContenidoPrincipal2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_ContenidoPrincipal2.createSequentialGroup()
							.addGap(11)
							.addComponent(Enunciado20)
							.addGap(11)
							.addComponent(Scroll17, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(Enunciado21)
							.addGap(11)
							.addComponent(Scroll18, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_ContenidoPrincipal2.createSequentialGroup()
							.addGap(14)
							.addComponent(Enunciado22, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(Scroll19, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(Enunciado23)
							.addGap(11)
							.addComponent(Scroll20, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
							.addGap(23)
							.addGroup(gl_ContenidoPrincipal2.createParallelGroup(Alignment.LEADING)
								.addComponent(bn5, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
								.addComponent(btn6, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))))
					.addGap(26))
		);
		ContenidoPrincipal2.setLayout(gl_ContenidoPrincipal2);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addComponent(Scrollprincipal2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1351, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(Scrollprincipal2, GroupLayout.DEFAULT_SIZE, 739, Short.MAX_VALUE)
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
