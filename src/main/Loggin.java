package main;

import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Loggin extends JDialog implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	
	Pruebas pr = new Pruebas();
	private JPanel panel;
	private JButton entrar;
	private JLabel textLog;
	private JTextField userLog, passLog;
	private Juego juego = new Juego();
	private Jugador jugador = new Jugador();
	private boolean logged = false;
	
	
	public Jugador getJugador() {
		return jugador;
	}

	public boolean getLogged() {
		return logged;
	}

	public void setLogged(boolean logged) {
		this.logged = logged;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public Loggin(GUI gui, boolean modal) {
		
		super(gui,modal);
		
		setSize(300, 180);
		setTitle("Loggin");
		setLocationRelativeTo(null);
		setMinimumSize(new Dimension(150, 150));
		initComponent();
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void initComponent () {
		
		pr.pri("init loggin");
		panel = new JPanel();
		entrar = new JButton("entrar");
		userLog = new JTextField("user");
		passLog = new JTextField("pass");
		textLog = new JLabel("Ingrese sus datos");
		
		this.getContentPane().add(panel);
		//panel.setLayout(new GridLayout(3,1));
		panel.setLayout(null);
		entrar.setLayout(null);
		userLog.setLayout(null);
		passLog.setLayout(null);
		textLog.setLayout(null);
		
		entrar.setBounds(100, 110, 100, 20);
		userLog.setBounds(90, 50, 110, 20);
		passLog.setBounds(90, 80, 110, 20);
		textLog.setBounds(20, 10, 260, 30);
		
		panel.add(entrar);
		panel.add(userLog);
		panel.add(passLog);
		panel.add(textLog);
		
		ActionListener log = new ActionListener( ) {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if((userLog.getText().equals("")) || (passLog.getText().equals(""))) { 
					
					if (juego.loggin(userLog.getText(), passLog.getText()) == 1) {
						
						textLog.setText("Logged. Cierre esta ventana.");
						jugador = juego.getJugador();
						logged = true;
					}
					else {
						
						textLog.setText("Contraseña y/o usuario incorrectos");
					}
				}
				else {
					
					textLog.setText("Usuario y/o contraseña nulos");
				}
				
			}
		};
		
		entrar.addActionListener(log);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
}