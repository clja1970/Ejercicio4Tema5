package es.studium.ejercicio4;
/*Realizar un programa que muestre por pantalla una serie de preguntas sobre
vehículos. Serán campos de selección única. En primer lugar, se preguntará el tipo de
motorización del vehículo entre Diésel, Gasolina, Híbrido o Eléctrico. A continuación,
preguntará por el número de puertas entre 3, 4 ó 5. Por último, preguntará si la pintura
es metalizada o no. Una vez seleccionados todos los elementos, se pulsará un botón y
saldrá un presupuesto atendiendo a los siguientes elementos:
• Diésel: 8.000 €
• Gasolina: 7.000 €
• Híbrido: 9.000 €
• Eléctrico: 8.500 €
• 3 puertas: 2.000 €
• 4 puertas: 3.000 €
• 5 puertas: 2.500 €
• Pintura normal: (Incluido en los preciso anteriores)
• Pintura metalizada: 1.500 €
 */

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ejercicio4 extends Frame implements ActionListener, WindowListener, ItemListener
{
	private static final long serialVersionUID = 1L;
	//En este caso, primero se define los tres grupos
	CheckboxGroup chkgrGrupo = new CheckboxGroup();
	CheckboxGroup chkgrGrupo1 = new CheckboxGroup();
	CheckboxGroup chkgrGrupo2 = new CheckboxGroup();

	// Al crear los checkboxes, se indica la etiqueta, si está o no
	// activo y el grupo al que pertenece. En un grupo, solamente
	// podrá estar activo un checkbox
	Checkbox chkUno = new Checkbox("Gasolina", false, chkgrGrupo);
	Checkbox chkDos = new Checkbox("Diesel", false, chkgrGrupo);
	Checkbox chkTres = new Checkbox("Híbrido", false, chkgrGrupo);
	Checkbox chkCuatro = new Checkbox("Eléctrico", false, chkgrGrupo);
	Checkbox chk3p = new Checkbox("3 puertas", false, chkgrGrupo1);
	Checkbox chk4p = new Checkbox("4 puertas", false, chkgrGrupo1);
	Checkbox chk5p = new Checkbox("5 puertas", false, chkgrGrupo1);
	Checkbox chkpms = new Checkbox("Si", false, chkgrGrupo2);
	Checkbox chkpmn = new Checkbox("No", false, chkgrGrupo2);
	Label ele1 = new Label ("Tipo de motorizacion");
	Label ele2 = new Label ("¿Número de puertas?");
	Label ele3 = new Label ("Pinturita metalizada");
	Button btnCal = new Button ("Calcular presupuesto");
	TextField resultado = new TextField (30);
	String total="";
	int numero1=0;
	int numero2=0;
	int numero3=0;
	
	
	//A continuación decarar el objeto de la clase a construir
	public ejercicio4 ()
	{
		setLayout (new FlowLayout ());
		
		setTitle("Presupuesto del coche");
		//añadiendo botones al panel
		setBackground(Color.getHSBColor(73,210,77));
		add(ele1);
		add(chkUno);
		add(chkDos);
		add(chkTres);
		add(chkCuatro);
		add(ele2);
		add(chk3p);
		add(chk4p);
		add(chk5p);
		add(ele3);
		add(chkpms);
		add(chkpmn);
		add(btnCal);
		add(resultado);
		chkUno.addItemListener(this);
		chkDos.addItemListener(this);
		chkTres.addItemListener(this);
		chkCuatro.addItemListener(this);
		chk3p.addItemListener(this);
		chk4p.addItemListener(this);
		chk5p.addItemListener(this);
		chkpms.addItemListener(this);
		chkpmn.addItemListener(this);
		btnCal.addActionListener(this);
		resultado.addActionListener(this);
		btnCal.setBackground(Color.gray);
		setSize(500,200);
		setResizable(false);
		setLocationRelativeTo(null);
		addWindowListener(this);
		setVisible(true);
	}
	public static void main(String[] args) {
		// Declarar 
		new ejercicio4();
		}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ta lueegooo");
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	
	@Override
	public void itemStateChanged(ItemEvent iec) 
		{
		if("Gasolina".equals(iec.getItem()))
		{
				numero1=7000;
				resultado.setText("7000+ ");
			}
		else if("Diesel".equals(iec.getItem()))
		{
			numero1=8000;
			resultado.setText("8000+ ");
		}
		else if("Híbrido".equals(iec.getItem()))
		{
				numero1=9000;
				resultado.setText("9000+ ");
		}
		else if("Eléctrico".equals(iec.getItem()))
		{
			numero1=8500;
			resultado.setText("8500+ ");
		}
		else if("3 puertas".equals(iec.getItem()))
		{
			numero2=2000;
			resultado.setText("2000+ ");
		}
		else if("4 puertas".equals(iec.getItem()))
		{
			numero2=3000;
			resultado.setText("3000+ ");
		}
		else if("5 puertas".equals(iec.getItem()))
		{
			numero2=2500;
			resultado.setText("20500+ ");
		}
		else if("Si".equals(iec.getItem()))
		{
			numero3=1500;
			resultado.setText("1500+ ");
		}
		else 
		{
			numero3=0;
		}
		}
	//Se repite la operación para Número de puertas
	
	
	
	@Override
	public void actionPerformed(ActionEvent Coche) {
		// Aquí es donde tenemos que hacer la validación de los botones
		
		if (Coche.getSource().equals(btnCal))
		{
			total= String.valueOf(numero1+numero2+numero3);
			resultado.setText(total);
			
		}
		}

}