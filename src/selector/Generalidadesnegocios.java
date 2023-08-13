package selector;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JTextField;

public class Generalidadesnegocios extends JFrame {

	private JPanel contentPane;
	// Declaracion de la variables se puede utilizar en cualquier clase
	public static JTextArea Respuesta12 = new JTextArea();
	public static JTextArea Respuesta13 = new JTextArea();
	public static JTextArea Respuesta14 = new JTextArea();
	public static JTextArea Respuesta15 = new JTextArea();
	public static JTextArea Respuesta16 = new JTextArea();
	public static String[] Resultado2 = new String[5];
	public static JLabel Imagen1;
	public static JTextField Rutaimagen;
	public static File Ruta1;
	public static ImageIcon Informacionimagen;
	public static Icon imagen1;

	/**
	 * iniciacion de la aplicacion.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Generalidadesnegocios frame = new Generalidadesnegocios();
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
	public Generalidadesnegocios() {
		// Diseño similar al navegador de windows al momento de seleccionar una imagen 
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		setTitle("Generalidades de negocios");   /* configuracion general del frame*/
		setExtendedState(JFrame.MAXIMIZED_HORIZ);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 25, 1447, 847);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JPanel ContenidoPrincipal2 = new JPanel();
		scrollPane.setViewportView(ContenidoPrincipal2);
		/*contenido principal del frame,enunciados de cada campo y
        sus respectivo formato para cada campo*/
		JLabel Enunciado14 = new JLabel("<html>1.\tCon base en el análisis del punto 1 especifica: Tu producto(s)/servicio(s). Describiendo: 1. ¿Qué es?, sus características principales: físicas, de funcionalidad, de calidad, etc. 2. ¿Qué necesidad satisface o que problema resuelve?. 3. ¿En qué grado de avance se encuentra al día de hoy (Idea, prototipo simulado, prototipo dibujo, prototipo maqueta, prototipo físico, producto mínimo viable (primeras pruebas de mercado con la venta del producto en un segmento de prueba)? agregar link del video en donde se observe el producto en su grado de avance al día de hoy. <html>");
		Enunciado14.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JScrollPane Scroll12 = new JScrollPane();
		
		JLabel Enunciado15 = new JLabel("<html>2.Datos del negocio. Nombre de la empresa, a qué se dedicará el negocio, giro, ubicación, misión, visión y valores.<html>");
		Enunciado15.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JScrollPane Scroll13 = new JScrollPane();
		
		JLabel Enunciado16 = new JLabel("<html>3. Describan el segmento de mercado al que quisieran enfocarse y por qué.\r\n*La segmentación se refiere al proceso de dividir el mercado en grupos más pequeños que comparten una o varias características en común, y que, además, con base en esas diferencias, cada grupo puede necesitar productos o estrategias de marketing diferenciados. (geográfico, psicografico, demográfico, función del comportamiento)<html>\r\n");
		Enunciado16.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JScrollPane Scroll14 = new JScrollPane();
		
		JLabel Enunciado17 = new JLabel("<html>4.\tTendencias del sector o industria en el que se desarrollará el negocio. \r\nAcopia información confiable actual sobre: 4.1) el crecimiento, estancamiento o decrecimiento del sector en el que se encuentra tu negocio, 4.2) sobre las tendencias para los próximos 5 años.<html>");
		Enunciado17.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JScrollPane Scroll15 = new JScrollPane();
		
		JLabel Enunciado18 = new JLabel("<html>5.\tTendencias del mercado en el que se desarrollará el negocio.\r\nAcopia información sobre el comportamiento de las ventas de productos y/o servicios similares al tuyo en los últimos 12 meses y cuál es la tendencia de éstas para los próximos 3 años.<html>\r\n");
		Enunciado18.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JScrollPane Scroll16 = new JScrollPane();
		
		JLabel Enunciado19 = new JLabel("<html>4. Poner la foto, dibujo, etc. en donde se observe el producto en su grado de avance al día de hoy.<html>");
		Enunciado19.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JButton btn6 = new JButton("Cargar imagen"); // boton para cargar imagen 
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // evento para cargar la imagen 
				JFileChooser explorador1 = new JFileChooser();
				explorador1.setCurrentDirectory(new File("C:\\")); // ruta principal del disco duro al momento de carga imagen 
				// extension admitidas al momento de buscar la imagen 
				FileNameExtensionFilter filtrado1 =  new FileNameExtensionFilter("jpg, png, jpeg, mpg, mpeg", "jpg","png","jpeg","mpg","mpeg");
				explorador1.setFileFilter(filtrado1);
				
			int accion = explorador1.showOpenDialog(btn6);
			// condicional para verificar la tabla seleccionada 
			if (accion == JFileChooser.APPROVE_OPTION) {
				 Ruta1 = explorador1.getSelectedFile();             // Ruta de la imagen seleccionada 
				Rutaimagen .setText(Ruta1.getAbsolutePath());
				 // mostar como vista brevia la imagen seleccionada  con un tamaño a partir de una escala establecido 
				Informacionimagen = new ImageIcon(Ruta1.toString());
				  imagen1 = new ImageIcon(Informacionimagen.getImage().getScaledInstance(Imagen1.getWidth(), Imagen1.getHeight(), Image.SCALE_DEFAULT));
				  Imagen1.setIcon(imagen1);
				 
			 }
			}
		});
		btn6.setFont(new Font("Arial", Font.PLAIN, 14));
		
		Rutaimagen = new JTextField(); // Declaracion del campo de la ruta establecido 
		Rutaimagen.setFont(new Font("Arial", Font.PLAIN, 12));
		Rutaimagen.setColumns(10);
		
		 Imagen1 = new JLabel("");
		 
		 Respuesta16.setFont(new Font("Arial", Font.PLAIN, 12)); // Declaracion del formato de los campos 
		 Respuesta16.setWrapStyleWord(true);
		 Respuesta16.setLineWrap(true);
		 Scroll16.setViewportView(Respuesta16);
		 
		 JPopupMenu Menu16 = new JPopupMenu(); // Declaracion de menu al momento de pulsar click derecho con el mouse
		 Menu16.setFont(new Font("Arial", Font.PLAIN, 14));
		 addPopup(Respuesta16, Menu16);
		 
		 JMenuItem menuopcion46 = new JMenuItem("Cortar"); // opcion de cortar
		 menuopcion46.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) { // metodo para cortar
		 		Respuesta16.cut();
		 	}
		 });
		 menuopcion46.setFont(new Font("Arial", Font.PLAIN, 14));
		 /* metodo que permite adquirir la accion del atajo cortar con
         el teclado   */
		 menuopcion46.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
		 Menu16.add(menuopcion46);
		 
		 JMenuItem menuopcion47 = new JMenuItem("Copiar"); // opcion de copiar
		 menuopcion47.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) { // metodo para copiar
		 		Respuesta16.copy();
		 	}
		 });
		 menuopcion47.setFont(new Font("Arial", Font.PLAIN, 14));
		 /* metodo que permite adquirir la accion del atajo copiar con
	        el teclado */
		 menuopcion47.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
		 Menu16.add(menuopcion47);
		 
		 JMenuItem menuopcion48 = new JMenuItem("Pegar");  // opcion de pegar
		 menuopcion48.setFont(new Font("Arial", Font.PLAIN, 14));
		 menuopcion48.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {  // metodo para pegar
		 		Respuesta16.paste();
		 	}
		 });
		 /* metodo que permite adquirir la accion del atajo pegar con
         el teclado */
		 menuopcion48.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
		 Menu16.add(menuopcion48);
		 /*Declaracion de los caampos con su respectivo formato y configuracion  */
		 Respuesta15.setFont(new Font("Arial", Font.PLAIN, 12));
		 Respuesta15.setWrapStyleWord(true);
		 Respuesta15.setLineWrap(true);
		 Scroll15.setViewportView(Respuesta15);
		 
		 JPopupMenu Menu15 = new JPopupMenu();
		 Menu15.setFont(new Font("Arial", Font.PLAIN, 15));
		 addPopup(Respuesta15, Menu15);
		 
		 JMenuItem menuopcion43 = new JMenuItem("Cortar");
		 menuopcion43.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		Respuesta15.cut();
		 	}
		 });
		 menuopcion43.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
		 menuopcion43.setFont(new Font("Arial", Font.PLAIN, 14));
		 Menu15.add(menuopcion43);
		 
		 JMenuItem menuopcion44 = new JMenuItem("Copiar");
		 menuopcion44.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		Respuesta15.copy();
		 	}
		 });
		 menuopcion44.setFont(new Font("Arial", Font.PLAIN, 14));
		 menuopcion44.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
		 Menu15.add(menuopcion44);
		 
		 JMenuItem menuopcion45 = new JMenuItem("Pegar");
		 menuopcion45.setFont(new Font("Arial", Font.PLAIN, 14));
		 menuopcion45.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		Respuesta15.paste();
		 	}
		 });
		 menuopcion45.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
		 Menu15.add(menuopcion45);
		 
		 Respuesta14.setFont(new Font("Arial", Font.PLAIN, 12));
		 Respuesta14.setWrapStyleWord(true);
		 Respuesta14.setLineWrap(true);
		 Scroll14.setViewportView(Respuesta14);
		 
		 JPopupMenu Menu14 = new JPopupMenu();
		 Menu14.setFont(new Font("Arial", Font.PLAIN, 14));
		 addPopup(Respuesta14, Menu14);
		 
		 JMenuItem menuopcion40 = new JMenuItem("Cortar");
		 menuopcion40.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		Respuesta14.cut();
		 	}
		 });
		 menuopcion40.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
		 menuopcion40.setFont(new Font("Arial", Font.PLAIN, 14));
		 Menu14.add(menuopcion40);
		 
		 JMenuItem menuopcion41 = new JMenuItem("Copiar");
		 menuopcion41.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
		 menuopcion41.setFont(new Font("Arial", Font.PLAIN, 14));
		 Menu14.add(menuopcion41);
		 
		 JMenuItem menuopcion42 = new JMenuItem("Pegar");
		 menuopcion42.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		Respuesta14.paste();
		 	}
		 });
		 menuopcion42.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
		 menuopcion42.setFont(new Font("Arial", Font.PLAIN, 14));
		 Menu14.add(menuopcion42);
		 Respuesta12.setFont(new Font("Arial", Font.PLAIN, 12));
		 
		 Scroll12.setViewportView(Respuesta12);
		 Respuesta12.setLineWrap(true);
		 Respuesta12.setWrapStyleWord(true);
		 
		 JPopupMenu Menu12 = new JPopupMenu();
		 addPopup(Respuesta12, Menu12);
		 
		 JMenuItem menuopcion34 = new JMenuItem("Cortar");
		 menuopcion34.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
		 menuopcion34.setFont(new Font("Arial", Font.PLAIN, 14));
		 menuopcion34.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		Respuesta12.cut();
		 	}
		 });
		 Menu12.add(menuopcion34);
		 
		 JMenuItem menuopcion35 = new JMenuItem("Copiar");
		 menuopcion35.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
		 menuopcion35.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		Respuesta12.copy();
		 		
		 	}
		 });
		 menuopcion35.setFont(new Font("Arial", Font.PLAIN, 14));
		 Menu12.add(menuopcion35);
		 
		 JMenuItem menuopcion36 = new JMenuItem("Pegar");
		 menuopcion36.setFont(new Font("Arial", Font.PLAIN, 14));
		 menuopcion36.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
		 menuopcion36.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		Respuesta12.paste();
		 	}
		 });
		 Menu12.add(menuopcion36);
		 Scroll13.setViewportView(Respuesta13);
		 
		 Respuesta13.setFont(new Font("Arial", Font.PLAIN, 12));
		 Respuesta13.setWrapStyleWord(true);
		 Respuesta13.setLineWrap(true);
		 
		 JPopupMenu Menu13 = new JPopupMenu();
		 Menu13.setFont(new Font("Arial", Font.PLAIN, 14));
		 addPopup(Respuesta13, Menu13);
		 
		 JMenuItem meuopcion37 = new JMenuItem("Cortar");
		 meuopcion37.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
		 meuopcion37.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		Respuesta13.cut();
		 	}
		 });
		 meuopcion37.setFont(new Font("Arial", Font.PLAIN, 14));
		 Menu13.add(meuopcion37);
		 
		 JMenuItem menuopcion38 = new JMenuItem("Copiar");
		 menuopcion38.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
		 menuopcion38.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		Respuesta13.copy();
		 	}
		 });
		 menuopcion38.setFont(new Font("Arial", Font.PLAIN, 14));
		 Menu13.add(menuopcion38);
		 
		 JMenuItem menuopcion39 = new JMenuItem("Pegar");
		 menuopcion39.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		Respuesta13.paste();
		 	}
		 });
		 menuopcion39.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
		 menuopcion39.setFont(new Font("Arial", Font.PLAIN, 14));
		 Menu13.add(menuopcion39);
		 
		 JButton btn3 = new JButton("Atras"); // declaracion del boton atras
		 btn3.addActionListener(new ActionListener() { // evento del boton atras
		 	public void actionPerformed(ActionEvent e) {
		 		Modelonegocios ventana4 = new Modelonegocios(); // retroceder  al anterior frame
		 		ventana4.setVisible(true);
		 	// cierra el frame anterior y deja abierto el actual
		 		dispose();
		 	}
		 });
		 btn3.setFont(new Font("Arial", Font.PLAIN, 14));
		 
		 JButton btn4 = new JButton("Siguiente"); // declaracion del boton siguente
		 btn4.addActionListener(new ActionListener() { // evento del boton siguiente 
		 	public void actionPerformed(ActionEvent e) {
		 	// condicional por si algun campo se encuentra vacio no se pueda avanzar al siguente frame
		 	if (Respuesta12.getText().isEmpty() || Respuesta13.getText().isEmpty()|| Respuesta14.getText().isEmpty()
		 			|| Respuesta15.getText().isEmpty()|| Respuesta16.getText().isEmpty()) 
		 	{
		 	// mensaje por si aun campo se encuentra vacio
		 		JOptionPane.showMessageDialog(null, "Llenar los campos vacios");
		 	}
		 // condicional cuando hay por lo menos un caracter en todos los campos
		 	else {
		 	// arreglo que guarda los datos de cada campo 
		 		Resultado2[0] = Respuesta12.getText();
		 		Resultado2[1] = Respuesta13.getText();
		 		Resultado2[2] = Respuesta14.getText();
		 		Resultado2[3] = Respuesta15.getText();
		 		Resultado2[4] = Respuesta16.getText();
		 		
		 		
		 		//System.out.print(Resultado2[0]);
		 		Aspectosmercado ventana6 = new Aspectosmercado(); // avanzar al siguiente frame
		 		ventana6.setVisible(true);
		 	// cierra el frame anterio y deja abierto el actual
		       dispose();
		       
		       JOptionPane.showMessageDialog(null, "CONSIDERACIONES: \n \n 1 en caso de no llevar informacion en algun campo generar un espacio en"
						+ "blanco para poder continuar a la siguente seccion \n 2 todos los campos los campos tinen que estar llenados para poder generar el pdf correctamente "
						+ "\n 3 para cada parrafo que lleve punto y aparte generar 2 saltos en lina en blanco con la tecla enter (2 veces)");
			}
		 		
		 	}
		 });
		 btn4.setFont(new Font("Arial", Font.PLAIN, 14));
		 // tipo de layout grupal del contenido del frame
		 GroupLayout gl_ContenidoPrincipal2 = new GroupLayout(ContenidoPrincipal2);
		 gl_ContenidoPrincipal2.setHorizontalGroup(
		 	gl_ContenidoPrincipal2.createParallelGroup(Alignment.LEADING) // tipo de alineacion adaptable del contenido pa cualquier tipo de pantalla
		 		.addGroup(gl_ContenidoPrincipal2.createSequentialGroup()
		 			.addGap(10)
		 			.addGroup(gl_ContenidoPrincipal2.createParallelGroup(Alignment.LEADING, false)
		 				.addComponent(Enunciado14, GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
		 				.addComponent(Enunciado19, GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
		 				.addGroup(gl_ContenidoPrincipal2.createSequentialGroup()
		 					.addComponent(btn6)
		 					.addGap(18)
		 				// tamaño adaptable de los campos y contenidos del frame
                            //  Para cualquier pantalla de laptop o computadora de escritorio
		 					.addComponent(Rutaimagen, GroupLayout.PREFERRED_SIZE, 593, GroupLayout.PREFERRED_SIZE))
		 				.addComponent(Imagen1, GroupLayout.PREFERRED_SIZE, 266, GroupLayout.PREFERRED_SIZE)
		 				.addComponent(Enunciado15, GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
		 				.addComponent(Scroll12)
		 				.addGroup(gl_ContenidoPrincipal2.createSequentialGroup()
		 					.addGap(10)
		 					.addComponent(Scroll13)))
		 			.addGap(41)
		 			.addGroup(gl_ContenidoPrincipal2.createParallelGroup(Alignment.LEADING)
		 				.addComponent(Enunciado16, GroupLayout.PREFERRED_SIZE, 625, GroupLayout.PREFERRED_SIZE)
		 				.addComponent(Enunciado17, GroupLayout.PREFERRED_SIZE, 625, GroupLayout.PREFERRED_SIZE)
		 				.addComponent(Enunciado18, GroupLayout.PREFERRED_SIZE, 625, GroupLayout.PREFERRED_SIZE)
		 				.addGroup(gl_ContenidoPrincipal2.createSequentialGroup()
		 					.addGap(79)
		 					.addComponent(btn3, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
		 					.addGap(10)
		 					.addComponent(btn4, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
		 				.addGroup(gl_ContenidoPrincipal2.createSequentialGroup()
		 					.addComponent(Scroll14, GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
		 					.addContainerGap())
		 				.addGroup(gl_ContenidoPrincipal2.createSequentialGroup()
		 					.addComponent(Scroll15, GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
		 					.addContainerGap())
		 				.addGroup(gl_ContenidoPrincipal2.createSequentialGroup()
		 					.addComponent(Scroll16, GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
		 					.addContainerGap())))
		 );
		 gl_ContenidoPrincipal2.setVerticalGroup(
		 	gl_ContenidoPrincipal2.createParallelGroup(Alignment.LEADING)
		 		.addGroup(gl_ContenidoPrincipal2.createSequentialGroup()
		 			.addGroup(gl_ContenidoPrincipal2.createParallelGroup(Alignment.LEADING)
		 				.addGroup(gl_ContenidoPrincipal2.createSequentialGroup()
		 					.addGap(11)
		 					.addComponent(Enunciado14, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
		 					.addGap(3)
		 					.addComponent(Scroll12, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
		 					.addGap(11)
		 					.addComponent(Enunciado19, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
		 					.addGap(11)
		 					.addGroup(gl_ContenidoPrincipal2.createParallelGroup(Alignment.LEADING)
		 						.addComponent(btn6)
		 						.addGroup(gl_ContenidoPrincipal2.createSequentialGroup()
		 							.addGap(3)
		 							.addComponent(Rutaimagen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
		 					.addGap(11)
		 					.addComponent(Imagen1, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
		 					.addGap(11)
		 					.addComponent(Enunciado15, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
		 					.addGap(11)
		 					.addComponent(Scroll13, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE))
		 				.addGroup(gl_ContenidoPrincipal2.createSequentialGroup()
		 					.addGap(9)
		 					.addComponent(Enunciado16)
		 					.addGap(8)
		 					.addComponent(Scroll14, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
		 					.addGap(7)
		 					.addComponent(Enunciado17, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
		 					.addGap(11)
		 					.addComponent(Scroll15, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
		 					.addGap(24)
		 					.addComponent(Enunciado18)
		 					.addGap(11)
		 					.addComponent(Scroll16, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
		 					.addGap(55)
		 					.addGroup(gl_ContenidoPrincipal2.createParallelGroup(Alignment.LEADING)
		 						.addComponent(btn3)
		 						.addComponent(btn4))))
		 			.addGap(24))
		 );
		 ContenidoPrincipal2.setLayout(gl_ContenidoPrincipal2);
		 GroupLayout gl_contentPane = new GroupLayout(contentPane);
		 gl_contentPane.setHorizontalGroup(
		 	gl_contentPane.createParallelGroup(Alignment.LEADING)
		 		.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 1431, Short.MAX_VALUE)
		 );
		 gl_contentPane.setVerticalGroup(
		 	gl_contentPane.createParallelGroup(Alignment.LEADING)
		 		.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE)
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
