package selector;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
										
public class Inicio extends JFrame {

	private JPanel contentPane;

	/**
	 * Iniciacion de la clase.
	 */
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Bienvenidos al generador de negocios");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
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
	public Inicio() {                                /* Configuracion general del frame  */
		setResizable(false);                             
		setTitle("Generador de plan de negocio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 470, 220);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/* Creacion  del combobox para que el usuario pueda seleccionar al frame que quiera dirigirse 
		*/
		JComboBox seleccionar = new JComboBox();
		seleccionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*Guarda el nombre asociado a cada frame de la clase al que se quiere dirigirse  */
				String seleccionador = (String) seleccionar.getSelectedItem();
				/* Condicional  que asocia el nombre del combobox guardado con el nombre de la clase asignada */
				if (seleccionador.equals("Datos de portada")) {
					// redireccion a la siguiente frame asignada 
					DatosdePortada ventana2 = new DatosdePortada();
					ventana2.setVisible(true);
					// cierra el frame anterior y mantiene el frame actual abierto
					setVisible(false);
					JOptionPane.showMessageDialog(null, "CONSIDERACIONES: \n \n 1 en caso de no llevar informacion en algun campo generar un espacio en"
							+ "blanco para poder continuar a la siguente seccion \n 2 todos los campos los campos tinen que estar llenados para poder generar el pdf correctamente");
				
				}
				
				if (seleccionador.equals("Introduccion")) {
					Intro ventana3 = new Intro();
					ventana3.setVisible(true);
					setVisible(false);
					
					JOptionPane.showMessageDialog(null, "CONSIDERACIONES: \n \n 1 en caso de no llevar informacion en algun campo generar un espacio en"
							+ "blanco para poder continuar a la siguente seccion \n 2 todos los campos los campos tinen que estar llenados para poder generar el pdf correctamente "
							+ "\n 3 para cada parrafo que lleve punto y aparte generar 2 saltos en lina en blanco con la tecla enter (2 veces)");
					
					
				}
				
				if (seleccionador.equals("Modelo de negocio")) {
					Modelonegocios ventana4 = new Modelonegocios();
					ventana4.setVisible(true);
					setVisible(false);
					
					JOptionPane.showMessageDialog(null, "CONSIDERACIONES: \n \n 1 en caso de no llevar informacion en algun campo generar un espacio en"
							+ "blanco para poder continuar a la siguente seccion \n 2 todos los campos los campos tinen que estar llenados para poder generar el pdf correctamente "
							+ "\n 3 para cada parrafo que lleve punto y aparte generar 2 saltos en lina en blanco con la tecla enter (2 veces)");
				}
				
				if (seleccionador.equals("Generalidades del negocios")) {
					Generalidadesnegocios ventana5 = new Generalidadesnegocios();
					ventana5.setVisible(true);
					setVisible(false);
					
					JOptionPane.showMessageDialog(null, "CONSIDERACIONES: \n \n 1 en caso de no llevar informacion en algun campo generar un espacio en"
							+ "blanco para poder continuar a la siguente seccion \n 2 todos los campos los campos tinen que estar llenados para poder generar el pdf correctamente "
							+ "\n 3 para cada parrafo que lleve punto y aparte generar 2 saltos en lina en blanco con la tecla enter (2 veces) \n"
							+ "4 insertar la imagen es obigatorio para generar el pdf corretamente");
				}
				
				if (seleccionador.equals("Aspectos del mercado")) {
					Aspectosmercado ventana6 = new Aspectosmercado();
					ventana6.setVisible(true);
					setVisible(false);
					
					JOptionPane.showMessageDialog(null, "CONSIDERACIONES: \n \n 1 en caso de no llevar informacion en algun campo generar un espacio en"
							+ "blanco para poder continuar a la siguente seccion \n 2 todos los campos los campos tinen que estar llenados para poder generar el pdf correctamente "
							+ "\n 3 para cada parrafo que lleve punto y aparte generar 2 saltos en lina en blanco con la tecla enter (2 veces)");
				}
				
				if (seleccionador.equals("Aspectos operativos")) {
					Aspectosoperativos ventana7 = new Aspectosoperativos();
					ventana7.setVisible(true);
					setVisible(false);
					JOptionPane.showMessageDialog(null, "CONSIDERACIONES: \n \n 1 en caso de no llevar informacion en algun campo generar un espacio en"
							+ "blanco para poder continuar a la siguente seccion \n 2 todos los campos los campos tinen que estar llenados para poder generar el pdf correctamente "
							+ "\n 3 para cada parrafo que lleve punto y aparte generar 2 saltos en lina en blanco con la tecla enter (2 veces)");
				}
				
				if (seleccionador.equals("Aspectos administrativos")) {
					Aspectosadministrativos ventana8 = new Aspectosadministrativos();
					ventana8.setVisible(true);
					setVisible(false);
					
					JOptionPane.showMessageDialog(null, "CONSIDERACIONES: \n \n 1 en caso de no llevar informacion en algun campo generar un espacio en"
							+ "blanco para poder continuar a la siguente seccion \n 2 todos los campos los campos tinen que estar llenados para poder generar el pdf correctamente "
							+ "\n 3 para cada parrafo que lleve punto y aparte generar 2 saltos en lina en blanco con la tecla enter (2 veces)"
							+ "\n \n CONSIDERACIONES DE TABLA: \n \n 1 dar doble clicke a cada celda para introducir la informacion "
							+ "\n 2 muy importante verificar la informacion de la tabla ya que si la informacion esta incompleta o se les ovida informacion al pasar a la "
							+ "siguiente seccion y regresar a esta tabla se tendra que llenar de nuevo la tabla en cuestion"
							+ "\n 3 cada vez que se introduzca informacion en cada celda al terminar darle un enter");
				}
				
				if (seleccionador.equals("Aspectos legales")) {
					Aspectoslegales ventana9 = new Aspectoslegales();
					ventana9.setVisible(true);
					
					setVisible(false);JOptionPane.showMessageDialog(null, "CONSIDERACIONES: \n \n 1 en caso de no llevar informacion en algun campo generar un espacio en"
							+ "blanco para poder continuar a la siguente seccion \n 2 todos los campos los campos tinen que estar llenados para poder generar el pdf correctamente "
							+ "\n 3 para cada parrafo que lleve punto y aparte generar 2 saltos en lina en blanco con la tecla enter (2 veces)"
							+ "\n \n CONSIDERACIONES DE TABLA: \n \n 1 dar doble clicke a cada celda para introducir la informacion "
							+ "\n 2 muy importante verificar la informacion de la tabla ya que si la informacion esta incompleta o se les ovida informacion al pasar a la "
							+ "siguiente seccion y regresar a esta tabla se tendra que llenar de nuevo la tabla en cuestion"
							+ "\n 3 cada vez que se introduzca informacion en cada celda al terminar darle un enter");
					
					
				}
				
				if (seleccionador.equals("Aspectos Financieros")) {
					Aspectosfinancierosseccion1 ventana10 = new Aspectosfinancierosseccion1();
					ventana10.setVisible(true);
					setVisible(false);
					JOptionPane.showMessageDialog(null,"\n \n CONSIDERACIONES DE TABLA: \n \n 1 dar doble click a cada celda para introducir la informacion "
							+ "\n 2 muy importante verificar la informacion de la tabla ya que si la informacion esta incompleta o se les ovida informacion al pasar a la "
							+ "siguiente seccion y regresar a esta tabla se tendra que llenar de nuevo la tabla en cuestion"
							+ "\n 3 cada vez que se introduzca informacion en cada celda al terminar darle un enter");
				}
				
				if (seleccionador.equals("Resumen ejecutivo")) {
					Resumenejecutivo ventana10 = new Resumenejecutivo();
					ventana10.setVisible(true);
					setVisible(false);
					JOptionPane.showMessageDialog(null, "CONSIDERACIONES: \n \n 1 en caso de no llevar informacion en algun campo generar un espacio en"
							+ "blanco para poder continuar a la siguente seccion \n 2 todos los campos los campos tinen que estar llenados para poder generar el pdf correctamente "
							+ "\n 3 para cada parrafo que lleve punto y aparte generar 2 saltos en lina en blanco con la tecla enter (2 veces)"
							+ "\n 4 si algun campo de texto o tabla no lleno de informacion el pdf no se abrira "
							+ "\n 5 el pdf estara en el escritorio con el nombre plan de negocios ");
				}
			}
			
			
		});
		
		//  Opciones a seleccionar dentro del combobox
		seleccionar.setModel(new DefaultComboBoxModel(new String[] {"Seccionar Campo", "Datos de portada", "Introduccion", "Modelo de negocio", "Generalidades del negocios", "Aspectos del mercado", "Aspectos operativos", "Aspectos administrativos", "Aspectos legales", "Aspectos Financieros", "Resumen ejecutivo"}));
		seleccionar.setBounds(93, 26, 195, 20);
		contentPane.add(seleccionar);
	}
}
