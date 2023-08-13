package selector;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.w3c.dom.events.EventTarget;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyAdapter;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;

public class DatosdePortada extends JFrame {
// Declaracion de la variables solo se puede utilizar dentro de esta clase 
	private JPanel contentPane;
	private JTextField Respuesta30;
	private JTextField Respuesta31;
	private JTextField Respuesta32;
	private JTextField Respuesta33;
	private JTextField Respuesta34;
	private JTextField Respuesta35;
	private JTextField Respuesta36;
	private JTextField Respuesta37;
	
	public static String[]Resultados8 = new String[8];

	/**
	 * iniciacion de la clase.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DatosdePortada frame = new DatosdePortada();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Creacio del frame.
	 */
	public DatosdePortada() {                                 /* configuracion general del frame*/
		setTitle("Datos de portada");
		setExtendedState(JFrame.MAXIMIZED_HORIZ);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 25, 1377, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JScrollPane ScrollPrincipal10 = new JScrollPane();
		                                                    /*contenido principal del frame,enunciados de cada campo y
		                                                       sus respectivo formato para cada campo*/
		JPanel ContenidoPrincipal10 = new JPanel();
		ScrollPrincipal10.setViewportView(ContenidoPrincipal10);
		
		JLabel Enunciado35 = new JLabel("Departamento:");
		Enunciado35.setFont(new Font("Arial", Font.PLAIN, 12));
		
		JLabel Enunciado36 = new JLabel("Carrera:");
		Enunciado36.setFont(new Font("Arial", Font.PLAIN, 12));
		
		JLabel Enunciado37 = new JLabel("Mareria:");
		Enunciado37.setFont(new Font("Arial", Font.PLAIN, 12));
		Enunciado37.setVerticalAlignment(SwingConstants.BOTTOM);
		
		JLabel Enunciado38 = new JLabel("Grupo:");
		Enunciado38.setFont(new Font("Arial", Font.PLAIN, 12));
		
		JLabel Enunciado39 = new JLabel("Maestro(a):");
		Enunciado39.setFont(new Font("Arial", Font.PLAIN, 12));
		
		JLabel Enunciado40 = new JLabel("Nombre del Alumno:");
		Enunciado40.setFont(new Font("Arial", Font.PLAIN, 12));
		
		JLabel Eninciado41 = new JLabel("Matricula:");
		Eninciado41.setFont(new Font("Arial", Font.PLAIN, 12));
		
		JLabel Enunciado42 = new JLabel("Fecha:");
		Enunciado42.setFont(new Font("Arial", Font.PLAIN, 12));
		
		Respuesta30 = new JTextField();              /* Declaracion de cada campo */
		
		/* evento para que cada campo solo admita caracteres en mayuscula */
		Respuesta30.addKeyListener(new KeyAdapter() {          
			@Override
			public void keyTyped(KeyEvent e) {
				char caracter1 = e.getKeyChar();
				if (Character.isLowerCase(caracter1)) {
				  e.setKeyChar(Character.toUpperCase(caracter1)); 	
				}	
			}
		});
		Respuesta30.setFont(new Font("Arial", Font.PLAIN, 12));    //formato de texto al introducir texto para cada campo
		Respuesta30.setColumns(10);
		
		JPopupMenu Menu30 = new JPopupMenu();  // Declaracion de menu al momento de pulsar click derecho con el mouse
		addPopup(Respuesta30, Menu30);
		
		JMenuItem menuopcion88 = new JMenuItem("Cortar");   // opcion de cortar
		menuopcion88.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK)); /* metodo que permite adqui
		                                                                                                 rir la accion del atajo cortar con
		                                                                                                 el teclado   */
		menuopcion88.addActionListener(new ActionListener() { // metodo para cortar 
			public void actionPerformed(ActionEvent e) {
				Respuesta30.cut();
			}
		});
		menuopcion88.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu30.add(menuopcion88);
		
		JMenuItem menuopcion89 = new JMenuItem("Copiar");  // opcion de copiar
		menuopcion89.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK)); /* metodo que permite adqui
                                                                                                       rir la accion del atajo copiar con
                                                                                                        el teclado */
		menuopcion89.addActionListener(new ActionListener() {// metodo para copiar
			public void actionPerformed(ActionEvent e) {
				Respuesta30.copy();
			}
		});
		menuopcion89.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu30.add(menuopcion89);
		
		JMenuItem menuopcion90 = new JMenuItem("Pegar"); // opcion de pegar
		menuopcion90.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK)); /* metodo que permite adqui
                                                                                                        rir la accion del atajo pegar con
                                                                                                         el teclado */
		menuopcion90.addActionListener(new ActionListener() { // metodo para pegar
			public void actionPerformed(ActionEvent e) {
				Respuesta30.paste();
			}
		});
		menuopcion90.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu30.add(menuopcion90);
		
		Respuesta31 = new JTextField();
		Respuesta31.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char caracter2 = e.getKeyChar();
				if (Character.isLowerCase(caracter2)) {
				  e.setKeyChar(Character.toUpperCase(caracter2)); 	
				}	
			}
		});
		Respuesta31.setFont(new Font("Arial", Font.PLAIN, 12));
		Respuesta31.setColumns(10);
		
		JPopupMenu Menu31 = new JPopupMenu();
		addPopup(Respuesta31, Menu31);
		
		JMenuItem menuopcion91 = new JMenuItem("Cortar");
		menuopcion91.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
		menuopcion91.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta31.cut();
			}
		});
		menuopcion91.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu31.add(menuopcion91);
		
		JMenuItem menuopcion92 = new JMenuItem("Copiar");
		menuopcion92.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
		menuopcion92.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta31.copy();
			}
		});
		menuopcion92.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu31.add(menuopcion92);
		
		JMenuItem menuopcion93 = new JMenuItem("Pegar");
		menuopcion93.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
		menuopcion93.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta31.paste();
			}
		});
		menuopcion93.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu31.add(menuopcion93);
		
		Respuesta32 = new JTextField();
		Respuesta32.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char caracter3 = e.getKeyChar();
				if (Character.isLowerCase(caracter3)) {
				  e.setKeyChar(Character.toUpperCase(caracter3)); 	
				}	
			}
		});
		Respuesta32.setFont(new Font("Arial", Font.PLAIN, 12));
		Respuesta32.setColumns(10);
		
		JPopupMenu Menu32 = new JPopupMenu();
		addPopup(Respuesta32, Menu32);
		
		JMenuItem menuopcion94 = new JMenuItem("Cortar");
		menuopcion94.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta32.cut();
			}
		});
		menuopcion94.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
		menuopcion94.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu32.add(menuopcion94);
		
		JMenuItem menuopcion95 = new JMenuItem("Copiar");
		menuopcion95.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
		menuopcion95.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta32.copy();
			}
		});
		menuopcion95.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu32.add(menuopcion95);
		
		JMenuItem menuopcion96 = new JMenuItem("Pegar");
		menuopcion96.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta32.paste();
			}
		});
		menuopcion96.setFont(new Font("Arial", Font.PLAIN, 14));
		menuopcion96.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
		Menu32.add(menuopcion96);
		
		Respuesta33 = new JTextField();
		Respuesta33.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char caracter4 = e.getKeyChar();
				if (Character.isLowerCase(caracter4)) {
				  e.setKeyChar(Character.toUpperCase(caracter4)); 	
				}	
			}
		});
		Respuesta33.setFont(new Font("Arial", Font.PLAIN, 12));
		Respuesta33.setColumns(10);
		
		JPopupMenu Menu33 = new JPopupMenu();
		addPopup(Respuesta33, Menu33);
		
		JMenuItem menuopcion97 = new JMenuItem("Cortar");
		menuopcion97.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta33.cut();
			}
		});
		menuopcion97.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
		menuopcion97.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu33.add(menuopcion97);
		
		JMenuItem menuopcion98 = new JMenuItem("Copiar");
		menuopcion98.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta33.copy();
			}
		});
		menuopcion98.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
		menuopcion98.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu33.add(menuopcion98);
		
		JMenuItem menuopcion99 = new JMenuItem("Pegar");
		menuopcion99.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta33.paste();
			}
		});
		menuopcion99.setFont(new Font("Arial", Font.PLAIN, 14));
		menuopcion99.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
		Menu33.add(menuopcion99);
		
		Respuesta34 = new JTextField();
		Respuesta34.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char caracter5 = e.getKeyChar();
				if (Character.isLowerCase(caracter5)) {
				  e.setKeyChar(Character.toUpperCase(caracter5)); 	
				}	
			}
		});
		Respuesta34.setFont(new Font("Arial", Font.PLAIN, 12));
		Respuesta34.setColumns(10);
		
		JPopupMenu Menu34 = new JPopupMenu();
		addPopup(Respuesta34, Menu34);
		
		JMenuItem menuopcion100 = new JMenuItem("Cortar");
		menuopcion100.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta34.cut();
			}
		});
		menuopcion100.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
		menuopcion100.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu34.add(menuopcion100);
		
		JMenuItem menuopcion101 = new JMenuItem("Copiar");
		menuopcion101.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta34.copy();
			}
		});
		menuopcion101.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
		menuopcion101.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu34.add(menuopcion101);
		
		JMenuItem menuopcion102 = new JMenuItem("Pegar");
		menuopcion102.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta34.paste();
			}
		});
		menuopcion102.setFont(new Font("Arial", Font.PLAIN, 14));
		menuopcion102.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
		Menu34.add(menuopcion102);
		
		Respuesta35 = new JTextField();
		Respuesta35.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char caracter6 = e.getKeyChar();
				if (Character.isLowerCase(caracter6)) {
				  e.setKeyChar(Character.toUpperCase(caracter6)); 	
				}	
			}
		});
		Respuesta35.setFont(new Font("Arial", Font.PLAIN, 12));
		Respuesta35.setColumns(10);
		
		JPopupMenu Menu35 = new JPopupMenu();
		addPopup(Respuesta35, Menu35);
		
		JMenuItem menuopcion103 = new JMenuItem("Cortar");
		menuopcion103.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta35.cut();
			}
		});
		menuopcion103.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
		menuopcion103.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu35.add(menuopcion103);
		
		JMenuItem menuopcion104 = new JMenuItem("Copiar");
		menuopcion104.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta35.copy();
			}
		});
		menuopcion104.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
		menuopcion104.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu35.add(menuopcion104);
		
		JMenuItem menuopcion105 = new JMenuItem("Pegar");
		menuopcion105.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta35.paste();
			}
		});
		menuopcion105.setFont(new Font("Arial", Font.PLAIN, 14));
		menuopcion105.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
		Menu35.add(menuopcion105);
		
		Respuesta36 = new JTextField();
		Respuesta36.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char caracter7 = e.getKeyChar();
				if (Character.isLowerCase(caracter7)) {
				  e.setKeyChar(Character.toUpperCase(caracter7)); 	
				}	
			}
		});
		Respuesta36.setFont(new Font("Arial", Font.PLAIN, 12));
		Respuesta36.setColumns(10);
		
		JPopupMenu Menu36 = new JPopupMenu();
		addPopup(Respuesta36, Menu36);
		
		JMenuItem menuopcion106 = new JMenuItem("Cortar");
		menuopcion106.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta36.cut();
			}
		});
		menuopcion106.setFont(new Font("Arial", Font.PLAIN, 14));
		menuopcion106.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
		Menu36.add(menuopcion106);
		
		JMenuItem menuopcion107 = new JMenuItem("Copiar");
		menuopcion107.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta36.copy();
			}
		});
		menuopcion107.setFont(new Font("Arial", Font.PLAIN, 14));
		menuopcion107.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
		Menu36.add(menuopcion107);
		
		JMenuItem menuopcion108 = new JMenuItem("Pegar");
		menuopcion108.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta36.paste();
			}
		});
		menuopcion108.setFont(new Font("Arial", Font.PLAIN, 14));
		menuopcion108.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
		Menu36.add(menuopcion108);
		
		Respuesta37 = new JTextField();
		Respuesta37.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char caracter8 = e.getKeyChar();
				if (Character.isLowerCase(caracter8)) {
				  e.setKeyChar(Character.toUpperCase(caracter8)); 	
				}	
			}
		});
		Respuesta37.setFont(new Font("Arial", Font.PLAIN, 12));
		Respuesta37.setColumns(10);
		
		JPopupMenu Menu37 = new JPopupMenu();
		addPopup(Respuesta37, Menu37);
		
		JMenuItem menuopcion109 = new JMenuItem("Cortar");
		menuopcion109.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta37.cut();
			}
		});
		menuopcion109.setFont(new Font("Arial", Font.PLAIN, 14));
		menuopcion109.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
		Menu37.add(menuopcion109);
		
		JMenuItem menuopcion110 = new JMenuItem("Copiar");
		menuopcion110.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta37.copy();
			}
		});
		menuopcion110.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
		menuopcion110.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu37.add(menuopcion110);
		
		JMenuItem menuopcion111 = new JMenuItem("Pegar");
		menuopcion111.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Respuesta37.paste();
			}
		});
		menuopcion111.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
		menuopcion111.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu37.add(menuopcion111);
		
		JButton btn21 = new JButton("Atras");// declaracion del boton atras
		btn21.addActionListener(new ActionListener() { // evento del boton atras
			public void actionPerformed(ActionEvent e) { 
				Inicio ventana1 = new Inicio(); // retroceder  al anterior frame
				ventana1.setVisible(true);
				// cierra el frame anterio y deja abierto el actual
				dispose();
			}
		});
		btn21.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JButton btn22 = new JButton("Siguiente"); // declaracion del boton siguente
		btn22.addActionListener(new ActionListener() { // evento del boton siguiente 
			public void actionPerformed(ActionEvent e) {
				// condicional por si algun campo se encuentra vacio no se pueda avanzar al siguente frame
				if(Respuesta30.getText().isEmpty() || Respuesta31.getText().isEmpty() || Respuesta32.getText().isEmpty()
						|| Respuesta33.getText().isEmpty() || Respuesta34.getText().isEmpty()
						|| Respuesta35.getText().isEmpty() || Respuesta36.getText().isEmpty() || Respuesta37.getText().isEmpty()) {
					// mensaje por si aun campo se encuentra vacio 
					JOptionPane.showMessageDialog(null, " Llenar los campos vacios");
				}
				// condicional cuando hay por lo menos un caracter en todos los campos  
				else {
					Intro ventana3 = new Intro(); // avanzar al siguiente frame
					ventana3.setVisible(true);
					
					
					// cierra el frame anterio y deja abierto el actual
					dispose ();
					JOptionPane.showMessageDialog(null, "CONSIDERACIONES: \n \n 1 en caso de no llevar informacion en algun campo generar un espacio en"
							+ "blanco para poder continuar a la siguente seccion \n 2 todos los campos los campos tinen que estar llenados para poder generar el pdf correctamente "
							+ "\n 3 para cada parrafo que lleve punto y aparte generar 2 saltos en lina en blanco con la tecla enter (2 veces)");
					
					// arreglo que guarda los datos de cada campo 
					Resultados8[0] = Respuesta30.getText();
					Resultados8[1] = Respuesta31.getText();
					Resultados8[2] = Respuesta32.getText();
					Resultados8[3] = Respuesta33.getText();
					Resultados8[4] = Respuesta34.getText();
					Resultados8[5] = Respuesta35.getText();
					Resultados8[6] = Respuesta36.getText();
					Resultados8[7] = Respuesta37.getText();
					
				}
				
				
				
				//System.out.println(Resultados8[0]);
				
				
				
			}
		});
		btn22.setFont(new Font("Arial", Font.PLAIN, 14)); // Estilo de texto del boton  
		// tipo de layout grupal del COntenido del frame 
		GroupLayout gl_ContenidoPrincipal10 = new GroupLayout(ContenidoPrincipal10);
		gl_ContenidoPrincipal10.setHorizontalGroup(
			gl_ContenidoPrincipal10.createParallelGroup(Alignment.LEADING) // tipo de alineacion adaptable del contenido pa cualquier tipo de pantalla
				.addGroup(gl_ContenidoPrincipal10.createSequentialGroup()
					.addGap(10)
					.addComponent(Enunciado35, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)  // tamaño adaptable de los campos y contenidos del frame
					                                                                                        //  Para cualquier pantalla de laptop o computadora de escritorio 
					.addGap(16)
					.addComponent(Respuesta30, GroupLayout.PREFERRED_SIZE, 369, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_ContenidoPrincipal10.createSequentialGroup()
					.addGap(10)
					.addComponent(Enunciado36, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(Respuesta31, GroupLayout.PREFERRED_SIZE, 411, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_ContenidoPrincipal10.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_ContenidoPrincipal10.createParallelGroup(Alignment.LEADING)
						.addComponent(Enunciado37, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_ContenidoPrincipal10.createSequentialGroup()
							.addGap(63)
							.addComponent(Respuesta32, GroupLayout.PREFERRED_SIZE, 305, GroupLayout.PREFERRED_SIZE))))
				.addGroup(gl_ContenidoPrincipal10.createSequentialGroup()
					.addGap(10)
					.addComponent(Enunciado38, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(Respuesta33, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_ContenidoPrincipal10.createSequentialGroup()
					.addGap(10)
					.addComponent(Enunciado39, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(Respuesta34, GroupLayout.PREFERRED_SIZE, 342, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_ContenidoPrincipal10.createSequentialGroup()
					.addGap(10)
					.addComponent(Enunciado40, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(Respuesta35, GroupLayout.PREFERRED_SIZE, 392, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_ContenidoPrincipal10.createSequentialGroup()
					.addGap(10)
					.addComponent(Eninciado41, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addGap(19)
					.addComponent(Respuesta36, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_ContenidoPrincipal10.createSequentialGroup()
					.addGap(10)
					.addComponent(Enunciado42, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addGap(15)
					.addComponent(Respuesta37, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_ContenidoPrincipal10.createSequentialGroup()
					.addGap(991)
					.addComponent(btn21, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addGap(34)
					.addComponent(btn22, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
		);
		gl_ContenidoPrincipal10.setVerticalGroup(
			gl_ContenidoPrincipal10.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ContenidoPrincipal10.createSequentialGroup()
					.addGap(11)
					.addGroup(gl_ContenidoPrincipal10.createParallelGroup(Alignment.LEADING)
						.addComponent(Enunciado35, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(Respuesta30, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addGap(21)
					.addGroup(gl_ContenidoPrincipal10.createParallelGroup(Alignment.LEADING)
						.addComponent(Enunciado36, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_ContenidoPrincipal10.createSequentialGroup()
							.addGap(3)
							.addComponent(Respuesta31, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)))
					.addGap(31)
					.addGroup(gl_ContenidoPrincipal10.createParallelGroup(Alignment.LEADING)
						.addComponent(Enunciado37, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_ContenidoPrincipal10.createSequentialGroup()
							.addGap(4)
							.addComponent(Respuesta32, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)))
					.addGap(32)
					.addGroup(gl_ContenidoPrincipal10.createParallelGroup(Alignment.LEADING)
						.addComponent(Enunciado38, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(Respuesta33, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addGap(48)
					.addGroup(gl_ContenidoPrincipal10.createParallelGroup(Alignment.LEADING)
						.addComponent(Enunciado39, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(Respuesta34, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addGap(42)
					.addGroup(gl_ContenidoPrincipal10.createParallelGroup(Alignment.LEADING)
						.addComponent(Enunciado40, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(Respuesta35, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addGap(42)
					.addGroup(gl_ContenidoPrincipal10.createParallelGroup(Alignment.LEADING)
						.addComponent(Eninciado41, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(Respuesta36, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addGap(46)
					.addGroup(gl_ContenidoPrincipal10.createParallelGroup(Alignment.LEADING)
						.addComponent(Enunciado42, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(Respuesta37, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(222)
					.addGroup(gl_ContenidoPrincipal10.createParallelGroup(Alignment.LEADING)
						.addComponent(btn21, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_ContenidoPrincipal10.createSequentialGroup()
							.addGap(1)
							.addComponent(btn22, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))))
		);
		ContenidoPrincipal10.setLayout(gl_ContenidoPrincipal10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(ScrollPrincipal10, GroupLayout.DEFAULT_SIZE, 1361, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(ScrollPrincipal10, GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE)
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
