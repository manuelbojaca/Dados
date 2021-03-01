package main;

import java.util.Scanner;

public class Maquina extends Dado{
	
	Pruebas pr = new Pruebas();
	private int res;
	private int res2;
	private int estado;
	private int turno = 0;
	//private Dado dados = new Dado();
	//private final boolean pierde = (this.res==2) || (this.res==3) || (this.res==12);
	//private final boolean gana = (this.res==7) || (this.res==11);
	//private final boolean pierde2 = (this.res==2) || (this.res==3) || (this.res==12);
	
	public Maquina () {
		super();
	}
	
	public int isEstado() {
		return estado;
	}
	public int setEstado(int estado) {
		return this.estado = estado;
	}
	public int getTurno() {
		return turno;
	}
	public void setTurno(int turno) {
		this.turno = turno;
	
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

	public int maqEstados() {

		this.res = super.resDados();
		pr.pri("turno_ = "+this.turno);
		if(turno == 0) {	
			System.out.println("Entro a Turno == 0 maqEs...." + this.res);
			this.turno = 2;
			if ((this.res==7) || (this.res==11)) {
				System.out.println("gana turno 1");
				this.turno=1;
				return 1;
			}
			else if((this.res==2) || (this.res==3) || (this.res==12)){
				System.out.println("pierde otro turno");
				this.turno=1;
				return 0;
			}
			else {
				//System.out.println();
				this.res2 = this.res;
				return 2;
			}
		}
		else {
			if (res == 7) {
				//System.out.println();
				this.turno=1;
				return 0;
			}
			else if (res == res2) {
				//System.out.println();
				this.turno=1;
				return 1;
			}
			else{
				System.out.println("Suigue jugando");
				//this.res2 = this.res;
				return 2;
			}
		}
	}
	
	/*public void game () {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Dados: "+this.turno+" presione f para lanzar");
			char pop = sc.next().charAt(0);
			this.estado = maquina();
			this.turno++;
			System.out.println("Dado1:"+getDado1()+" Dado2:"+getDado2());
			if (estado == 1) {
				System.out.println("Gano");
			}else if(estado == 0) {
				System.out.println("Pierde");
			}
			while (estado == 2) {
				System.out.println("Dados: "+this.turno+" presione f para lanzar");
				char pop1 = sc.next().charAt(0);
				this.estado = maquina();
				this.turno++;
				System.out.println("Dado1:"+getDado1()+" Dado2:"+getDado2());
				if (estado == 1) {
					System.out.println("Gano");
				}else if(estado == 0) {
					System.out.println("Pierde");
				}
			}
			
		}finally {
			//sc.close();
		}
	}*/
}


