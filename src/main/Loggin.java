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
	
	private JPanel panel;
	private JDialog loggin;
	private JButton entrar;
	private JLabel textLog;
	private JTextField userLog, passLog;
	
	public Loggin(GUI gui, boolean modal) {
		
		super(gui,modal);
		
		setSize(182, 180);
		setTitle("Loggin");
		setLocationRelativeTo(null);
		setMinimumSize(new Dimension(150, 150));
		initComponent();
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void initComponent () {
		
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
		
		entrar.setBounds(40, 110, 100, 20);
		userLog.setBounds(30, 50, 110, 20);
		passLog.setBounds(30, 80, 110, 20);
		textLog.setBounds(20, 10, 140, 30);
		
		panel.add(entrar);
		panel.add(userLog);
		panel.add(passLog);
		panel.add(textLog);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}