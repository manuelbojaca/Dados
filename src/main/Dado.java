package main;

public class Dado {
	
	private int dado1 = 0;
	private int dado2 = 0;
	private int caras = 6;

	public int getDado1() {
		return dado1;
	}

	public void setDado1(int resultado) {
		this.dado1 = resultado;
	}
	
	public int getDado2() {
		return dado2;
	}

	public void setDado2(int dado2) {
		this.dado2 = dado2;
	}
	
	private int lanzar () {
		int res = (int)Math.floor(Math.random()*this.caras+1);
		return res;
	}
	
	public int resDados() {
		this.dado1=lanzar();
		this.dado2=lanzar();
		return dado1 + dado2;
	}

}

