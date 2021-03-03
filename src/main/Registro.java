package main;

import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Registro extends JDialog implements ActionListener{
	
	Pruebas pr = new Pruebas();
	private JPanel panel;
	private JButton registrar;
	private JLabel textReg;
	private JTextField userReg, passReg;
	private Juego juego = new Juego();
	private Jugador jugador = new Jugador();
	
	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public Registro(GUI gui, boolean modal) {
		
		super(gui,modal);
		
		setSize(300, 180);
		setTitle("Loggin");
		setLocationRelativeTo(null);
		setMinimumSize(new Dimension(150, 150));
		initComponent();
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void initComponent () {
		
		panel = new JPanel();
		registrar = new JButton("Registrar");
		userReg = new JTextField("user");
		passReg = new JTextField("pass"); 
		textReg = new JLabel("Ingrese datos de usuario nuevo.");
		
		this.getContentPane().add(panel);
		//panel.setLayout(new GridLayout(3,1));
		panel.setLayout(null);
		registrar.setLayout(null);
		userReg.setLayout(null);
		passReg.setLayout(null);
		textReg.setLayout(null);
		
		registrar.setBounds(100, 110, 100, 20);
		userReg.setBounds(90, 50, 110, 20);
		passReg.setBounds(90, 80, 110, 20);
		textReg.setBounds(20, 10, 260, 30);
		
		panel.add(registrar);
		panel.add(userReg);
		panel.add(passReg);
		panel.add(textReg);
		
		ActionListener registro = new ActionListener( ) {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if(!((userReg.getText().equals("")) || (passReg.getText().equals("")))) { 
					
					System.out.println("Comparacion "+userReg.getText()+" "+ passReg.getText());
					if((juego.registro(userReg.getText(), passReg.getText())) == 1) {
						
						textReg.setText("Usuario creado.");
					}
					else {
						
						textReg.setText("Nombre de Usuario en uso, cambielo.");
					}	
				}
				else {
					
					textReg.setText("Por favor complete los datos.");
				}
			}
		};
		registrar.addActionListener(registro);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
