package main;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class GUI extends JFrame implements ActionListener {
	 
	Pruebas pr = new Pruebas();
	
	String jug;
	private JPanel panel;
	private JMenuBar jmb;
	private JMenu opciones;
	private JMenuItem log, rec, reg;
	private JButton jugar, newGame, salir;
	private JLabel turno, txApuesta, dados, resultado, anterior, dinero, user, mensaje;
	private JTextField apuesta;
	
	private Juego juego = new Juego();
	
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
		
		jug = "Jugar";
		panel = new JPanel();
		jmb = new JMenuBar();
		opciones = new JMenu("Opciones");
		reg = new JMenuItem("Registrar");
		rec = new JMenuItem("Records");
		log = new JMenuItem("Log in");
		jugar = new JButton("Lanzar");
		newGame = new JButton("Jugar de nuevo");
		salir = new JButton("Salir");
		user = new JLabel("No user");
		mensaje = new JLabel("Mensaje");
		turno = new JLabel("Turno");
		txApuesta = new JLabel("Apuesta");
		dados = new JLabel("Dados");
		resultado = new JLabel("Resultado");
		anterior = new JLabel("Anterior");
		dinero = new JLabel("$");
		apuesta = new JTextField();
		
		Loggin loggin = new Loggin(this, true);
		
		this.getContentPane().add(panel);
	
		setJMenuBar(jmb);
		
		panel.setLayout(null);
		jugar.setLayout(null);
		newGame.setLayout(null);
		salir.setLayout(null);
		user.setLayout(null);
		mensaje.setLayout(null);
		turno.setLayout(null);
		txApuesta.setLayout(null);
		dados.setLayout(null);
		resultado.setLayout(null);
		anterior.setLayout(null);
		dinero.setLayout(null);
		apuesta.setLayout(null);
		
		jugar.setBounds(100, 220, 90, 30);
		newGame.setBounds(75, 220, 140, 30);
		salir.setBounds(105, 252, 80, 20);
		user.setBounds(10, 10, 110, 20);
		mensaje.setBounds(30, 170, 200, 20);
		turno.setBounds(100, 80, 80, 20);
		txApuesta.setBounds(10, 35, 80, 20);
		dados.setBounds(20, 100, 200, 20);
		resultado.setBounds(20, 140, 100, 20);
		anterior.setBounds(120, 140, 100, 20);
		dinero.setBounds(120, 10, 80, 20);
		apuesta.setBounds(80, 35, 80, 20);
			
		jmb.add(opciones);
		opciones.add(reg);
		opciones.add(rec);
		opciones.add(log);
		panel.add(jugar);
		panel.add(newGame);
		panel.add(salir);
		panel.add(user);
		panel.add(mensaje);
		panel.add(turno);
		panel.add(txApuesta);
		panel.add(dados);
		panel.add(resultado);
		panel.add(anterior);
		panel.add(dinero);
		panel.add(apuesta);
		newGame.setVisible(false);
		salir.setVisible(false);
	
		ActionListener menu = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == log) {
					
					pr.pri("Yeahs");
					loggin.setVisible(true);
				}
				if(e.getSource() == reg) {
					
				}
				if(e.getSource() == rec) {
					
				}
			}
		};
		
		ActionListener lanzar = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				juego.inicio();
				
				turno.setText("Turno " + juego.getTurno());
				dados.setText("Dado 1: "+ juego.getDado1() +" Dado 2: "+ juego.getDado2());
				resultado.setText("Resultado: "+ juego.getRes());
				anterior.setText("Anterior: "+ juego.getRes2());
				mensaje.setText(juego.mensaje());
				
				if(juego.getEstado() < 2) {
					jugar.setVisible(false);
					newGame.setVisible(true);
					salir.setVisible(true);
				
				}
			}
		};
		ActionListener nwGame = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				jugar.setVisible(true);
				newGame.setVisible(false);
				salir.setVisible(false);
				
				juego.nwGame();
				
				turno.setText("Turno");
				dados.setText("Dado 1:   Dado 2:");
				resultado.setText("Resultado: ");
				anterior.setText("Anterior: ");
				mensaje.setText("Juego nuevo");
			}
		};
		
		log.addActionListener(menu);
		jugar.addActionListener(lanzar);
		newGame.addActionListener(nwGame);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
	
	/*@Override
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

	


