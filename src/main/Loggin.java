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
		
		setSize(302, 339);
		setTitle("Loggin");
		setLocationRelativeTo(null);
		setMinimumSize(new Dimension(300, 300));
		initComponent();
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void initComponent () {
		
		panel = new JPanel();
		entrar = new JButton("entrar");
		userLog = new JTextField();
		passLog = new JTextField();
		textLog = new JLabel("Label");
		
		this.getContentPane().add(panel);
		//panel.setLayout(new GridLayout(3,1));
		entrar.setLayout(null);
		userLog.setLayout(null);
		passLog.setLayout(null);
		textLog.setLayout(null);
		
		entrar.setBounds(0, 100, 150, 100);
		userLog.setBounds(150, 100, 150, 100);
		passLog.setBounds(0, 200, 300, 100);
		textLog.setBounds(0, 200, 300, 100);
		
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