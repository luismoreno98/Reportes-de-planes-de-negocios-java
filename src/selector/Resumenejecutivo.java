package selector;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileSystemView;

import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.colors.Color;
import com.itextpdf.kernel.colors.DeviceCmyk;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.kernel.pdf.canvas.draw.DottedLine;
import com.itextpdf.kernel.pdf.canvas.parser.listener.ITextChunkLocation;
import com.itextpdf.kernel.pdf.canvas.parser.listener.TextChunk;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.AreaBreak;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Text;
import com.itextpdf.layout.property.HorizontalAlignment;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.property.VerticalAlignment;
import com.itextpdf.styledxmlparser.jsoup.nodes.Element;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Resumenejecutivo extends JFrame {

	// Declaracion de la variables se puede utilizar en cualquier clase ( algunas son solo para esta clase)
	private JPanel contentPane;
	public static JTextArea Respuesta29 = new JTextArea();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Resumenejecutivo frame = new Resumenejecutivo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 *  iniciacion de la aplicacion.
	 */
	public Resumenejecutivo() {             /* configuracion general del frame*/
		setTitle("Resumen ejecutivo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_HORIZ);
		setBounds(100, 25, 1377, 984);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JScrollPane ScrollPrincipal9 = new JScrollPane();
		
		JPanel ContenidoPrincipal9 = new JPanel();
		ScrollPrincipal9.setViewportView(ContenidoPrincipal9);
		/*contenido principal del frame,enunciados de los campos  y
        sus respectivo formato para los campos */
		JLabel Enunciado34 = new JLabel("Resumen ejecutivo");
		Enunciado34.setFont(new Font("Arial", Font.PLAIN, 16));
		
		JScrollPane Scroll29 = new JScrollPane();
		Respuesta29.setFont(new Font("Arial", Font.PLAIN, 12));
		
		Respuesta29.setLineWrap(true);
		Respuesta29.setWrapStyleWord(true);
		Scroll29.setViewportView(Respuesta29);
		
		JPopupMenu Menu29 = new JPopupMenu(); // menu del cliclk derecho del mouse
		addPopup(Respuesta29, Menu29);
		
		JMenuItem menuopcion85 = new JMenuItem("Cortar");   // opcion de cortar
		/* metodo que permite adquirir la accion del atajo cortar con
        el teclado   */
		menuopcion85.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
		menuopcion85.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // metodo para cortar
				Respuesta29.cut();
			}
		});
		menuopcion85.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu29.add(menuopcion85);
		
		JMenuItem menuopcion86 = new JMenuItem("Copiar");  // metodo para copiar
		/* metodo que permite adquirir la accion del atajo copiar con
        el teclado */
		menuopcion86.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
		menuopcion86.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {  // metodo para copiar
				Respuesta29.copy();
			}
		});
		menuopcion86.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu29.add(menuopcion86);
		
		JMenuItem menuopcion87 = new JMenuItem("Pegar");  // opcion de pegar
		/* metodo que permite adquirir la accion del atajo pegar con
        el teclado */
		menuopcion87.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
		menuopcion87.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // metodo para pegar
				Respuesta29.paste();
			}
		});
		menuopcion87.setFont(new Font("Arial", Font.PLAIN, 14));
		Menu29.add(menuopcion87);
		
		JButton btn19 = new JButton("Atras"); // declaracion del boton atras
		btn19.addActionListener(new ActionListener() {   // evento del boton atras
			public void actionPerformed(ActionEvent e) {
				
				Aspectosfinancierosseccion3 ventana12 = new Aspectosfinancierosseccion3();  // retroceder  al anterior frame
				ventana12.setVisible(true);
				// cierra el frame anterior y deja abierto el actual
				dispose();
			}
		});
		btn19.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JButton btn20 = new JButton("Generar PDF"); // declaracion del boton generar PDF 
		btn20.addActionListener(new ActionListener() { // evento del boton atras
			public void actionPerformed(ActionEvent e) {
			
			String Resultado7 = null;
			Resultado7= Respuesta29.getText(); // guarda el texto del campo de resumen ejecutivo
			
			File ruta = FileSystemView.getFileSystemView().getHomeDirectory();  // obtiene la ruta del escritorio
			
			String username = ruta.getAbsolutePath(); //obtener la ruta en forma de cadena 
			
			String Path =  username + "\\Plan de negocios.pdf"; // obtener la ruta completa del pdf con su respectivo nombre 
			try {
				PdfWriter pdfwriter = new PdfWriter(Path); // crear el pdf en la ruta obtenida 
				PdfDocument pdfDocument = new PdfDocument(pdfwriter); // iniciar a crear el pdf 
				// Declaracion de estilos de letras 
				PdfFont fonttitlebold = PdfFontFactory.createFont(StandardFonts.HELVETICA_BOLD);
				//crear  la primera pagina para laportada 
					 PdfPage page1 = pdfDocument.addNewPage();
					 
					 
                    // crear un canvas en la prmera pagina para crear un borde de pagina 
				    PdfCanvas canvas = new PdfCanvas(page1);
				    // color del borde de pagina 
				    Color colortec = new DeviceCmyk(0, 90, 72, 52);
				    // dibujar las lineas del borde de pagina cuadrado
				    canvas.moveTo(26, 36)
				    .setStrokeColor(colortec)
	                .lineTo(26, 820)
	                .lineTo(580,821)
	                .lineTo(580,36)
	                .lineTo(26, 36)
	                .stroke();
				    
				 // crear el objeto de la imagen y la ruta de donde toma la imagen 
				ImageData imageData = ImageDataFactory.create("src/img/logo_tec.png");
			   	Image image = new Image(imageData).scaleAbsolute(100,100)
					.setFixedPosition(470, 700);
					    
				
				ImageData imageData2 = ImageDataFactory.create("src/img/logo_tecnm.png");
				Image image2 = new Image(imageData2).scaleAbsolute(100,100)
					    .setFixedPosition(35, 700);
				// secrean saltos de linea con el objeto de parafo centrado para baja el texto  
				Paragraph salto1 = new Paragraph("\n");
				salto1.setTextAlignment(TextAlignment.CENTER);
				
				Paragraph salto2 = new Paragraph("\n");
				salto2.setTextAlignment(TextAlignment.CENTER);
				
				Paragraph salto3 = new Paragraph("\n");
				salto3.setTextAlignment(TextAlignment.CENTER);
				
				Paragraph salto4 = new Paragraph("\n");
				salto4.setTextAlignment(TextAlignment.CENTER);
				// creamos los objetos de tipo parrafo de los datos de la portada centrados
				Paragraph instituto = new Paragraph("INSTITUTO TECNOLOGICO DE MERIDA \n TECNOLOGICO NACIONAL DE MEXICO");
				instituto.setTextAlignment(TextAlignment.CENTER);
				
				Paragraph deprtamento = new Paragraph("DEPARTAMENTO DE \n" + DatosdePortada.Resultados8[0]); // llamamos a la variable de la clase respectivamente
				deprtamento.setTextAlignment(TextAlignment.CENTER);
				
				Paragraph ingenieria = new Paragraph(DatosdePortada.Resultados8[1]);
				ingenieria.setTextAlignment(TextAlignment.CENTER);
				
				Paragraph materia = new Paragraph(DatosdePortada.Resultados8[2]);
				materia.setTextAlignment(TextAlignment.CENTER);
				
				Paragraph grupo = new Paragraph(DatosdePortada.Resultados8[3]);
				grupo.setTextAlignment(TextAlignment.CENTER);
				
				Paragraph maestro = new Paragraph(DatosdePortada.Resultados8[4]);
				maestro.setTextAlignment(TextAlignment.CENTER);
				// agregramos un estilo de letra al objeto del parrafo 
				Paragraph plan = new Paragraph("PLAN DE NEGOCIOS").setFont(fonttitlebold);
				plan.setTextAlignment(TextAlignment.CENTER);
				
				Paragraph presenta = new Paragraph("PRESENTA");
				presenta.setTextAlignment(TextAlignment.CENTER);
				
				Paragraph alumno = new Paragraph(DatosdePortada.Resultados8[5] + " " + DatosdePortada.Resultados8[6]);
				alumno.setTextAlignment(TextAlignment.CENTER);
				
				Paragraph fechalugar = new Paragraph("MÉRIDA, YUCATÁN A \n" + DatosdePortada.Resultados8[7]);
				fechalugar.setTextAlignment(TextAlignment.CENTER);
				
		
		
				// se crea la pagina 2   
				pdfDocument.addNewPage();
				
			
			
		         // se crear los objetos para los respectivos datos y contenido 
				
				Paragraph TituloIntroduccion = new Paragraph("INTRODUCCION").setFontSize(20);
				TituloIntroduccion.setTextAlignment(TextAlignment.CENTER);
				
			  Paragraph parrafointroduccion = new Paragraph(Intro.Resultado9);
		        parrafointroduccion.setTextAlignment(TextAlignment.LEFT);
		     
		        Paragraph Tituloindice = new Paragraph("INDICE").setFontSize(20);
					Tituloindice.setTextAlignment(TextAlignment.CENTER);
		         	
				 Paragraph indice1 = new Paragraph("INTRODUCCION .................................................................................................1")
							 .setFontSize(12);
					   indice1.setTextAlignment(TextAlignment.CENTER);
					
					 Paragraph indice2 = new Paragraph("MODELO DE NEGOCIOS .................................................................................2")
								 .setFontSize(12);
						   indice2.setTextAlignment(TextAlignment.CENTER);
						   
						   Paragraph indice3 = new Paragraph("RESUMEN EJECUTIVO ....................................................................................7")
									 .setFontSize(12);
							   indice3.setTextAlignment(TextAlignment.CENTER);
							   
							   Paragraph indice4 = new Paragraph("GENERALIDADES DEL NEGOCIO ................................................................14")
										 .setFontSize(12);
								   indice4.setTextAlignment(TextAlignment.CENTER);
								   
								   Paragraph indice5 = new Paragraph("ASPECTOS DEL MERCADO ...........................................................................19")
											 .setFontSize(12);
									   indice5.setTextAlignment(TextAlignment.CENTER);
									    
									   Paragraph indice6 = new Paragraph("ASPECTOS DE LAS OPERACIONES ..............................................................26")
												 .setFontSize(12);
										   indice6.setTextAlignment(TextAlignment.CENTER);
									  
										   Paragraph indice7 = new Paragraph("ASPECTOS ADMINISTRATIVOS ...................................................................33")
													 .setFontSize(12);
											   indice7.setTextAlignment(TextAlignment.CENTER);
												
											   Paragraph indice8 = new Paragraph("ASPECTOS LEGALES ........................................................................................48")
														 .setFontSize(12);
												   indice8.setTextAlignment(TextAlignment.CENTER);
												   
												   Paragraph indice9 = new Paragraph("ASPECTOS FINANCIEROS ..............................................................................57")
															 .setFontSize(12);
													   indice9.setTextAlignment(TextAlignment.CENTER);
													   
													   // se crean la pagina 3
													   pdfDocument.addNewPage();
// a partir de la pagina 3 en adelantes todo el contenido del pdf esta alineado a la izquierda a ecepcion de los titulos
													   
													   // se crean los objetos de la pagina 3
													   
													   Paragraph titulo1 = new Paragraph("PLAN DE NEGOCIOS \n MODELO DE NEGOCIO ").setFontSize(20);
														titulo1.setTextAlignment(TextAlignment.CENTER);
														
														  Paragraph parrafo1 = new Paragraph("Los nueve apartados del modelo de negocios son:").setFontSize(12);
														 	parrafo1.setTextAlignment(TextAlignment.LEFT);
										   
														Paragraph parrafo2 = new Paragraph("Propuesta de valor: " + Modelonegocios.Resultados1[4]).setFontSize(12);
												         parrafo2.setTextAlignment(TextAlignment.LEFT);
												         
												         // se crean la pagina 4 con sus respectivos objetos de los datos 
												         pdfDocument.addNewPage();
												        
												         Paragraph parrafo3 = new Paragraph("segmento de mercado: " + Modelonegocios.Resultados1[7]).setFontSize(12);
														 parrafo3.setTextAlignment(TextAlignment.LEFT);
												         
												         Paragraph parrafo4 = new Paragraph("Canales de distribucion: " + Modelonegocios.Resultados1[6]).setFontSize(12);
														 parrafo4.setTextAlignment(TextAlignment.LEFT);
												 
					                                Paragraph parrafo5 = new Paragraph("Relacion de clientes: " + Modelonegocios.Resultados1[5]).setFontSize(12);
							 			  	         parrafo5.setTextAlignment(TextAlignment.LEFT);  
							 			  	         
							 			  	      Paragraph parrafo6 = new Paragraph("Fuente de ingreso: " + Modelonegocios.Resultados1[9]).setFontSize(12);
							 			  	         parrafo6.setTextAlignment(TextAlignment.LEFT); 
							 			  	         
							 			  	      Paragraph parrafo7 = new Paragraph("Recursos clave: " + Modelonegocios.Resultados1[3]).setFontSize(12);
							 			  	         parrafo7.setTextAlignment(TextAlignment.LEFT);
						 				  	          
							 			  	      Paragraph parrafo8 = new Paragraph("Socios clave o provedores: " + Modelonegocios.Resultados1[1]).setFontSize(12);
							 			  	         parrafo8.setTextAlignment(TextAlignment.LEFT);
							 			  	         
							 			  	      Paragraph parrafo9 = new Paragraph("Actividades clave: " + Modelonegocios.Resultados1[2]).setFontSize(12);
							 			  	         parrafo9.setTextAlignment(TextAlignment.LEFT);
							 			  	         
							 			  	      Paragraph parrafo10 = new Paragraph("Costos: " + Modelonegocios.Resultados1[8]).setFontSize(12);
							 			  	         parrafo10.setTextAlignment(TextAlignment.LEFT);
							 			  	         // se crean la pagina 5  con los objetos de los datos 
							 			  	      pdfDocument.addNewPage();
							 			  	      
							 			  	   Paragraph titulo2 = new Paragraph("Descripcion Modelo de negocio").setFontSize(20);
						 			  	         titulo2.setTextAlignment(TextAlignment.CENTER);
							 			  	      
						 			  	      Paragraph parrafo11 = new Paragraph( Modelonegocios.Resultados1[10]).setFontSize(12);
						 			  	         parrafo11.setTextAlignment(TextAlignment.LEFT);
						 			  	         
						 			  	      Paragraph titulo3 = new Paragraph("Descripcion servicio o modelo").setFontSize(20);
						 			  	         titulo3.setTextAlignment(TextAlignment.CENTER);
						 			  	         
						 			  	      Paragraph parrafo12 = new Paragraph( Modelonegocios.Resultados1[0]).setFontSize(12);
						 			  	         parrafo12.setTextAlignment(TextAlignment.LEFT);
						 			  	         // se crean la pagina 6 con sus objetos  de contenido
						 			  	      pdfDocument.addNewPage();
						 			  	         
						 			  	      Paragraph titulo4 = new Paragraph("Resumen ejecutivo").setFontSize(20);
						 			  	         titulo4.setTextAlignment(TextAlignment.CENTER);
							 			  	      
						 			  	      Paragraph parrafo13 = new Paragraph( Resultado7 ).setFontSize(12);
						 			  	         parrafo13.setTextAlignment(TextAlignment.LEFT);
						 			  	         // se crea la pagina 7 de forma automatica 
						 			  	      Paragraph titulo5 = new Paragraph("Generalidades del negocio").setFontSize(20);
						 			  	         titulo5.setTextAlignment(TextAlignment.CENTER);
						 			  	         
						 			  	      Paragraph parrafo14 = new Paragraph( Generalidadesnegocios.Resultado2[0]).setFontSize(12);
						 			  	         parrafo14.setTextAlignment(TextAlignment.LEFT);
						 			  	         
						 			  	      ImageData imageData3 = ImageDataFactory.create(Generalidadesnegocios.Ruta1.getAbsolutePath());
						 						Image image3 = new Image(imageData3).scaleAbsolute(300,200)
						 							    .setHorizontalAlignment(HorizontalAlignment.CENTER);
						 						
						 						 Paragraph parrafo15 = new Paragraph( Generalidadesnegocios.Resultado2[1]).setFontSize(12);
						 			  	         parrafo15.setTextAlignment(TextAlignment.LEFT);
						 			  	         
						 			  	      Paragraph parrafo16 = new Paragraph( Generalidadesnegocios.Resultado2[2]).setFontSize(12);
						 			  	         parrafo16.setTextAlignment(TextAlignment.LEFT);
						 			  	         
						 			  	      Paragraph parrafo17 = new Paragraph( Generalidadesnegocios.Resultado2[3]).setFontSize(12);
						 			  	         parrafo17.setTextAlignment(TextAlignment.LEFT);
						 			  	         
						 			  	      Paragraph parrafo18 = new Paragraph( Generalidadesnegocios.Resultado2[4]).setFontSize(12);
						 			  	         parrafo18.setTextAlignment(TextAlignment.LEFT);
						 			  	         // Pagina 8 de forma automatica 
						 			  	      Paragraph titulo6 = new Paragraph("Aspectos de Mercado").setFontSize(20);
						 			  	         titulo6.setTextAlignment(TextAlignment.CENTER); 
						 			  	         
						 			  	      Paragraph parrafo19 = new Paragraph( Aspectosmercado.Resultado3[0]).setFontSize(12);
						 			  	         parrafo19.setTextAlignment(TextAlignment.LEFT);
						 			  	         
						 			  	      Paragraph parrafo20 = new Paragraph( Aspectosmercado.Resultado3[1]).setFontSize(12);
						 			  	         parrafo20.setTextAlignment(TextAlignment.LEFT);
						 			  	         
						 			  	      Paragraph parrafo21 = new Paragraph( Aspectosmercado.Resultado3[2]).setFontSize(12);
						 			  	         parrafo21.setTextAlignment(TextAlignment.LEFT);
						 			  	         
						 			  	      Paragraph parrafo22 = new Paragraph( Aspectosmercado.Resultado3[3]).setFontSize(12);
						 			  	         parrafo22.setTextAlignment(TextAlignment.LEFT);
						 			  	         // pagina 9 
						 			  	      Paragraph titulo7 = new Paragraph("Aspectos Operativos").setFontSize(20);
						 			  	         titulo7.setTextAlignment(TextAlignment.CENTER);
						 			  	       
						 			  	      Paragraph parrafo23 = new Paragraph( Aspectosoperativos.Resultados4[0]).setFontSize(12);
						 			  	         parrafo23.setTextAlignment(TextAlignment.LEFT);
						 			  	         
						 			  	      Paragraph parrafo24 = new Paragraph( Aspectosoperativos.Resultados4[1]).setFontSize(12);
						 			  	         parrafo24.setTextAlignment(TextAlignment.LEFT);
						 			  	         
						 			  	      Paragraph parrafo25 = new Paragraph( Aspectosoperativos.Resultados4[2]).setFontSize(12);
						 			  	         parrafo25.setTextAlignment(TextAlignment.LEFT); 
						 			  	         
						 			  	      Paragraph parrafo26 = new Paragraph( Aspectosoperativos.Resultados4[3]).setFontSize(12);
						 			  	         parrafo26.setTextAlignment(TextAlignment.LEFT);
						 			  	         // pagina 10
						 			  	      Paragraph titulo8 = new Paragraph("Aspectos Administrativos").setFontSize(20);
						 			  	         titulo8.setTextAlignment(TextAlignment.CENTER);
						 			  	         
						 			  	      Paragraph parrafo27 = new Paragraph( Aspectosadministrativos.Resultados5[0]).setFontSize(12);
						 			  	         parrafo27.setTextAlignment(TextAlignment.LEFT);
						 			  	         
							 			  	   Paragraph parrafo28 = new Paragraph( Aspectosadministrativos.Resultados5[1]).setFontSize(12);
							 			  	        parrafo28.setTextAlignment(TextAlignment.LEFT);
						 			  	         
							 			  	     Paragraph parrafo29 = new Paragraph( Aspectosadministrativos.Resultados5[2]).setFontSize(12);
							 			  	        parrafo29.setTextAlignment(TextAlignment.LEFT);
							 			  	        // pagina 11
							 			  	     Paragraph titulo9 = new Paragraph("Aspectos Legales").setFontSize(20);
						 			  	         titulo9.setTextAlignment(TextAlignment.CENTER);
						 			  	         
						 			  	      Paragraph parrafo30 = new Paragraph( Aspectoslegales.Resultado6).setFontSize(12);
						 			  	        parrafo30.setTextAlignment(TextAlignment.LEFT);
						 			  	        
						 			  	     Paragraph title1 = new Paragraph("Tabulador de sueldos").setFontSize(15);
					 			  	         title1.setTextAlignment(TextAlignment.LEFT);
					 			  	         
					 			  	      Paragraph title2 = new Paragraph("Construccion legal").setFontSize(15);
					 			  	         title2.setTextAlignment(TextAlignment.LEFT);
						 			  	       // Pagina 12  
						 			  	     Paragraph titulo12 = new Paragraph("Aspectos financieros").setFontSize(20);
					 			  	         titulo12.setTextAlignment(TextAlignment.CENTER);
					 			  	         
					 			  	      Paragraph title3 = new Paragraph("Balance general presupuestado").setFontSize(15);
					 			  	         title3.setTextAlignment(TextAlignment.LEFT);
					 			  	         
					 			  	      Paragraph title4 = new Paragraph("Estado de resultados presupuestado").setFontSize(15);
					 			  	         title4.setTextAlignment(TextAlignment.LEFT);
					 			  	         
					 			  	      Paragraph title5 = new Paragraph("Flujo efectivo presupuestado ").setFontSize(15);
					 			  	         title5.setTextAlignment(TextAlignment.LEFT);
					 			  	         
					 			  	      Paragraph title6 = new Paragraph("Tipo de sociedades").setFontSize(15);
					 			  	         title6.setTextAlignment(TextAlignment.LEFT);
						 			  	        
						 			  	      // se crea el objeto tabla se requiere el numero de columnas a crear
						 			  	      Table table1 = new Table(6);
						 			  	   
						 			  	     // a partir de una celda como modelo
						 			  	      // creacion de la primera fila 
						 			  	   Cell cell1 = new Cell();
						 			  	cell1.add(new Paragraph("N°"));
						 			  	  table1.addCell(cell1); 
						 			  	  
						 			  	  table1.addCell(new Cell().add(new Paragraph("puesto")));
						 			  	 table1.addCell(new Cell().add(new Paragraph("Cantidad de personas en el puesto")));
						 			  	table1.addCell(new Cell().add(new Paragraph("Importe sueldo mensual")));
						 			  	table1.addCell(new Cell().add(new Paragraph("Importe de Prestaciones")));
								 	    table1.addCell(new Cell().add(new Paragraph("Descuentos \n (SR,AFORE,INFONAVIT,FONACOT ETC")));
								 	    // creacion de la segunda fila 
								 	   table1.addCell(new Cell().add(new Paragraph("1")));
						 			  	 table1.addCell(new Cell().add(new Paragraph(Aspectosadministrativos.Resultadostablas1[0][0])));
						 			  	table1.addCell(new Cell().add(new Paragraph(Aspectosadministrativos.Resultadostablas1[0][1])));
						 			  	table1.addCell(new Cell().add(new Paragraph(Aspectosadministrativos.Resultadostablas1[0][2])));
								 	    table1.addCell(new Cell().add(new Paragraph(Aspectosadministrativos.Resultadostablas1[0][3])));
								 	   table1.addCell(new Cell().add(new Paragraph(Aspectosadministrativos.Resultadostablas1[0][4])));
								  
								 	  table1.addCell(new Cell().add(new Paragraph("2")));
						 			  	 table1.addCell(new Cell().add(new Paragraph(Aspectosadministrativos.Resultadostablas1[1][0])));
						 			  	table1.addCell(new Cell().add(new Paragraph(Aspectosadministrativos.Resultadostablas1[1][1])));
						 			  	table1.addCell(new Cell().add(new Paragraph(Aspectosadministrativos.Resultadostablas1[1][2])));
								 	    table1.addCell(new Cell().add(new Paragraph(Aspectosadministrativos.Resultadostablas1[1][3])));
								 	   table1.addCell(new Cell().add(new Paragraph(Aspectosadministrativos.Resultadostablas1[1][4])));
								 	   
								 	  table1.addCell(new Cell().add(new Paragraph("3")));
						 			  	 table1.addCell(new Cell().add(new Paragraph(Aspectosadministrativos.Resultadostablas1[2][0])));
						 			  	table1.addCell(new Cell().add(new Paragraph(Aspectosadministrativos.Resultadostablas1[2][1])));
						 			  	table1.addCell(new Cell().add(new Paragraph(Aspectosadministrativos.Resultadostablas1[2][2])));
								 	    table1.addCell(new Cell().add(new Paragraph(Aspectosadministrativos.Resultadostablas1[2][3])));
								 	   table1.addCell(new Cell().add(new Paragraph(Aspectosadministrativos.Resultadostablas1[2][4])));
								 	   
								 	  table1.addCell(new Cell().add(new Paragraph("4")));
						 			  	 table1.addCell(new Cell().add(new Paragraph(Aspectosadministrativos.Resultadostablas1[3][0])));
						 			  	table1.addCell(new Cell().add(new Paragraph(Aspectosadministrativos.Resultadostablas1[3][1])));
						 			  	table1.addCell(new Cell().add(new Paragraph(Aspectosadministrativos.Resultadostablas1[3][2])));
								 	    table1.addCell(new Cell().add(new Paragraph(Aspectosadministrativos.Resultadostablas1[3][3])));
								 	   table1.addCell(new Cell().add(new Paragraph(Aspectosadministrativos.Resultadostablas1[3][4])));
								 	   
								 	  table1.addCell(new Cell().add(new Paragraph("5")));
						 			  	 table1.addCell(new Cell().add(new Paragraph(Aspectosadministrativos.Resultadostablas1[4][0])));
						 			  	table1.addCell(new Cell().add(new Paragraph(Aspectosadministrativos.Resultadostablas1[4][1])));
						 			  	table1.addCell(new Cell().add(new Paragraph(Aspectosadministrativos.Resultadostablas1[4][2])));
								 	    table1.addCell(new Cell().add(new Paragraph(Aspectosadministrativos.Resultadostablas1[4][3])));
								 	   table1.addCell(new Cell().add(new Paragraph(Aspectosadministrativos.Resultadostablas1[4][4])));
								 	   
								 	  table1.addCell(new Cell().add(new Paragraph("6")));
						 			  	 table1.addCell(new Cell().add(new Paragraph(Aspectosadministrativos.Resultadostablas1[5][0])));
						 			  	table1.addCell(new Cell().add(new Paragraph(Aspectosadministrativos.Resultadostablas1[5][1])));
						 			  	table1.addCell(new Cell().add(new Paragraph(Aspectosadministrativos.Resultadostablas1[5][2])));
								 	    table1.addCell(new Cell().add(new Paragraph(Aspectosadministrativos.Resultadostablas1[5][3])));
								 	   table1.addCell(new Cell().add(new Paragraph(Aspectosadministrativos.Resultadostablas1[5][4])));
								 	   
								 	  table1.addCell(new Cell().add(new Paragraph("7")));
						 			  	 table1.addCell(new Cell().add(new Paragraph(Aspectosadministrativos.Resultadostablas1[6][0])));
						 			  	table1.addCell(new Cell().add(new Paragraph(Aspectosadministrativos.Resultadostablas1[6][1])));
						 			  	table1.addCell(new Cell().add(new Paragraph(Aspectosadministrativos.Resultadostablas1[6][2])));
								 	    table1.addCell(new Cell().add(new Paragraph(Aspectosadministrativos.Resultadostablas1[6][3])));
								 	   table1.addCell(new Cell().add(new Paragraph(Aspectosadministrativos.Resultadostablas1[6][4])));
								 	   
								 	  table1.addCell(new Cell().add(new Paragraph("8")));
						 			  	 table1.addCell(new Cell().add(new Paragraph(Aspectosadministrativos.Resultadostablas1[7][0])));
						 			  	table1.addCell(new Cell().add(new Paragraph(Aspectosadministrativos.Resultadostablas1[7][1])));
						 			  	table1.addCell(new Cell().add(new Paragraph(Aspectosadministrativos.Resultadostablas1[7][2])));
								 	    table1.addCell(new Cell().add(new Paragraph(Aspectosadministrativos.Resultadostablas1[7][3])));
								 	   table1.addCell(new Cell().add(new Paragraph(Aspectosadministrativos.Resultadostablas1[7][4])));
								 	   
								 	  table1.addCell(new Cell().add(new Paragraph("9")));
						 			  	 table1.addCell(new Cell().add(new Paragraph(Aspectosadministrativos.Resultadostablas1[8][0])));
						 			  	table1.addCell(new Cell().add(new Paragraph(Aspectosadministrativos.Resultadostablas1[8][1])));
						 			  	table1.addCell(new Cell().add(new Paragraph(Aspectosadministrativos.Resultadostablas1[8][2])));
								 	    table1.addCell(new Cell().add(new Paragraph(Aspectosadministrativos.Resultadostablas1[8][3])));
								 	   table1.addCell(new Cell().add(new Paragraph(Aspectosadministrativos.Resultadostablas1[8][4])));
								 	   
								 	  table1.addCell(new Cell().add(new Paragraph("10")));
						 			  	 table1.addCell(new Cell().add(new Paragraph(Aspectosadministrativos.Resultadostablas1[9][0])));
						 			  	table1.addCell(new Cell().add(new Paragraph(Aspectosadministrativos.Resultadostablas1[9][1])));
						 			  	table1.addCell(new Cell().add(new Paragraph(Aspectosadministrativos.Resultadostablas1[9][2])));
								 	    table1.addCell(new Cell().add(new Paragraph(Aspectosadministrativos.Resultadostablas1[9][3])));
								 	   table1.addCell(new Cell().add(new Paragraph(Aspectosadministrativos.Resultadostablas1[9][4])));
								 	   
								 	  
								 	   // alineacion de la tabla y el texto 
								 	    table1.setTextAlignment(TextAlignment.CENTER);
								 	    table1.setHorizontalAlignment(HorizontalAlignment.LEFT);
								 	    
								 	    
						 			  	
						 			  	
								 	   Table table2 = new Table(3);
					 			  	   
					 			  	      
					 			  	   Cell cell2 = new Cell();
					 			  	cell2.add(new Paragraph(" "));
					 			  	  table2.addCell(cell2); 
					 			  	  
					 			  	  table2.addCell(new Cell().add(new Paragraph("Mi Propuesta")));
					 			  	 table2.addCell(new Cell().add(new Paragraph("A")));
					 			 // 	table2.addCell(new Cell().add(new Paragraph("B")));
					 			  //	table2.addCell(new Cell().add(new Paragraph("C")));
					 			  //	table2.addCell(new Cell().add(new Paragraph("D")));
					 			   
							 	    
							 	   table2.addCell(new Cell().add(new Paragraph("Producto")));
					 			  	 table2.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2[2][0])));
					 			  	table2.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2[2][1])));
					 			//  	table2.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2[2][2])));
					 			 // 	table2.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2[2][3])));
					 			 // 	table2.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2[2][4])));
					 			  	
					 			  	
							 	 
							 	 
							 	  table2.addCell(new Cell().add(new Paragraph("Precio")));
					 			  	 table2.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2[3][0])));
					 			  	table2.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2[3][1])));
					 			//  	table2.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2[3][2])));
					 			//  	table2.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2[3][3])));
					 			//  	table2.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2[3][4])));
							 	  
							 	  table2.addCell(new Cell().add(new Paragraph("Punto de venta")));
					 			  	 table2.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2[4][0])));
					 			  	table2.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2[4][1])));
					 		//	  	table2.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2[4][2])));
					 		//		table2.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2[4][3])));
					 		//		table2.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2[4][4])));
							 	   
							 	   
							 	  table2.addCell(new Cell().add(new Paragraph("Publicidad")));
					 			  	 table2.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2[5][0])));
					 			  	table2.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2[5][1])));
					 		//	  	table2.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2[5][2])));
					 		//	 	table2.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2[5][3])));
					 		//	 	table2.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2[5][4])));
							 	  
							 	   
							 	  table2.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2[0][0])));
					 			  	 table2.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2[0][1])));
					 			  	table2.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2[0][2])));
					 		//	  	table2.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2[0][3])));
					 		//	  	table2.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2[0][4])));
					 		//	  	table2.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2[0][5])));
							 	   
							 	   
							 	  table2.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2[1][0])));
					 			  	 table2.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2[1][1])));
					 			  	table2.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2[1][2])));
					 		//	  	table2.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2[1][3])));
					 		//		table2.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2[1][4])));
					 		//	  	table2.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2[1][5])));
							 	  
							 	   
							 	 
							 	   
							 	    table2.setTextAlignment(TextAlignment.CENTER);
							 	    table2.setHorizontalAlignment(HorizontalAlignment.LEFT);
							 	    
							 	   Table table3_1= new Table(8);
				 			  	   
				 			  	      
				 			  	   Cell cell3_1 = new Cell();
				 			  	cell3_1.add(new Paragraph(" "));
				 			  	  table3_1.addCell(cell3_1); 
				 			  	  
				 			  	  table3_1.addCell(new Cell().add(new Paragraph(" ")));
				 			  	 table3_1.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2_1[0][0])));
				 			 	table3_1.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2_1[0][1])));
				 			  	table3_1.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2_1[0][2])));
				 			  	table3_1.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2_1[0][3])));
				 			  	table3_1.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2_1[0][4])));
				 			  	table3_1.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2_1[0][5])));
				 			  	
				 			  	table3_1.addCell(new Cell().add(new Paragraph("1")));
				 			  	table3_1.addCell(new Cell().add(new Paragraph("Responsabilidades de socios")));
				 			  	 table3_1.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2_1[1][0])));
				 			 	table3_1.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2_1[1][1])));
				 			  	table3_1.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2_1[1][2])));
				 			  	table3_1.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2_1[1][3])));
				 			  	table3_1.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2_1[1][4])));
				 			  	table3_1.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2_1[1][5])));
				 			  	
				 				table3_1.addCell(new Cell().add(new Paragraph("2")));
				 			  	table3_1.addCell(new Cell().add(new Paragraph("Razon social o denominacion")));
				 			  	 table3_1.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2_1[2][0])));
				 			 	table3_1.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2_1[2][1])));
				 			  	table3_1.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2_1[2][2])));
				 			  	table3_1.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2_1[2][3])));
				 			  	table3_1.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2_1[2][4])));
				 			  	table3_1.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2_1[2][5])));

				 			  	table3_1.addCell(new Cell().add(new Paragraph("3")));
				 			  	table3_1.addCell(new Cell().add(new Paragraph("Tipos de socios")));
				 			  	 table3_1.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2_1[3][0])));
				 			 	table3_1.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2_1[3][1])));
				 			  	table3_1.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2_1[3][2])));
				 			  	table3_1.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2_1[3][3])));
				 			  	table3_1.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2_1[3][4])));
				 			  	table3_1.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2_1[3][5])));
				 			  	
				 			  	table3_1.addCell(new Cell().add(new Paragraph("4")));
				 			  	table3_1.addCell(new Cell().add(new Paragraph("Administracion")));
				 			  	 table3_1.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2_1[4][0])));
				 			 	table3_1.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2_1[4][1])));
				 			  	table3_1.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2_1[4][2])));
				 			  	table3_1.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2_1[4][3])));
				 			  	table3_1.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2_1[4][4])));
				 			  	table3_1.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2_1[4][5])));
				 			  	
				 			  	table3_1.addCell(new Cell().add(new Paragraph("5")));
				 			  	table3_1.addCell(new Cell().add(new Paragraph("Vigilancia")));
				 			  	 table3_1.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2_1[5][0])));
				 			 	table3_1.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2_1[5][1])));
				 			  	table3_1.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2_1[5][2])));
				 			  	table3_1.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2_1[5][3])));
				 			  	table3_1.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2_1[5][4])));
				 			  	table3_1.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2_1[5][5])));
				 			  	
				 			  	table3_1.addCell(new Cell().add(new Paragraph("6")));
				 			  	table3_1.addCell(new Cell().add(new Paragraph("Limite de socios")));
				 			  	 table3_1.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2_1[6][0])));
				 			 	table3_1.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2_1[6][1])));
				 			  	table3_1.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2_1[6][2])));
				 			  	table3_1.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2_1[6][3])));
				 			  	table3_1.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2_1[6][4])));
				 			  	table3_1.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2_1[6][5])));
				 			  	
				 			  	table3_1.addCell(new Cell().add(new Paragraph("7")));
				 			  	table3_1.addCell(new Cell().add(new Paragraph("Caracteristicas de capital")));
				 			  	 table3_1.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2_1[7][0])));
				 			 	table3_1.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2_1[7][1])));
				 			  	table3_1.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2_1[7][2])));
				 			  	table3_1.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2_1[7][3])));
				 			  	table3_1.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2_1[7][4])));
				 			  	table3_1.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2_1[7][5])));
				 			  	
				 			   table3_1.setTextAlignment(TextAlignment.CENTER);
						 	    table3_1.setHorizontalAlignment(HorizontalAlignment.LEFT);
				 			  	
					 			 	
							 	   Paragraph salto6 = new Paragraph("\n");
									salto6.setTextAlignment(TextAlignment.CENTER);
							 	
									
									
									  
							 	   Table table2part2 = new Table(3);
				 			  	   
				 			  	      
				 			  	   Cell cell3 = new Cell();
				 			  	cell3.add(new Paragraph("B"));
				 			  	  table2part2.addCell(cell3); 
				 			  	  
				 			  	  table2part2.addCell(new Cell().add(new Paragraph("C")));
				 			  	 table2part2.addCell(new Cell().add(new Paragraph("D"))); 
				 			  	 
    			 		  	        table2part2.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2[2][2])));
					 			  	table2part2.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2[2][3])));
					 			 	table2part2.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2[2][4])));
					 			  
					 			 	table2part2.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2[3][2])));
						 		  	table2part2.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2[3][3])));
						 			table2part2.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2[3][4])));
						 			
						 		  	table2part2.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2[4][2])));
							 		table2part2.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2[4][3])));
							 		table2part2.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2[4][4])));
							 		
							 	  	table2part2.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2[5][2])));
							 	 	table2part2.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2[5][3])));
							        table2part2.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2[5][4])));
							        
				             	  	table2part2.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2[0][3])));
							 	  	table2part2.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2[0][4])));
							 	  	table2part2.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2[0][5])));
							 	  	
							     	table2part2.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2[1][3])));
							 		table2part2.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2[1][4])));
							 		table2part2.addCell(new Cell().add(new Paragraph(Aspectoslegales.Resultadostablas2[1][5])));
									 	  
				 			  	 
				 			    table2part2.setTextAlignment(TextAlignment.CENTER);
						 	    table2part2.setHorizontalAlignment(HorizontalAlignment.LEFT);
						 			  	 
						 			 
														  	         
			                       
						 			  		   Table table3 = new Table(7);
							 			  	   
							 			  	      
							 			  	   Cell cell4 = new Cell();
							 			  	cell4.add(new Paragraph(" "));
							 			  	  table3.addCell(cell4); 
							 			  	  
							 			  	  table3.addCell(new Cell().add(new Paragraph("Año 1")));
							 			  	 table3.addCell(new Cell().add(new Paragraph("Porcentaje")));
							 			  	 table3.addCell(new Cell().add(new Paragraph("Año 2")));
							 			  	 table3.addCell(new Cell().add(new Paragraph("Porcentaje")));
							 			  	 table3.addCell(new Cell().add(new Paragraph("Año 3")));
							 			  	 table3.addCell(new Cell().add(new Paragraph("Porcentaje")));
							 			   
									 	    
										   table3.addCell(new Cell().add(new Paragraph("Activo")));
							 			   table3.addCell(new Cell().add(new Paragraph(" ")));
							 			   table3.addCell(new Cell().add(new Paragraph(" ")));
							 			  table3.addCell(new Cell().add(new Paragraph(" ")));
							 			 table3.addCell(new Cell().add(new Paragraph(" ")));
							 			table3.addCell(new Cell().add(new Paragraph(" ")));
							 			table3.addCell(new Cell().add(new Paragraph(" ")));
							 		
							 			  	
									 	 
									 	 
						      		   table3.addCell(new Cell().add(new Paragraph("Circulante")));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[1][0])));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[1][1])));
						 			  table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[1][2])));
						 			 table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[1][3])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[1][4])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[1][5])));
								
						 			  table3.addCell(new Cell().add(new Paragraph("Banco")));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[2][0])));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[2][1])));
						 			  table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[2][2])));
						 			 table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[2][3])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[2][4])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[2][5])));
									
						 			  table3.addCell(new Cell().add(new Paragraph("Invers a cp")));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[3][0])));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[3][1])));
						 			  table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[3][2])));
						 			 table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[3][3])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[3][4])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[3][5]))); 
									 	   
						 			  table3.addCell(new Cell().add(new Paragraph("cuenta p cp")));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[4][0])));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[4][1])));
						 			  table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[4][2])));
						 			 table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[4][3])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[4][4])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[4][5])));
									   
						 			  table3.addCell(new Cell().add(new Paragraph("Total AC")));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[5][0])));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[5][1])));
						 			  table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[5][2])));
						 			 table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[5][3])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[5][4])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[5][5])));
								 	  
						 			  table3.addCell(new Cell().add(new Paragraph("Fijo")));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[6][0])));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[6][1])));
						 			  table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[6][2])));
						 			 table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[6][3])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[6][4])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[6][5])));
									 	 
						 			  table3.addCell(new Cell().add(new Paragraph("Terrenos")));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[7][0])));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[7][1])));
						 			  table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[7][2])));
						 			 table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[7][3])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[7][4])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[7][5])));
						 			
						 			  table3.addCell(new Cell().add(new Paragraph("Edificios")));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[8][0])));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[8][1])));
						 			  table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[8][2])));
						 			 table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[8][3])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[8][4])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[8][5])));
						 			
						 	     	  table3.addCell(new Cell().add(new Paragraph("Depreciacion")));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[9][0])));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[9][1])));
						 			  table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[9][2])));
						 			 table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[9][3])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[9][4])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[9][5])));
						 			
						 			  table3.addCell(new Cell().add(new Paragraph("Acumulada edificios")));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[10][0])));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[10][1])));
						 			  table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[10][2])));
						 			 table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[10][3])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[10][4])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[10][5])));
						 			
						 			  table3.addCell(new Cell().add(new Paragraph("mobiliario y equipo")));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[11][0])));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[11][1])));
						 			  table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[11][2])));
						 			 table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[11][3])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[11][4])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[11][5])));
						 			
						     		  table3.addCell(new Cell().add(new Paragraph("Depreciacion")));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[12][0])));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[12][1])));
						 			  table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[12][2])));
						 			 table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[12][3])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[12][4])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[12][5])));
						 			
									  table3.addCell(new Cell().add(new Paragraph("acumulada mobiliario")));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[13][0])));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[13][1])));
						 			  table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[13][2])));
						 			 table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[13][3])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[13][4])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[13][5])));
						 			
						 			  table3.addCell(new Cell().add(new Paragraph("Equipo de trasporte")));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[14][0])));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[14][1])));
						 			  table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[14][2])));
						 			 table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[14][3])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[14][4])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[14][5])));
						 			
						 			  table3.addCell(new Cell().add(new Paragraph("Depreciacion")));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[15][0])));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[15][1])));
						 			  table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[15][2])));
						 			 table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[15][3])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[15][4])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[15][5])));
						 			
						 			  table3.addCell(new Cell().add(new Paragraph("Acumulada equ trasporte")));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[16][0])));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[16][1])));
						 			  table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[16][2])));
						 			 table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[16][3])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[16][4])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[16][5])));
						 			
						 			  table3.addCell(new Cell().add(new Paragraph("Equipo computo")));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[17][0])));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[17][1])));
						 			  table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[17][2])));
						 			 table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[17][3])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[17][4])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[17][5])));
						 			
						 			  table3.addCell(new Cell().add(new Paragraph("Depreciacion")));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[18][0])));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[18][1])));
						 			  table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[18][2])));
						 			 table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[18][3])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[18][4])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[18][5])));
						 			
						 			  table3.addCell(new Cell().add(new Paragraph("Acumulada equ computo")));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[19][0])));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[19][1])));
						 			  table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[19][2])));
						 			 table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[19][3])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[19][4])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[19][5])));
						 			
						 			  table3.addCell(new Cell().add(new Paragraph("Total activo fijo")));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[20][0])));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[20][1])));
						 			  table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[20][2])));
						 			 table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[20][3])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[20][4])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[20][5])));
						 			
						 			  table3.addCell(new Cell().add(new Paragraph("Diferido")));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[21][0])));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[21][1])));
						 			  table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[21][2])));
						 			 table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[21][3])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[21][4])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[21][5])));
						 			
						 			  table3.addCell(new Cell().add(new Paragraph("Rentas pagadas por anticipado")));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[22][0])));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[22][1])));
						 			  table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[22][2])));
						 			 table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[22][3])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[22][4])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[22][5])));
						 			
						 			  table3.addCell(new Cell().add(new Paragraph("Otros activos diferidos")));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[23][0])));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[23][1])));
						 			  table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[23][2])));
						 			 table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[23][3])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[23][4])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[23][5])));
						 			
						 			  table3.addCell(new Cell().add(new Paragraph("Suma del activos pasivos")));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[24][0])));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[24][1])));
						 			  table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[24][2])));
						 			 table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[24][3])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[24][4])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[24][5])));
						 			
						 			  table3.addCell(new Cell().add(new Paragraph("A corto plazo")));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[25][0])));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[25][1])));
						 			  table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[25][2])));
						 			 table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[25][3])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[25][4])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[25][5])));
						 			
						 			  table3.addCell(new Cell().add(new Paragraph("Provedores")));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[26][0])));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[26][1])));
						 			  table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[26][2])));
						 			 table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[26][3])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[26][4])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[26][5])));
						 			
						 			  table3.addCell(new Cell().add(new Paragraph("Acredores")));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[27][0])));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[27][1])));
						 			  table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[27][2])));
						 			 table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[27][3])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[27][4])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[27][5])));
						 			
						 			  table3.addCell(new Cell().add(new Paragraph("Interes por pagar")));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[28][0])));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[28][1])));
						 			  table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[28][2])));
						 			 table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[28][3])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[28][4])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[28][5])));
						 			
						 			  table3.addCell(new Cell().add(new Paragraph("ISR por pagar")));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[29][0])));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[29][1])));
						 			  table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[29][2])));
						 			 table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[29][3])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[29][4])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[29][5])));
						 			
						 			  table3.addCell(new Cell().add(new Paragraph("Anticipo de clientes")));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[30][0])));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[30][1])));
						 			  table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[30][2])));
						 			 table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[30][3])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[30][4])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[30][5])));
						 			
						 			  table3.addCell(new Cell().add(new Paragraph("Total pasivo a CP")));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[31][0])));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[31][1])));
						 			  table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[31][2])));
						 			 table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[31][3])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[31][4])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[31][5])));
						 			
						 			  table3.addCell(new Cell().add(new Paragraph("A largo Plazo")));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[32][0])));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[32][1])));
						 			  table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[32][2])));
						 			 table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[32][3])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[32][4])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[32][5])));
						 			
						 			  table3.addCell(new Cell().add(new Paragraph("Documentos por pagar a largo plazo")));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[33][0])));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[33][1])));
						 			  table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[33][2])));
						 			 table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[33][3])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[33][4])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[33][5])));
						 			
						 			  table3.addCell(new Cell().add(new Paragraph("Total pasivo a LP")));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[34][0])));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[34][1])));
						 			  table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[34][2])));
						 			 table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[34][3])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[34][4])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[34][5])));
						 			
						 			  table3.addCell(new Cell().add(new Paragraph("Suma del pasivo")));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[35][0])));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[35][1])));
						 			  table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[35][2])));
						 			 table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[35][3])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[35][4])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[35][5])));
						 			
						 			  table3.addCell(new Cell().add(new Paragraph("Capital contable")));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[36][0])));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[36][1])));
						 			  table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[36][2])));
						 			 table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[36][3])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[36][4])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[36][5])));
						 			
						 			  table3.addCell(new Cell().add(new Paragraph("Capital social")));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[37][0])));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[37][1])));
						 			  table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[37][2])));
						 			 table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[37][3])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[37][4])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[37][5])));
						 			
						 			  table3.addCell(new Cell().add(new Paragraph("Reservas")));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[38][0])));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[38][1])));
						 			  table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[38][2])));
						 			 table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[38][3])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[38][4])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[38][5])));
						 			
						 			  table3.addCell(new Cell().add(new Paragraph("Resultados de ejercicios anteriores")));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[39][0])));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[39][1])));
						 			  table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[39][2])));
						 			 table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[39][3])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[39][4])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[39][5])));
						 			
						 			  table3.addCell(new Cell().add(new Paragraph("Resultados de ejercicios")));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[40][0])));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[40][1])));
						 			  table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[40][2])));
						 			 table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[40][3])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[40][4])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[40][5])));
						 			
						 			  table3.addCell(new Cell().add(new Paragraph("Total capital contable")));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[41][0])));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[41][1])));
						 			  table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[41][2])));
						 			 table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[41][3])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[41][4])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[41][5])));
						 			
						 			  table3.addCell(new Cell().add(new Paragraph("Suma del pasivo + capital contable")));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[42][0])));
						 			   table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[42][1])));
						 			  table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[42][2])));
						 			 table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[42][3])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[42][4])));
						 			table3.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion1.Resultadostablas3[42][5])));
						 			
									 	    table3.setTextAlignment(TextAlignment.CENTER);
									 	    table3.setHorizontalAlignment(HorizontalAlignment.LEFT);
						 			  	        
													
						 	               
						 			  	      Table table4 = new Table(7);
							 			  	   
						 			  	      
							 			  	   Cell cell5 = new Cell();
							 			  	cell5.add(new Paragraph(" "));
							 			  	  table4.addCell(cell5); 
							 			  	  
							 			  	  table4.addCell(new Cell().add(new Paragraph("Año 1")));
							 			  	 table4.addCell(new Cell().add(new Paragraph("Porcentaje")));
							 				 table4.addCell(new Cell().add(new Paragraph("Año 2")));
							 				 table4.addCell(new Cell().add(new Paragraph("Porcentaje")));
							 				 table4.addCell(new Cell().add(new Paragraph("Año 3")));
							 				 table4.addCell(new Cell().add(new Paragraph("Porcentaje")));
							 				 
							 				 
							 				    table4.addCell(new Cell().add(new Paragraph("ingresos")));
			    			 		  	        table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[0][0])));
								 			  	table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[0][1])));
								 			 	table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[0][2])));
								 			   table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[0][3])));
								 			  	table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[0][4])));
								 			 	table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[0][5])));
								 			  
								 			 
									 			
								 			 	 table4.addCell(new Cell().add(new Paragraph("Otros Ingresos")));
				    			 		  	        table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[1][0])));
									 			  	table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[1][1])));
									 			 	table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[1][2])));
									 			   table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[1][3])));
									 			  	table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[1][4])));
									 			 	table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[1][5])));
									 			 	
									 			 	
									 			 	 table4.addCell(new Cell().add(new Paragraph("Suma ingresos")));
					    			 		  	        table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[2][0])));
										 			  	table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[2][1])));
										 			 	table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[2][2])));
										 			   table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[2][3])));
										 			  	table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[2][4])));
										 			 	table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[2][5])));
										        
										 			 	 table4.addCell(new Cell().add(new Paragraph("Menos: Costos de ventas")));
						    			 		  	        table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[3][0])));
											 			  	table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[3][1])));
											 			 	table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[3][2])));
											 			   table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[3][3])));
											 			  	table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[3][4])));
											 			 	table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[3][5])));
										 	  	
											 			 	 table4.addCell(new Cell().add(new Paragraph("Utilidad bruta")));
							    			 		  	        table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[4][0])));
												 			  	table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[4][1])));
												 			 	table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[4][2])));
												 			   table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[4][3])));
												 			  	table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[4][4])));
												 			 	table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[4][5])));
												 	  
												 			 	 table4.addCell(new Cell().add(new Paragraph("Menos: Gastos de operacion")));
								    			 		  	        table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[5][0])));
													 			  	table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[5][1])));
													 			 	table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[5][2])));
													 			   table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[5][3])));
													 			  	table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[5][4])));
													 			 	table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[5][5])));
													 			 	
													 			 	 table4.addCell(new Cell().add(new Paragraph("Utilidad de operacion")));
									    			 		  	        table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[6][0])));
														 			  	table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[6][1])));
														 			 	table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[6][2])));
														 			   table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[6][3])));
														 			  	table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[6][4])));
														 			 	table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[6][5])));
														 			 	
														 			 	 table4.addCell(new Cell().add(new Paragraph("Menos: gastos financieros")));
										    			 		  	        table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[7][0])));
															 			  	table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[7][1])));
															 			 	table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[7][2])));
															 			   table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[7][3])));
															 			  	table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[7][4])));
															 			 	table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[7][5])));
															 			 	
															 			 	 table4.addCell(new Cell().add(new Paragraph("Utilidad financiera")));
											    			 		  	        table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[8][0])));
																 			  	table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[8][1])));
																 			 	table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[8][2])));
																 			   table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[8][3])));
																 			  	table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[8][4])));
																 			 	table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[8][5])));
																 			 	
																 			 	 table4.addCell(new Cell().add(new Paragraph("Menos: ISR")));
												    			 		  	        table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[9][0])));
																	 			  	table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[9][1])));
																	 			 	table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[9][2])));
																	 			   table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[9][3])));
																	 			  	table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[9][4])));
																	 			 	table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[9][5])));
																	 			 	
																	 			 	 table4.addCell(new Cell().add(new Paragraph("Menos: PTU")));
													    			 		  	        table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[10][0])));
																		 			  	table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[10][1])));
																		 			 	table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[10][2])));
																		 			   table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[10][3])));
																		 			  	table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[10][4])));
																		 			 	table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[10][5])));
																		 			 	
																		 			 	 table4.addCell(new Cell().add(new Paragraph("Utilidad neta d/imptos.")));
														    			 		  	        table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[11][0])));
																			 			  	table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[11][1])));
																			 			 	table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[11][2])));
																			 			   table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[11][3])));
																			 			  	table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[11][4])));
																			 			 	table4.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion2.Resultadostablas4[11][5])));
																			 			 	
																			 			 	
							 			  	 
							 			    table4.setTextAlignment(TextAlignment.CENTER);
									 	    table4.setHorizontalAlignment(HorizontalAlignment.LEFT);
						 		
						 			                    // salto de linea entre tabla y tabla 
														 Paragraph salto9 = new Paragraph("\n");
															salto9.setTextAlignment(TextAlignment.CENTER);					
						 			  	       
						 			  	     Table table5 = new Table(4);
							 			  	   
						 			  	      
							 			  	   Cell cell6 = new Cell();
							 			  	cell6.add(new Paragraph("Entradas (E)"));
							 			  	  table5.addCell(cell6); 
							 			  	  
							 			  	  table5.addCell(new Cell().add(new Paragraph("Año 1")));
							 				 table5.addCell(new Cell().add(new Paragraph("Año 2")));
							 				 table5.addCell(new Cell().add(new Paragraph("Año 3")));

							 				 
							 				  table5.addCell(new Cell().add(new Paragraph("Ventas")));
			    			 		  	        table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[0][0])));
								 			  	table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[0][1])));
								 			 	table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[0][2])));
								 			 	
								 			   table5.addCell(new Cell().add(new Paragraph("Aportacion a socios")));
			    			 		  	        table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[1][0])));
								 			  	table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[1][1])));
								 			 	table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[1][2])));
								 			 	
								 			   table5.addCell(new Cell().add(new Paragraph("Prestamo pyme")));
			    			 		  	        table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[2][0])));
								 			  	table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[2][1])));
								 			 	table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[2][2])));
								 			 	
								 			   table5.addCell(new Cell().add(new Paragraph("Suma de entradas")));
			    			 		  	        table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[3][0])));
								 			  	table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[3][1])));
								 			 	table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[3][2])));
								 			 	
								 			   table5.addCell(new Cell().add(new Paragraph("SALIDAS (S)")));
			    			 		  	        table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[4][0])));
								 			  	table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[4][1])));
								 			 	table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[4][2])));
								 			 	
								 			   table5.addCell(new Cell().add(new Paragraph("Maquinaria")));
			    			 		  	        table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[5][0])));
								 			  	table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[5][1])));
								 			 	table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[5][2])));
								 			 	
								 			   table5.addCell(new Cell().add(new Paragraph("Mobiliario")));
			    			 		  	        table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[6][0])));
								 			  	table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[6][1])));
								 			 	table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[6][2])));
								 			 	
								 			   table5.addCell(new Cell().add(new Paragraph("Eq. De comp.")));
			    			 		  	        table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[7][0])));
								 			  	table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[7][1])));
								 			 	table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[7][2])));
								 			 	
								 			   table5.addCell(new Cell().add(new Paragraph("Herram.")));
			    			 		  	        table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[8][0])));
								 			  	table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[8][1])));
								 			 	table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[8][2])));
								 			 	
								 			   table5.addCell(new Cell().add(new Paragraph("Compras materiales")));
			    			 		  	        table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[9][0])));
								 			  	table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[9][1])));
								 			 	table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[9][2])));
								 			 	
								 			   table5.addCell(new Cell().add(new Paragraph("Maquila")));
			    			 		  	        table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[10][0])));
								 			  	table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[10][1])));
								 			 	table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[10][2])));
								 			 	
								 			   table5.addCell(new Cell().add(new Paragraph("Gastos de operacion")));
			    			 		  	        table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[11][0])));
								 			  	table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[11][1])));
								 			 	table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[11][2])));
								 			 	
								 			   table5.addCell(new Cell().add(new Paragraph("Gastos financieros")));
			    			 		  	        table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[12][0])));
								 			  	table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[12][1])));
								 			 	table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[12][2])));
								 			 	
								 			   table5.addCell(new Cell().add(new Paragraph("Devolucion de prestamo")));
			    			 		  	        table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[13][0])));
								 			  	table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[13][1])));
								 			 	table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[13][2])));
								 			 	
								 			   table5.addCell(new Cell().add(new Paragraph("Pago de impuestos")));
			    			 		  	        table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[14][0])));
								 			  	table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[14][1])));
								 			 	table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[14][2])));
								 			 	
								 			   table5.addCell(new Cell().add(new Paragraph("Otros")));
			    			 		  	        table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[15][0])));
								 			  	table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[15][1])));
								 			 	table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[15][2])));
								 			 	
								 			   table5.addCell(new Cell().add(new Paragraph("SUMA DE SALIDAS")));
			    			 		  	        table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[16][0])));
								 			  	table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[16][1])));
								 			 	table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[16][2])));
								 			 	
								 			   table5.addCell(new Cell().add(new Paragraph("DIFERENCIA: E-S")));
			    			 		  	        table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[17][0])));
								 			  	table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[17][1])));
								 			 	table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[17][2])));
								 			 	
								 			   table5.addCell(new Cell().add(new Paragraph("Mas: saldo inicial")));
			    			 		  	        table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[18][0])));
								 			  	table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[18][1])));
								 			 	table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[18][2])));
								 			 	
								 			   table5.addCell(new Cell().add(new Paragraph("SALDO FINAL DE EFECTIVO")));
			    			 		  	        table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[19][0])));
								 			  	table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[19][1])));
								 			 	table5.addCell(new Cell().add(new Paragraph(Aspectosfinancierosseccion3.Resultadostablas5[19][2])));
								 			 
							 				 table5.setTextAlignment(TextAlignment.CENTER);
										 	    table5.setHorizontalAlignment(HorizontalAlignment.LEFT);
										 	    
										 	   
			// creamos el objeto del documento antes cerra este			 			  	        
				Document document = new Document(pdfDocument);
				
				// se agrega e imprime todo el contenido al documento 
				document.add(salto4);
				document.add(salto3);
				document.add(salto2);
				document.add(salto1);
				document.add(instituto);
				document.add(deprtamento);
				document.add(ingenieria);
				document.add(materia);
				document.add(grupo);
				document.add(maestro);
				document.add(plan);
				document.add(presenta);
				document.add(alumno);
				document.add(fechalugar);
				document.add(image);
				document.add(image2);
				

				// saltos de pagina
				document.add(new AreaBreak());
		   document.add(TituloIntroduccion);
	  		document.add(parrafointroduccion);
				document.add(Tituloindice);
				document.add(indice1);
				document.add(indice2);
				document.add(indice3);
				document.add(indice4);
				document.add(indice5);
				document.add(indice6);
				document.add(indice7);
				document.add(indice8);
				document.add(indice9);
	
				document.add(new AreaBreak());
				document.add(titulo1);
				document.add(parrafo1);
				document.add(parrafo2);
				
				document.add(new AreaBreak());
				document.add(parrafo3);
				document.add(parrafo4);
				document.add(parrafo5);
				document.add(parrafo6);
				document.add(parrafo7);
				document.add(parrafo8);
				document.add(parrafo9);
				document.add(parrafo10);
				document.add(titulo2);
				document.add(parrafo11);
				document.add(titulo3);
				document.add(parrafo12);
				
				document.add(new AreaBreak());
				document.add(titulo4);
				document.add(parrafo13);
				
				document.add(new AreaBreak());
				document.add(titulo5);
				document.add(parrafo14);
				document.add(image3);
				document.add(parrafo15);
				document.add(parrafo16);
				document.add(parrafo17);
				document.add(parrafo18);
				
			//
			//	document.add(salto1);
			;
			 
			 //  document.add(table4);
			//  document.add(table5);
				
				
			
				document.add(new AreaBreak());
				document.add(titulo5);
				document.add(parrafo19);
				document.add(parrafo20);
				document.add(parrafo21);
				document.add(parrafo22);
				
				
				document.add(new AreaBreak());
				document.add(titulo7);
				document.add(parrafo23);
				document.add(parrafo24);
				document.add(parrafo25);
				document.add(parrafo26);
				
				
				
				document.add(new AreaBreak());
				document.add(titulo8);
				document.add(parrafo27);
				document.add(parrafo28);
				document.add(parrafo29);
				document.add(title1);
				document.add(salto1);
			document.add(table1);
				
				document.add(new AreaBreak());
				document.add(titulo9);
				document.add(title2);
				document.add(salto1);
                   document.add(table2);
					document.add(salto6);
				document.add(table2part2);
				document.add(title6);
				document.add(salto1);
				document.add(table3_1);
				document.add(salto1);
				document.add(parrafo30);
				
				document.add(new AreaBreak());
				document.add(titulo12);
				  document.add(title3);
				  document.add(salto1);
			    document.add(table3);
			    document.add(salto1);
			    document.add(title4);
			    document.add(salto1);
			      document.add(table4);
			      document.add(salto1);
			    document.add(title5);
			    document.add(salto1);
			    document.add(table5);
			   // se cierra el documento  
				document.close();
				JOptionPane.showMessageDialog(null, "El plan de negocio se genero correctamente"
						+ "\n El pdf se encuentra en el escritorio");
			} catch (FileNotFoundException e1) { // un catch por si se encuentra una excepcion
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			
			}
		});
		btn20.setFont(new Font("Arial", Font.PLAIN, 14));
		// tipo de layout grupal del contenido del frame
		GroupLayout gl_ContenidoPrincipal9 = new GroupLayout(ContenidoPrincipal9);
		gl_ContenidoPrincipal9.setHorizontalGroup(
				// tipo de alineacion adaptable del contenido pa cualquier tipo de pantalla
			gl_ContenidoPrincipal9.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ContenidoPrincipal9.createSequentialGroup()
					.addGroup(gl_ContenidoPrincipal9.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_ContenidoPrincipal9.createSequentialGroup()
							.addGap(10)
							// tamaño adaptable de los campos y contenidos del frame
		                    //  Para cualquier pantalla de laptop o computadora de escritorio
							.addComponent(Enunciado34, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_ContenidoPrincipal9.createSequentialGroup()
							.addGap(1047)
							.addComponent(btn19, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(btn20, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_ContenidoPrincipal9.createSequentialGroup()
							.addGap(20)
							.addComponent(Scroll29, GroupLayout.PREFERRED_SIZE, 1313, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(18, Short.MAX_VALUE))
		);
		gl_ContenidoPrincipal9.setVerticalGroup(
			gl_ContenidoPrincipal9.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ContenidoPrincipal9.createSequentialGroup()
					.addComponent(Enunciado34, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(Scroll29, GroupLayout.PREFERRED_SIZE, 672, GroupLayout.PREFERRED_SIZE)
					.addGap(9)
					.addGroup(gl_ContenidoPrincipal9.createParallelGroup(Alignment.LEADING)
						.addComponent(btn19, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_ContenidoPrincipal9.createSequentialGroup()
							.addGap(2)
							.addComponent(btn20, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))))
		);
		ContenidoPrincipal9.setLayout(gl_ContenidoPrincipal9);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(ScrollPrincipal9, GroupLayout.DEFAULT_SIZE, 1361, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(ScrollPrincipal9, GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
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
