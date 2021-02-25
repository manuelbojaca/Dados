package main;

import java.util.Scanner;

public class Juego {
	
	private int estado;
	private int turno = 0;
	private int dado1, dado2;
	private Jugador jug = new Jugador();
	private Maquina maquina = new Maquina();
	boolean i = true;
	
	public void inicio () {
		
		if (jug.getNombre() != "") {
			
			try {
				
				//Scanner sc = new Scanner(System.in);
				System.out.println("Dados: "+this.turno+" presione f para lanzar");
				//char pop = sc.next().charAt(0);
				this.estado = maquina.maqEstados();
				this.dado1 = maquina.getDado1();
				this.dado2 = maquina.getDado2();
				System.out.println("Dado1:" + maquina.getDado1() + " Dado2:" + maquina.getDado2());
				if (this.estado == 1) {
					
					System.out.println("Gano");
				}else if(this.estado == 0) {
					System.out.println("Pierde");
				}
				if(this.estado == 2) {
					System.out.println("Dados: "+ this.turno +" presione f para lanzar");
					//char pop1 = sc.next().charAt(0);
					this.estado = maquina.maqEstados();
					this.turno++;
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
}