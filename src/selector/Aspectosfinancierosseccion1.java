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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Aspectosfinancierosseccion1 extends JFrame {
	// Declaracion de la variables se puede utilizar en cualquier clase ( algunas son solo para esta clase)
	private JPanel ContentPanel;
	private JTable table;
	public static String[][] Resultadostablas3 = new String[43][6];


	/**
	 *  iniciacion de la aplicacion.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aspectosfinancierosseccion1 frame = new Aspectosfinancierosseccion1();
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
	public Aspectosfinancierosseccion1() {              /* configuracion general del frame*/
		setTitle("Aspectos Financieros  Seccion 1");
		setExtendedState(JFrame.MAXIMIZED_HORIZ);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 25, 1377, 800);
		ContentPanel = new JPanel();
		ContentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(ContentPanel);
		
		JScrollPane ScrollPrincipal6 = new JScrollPane();
		
		JPanel ContenidoPrincipal6 = new JPanel();
		ScrollPrincipal6.setViewportView(ContenidoPrincipal6);
		/*contenido principal del frame,enunciados de la tabla y
        sus respectivo formato para la tabla */
		JLabel Enunciadotabla1 = new JLabel("BALANCE GENERAL PRESUPUESTADO");
		Enunciadotabla1.setFont(new Font("Arial", Font.BOLD, 12));
		
		JScrollPane Scrolltabla3 = new JScrollPane();
		
		table = new JTable();  // Declaracion de la tabla 
		table.setModel(new DefaultTableModel(  // Declaracion de las celdas de la tabla
			new Object[][] {
				{"Activo", " ", " ", " ", " ", " ", " "},
				{"Circulante", " ", " ", " ", " ", " ", " "},
				{"Banco", " ", " ", " ", " ", " ", " "},
				{"Invers a cp", " ", " ", " ", " ", " ", " "},
				{"cuent. p cp", " ", " ", " ", " ", " ", " "},
				{"Total AC ", " ", " ", " ", " ", " ", " "},
				{"Fijo", " ", " ", " ", " ", " ", " "},
				{"Terrenos", " ", " ", " ", " ", " ", " "},
				{"Edificios", " ", " ", " ", " ", " ", " "},
				{"Depreciacion", " ", " ", " ", " ", " ", " "},
				{"acumulada edificios", " ", " ", " ", " ", " ", " "},
				{"Mobiliario y equipo", " ", " ", " ", " ", " ", " "},
				{"Depreciacion ", " ", " ", " ", " ", " ", " "},
				{"acumulada mobiliario", " ", " ", " ", " ", " ", " "},
				{"Equipo de transporte", " ", " ", " ", " ", " ", " "},
				{"Depreciacion ", " ", " ", " ", " ", " ", " "},
				{"Acumulada eq. Transp.", " ", " ", " ", " ", " ", " "},
				{"Equipo de Computo", " ", " ", " ", " ", " ", " "},
				{"Depreciacion", " ", " ", " ", " ", " ", " "},
				{"Acumulada eq.Comp.", " ", " ", " ", " ", " ", " "},
				{"Total Activo Fijo", " ", " ", " ", " ", " ", " "},
				{"Diferido", " ", " ", " ", " ", " ", " "},
				{"Renta Pagadas por anticipado", " ", " ", " ", " ", " ", " "},
				{"Otros activos diferidos", " ", " ", " ", " ", " ", " "},
				{"Suma del activo pasivo ", " ", " ", " ", " ", " ", " "},
				{"A corto Plazo ", " ", " ", " ", " ", " ", " "},
				{"Proveedores", " ", " ", " ", " ", " ", " "},
				{"Acredores", " ", " ", " ", " ", " ", " "},
				{"Interes por pagar ", " ", " ", " ", " ", " ", " "},
				{"ISR por pagar ", " ", " ", " ", " ", " ", " "},
				{"anticipo de clientes ", " ", " ", " ", " ", " ", " "},
				{"Total pasivo a CP ", " ", " ", " ", " ", " ", " "},
				{"A largo  Plazo ", " ", " ", " ", " ", " ", " "},
				{"Documentos por pagar a largo Plazo", " ", " ", " ", " ", " ", " "},
				{"Total Pasivo a LP ", " ", " ", " ", " ", " ", " "},
				{"Suma del pasivo", " ", " ", " ", " ", " ", " "},
				{"capital contable ", " ", " ", " ", " ", " ", " "},
				{"Capital Social ", " ", " ", " ", " ", " ", " "},
				{"Reservas", " ", " ", " ", " ", " ", " "},
				{"Resultados de ejercicios anteriores ", " ", " ", " ", " ", " ", " "},
				{"Resultados de ejercicios ", " ", " ", " ", " ", " ", " "},
				{"total capital contable", " ", " ", " ", " ", " ", " "},
				{"Suma del pasivo + capital contable", " ", " ", " ", " ", " ", " "},
			},
			new String[] { // nombre de las columnas 
				"", "A\u00F1o 1", "Porcentaje", "A\u00F1o 2", "porcentaje", "A\u00F1o 3", "Porcentaje"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(179); // Tamaño se la columna de la tabla y su formato
		table.setFont(new Font("Arial", Font.PLAIN, 12));
		Scrolltabla3.setViewportView(table);
		
		JButton btn13 = new JButton("Atras");  // declaracion del boton atras
		btn13.setFont(new Font("Arial", Font.PLAIN, 12));
		btn13.addActionListener(new ActionListener() { // evento del boton atras
			public void actionPerformed(ActionEvent e) {
				Aspectoslegales ventana9 = new Aspectoslegales(); // retroceder  al anterior frame
				ventana9.setVisible(true);
				// cierra el frame anterior y deja abierto el actual
				dispose();
			}
		});
		
		JButton btn14 = new JButton("Siguiente");  // declaracion del boton siguente
		btn14.addActionListener(new ActionListener() {  // evento del boton siguiente
			public void actionPerformed(ActionEvent e) {
				Aspectosfinancierosseccion2 ventana11 = new Aspectosfinancierosseccion2(); // avanzar al siguiente frame
				ventana11.setVisible(true);
				// cierra el frame anterior y deja abierto el actual
				dispose();
				
				JOptionPane.showMessageDialog(null,"\n \n CONSIDERACIONES DE TABLA: \n \n 1 dar doble clicke a cada celda para introducir la informacion "
						+ "\n 2 muy importante verificar la informacion de la tabla ya que si la informacion esta incompleta o se les ovida informacion al pasar a la "
						+ "siguiente seccion y regresar a esta tabla se tendra que llenar de nuevo la tabla en cuestion"
						+ "\n 3 cada vez que se introduzca informacion en cada celda al terminar darle un enter");
				
				// arreglo que guarda los datos de la tabla 
				
				Resultadostablas3[0][0] = (String) table.getValueAt(0, 1);
				Resultadostablas3[1][0] = (String) table.getValueAt(1, 1);
				Resultadostablas3[2][0] = (String) table.getValueAt(2, 1);
				Resultadostablas3[3][0] = (String) table.getValueAt(3, 1);
				Resultadostablas3[4][0] = (String) table.getValueAt(4, 1);
				Resultadostablas3[5][0] = (String) table.getValueAt(5, 1);
				Resultadostablas3[6][0] = (String) table.getValueAt(6, 1);
				Resultadostablas3[7][0] = (String) table.getValueAt(7, 1);
				Resultadostablas3[8][0] = (String) table.getValueAt(8, 1);
				Resultadostablas3[9][0] = (String) table.getValueAt(9, 1);
				Resultadostablas3[10][0] = (String) table.getValueAt(10, 1);
				Resultadostablas3[11][0] = (String) table.getValueAt(11, 1);
				Resultadostablas3[12][0] = (String) table.getValueAt(12, 1);
				Resultadostablas3[13][0] = (String) table.getValueAt(13, 1);
				Resultadostablas3[14][0] = (String) table.getValueAt(14, 1);
				Resultadostablas3[15][0] = (String) table.getValueAt(15, 1);
				Resultadostablas3[16][0] = (String) table.getValueAt(16, 1);
				Resultadostablas3[17][0] = (String) table.getValueAt(17, 1);
				Resultadostablas3[18][0] = (String) table.getValueAt(18, 1);
				Resultadostablas3[19][0] = (String) table.getValueAt(19, 1);
				Resultadostablas3[20][0] = (String) table.getValueAt(20, 1);
				Resultadostablas3[21][0] = (String) table.getValueAt(21, 1);
				Resultadostablas3[22][0] = (String) table.getValueAt(22, 1);
				Resultadostablas3[23][0] = (String) table.getValueAt(23, 1);
				Resultadostablas3[24][0] = (String) table.getValueAt(24, 1);
				Resultadostablas3[25][0] = (String) table.getValueAt(25, 1);
				Resultadostablas3[26][0] = (String) table.getValueAt(26, 1);
				Resultadostablas3[27][0] = (String) table.getValueAt(27, 1);
				Resultadostablas3[28][0] = (String) table.getValueAt(28, 1);
				Resultadostablas3[29][0] = (String) table.getValueAt(29, 1);
				Resultadostablas3[30][0] = (String) table.getValueAt(30, 1);
				Resultadostablas3[31][0] = (String) table.getValueAt(31, 1);
				Resultadostablas3[32][0] = (String) table.getValueAt(32, 1);
				Resultadostablas3[33][0] = (String) table.getValueAt(33, 1);
				Resultadostablas3[34][0] = (String) table.getValueAt(34, 1);
				Resultadostablas3[35][0] = (String) table.getValueAt(35, 1);
				Resultadostablas3[36][0] = (String) table.getValueAt(36, 1);
				Resultadostablas3[37][0] = (String) table.getValueAt(37, 1);
				Resultadostablas3[38][0] = (String) table.getValueAt(38, 1);
				Resultadostablas3[39][0] = (String) table.getValueAt(39, 1);
				Resultadostablas3[40][0] = (String) table.getValueAt(40, 1);
				Resultadostablas3[41][0] = (String) table.getValueAt(41, 1);
				Resultadostablas3[42][0] = (String) table.getValueAt(42, 1);
				
				Resultadostablas3[0][1] = (String) table.getValueAt(0, 2);
				Resultadostablas3[1][1] = (String) table.getValueAt(1, 2);
				Resultadostablas3[2][1] = (String) table.getValueAt(2, 2);
				Resultadostablas3[3][1] = (String) table.getValueAt(3, 2);
				Resultadostablas3[4][1] = (String) table.getValueAt(4, 2);
				Resultadostablas3[5][1] = (String) table.getValueAt(5, 2);
				Resultadostablas3[6][1] = (String) table.getValueAt(6, 2);
				Resultadostablas3[7][1] = (String) table.getValueAt(7, 2);
				Resultadostablas3[8][1] = (String) table.getValueAt(8, 2);
				Resultadostablas3[9][1] = (String) table.getValueAt(9, 2);
				Resultadostablas3[10][1] = (String) table.getValueAt(10, 2);
				Resultadostablas3[11][1] = (String) table.getValueAt(11, 2);
				Resultadostablas3[12][1] = (String) table.getValueAt(12, 2);
				Resultadostablas3[13][1] = (String) table.getValueAt(13, 2);
				Resultadostablas3[14][1] = (String) table.getValueAt(14, 2);
				Resultadostablas3[15][1] = (String) table.getValueAt(15, 2);
				Resultadostablas3[16][1] = (String) table.getValueAt(16, 2);
				Resultadostablas3[17][1] = (String) table.getValueAt(17, 2);
				Resultadostablas3[18][1] = (String) table.getValueAt(18, 2);
				Resultadostablas3[19][1] = (String) table.getValueAt(19, 2);
				Resultadostablas3[20][1] = (String) table.getValueAt(20, 2);
				Resultadostablas3[21][1] = (String) table.getValueAt(21, 2);
				Resultadostablas3[22][1] = (String) table.getValueAt(22, 2);
				Resultadostablas3[23][1] = (String) table.getValueAt(23, 2);
				Resultadostablas3[24][1] = (String) table.getValueAt(24, 2);
				Resultadostablas3[25][1] = (String) table.getValueAt(25, 2);
				Resultadostablas3[26][1] = (String) table.getValueAt(26, 2);
				Resultadostablas3[27][1] = (String) table.getValueAt(27, 2);
				Resultadostablas3[28][1] = (String) table.getValueAt(28, 2);
				Resultadostablas3[29][1] = (String) table.getValueAt(29, 2);
				Resultadostablas3[30][1] = (String) table.getValueAt(30, 2);
				Resultadostablas3[31][1] = (String) table.getValueAt(31, 2);
				Resultadostablas3[32][1] = (String) table.getValueAt(32, 2);
				Resultadostablas3[33][1] = (String) table.getValueAt(33, 2);
				Resultadostablas3[34][1] = (String) table.getValueAt(34, 2);
				Resultadostablas3[35][1] = (String) table.getValueAt(35, 2);
				Resultadostablas3[36][1] = (String) table.getValueAt(36, 2);
				Resultadostablas3[37][1] = (String) table.getValueAt(37, 2);
				Resultadostablas3[38][1] = (String) table.getValueAt(38, 2);
				Resultadostablas3[39][1] = (String) table.getValueAt(39, 2);
				Resultadostablas3[40][1] = (String) table.getValueAt(40, 2);
				Resultadostablas3[41][1] = (String) table.getValueAt(41, 2);
				Resultadostablas3[42][1] = (String) table.getValueAt(42, 2);
				
				Resultadostablas3[0][2] = (String) table.getValueAt(0, 3);
				Resultadostablas3[1][2] = (String) table.getValueAt(1, 3);
				Resultadostablas3[2][2] = (String) table.getValueAt(2, 3);
				Resultadostablas3[3][2] = (String) table.getValueAt(3, 3);
				Resultadostablas3[4][2] = (String) table.getValueAt(4, 3);
				Resultadostablas3[5][2] = (String) table.getValueAt(5, 3);
				Resultadostablas3[6][2] = (String) table.getValueAt(6, 3);
				Resultadostablas3[7][2] = (String) table.getValueAt(7, 3);
				Resultadostablas3[8][2] = (String) table.getValueAt(8, 3);
				Resultadostablas3[9][2] = (String) table.getValueAt(9, 3);
				Resultadostablas3[10][2] = (String) table.getValueAt(10, 3);
				Resultadostablas3[11][2] = (String) table.getValueAt(11, 3);
				Resultadostablas3[12][2] = (String) table.getValueAt(12, 3);
				Resultadostablas3[13][2] = (String) table.getValueAt(13, 3);
				Resultadostablas3[14][2] = (String) table.getValueAt(14, 3);
				Resultadostablas3[15][2] = (String) table.getValueAt(15, 3);
				Resultadostablas3[16][2] = (String) table.getValueAt(16, 3);
				Resultadostablas3[17][2] = (String) table.getValueAt(17, 3);
				Resultadostablas3[18][2] = (String) table.getValueAt(18, 3);
				Resultadostablas3[19][2] = (String) table.getValueAt(19, 3);
				Resultadostablas3[20][2] = (String) table.getValueAt(20, 3);
				Resultadostablas3[21][2] = (String) table.getValueAt(21, 3);
				Resultadostablas3[22][2] = (String) table.getValueAt(22, 3);
				Resultadostablas3[23][2] = (String) table.getValueAt(23, 3);
				Resultadostablas3[24][2] = (String) table.getValueAt(24, 3);
				Resultadostablas3[25][2] = (String) table.getValueAt(25, 3);
				Resultadostablas3[26][2] = (String) table.getValueAt(26, 3);
				Resultadostablas3[27][2] = (String) table.getValueAt(27, 3);
				Resultadostablas3[28][2] = (String) table.getValueAt(28, 3);
				Resultadostablas3[29][2] = (String) table.getValueAt(29, 3);
				Resultadostablas3[30][2] = (String) table.getValueAt(30, 3);
				Resultadostablas3[31][2] = (String) table.getValueAt(31, 3);
				Resultadostablas3[32][2] = (String) table.getValueAt(32, 3);
				Resultadostablas3[33][2] = (String) table.getValueAt(33, 3);
				Resultadostablas3[34][2] = (String) table.getValueAt(34, 3);
				Resultadostablas3[35][2] = (String) table.getValueAt(35, 3);
				Resultadostablas3[36][2] = (String) table.getValueAt(36, 3);
				Resultadostablas3[37][2] = (String) table.getValueAt(37, 3);
				Resultadostablas3[38][2] = (String) table.getValueAt(38, 3);
				Resultadostablas3[39][2] = (String) table.getValueAt(39, 3);
				Resultadostablas3[40][2] = (String) table.getValueAt(40, 3);
				Resultadostablas3[41][2] = (String) table.getValueAt(41, 3);
				Resultadostablas3[42][2] = (String) table.getValueAt(42, 3);
				
				Resultadostablas3[0][3] = (String) table.getValueAt(0, 4);
				Resultadostablas3[1][3] = (String) table.getValueAt(1, 4);
				Resultadostablas3[2][3] = (String) table.getValueAt(2, 4);
				Resultadostablas3[3][3] = (String) table.getValueAt(3, 4);
				Resultadostablas3[4][3] = (String) table.getValueAt(4, 4);
				Resultadostablas3[5][3] = (String) table.getValueAt(5, 4);
				Resultadostablas3[6][3] = (String) table.getValueAt(6, 4);
				Resultadostablas3[7][3] = (String) table.getValueAt(7, 4);
				Resultadostablas3[8][3] = (String) table.getValueAt(8, 4);
				Resultadostablas3[9][3] = (String) table.getValueAt(9, 4);
				Resultadostablas3[10][3] = (String) table.getValueAt(10, 4);
				Resultadostablas3[11][3] = (String) table.getValueAt(11, 4);
				Resultadostablas3[12][3] = (String) table.getValueAt(12, 4);
				Resultadostablas3[13][3] = (String) table.getValueAt(13, 4);
				Resultadostablas3[14][3] = (String) table.getValueAt(14, 4);
				Resultadostablas3[15][3] = (String) table.getValueAt(15, 4);
				Resultadostablas3[16][3] = (String) table.getValueAt(16, 4);
				Resultadostablas3[17][3] = (String) table.getValueAt(17, 4);
				Resultadostablas3[18][3] = (String) table.getValueAt(18, 4);
				Resultadostablas3[19][3] = (String) table.getValueAt(19, 4);
				Resultadostablas3[20][3] = (String) table.getValueAt(20, 4);
				Resultadostablas3[21][3] = (String) table.getValueAt(21, 4);
				Resultadostablas3[22][3] = (String) table.getValueAt(22, 4);
				Resultadostablas3[23][3] = (String) table.getValueAt(23, 4);
				Resultadostablas3[24][3] = (String) table.getValueAt(24, 4);
				Resultadostablas3[25][3] = (String) table.getValueAt(25, 4);
				Resultadostablas3[26][3] = (String) table.getValueAt(26, 4);
				Resultadostablas3[27][3] = (String) table.getValueAt(27, 4);
				Resultadostablas3[28][3] = (String) table.getValueAt(28, 4);
				Resultadostablas3[29][3] = (String) table.getValueAt(29, 4);
				Resultadostablas3[30][3] = (String) table.getValueAt(30, 4);
				Resultadostablas3[31][3] = (String) table.getValueAt(31, 4);
				Resultadostablas3[32][3] = (String) table.getValueAt(32, 4);
				Resultadostablas3[33][3] = (String) table.getValueAt(33, 4);
				Resultadostablas3[34][3] = (String) table.getValueAt(34, 4);
				Resultadostablas3[35][3] = (String) table.getValueAt(35, 4);
				Resultadostablas3[36][3] = (String) table.getValueAt(36, 4);
				Resultadostablas3[37][3] = (String) table.getValueAt(37, 4);
				Resultadostablas3[38][3] = (String) table.getValueAt(38, 4);
				Resultadostablas3[39][3] = (String) table.getValueAt(39, 4);
				Resultadostablas3[40][3] = (String) table.getValueAt(40, 4);
				Resultadostablas3[41][3] = (String) table.getValueAt(41, 4);
				Resultadostablas3[42][3] = (String) table.getValueAt(42, 4);
				
				Resultadostablas3[0][4] = (String) table.getValueAt(0, 5);
				Resultadostablas3[1][4] = (String) table.getValueAt(1, 5);
				Resultadostablas3[2][4] = (String) table.getValueAt(2, 5);
				Resultadostablas3[3][4] = (String) table.getValueAt(3, 5);
				Resultadostablas3[4][4] = (String) table.getValueAt(4, 5);
				Resultadostablas3[5][4] = (String) table.getValueAt(5, 5);
				Resultadostablas3[6][4] = (String) table.getValueAt(6, 5);
				Resultadostablas3[7][4] = (String) table.getValueAt(7, 5);
				Resultadostablas3[8][4] = (String) table.getValueAt(8, 5);
				Resultadostablas3[9][4] = (String) table.getValueAt(9, 5);
				Resultadostablas3[10][4] = (String) table.getValueAt(10, 5);
				Resultadostablas3[11][4] = (String) table.getValueAt(11, 5);
				Resultadostablas3[12][4] = (String) table.getValueAt(12, 5);
				Resultadostablas3[13][4] = (String) table.getValueAt(13, 5);
				Resultadostablas3[14][4] = (String) table.getValueAt(14, 5);
				Resultadostablas3[15][4] = (String) table.getValueAt(15, 5);
				Resultadostablas3[16][4] = (String) table.getValueAt(16, 5);
				Resultadostablas3[17][4] = (String) table.getValueAt(17, 5);
				Resultadostablas3[18][4] = (String) table.getValueAt(18, 5);
				Resultadostablas3[19][4] = (String) table.getValueAt(19, 5);
				Resultadostablas3[20][4] = (String) table.getValueAt(20, 5);
				Resultadostablas3[21][4] = (String) table.getValueAt(21, 5);
				Resultadostablas3[22][4] = (String) table.getValueAt(22, 5);
				Resultadostablas3[23][4] = (String) table.getValueAt(23, 5);
				Resultadostablas3[24][4] = (String) table.getValueAt(24, 5);
				Resultadostablas3[25][4] = (String) table.getValueAt(25, 5);
				Resultadostablas3[26][4] = (String) table.getValueAt(26, 5);
				Resultadostablas3[27][4] = (String) table.getValueAt(27, 5);
				Resultadostablas3[28][4] = (String) table.getValueAt(28, 5);
				Resultadostablas3[29][4] = (String) table.getValueAt(29, 5);
				Resultadostablas3[30][4] = (String) table.getValueAt(30, 5);
				Resultadostablas3[31][4] = (String) table.getValueAt(31, 5);
				Resultadostablas3[32][4] = (String) table.getValueAt(32, 5);
				Resultadostablas3[33][4] = (String) table.getValueAt(33, 5);
				Resultadostablas3[34][4] = (String) table.getValueAt(34, 5);
				Resultadostablas3[35][4] = (String) table.getValueAt(35, 5);
				Resultadostablas3[36][4] = (String) table.getValueAt(36, 5);
				Resultadostablas3[37][4] = (String) table.getValueAt(37, 5);
				Resultadostablas3[38][4] = (String) table.getValueAt(38, 5);
				Resultadostablas3[39][4] = (String) table.getValueAt(39, 5);
				Resultadostablas3[40][4] = (String) table.getValueAt(40, 5);
				Resultadostablas3[41][4] = (String) table.getValueAt(41, 5);
				Resultadostablas3[42][4] = (String) table.getValueAt(42, 5);
				
				Resultadostablas3[0][5] = (String) table.getValueAt(0, 6);
				Resultadostablas3[1][5] = (String) table.getValueAt(1, 6);
				Resultadostablas3[2][5] = (String) table.getValueAt(2, 6);
				Resultadostablas3[3][5] = (String) table.getValueAt(3, 6);
				Resultadostablas3[4][5] = (String) table.getValueAt(4, 6);
				Resultadostablas3[5][5] = (String) table.getValueAt(5, 6);
				Resultadostablas3[6][5] = (String) table.getValueAt(6, 6);
				Resultadostablas3[7][5] = (String) table.getValueAt(7, 6);
				Resultadostablas3[8][5] = (String) table.getValueAt(8, 6);
				Resultadostablas3[9][5] = (String) table.getValueAt(9, 6);
				Resultadostablas3[10][5] = (String) table.getValueAt(10, 6);
				Resultadostablas3[11][5] = (String) table.getValueAt(11, 6);
				Resultadostablas3[12][5] = (String) table.getValueAt(12, 6);
				Resultadostablas3[13][5] = (String) table.getValueAt(13, 6);
				Resultadostablas3[14][5] = (String) table.getValueAt(14, 6);
				Resultadostablas3[15][5] = (String) table.getValueAt(15, 6);
				Resultadostablas3[16][5] = (String) table.getValueAt(16, 6);
				Resultadostablas3[17][5] = (String) table.getValueAt(17, 6);
				Resultadostablas3[18][5] = (String) table.getValueAt(18, 6);
				Resultadostablas3[19][5] = (String) table.getValueAt(19, 6);
				Resultadostablas3[20][5] = (String) table.getValueAt(20, 6);
				Resultadostablas3[21][5] = (String) table.getValueAt(21, 6);
				Resultadostablas3[22][5] = (String) table.getValueAt(22, 6);
				Resultadostablas3[23][5] = (String) table.getValueAt(23, 6);
				Resultadostablas3[24][5] = (String) table.getValueAt(24, 6);
				Resultadostablas3[25][5] = (String) table.getValueAt(25, 6);
				Resultadostablas3[26][5] = (String) table.getValueAt(26, 6);
				Resultadostablas3[27][5] = (String) table.getValueAt(27, 6);
				Resultadostablas3[28][5] = (String) table.getValueAt(28, 6);
				Resultadostablas3[29][5] = (String) table.getValueAt(29, 6);
				Resultadostablas3[30][5] = (String) table.getValueAt(30, 6);
				Resultadostablas3[31][5] = (String) table.getValueAt(31, 6);
				Resultadostablas3[32][5] = (String) table.getValueAt(32, 6);
				Resultadostablas3[33][5] = (String) table.getValueAt(33, 6);
				Resultadostablas3[34][5] = (String) table.getValueAt(34, 6);
				Resultadostablas3[35][5] = (String) table.getValueAt(35, 6);
				Resultadostablas3[36][5] = (String) table.getValueAt(36, 6);
				Resultadostablas3[37][5] = (String) table.getValueAt(37, 6);
				Resultadostablas3[38][5] = (String) table.getValueAt(38, 6);
				Resultadostablas3[39][5] = (String) table.getValueAt(39, 6);
				Resultadostablas3[40][5] = (String) table.getValueAt(40, 6);
				Resultadostablas3[41][5] = (String) table.getValueAt(41, 6);
				Resultadostablas3[42][5] = (String) table.getValueAt(42, 6);
				
			/*	System.out.println(Resultadostablas3[42][0]);
				System.out.println(Resultadostablas3[42][1]);
				System.out.println(Resultadostablas3[42][2]);
				System.out.println(Resultadostablas3[42][3]);
				System.out.println(Resultadostablas3[42][4]);
				System.out.println(Resultadostablas3[42][5]); */
			}
		});
		btn14.setFont(new Font("Arial", Font.PLAIN, 12));
		// tipo de layout grupal del contenido del frame
		GroupLayout gl_ContenidoPrincipal6 = new GroupLayout(ContenidoPrincipal6);
		gl_ContenidoPrincipal6.setHorizontalGroup(
				// tipo de alineacion adaptable del contenido pa cualquier tipo de pantalla
			gl_ContenidoPrincipal6.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ContenidoPrincipal6.createSequentialGroup()
					.addGap(10)
					// tamaño adaptable de los campos y contenidos del frame
                    //  Para cualquier pantalla de laptop o computadora de escritorio
					.addComponent(Enunciadotabla1, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_ContenidoPrincipal6.createSequentialGroup()
					.addGap(10)
					.addComponent(Scrolltabla3, GroupLayout.PREFERRED_SIZE, 1305, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_ContenidoPrincipal6.createSequentialGroup()
					.addGap(1016)
					.addComponent(btn13, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(btn14, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
		);
		gl_ContenidoPrincipal6.setVerticalGroup(
			gl_ContenidoPrincipal6.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ContenidoPrincipal6.createSequentialGroup()
					.addGap(11)
					.addComponent(Enunciadotabla1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addComponent(Scrolltabla3, GroupLayout.PREFERRED_SIZE, 659, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addGroup(gl_ContenidoPrincipal6.createParallelGroup(Alignment.LEADING)
						.addComponent(btn13)
						.addComponent(btn14)))
		);
		ContenidoPrincipal6.setLayout(gl_ContenidoPrincipal6);
		GroupLayout gl_ContentPanel = new GroupLayout(ContentPanel);
		gl_ContentPanel.setHorizontalGroup(
			gl_ContentPanel.createParallelGroup(Alignment.LEADING)
				.addComponent(ScrollPrincipal6, GroupLayout.DEFAULT_SIZE, 1361, Short.MAX_VALUE)
		);
		gl_ContentPanel.setVerticalGroup(
			gl_ContentPanel.createParallelGroup(Alignment.LEADING)
				.addComponent(ScrollPrincipal6, GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
		);
		ContentPanel.setLayout(gl_ContentPanel);
	}
}
