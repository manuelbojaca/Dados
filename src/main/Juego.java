package main;

import java.util.Scanner;

public class Juego {
	
	Pruebas pr = new Pruebas();
	private int estado;
	private int turno;
	private int dado1=0, dado2=0, res=0, res2=0;
	private Jugador jugador = new Jugador();
	private Maquina maquina = new Maquina();
	private BD bd;
	
	
	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public int getTurno() {
		return turno;
	}

	public void setTurno(int turno) {
		this.turno = turno;
	}

	public int getDado1() {
		return dado1;
	}

	public void setDado1(int dado1) {
		this.dado1 = dado1;
	}

	public int getDado2() {
		return dado2;
	}

	public void setDado2(int dado2) {
		this.dado2 = dado2;
	}

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public Maquina getMaquina() {
		return maquina;
	}

	public void setMaquina(Maquina maquina) {
		this.maquina = maquina;
	}
	
	public int getRes() {
		return res;
	}

	public void setRes(int res) {
		this.res = res;
	}
	
	public int getRes2() {
		return res2;
	}

	public void setRes2(int res2) {
		this.res2 = res2;
	}
	
	public void inicio () {
		
		
		if (jugador.getNombre() != "") {
			
			this.turno++;
			this.estado = maquina.maqEstados();
			this.dado1 = maquina.getDado1();
			this.dado2 = maquina.getDado2();
			this.res = maquina.getRes();
			this.res2 = maquina.getRes2();
			
			if (this.turno == 1) {
				
				pr.pri("estado: "+this.estado);
				
				if (this.estado == 1) {
					pr.pri("Gano");
					this.estado = 0;
					this.turno = 0;
					
				}else if(this.estado == 0) {
					pr.pri("Pierde");
					this.estado = 0;
					this.turno = 0;
				
				}else {
					pr.pri("loli");
				}
			}
			else {
				
				pr.pri("turno = "+this.turno);
			}
		}
		
		/*pr.pri("Nombre: "+ jug.getNombre());
		if (jug.getNombre() != "") {
			
			try {
				
				this.estado = maquina.maqEstados();
				pr.pri("estado = " + estado);
				if(estado != 2) {
					pr.pri("quedo");
					this.dado1 = maquina.getDado1();
					this.dado2 = maquina.getDado2();
				
					this.turno++;
					
					if (this.estado == 1) {
						
						System.out.println("Gano");
					}else if(this.estado == 0) {
						System.out.println("Pierde");
					}
				}	
				else {
					pr.pri("paso");
					if (this.estado == 1) {
						System.out.println("Gano");
						this.estado = 0;
						this.turno = 0;
						
					}else if(this.estado == 0) {
						System.out.println("Pierde");
						this.estado = 0;
						this.turno = 0;
					}
				}
				
			}finally {
				//sc.close();
			}
		}*/	
	}
	
	public String mensaje () {
		String str = "";
		if(estado == 0)str="Perdistesss";
		if(estado == 1)str="Gana";
		if(estado == 2)str="Sigue jugando";
		if(estado == 3)str="Ingrese apuesta";
		return str;
	}
	
	public void nwGame() {
		this.turno = 0;
		this.estado = 3;
		maquina.setTurno(0);
		maquina.setRes2(0);
	}
	
	public int loggin (String user, String pass) {
		bd = new BD();
		pr.pri("user: "+user+" pass: "+pass);
		bd.buscar(user);
		System.out.println("bd.pass: "+bd.getContraseña()+" pass: "+pass);
		System.out.println("bd.pass: "+bd.getContraseña().length()+" pass: "+pass.length());
		if(bd.getContraseña().equals(pass)) {
			System.out.println("iguales");
			jugador.setNombre(bd.getNombre());
			jugador.setContraseña(bd.getContraseña());
			jugador.setDinero(bd.getDinero());
			return 1;
		}
		else {
			return 0;
		}
	}
	public int apuesta (String str1, String str2) {
		
		bd = new BD();
		System.out.println("sisa");
		int i = (Integer.parseInt(str1))-(Integer.parseInt(str2));
		String str3 = String.valueOf(i);
		System.out.println("i: "+i+" str3: "+str3+" user:"+jugador.getNombre());
		bd.cambiar(jugador.getNombre(), str3, 2);
		System.out.println("paso here");
		return i;
	}
	public int palNum(String str) {
		return Integer.parseInt(str);
	}
}