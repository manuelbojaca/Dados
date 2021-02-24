package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class GUI extends JFrame implements ActionListener {
	 
	Pruebas pr = new Pruebas();
	
	private JPanel panel;
	private JMenuBar jmb;
	private JMenu opciones;
	private JMenuItem log, rec, reg;
	private JButton jugar, juegoNuevo, salir;
	private JLabel turno, txApuesta, dados, resultado, anterior, dinero, user;
	private JTextField apuesta;
	
	
	private static final long serialVersionUID = 1L;

	boolean estado = true;
	
	public GUI() {
		
		setSize(302, 339);
		setTitle("Cronometro");
		setLocationRelativeTo(null);
		setMinimumSize(new Dimension(300, 300));
		initComponent();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	private void initComponent() {
		
		panel = new JPanel();
		jmb = new JMenuBar();
		opciones = new JMenu("Opciones");
		reg = new JMenuItem("Registrar");
		rec = new JMenuItem("Records");
		log = new JMenuItem("Log in");
		jugar = new JButton("Jugar");
		juegoNuevo = new JButton("Jugar de nuevo");
		salir = new JButton("Salir");
		turno = new JLabel("Turno");
		txApuesta = new JLabel("Apuesta");
		dados = new JLabel("Dados");
		resultado = new JLabel("Turno");
		anterior = new JLabel("Anterior");
		dinero = new JLabel("Dinero");
		apuesta = new JTextField();
			
		this.getContentPane().add(panel);
	
		setJMenuBar(jmb);
		
		jugar.setLayout(null);
		juegoNuevo.setLayout(null);
		salir.setLayout(null);
		turno.setLayout(null);
		txApuesta.setLayout(null);
		dados.setLayout(null);
		resultado.setLayout(null);
		anterior.setLayout(null);
		dinero.setLayout(null);
		apuesta.setLayout(null);
		
		jugar.setBounds(125, 0, 298, 100);
		juegoNuevo.setBounds(0, 100, 150, 100);
		salir.setBounds(150, 100,150, 100 );
		turno.setBounds(0, 200, 300, 100);
		txApuesta.setBounds(0, 200, 300, 100);
		dados.setBounds(0, 200, 300, 100);
		resultado.setBounds(0, 200, 300, 100);
		anterior.setBounds(0, 200, 300, 100);
		dinero.setBounds(0, 200, 300, 100);
		apuesta.setBounds(0, 200, 300, 100);
			
		jmb.add(opciones);
		opciones.add(reg);
		opciones.add(rec);
		opciones.add(log);
		panel.add(jugar);
		panel.add(juegoNuevo);
		panel.add(salir);
		panel.add(turno);
		panel.add(txApuesta);
		panel.add(dados);
		panel.add(resultado);
		panel.add(anterior);
		panel.add(dinero);
		panel.add(apuesta);
	
		log.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
			
		if(e.getSource() == log) {
			Loggin loggin = new Loggin(this, true);
			pr.pri("Yeahs");
			loggin.setVisible(true);
		}
		if(e.getSource() == reg) {
			
		}
		if(e.getSource() == rec) {
			
		}
	}

	
	
}			
		/*ActionListener jugar = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		};
		
		ActionListener Salir = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		};*/
		
		
		/*ActionListener aLPlay = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				estado = true;
				Thread hilo = new Thread() {
					public void run() {
						System.out.println("run");
						hor.contar();
						min.contar();
						seg.contar();
						for(;;) {
							if(estado == true) {
								display.setText(hor.definir() + ":" + min.definir()+ ":" + seg.definir());
							}
							else {
								System.out.println("break");
								break;
							}
						}
					}
				};
				
				if (estado == false) {
					estado = true;
					hilo.start();
				}else {
					hilo.start();
				}
				boolean bol = false;
				if (bol) 
					bol = false;
				else 
					bol = true;
				
				hor.contar();
				min.contar();
				seg.contar();
				
				for (int i = 0; i<100; i++) {
					display.setText(hor.definir() + ":" + min.definir()+ ":" + seg.definir());
					try {
						Thread.sleep(30);
					} catch (InterruptedException ex) {
					}
				}
			}
		};
		
		ActionListener aLPause = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				estado = false;
				System.out.println("reiniando" );
				hor.pausar();
				min.pausar();
				seg.pausar();
			}
			
		};
		
		ActionListener aLReiniciar = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				estado = true;
				hor.reiniciar();
				min.reiniciar();
				seg.reiniciar();
				display.setText("00:00:00");
				System.out.println("00:00:00");
			}
			
		};
		
		play.addActionListener(aLPlay);
		pause.addActionListener(aLPause);
		reiniciar.addActionListener(aLReiniciar);
	}*/

	


