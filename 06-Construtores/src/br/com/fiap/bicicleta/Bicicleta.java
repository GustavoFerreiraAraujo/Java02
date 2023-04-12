package br.com.fiap.bicicleta;

public class Bicicleta {
	private int aro;
	private String modelo;
	private float peso;

	public int getAro() {
		return aro;
	}

	public void setAro(int aro) {
		this.aro = aro;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String retornarDetalhes() {
		return "Aro " +aro + " Modelo "+ modelo + " Peso "+ peso+ " ";
		
	}
}
