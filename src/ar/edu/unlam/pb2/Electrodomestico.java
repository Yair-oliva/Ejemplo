package ar.edu.unlam.pb2;

public class Electrodomestico {
	
	protected String marca;
	protected Integer numeroDeSerie;
	
	public Electrodomestico(String marca,Integer numeroDeSerie) {
		this.marca=marca;
		this.numeroDeSerie=numeroDeSerie;
	}
	
	public void setMarca(String marca) {
		this.marca=marca;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setNumeroDeSerie(Integer numeroDeSerie) {
		this.numeroDeSerie=numeroDeSerie;
	}

	public Integer getNumeroDeSerie() {
		return numeroDeSerie;
	}
	
	
}
