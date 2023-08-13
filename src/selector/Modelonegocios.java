package selector;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;


public class Modelonegocios extends JFrame {
	// Declaracion de la variables se puede utilizar en cualquier clase
	private JPanel contentPane;
	private JMenuItem menuopcion1;
	public static JTextArea Respuesta1 = new JTextArea();
	public static JTextArea Respuesta2 = new JTextArea();
	public static JTextArea Respuesta3 = new JTextArea();
	public static JTextArea Respuesta4 = new JTextArea();
	public static JTextArea Respuesta5 = new JTextArea();
	public static JTextArea Respuesta6 = new JTextArea();
	public static JTextArea Respuesta7 = new JTextArea();
	public static JTextArea Respuesta8 = new JTextArea();
	public static JTextArea Respuesta9 = new JTextArea();
	public static JTextArea Respuesta10 = new JTextArea();
	public static JTextArea Respuesta11 = new JTextArea();
	public static String[] Resultados1 = new String[11];
	/**
	 * iniciacion de la aplicacion.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Modelonegocios frame = new Modelonegocios();
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
	public Modelonegocios() {                           /* configuracion general del frame*/
		setTitle("Modelo de negocio");
		setExtendedState(JFrame.MAXIMIZED_HORIZ);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 50, 1377, 800);
		contentPane = new JPanel();
		contentPane.setBorder(null);

		setContentPane(contentPane);
		
		JScrollPane Scrollprincipal1 = new JScrollPane(); // Declaraciopn del status dla barra de scroll 
		Scrollprincipal1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		Scrollprincipal1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		Scrollprincipal1.setViewportBorder(null);
		// tipo de layout grupal del COntenido del frame 
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		
		// tipo de alineacion adaptable del contenido pa cualquier tipo de pantalla de computadora 
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(Scrollprincipal1, GroupLayout.DEFAULT_SIZE, 1101, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addComponent(Scrollprincipal1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
		);
		
		JPanel Contenidoprincipal1 = new JPanel();
		//panel.setPreferredSize(new Dimension(10000,10000));
		Scrollprincipal1.setViewportView(Contenidoprincipal1);
		JLabel Enunciado1 = new JLabel("<html>1- Escribe detalladamente en un documento los nueve apartados del modelo de negocios de tu proyecto fundamentando cada apartado con información obtenida de diferentes fuentes (mínimo 3), ya sea información cualitativa o cuantitativa obtenida de fuentes primarias, secundarias o terciarias, respecto a tu idea de negocio.<html>");
		Enunciado1.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JLabel Enunciado2 = new JLabel("Respuesta:");
		Enunciado2.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JScrollPane Scroll1 = new JScrollPane();
		 /*contenido principal del frame,enunciados de cada campo y
        sus respectivo formato para cada campo*/
		JLabel Enunciado3 = new JLabel("<html>2.- Posteriormente sintetiza la información obtenida anteriormente realizando el lienzo de los 9 bloques del BMC.<html>");
		Enunciado3.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JLabel Enunciado4 = new JLabel("Socios Clave:");
		Enunciado4.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JScrollPane Scroll2 = new JScrollPane();
		
		JLabel Enunciado5 = new JLabel("Actividades Clave:");
		Enunciado5.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JScrollPane Scroll3 = new JScrollPane();
		
		JLabel lblNewLabel = new JLabel("Recusos Clave:");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		
		JScrollPane Scroll4 = new JScrollPane();
		
		JLabel Enunciado6 = new JLabel("Propuesta de Valor:");
		Enunciado6.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JScrollPane Scroll5 = new JScrollPane();
		
		JLabel Enunciado7 = new JLabel("Relacion con los clientes:");
		Enunciado7.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JScrollPane Scroll6 = new JScrollPane();
		
		JLabel Enunciado8 = new JLabel("Canales:");
		Enunciado8.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JScrollPane Scroll7 = new JScrollPane();
		
		JLabel Enunciado9 = new JLabel("Segmento del mercado:");
		Enunciado9.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JScrollPane Scroll8 = new JScrollPane();
		
		JLabel Enunciado10 = new JLabel("Estructura de costes:");
		Enunciado10.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JScrollPane Scroll9 = new JScrollPane();
		
		JLabel Enunciado11 = new JLabel("Fuentes de ingresos:");
		Enunciado11.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JScrollPane Scroll10 = new JScrollPane();
		
		JLabel Enunciado12 = new JLabel("<html>3.-Para finalizar el punto 1, explica en<p> máximo una cuartilla ¿Cuál es el modelo<p> de negocio de tu negocio? Tu descripción<p> debe abarcar los 9 apartados del modelo BMC, enfatizando como obtendrá ingresos suficientes y escalables para permanecer y crecer en el tiempo previsto. Mencionar tanto información cualitativa como cuantitativa.<html>");
		Enunciado12.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JLabel Enunciado13 = new JLabel("Respuesta:");
		Enunciado13.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JScrollPane Scroll11 = new JScrollPane();
		
		JButton btn1 = new JButton("Atras"); // declaracion del boton atras
		btn1.addActionListener(new ActionListener() {  // evento del boton atras
			public void actionPerformed(ActionEvent e) { // retroceder  al anterior frame
				Intro ventana3 = new Intro();
				ventana3.setVisible(true);
				// cierra el frame anterior y deja abierto el actual
				setVisible(false);
			}
			
		});
		btn1.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JButton btn2 = new JButton("Siguiente"); // declaracion del boton siguente
		btn2.addActionListener(new ActionListener() {  // evento del boton siguiente 
			public void actionPerformed(ActionEvent e) {
				// condicional por si algun campo se encuentra vacio no se pueda avanzar al siguente frame
				if (Respuesta1.getText().isEmpty() || Respuesta2.getText().isEmpty()
						|| Respuesta3.getText().isEmpty() || Respuesta4.getText().isEmpty()
						 || Respuesta5.getText().isEmpty() || Respuesta6.getText().isEmpty()
						 || Respuesta7.getText().isEmpty() || Respuesta8.getText().isEmpty()
						 || Respuesta9.getText().isEmpty() || Respuesta10.getText().isEmpty()
						 || Respuesta11.getText().isEmpty()) {
					// mensaje por si aun campo se encuentra vacio
					JOptionPane.showMessageDialog(null, "Llenar los campos vacios");
				}
				// condicional cuando hay por lo menos un caracter en todos los campos 
				else {
               
					Generalidadesnegocios ventana5 = new Generalidadesnegocios(); // avanzar al siguiente frame
					ventana5.setVisible(true);
					// cierra el frame anterio y deja abierto el actual
					setVisible(false);
					
					JOptionPane.showMessageDialog(null, "CONSIDERACIONES: \n \n 1 en caso de no llevar informacion en algun campo generar un espacio en"
							+ "blanco para poder continuar a la siguente seccion \n 2 todos los campos los campos tinen que estar llenados para poder generar el pdf correctamente "
							+ "\n 3 para cada parrafo que lleve punto y aparte generar 2 saltos en lina en blanco con la tecla enter (2 veces) \n"
							+ "4 insertar la imagen es obigatorio para generar el pdf corretamente");
					
					// arreglo que guarda los datos de cada campo 
					Resultados1[0] = Respuesta1.getText();
					Resultados1[1] = Respuesta2.getText();
					Resultados1[2] = Respuesta3.getText();
					Resultados1[3] = Respuesta4.getText();
					Resultados1[4] = Respuesta5.getText();
					Resultados1[5] = Respuesta6.getText();
					Resultados1[6] = Respuesta7.getText();
					Resultados1[7] = Respuesta8.getText();
					Resultados1[8] = Respuesta9.getText();
					Resultados1[9] = Respuesta10.getText();
					Resultados1[10] = Respuesta11.getText();
			//		System.out.print(Resultados1[0]);
				}
				
				
			}
		});
		btn2.setFont(new Font("Arial", Font.PLAIN, 14));
		// tipo de layout grupal del COntenido del frame 
		GroupLayout gl_Contenidoprincipal1 = new GroupLayout(Contenidoprincipal1);
		gl_Contenidoprincipal1.setHorizontalGroup(
			gl_Contenidoprincipal1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_Contenidoprincipal1.createSequentialGroup()
					.addContainerGap()
					// tipo de alineacion adaptable del contenido pa cualquier tipo de pantalla
					.addGroup(gl_Contenidoprincipal1.createParallelGroup(Alignment.LEADING)
						.addComponent(Scroll4, 0, 0, Short.MAX_VALUE)
						.addGroup(gl_Contenidoprincipal1.createParallelGroup(Alignment.LEADING, false)
								// tamaño adaptable de los campos y contenidos del frame
	                            //  Para cualquier pantalla de laptop o computadora de escritorio 
							.addComponent(Enunciado2, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
							.addComponent(Enunciado1, GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
							.addComponent(Enunciado4, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
							.addComponent(Enunciado5)
							.addComponent(lblNewLabel)
							.addComponent(Enunciado3, 0, 0, Short.MAX_VALUE)
							.addComponent(Scroll1, GroupLayout.PREFERRED_SIZE, 537, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_Contenidoprincipal1.createSequentialGroup()
								.addComponent(Scroll2, GroupLayout.PREFERRED_SIZE, 518, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)))
						.addGroup(gl_Contenidoprincipal1.createSequentialGroup()
							.addComponent(Scroll3, GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
							.addGap(18)))
					.addGroup(gl_Contenidoprincipal1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Contenidoprincipal1.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_Contenidoprincipal1.createParallelGroup(Alignment.LEADING, false)
								.addComponent(Scroll5, GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
								.addComponent(Enunciado6)
								.addComponent(Enunciado7, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
								.addComponent(Enunciado8, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Contenidoprincipal1.createSequentialGroup()
									.addComponent(Scroll6)
									.addPreferredGap(ComponentPlacement.RELATED))))
						.addGroup(gl_Contenidoprincipal1.createSequentialGroup()
							.addGap(28)
							.addGroup(gl_Contenidoprincipal1.createParallelGroup(Alignment.LEADING, false)
								.addComponent(Scroll7, GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
								.addComponent(Enunciado9)))
						.addGroup(gl_Contenidoprincipal1.createSequentialGroup()
							.addGap(38)
							.addComponent(Scroll8, GroupLayout.PREFERRED_SIZE, 409, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Contenidoprincipal1.createSequentialGroup()
							.addGap(174)
							.addComponent(btn1)
							.addGap(28)
							.addComponent(btn2)))
					.addGroup(gl_Contenidoprincipal1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Contenidoprincipal1.createSequentialGroup()
							.addGap(15)
							.addGroup(gl_Contenidoprincipal1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Contenidoprincipal1.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_Contenidoprincipal1.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_Contenidoprincipal1.createSequentialGroup()
											.addGap(66)
											.addComponent(Enunciado10))
										.addGroup(gl_Contenidoprincipal1.createSequentialGroup()
											.addGap(50)
											.addGroup(gl_Contenidoprincipal1.createParallelGroup(Alignment.LEADING)
												.addComponent(Scroll10, GroupLayout.PREFERRED_SIZE, 241, GroupLayout.PREFERRED_SIZE)
												.addComponent(Enunciado11)
												.addComponent(Scroll9, GroupLayout.PREFERRED_SIZE, 244, GroupLayout.PREFERRED_SIZE)))))
								.addGroup(gl_Contenidoprincipal1.createSequentialGroup()
									.addGap(27)
									.addGroup(gl_Contenidoprincipal1.createParallelGroup(Alignment.LEADING)
										.addComponent(Scroll11, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE)
										.addComponent(Enunciado12, GroupLayout.PREFERRED_SIZE, 294, GroupLayout.PREFERRED_SIZE)))))
						.addGroup(gl_Contenidoprincipal1.createSequentialGroup()
							.addGap(52)
							.addComponent(Enunciado13)))
					.addGap(3062))
		);
		gl_Contenidoprincipal1.setVerticalGroup(
			gl_Contenidoprincipal1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Contenidoprincipal1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_Contenidoprincipal1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Contenidoprincipal1.createSequentialGroup()
							.addGap(389)
							.addComponent(Scroll8, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_Contenidoprincipal1.createSequentialGroup()
							.addGroup(gl_Contenidoprincipal1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Contenidoprincipal1.createSequentialGroup()
									.addComponent(Enunciado1, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(Enunciado2)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(Scroll1, GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(Enunciado3))
								.addGroup(gl_Contenidoprincipal1.createSequentialGroup()
									.addGap(25)
									.addGroup(gl_Contenidoprincipal1.createParallelGroup(Alignment.BASELINE)
										.addComponent(Enunciado6)
										.addComponent(Enunciado10))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_Contenidoprincipal1.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_Contenidoprincipal1.createSequentialGroup()
											.addComponent(Scroll5, GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(Enunciado7, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_Contenidoprincipal1.createSequentialGroup()
											.addComponent(Scroll9, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
											.addGap(26)
											.addComponent(Enunciado11)))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_Contenidoprincipal1.createParallelGroup(Alignment.LEADING)
										.addComponent(Scroll6, GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
										.addComponent(Scroll10, GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))))
							.addGroup(gl_Contenidoprincipal1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Contenidoprincipal1.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(Enunciado4)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(Scroll2, GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(Enunciado5)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(Scroll3, GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(Scroll4, GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
									.addGap(131))
								.addGroup(gl_Contenidoprincipal1.createSequentialGroup()
									.addGap(25)
									.addComponent(Enunciado8)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_Contenidoprincipal1.createParallelGroup(Alignment.BASELINE)
										.addGroup(gl_Contenidoprincipal1.createSequentialGroup()
											.addComponent(Scroll7, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
											.addGap(16)
											.addComponent(Enunciado9))
										.addComponent(Enunciado12))
									.addGroup(gl_Contenidoprincipal1.createParallelGroup(Alignment.TRAILING)
										.addGroup(Alignment.LEADING, gl_Contenidoprincipal1.createSequentialGroup()
											.addGap(18)
											.addComponent(Enunciado13)
											.addGap(18)
											.addComponent(Scroll11, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
											.addContainerGap())
										.addGroup(gl_Contenidoprincipal1.createSequentialGroup()
											.addGap(204)
											.addGroup(gl_Contenidoprincipal1.createParallelGroup(Alignment.BASELINE)
												.addComponent(btn1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(btn2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
											.addGap(142))))))))
		);
		
		Respuesta11.setWrapStyleWord(true);  /*Declaracion de los caampos con surespectivo formato y configuracion  */
		Respuesta11.setLineWrap(true);
		Respuesta11.setFont(new Font("Arial", Font.PLAIN, 12));
		Scroll11.setViewportView(Respuesta11);
		
		JPopupMenu Menu11 = new JPopupMenu();  // Declaracion de menu al momento de pulsar click derecho con el mouse
		Menu11.setFont(new Font("Arial", Font.PLAIN, 14));
		addPopup(Respuesta11, Menu11);
		
		JMenuItem menuopcion31 = new JMenuItem("Cortar");  // opcion de cortar
		/* metodo que permite adquirir la accion del atajo cortar con
         el teclado   */
		menuopcion31.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));   
		menuopcion31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // metodo para cortar
				Respuesta11.cut();
			}
		});
		menuopcion31.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu11.add(menuopcion31);
		
		JMenuItem menuopcion32 = new JMenuItem("Copiar"); // opcion de copiar
		 /* metodo que permite adquirir la accion del atajo copiar con
        el teclado */
		menuopcion32.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
		menuopcion32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // metodo para copiar
				Respuesta11.copy();
			}
		});
		menuopcion32.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu11.add(menuopcion32);
		
		JMenuItem menuopcion33 = new JMenuItem("Pegar"); // opcion de pegar
		 /* metodo que permite adquirir la accion del atajo pegar con
          el teclado */
		menuopcion33.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
		menuopcion33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // metodo para pegar
				Respuesta11.paste();
			}
		});
		menuopcion33.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu11.add(menuopcion33);
		
		Respuesta10.setWrapStyleWord(true);  /*Declaracion de los caampos con su respectivo formato y configuracion  */
		Respuesta10.setLineWrap(true);
		Respuesta10.setFont(new Font("Arial", Font.PLAIN, 14));
		Scroll10.setViewportView(Respuesta10);
		
		JPopupMenu Menu10 = new JPopupMenu();
		Menu10.setFont(new Font("Arial", Font.PLAIN, 14));
		addPopup(Respuesta10, Menu10);
		
		JMenuItem menuopcion28 = new JMenuItem("Cortar");
		menuopcion28.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
		menuopcion28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta10.cut();
			}
		});
		menuopcion28.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu10.add(menuopcion28);
		
		JMenuItem menuopcion29 = new JMenuItem("Copiar");
		menuopcion29.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
		menuopcion29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta10.copy();
			}
		});
		menuopcion29.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu10.add(menuopcion29);
		
		JMenuItem menuopcion30 = new JMenuItem("Pegar");
		menuopcion30.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
		menuopcion30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta10.paste();
			}
		});
		menuopcion30.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu10.add(menuopcion30);
		
		Respuesta9.setWrapStyleWord(true);
		Respuesta9.setLineWrap(true);
		Respuesta9.setFont(new Font("Arial", Font.PLAIN, 12));
		Scroll9.setViewportView(Respuesta9);
		
		JPopupMenu Menu9 = new JPopupMenu();
		Menu9.setFont(new Font("Arial", Font.PLAIN, 14));
		addPopup(Respuesta9, Menu9);
		
		JMenuItem menuopcion25 = new JMenuItem("Cortar");
		menuopcion25.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
		menuopcion25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta9.cut();
			}
		});
		menuopcion25.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu9.add(menuopcion25);
		
		JMenuItem menuopcion26 = new JMenuItem("Copiar");
		menuopcion26.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
		menuopcion26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta9.copy();
			}
		});
		menuopcion26.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu9.add(menuopcion26);
		
		JMenuItem menuopcion27 = new JMenuItem("Pegar");
		menuopcion27.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
		menuopcion27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta9.paste();
			}
			
		});
		menuopcion27.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu9.add(menuopcion27);
		
		Respuesta8.setWrapStyleWord(true);
		Respuesta8.setLineWrap(true);
		Respuesta8.setFont(new Font("Arial", Font.PLAIN, 12));
		Scroll8.setViewportView(Respuesta8);
		
		JPopupMenu Menu8 = new JPopupMenu();
		Menu8.setFont(new Font("Arial", Font.PLAIN, 14));
		addPopup(Respuesta8, Menu8);
		
		JMenuItem menuopcion22 = new JMenuItem("Cortar");
		menuopcion22.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
		menuopcion22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta8.cut();
			}
		});
		menuopcion22.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu8.add(menuopcion22);
		
		JMenuItem menuopcion23 = new JMenuItem("Copiar");
		menuopcion23.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
		menuopcion23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta8.copy();
			}
		});
		menuopcion23.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu8.add(menuopcion23);
		
		JMenuItem menuopcion24 = new JMenuItem("Pegar");
		menuopcion24.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
		menuopcion24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta8.paste();
			}
		});
		menuopcion24.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu8.add(menuopcion24);
		
		Respuesta7.setWrapStyleWord(true);
		Respuesta7.setLineWrap(true);
		Respuesta7.setFont(new Font("Arial", Font.PLAIN, 12));
		Scroll7.setViewportView(Respuesta7);
		
		JPopupMenu Menu7 = new JPopupMenu();
		Menu7.setFont(new Font("Arial", Font.PLAIN, 14));
		addPopup(Respuesta7, Menu7);
		
		JMenuItem menuopcion19 = new JMenuItem("Cortar");
		menuopcion19.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
		menuopcion19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta7.cut();
			}
		});
		menuopcion19.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu7.add(menuopcion19);
		
		JMenuItem menuopcion20 = new JMenuItem("Copiar");
		menuopcion20.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
		menuopcion20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta7.copy();
			}
		});
		menuopcion20.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu7.add(menuopcion20);
		
		JMenuItem menuopcion21 = new JMenuItem("Pegar");
		menuopcion21.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
		menuopcion21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta7.paste();
			}
		});
		menuopcion21.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu7.add(menuopcion21);
		
		Respuesta6.setWrapStyleWord(true);
		Respuesta6.setLineWrap(true);
		Respuesta6.setFont(new Font("Arial", Font.PLAIN, 12));
		Scroll6.setViewportView(Respuesta6);
		
		JPopupMenu Menu6 = new JPopupMenu();
		Menu6.setFont(new Font("Arial", Font.PLAIN, 14));
		addPopup(Respuesta6, Menu6);
		
		JMenuItem menuopcion16 = new JMenuItem("Cortar");
		menuopcion16.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
		menuopcion16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta6.cut();
			}
		});
		menuopcion16.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu6.add(menuopcion16);
		
		JMenuItem menuopcion17 = new JMenuItem("Copiar");
		menuopcion17.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
		menuopcion17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta6.copy();
			}
		});
		menuopcion17.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu6.add(menuopcion17);
		
		JMenuItem menuopcion18 = new JMenuItem("Pegar");
		menuopcion18.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
		menuopcion18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta6.paste();
			}
		});
		menuopcion18.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu6.add(menuopcion18);
		
		Respuesta5.setFont(new Font("Arial", Font.PLAIN, 12));
		Respuesta5.setWrapStyleWord(true);
		Respuesta5.setLineWrap(true);
		Scroll5.setViewportView(Respuesta5);
		
		JPopupMenu Menu5 = new JPopupMenu();
		Menu5.setFont(new Font("Arial", Font.PLAIN, 14));
		addPopup(Respuesta5, Menu5);
		
		JMenuItem menuopcion13 = new JMenuItem("Cortar");
		menuopcion13.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
		menuopcion13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta5.cut();
				
			
			}
		});
		menuopcion13.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu5.add(menuopcion13);
	
		JMenuItem menuopcion14 = new JMenuItem("Copiar");
		menuopcion14.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
		menuopcion14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta5.copy();
			}
		});
		menuopcion14.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu5.add(menuopcion14);
		
		JMenuItem menuopcion15 = new JMenuItem("Pegar");
		menuopcion15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta5.paste();
			}
		});
		menuopcion15.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
		menuopcion15.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu5.add(menuopcion15);
		
		Scroll4.setViewportView(Respuesta4);
		Respuesta4.setToolTipText("");
		Respuesta4.setFont(new Font("Arial", Font.PLAIN, 12));
		Respuesta4.setWrapStyleWord(true);
		Respuesta4.setLineWrap(true);
		
		JPopupMenu Menu4 = new JPopupMenu();
		Menu4.setFont(new Font("Arial", Font.PLAIN, 14));
		addPopup(Respuesta4, Menu4);
		
		JMenuItem menuopcion10 = new JMenuItem("Cortar");
		menuopcion10.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
		menuopcion10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta4.cut();
			}
		});
		menuopcion10.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu4.add(menuopcion10);
		
		JMenuItem menuopcion11 = new JMenuItem("Copiar");
		menuopcion11.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
		menuopcion11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta4.copy();
			}
		});
		menuopcion11.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu4.add(menuopcion11);
		
		JMenuItem menuopcion12 = new JMenuItem("Pegar");
		menuopcion12.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
		menuopcion12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta4.paste();
			}
		});
		menuopcion12.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu4.add(menuopcion12);
		
		Respuesta3.setFont(new Font("Arial", Font.PLAIN, 12));
		Respuesta3.setWrapStyleWord(true);
		Respuesta3.setLineWrap(true);
		Scroll3.setViewportView(Respuesta3);
		
		JPopupMenu Menu3 = new JPopupMenu();
		addPopup(Respuesta3, Menu3);
		
		JMenuItem menuopcion7 = new JMenuItem("Cortar");
		menuopcion7.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
		menuopcion7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta3.cut();
			}
		});
		menuopcion7.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu3.add(menuopcion7);
		
		JMenuItem menuopcion8 = new JMenuItem("Copiar");
		menuopcion8.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
		menuopcion8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta3.copy();
			}
			
		});
		menuopcion8.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu3.add(menuopcion8);
		
		JMenuItem menuopcion9 = new JMenuItem("Pegar");
		menuopcion9.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
		menuopcion9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta3.paste();
			}
		});
		menuopcion9.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu3.add(menuopcion9);
		
		Respuesta2.setFont(new Font("Arial", Font.PLAIN, 14));
		Respuesta2.setWrapStyleWord(true);
		Respuesta2.setLineWrap(true);
		Scroll2.setViewportView(Respuesta2);
		
		JPopupMenu Menu2 = new JPopupMenu();
		Menu2.setFont(new Font("Arial", Font.PLAIN, 14));
		addPopup(Respuesta2, Menu2);
		
		JMenuItem menuopcion4 = new JMenuItem("Cortar");
		menuopcion4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
		menuopcion4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta2.cut();
			}
		});
		menuopcion4.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu2.add(menuopcion4);
		
		JMenuItem menuopcion5 = new JMenuItem("Copiar");
		menuopcion5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
		menuopcion5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta2.copy();
			}
		});
		menuopcion5.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu2.add(menuopcion5);
		
		JMenuItem menuopcion6 = new JMenuItem("Pegar");
		menuopcion6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta2.paste();
			}
		});
		menuopcion6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
		menuopcion6.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu2.add(menuopcion6);
		Respuesta1.setLineWrap(true);
		Respuesta1.setWrapStyleWord(true);
		
		Scroll1.setViewportView(Respuesta1);
		Respuesta1.setFont(new Font("Arial", Font.PLAIN, 12));
		
		JPopupMenu Menu1 = new JPopupMenu();
		Menu1.setFont(new Font("Arial", Font.PLAIN, 14));
		addPopup(Respuesta1, Menu1);
		
		menuopcion1 = new JMenuItem("Cortar");
		menuopcion1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
		menuopcion1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta1.cut();
			}
		});
		menuopcion1.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu1.add(menuopcion1);
		
		JMenuItem menuopcion2 = new JMenuItem("Copiar");
		menuopcion2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
		menuopcion2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta1.copy();
			}
		});
		menuopcion2.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu1.add(menuopcion2);
		
		JMenuItem menuopcion3 = new JMenuItem("Pegar");
		menuopcion3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
		menuopcion3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta1.paste();
			}
		});
		menuopcion3.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu1.add(menuopcion3);
		Contenidoprincipal1.setLayout(gl_Contenidoprincipal1);
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
