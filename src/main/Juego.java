package main;

import java.util.Scanner;

public class Juego {
	
	private int estado;
	private int turno = 0;
	private int dado1=0, dado2=0, res=0;
	private Jugador jug = new Jugador();
	private Maquina maquina = new Maquina();
	
	
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

	public Jugador getJug() {
		return jug;
	}

	public void setJug(Jugador jug) {
		this.jug = jug;
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

	public void inicio () {
		
		/*Modificar esta clase para que siga el orden correcto
		 * los if estan mal <-- ERROR*/
		
		if (jug.getNombre() != "") {
			
			try {
				this.res = maquina.getRes2();
				//Scanner sc = new Scanner(System.in);
				System.out.println("Dados: "+this.turno+" presione f para lanzar");
				//char pop = sc.next().charAt(0);
				if(estado != 2) {
					
					this.estado = maquina.maqEstados();
					this.dado1 = maquina.getDado1();
					this.dado2 = maquina.getDado2();
				
					this.turno++;
					System.out.println("Dado1:" + maquina.getDado1() + " Dado2:" + maquina.getDado2());
					if (this.estado == 1) {
						
						System.out.println("Gano");
					}else if(this.estado == 0) {
						System.out.println("Pierde");
					}
				}	
				else {
					System.out.println("Dados: "+ this.turno +" presione f para lanzar");
					//char pop1 = sc.next().charAt(0);
					this.estado = maquina.maqEstados();
					//this.turno++;
					System.out.println("Dado1:"+maquina.getDado1()+" Dado2:"+maquina.getDado2());
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
		}	
	}
	
	public String mensaje () {
		String str = "";
		if(estado == 0)str="Perdistesss";
		if(estado == 1)str="Gana";
		if(estado == 2)str="Sigue jugando";
		return str;
	}
}