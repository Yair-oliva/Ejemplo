package ar.edu.unlam.pb2;

public class Televisor extends Electrodomestico {
	
	private Integer volumen;
	private Integer canal;
	private Integer canalMaximo;
	private Integer volumenMaximo;
	private Boolean estado=false;
	
	public Televisor(String marca,Integer numeroDeSerie,Integer canal,Integer canalMaximo,Integer volumen,Integer volumenMaximo,Boolean estado) {
		super(marca,numeroDeSerie);
		this.volumen=volumen;
		this.canal=canal;
		this.canalMaximo=canalMaximo;
		this.volumenMaximo=volumenMaximo;
		this.estado=estado;
	}
	
		
	public Integer getVolumen() {
		return volumen;
	}

	public void setVolumen(Integer volumen) {
		this.volumen = volumen;
	}

	public Integer getCanal() {
		return canal;
	}

	public void setCanal(Integer canal) {
		this.canal = canal;
	}

	public Integer getCanalMaximo() {
		return canalMaximo;
	}

	public void setCanalMaximo(Integer canalMaximo) {
		this.canalMaximo = canalMaximo;
	}

	public Integer getVolumenMaximo() {
		return volumenMaximo;
	}

	public void setVolumenMaximo(Integer volumenMaximo) {
		this.volumenMaximo = volumenMaximo;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public void incrementarCanal() {
		this.canal++;
			if(this.canal>this.canalMaximo) {
				this.canal=1;
			}
	}
	
	public boolean verificaCanal(Integer canal) {
		boolean estado=false;
			if(canal>0 && canal<=this.canalMaximo) {
				estado=true;
			}
			else {
				estado=false;
			}
		
		return estado;
	}
	
	public void subirVolumen() {
		if(this.volumen<=this.volumenMaximo) {
			this.volumen++;
		}
	}
	
	public Integer subirVolumen(Integer volumen) {
		
		if(this.volumen<=this.volumenMaximo) {
			this.volumen++;
		}
		return this.volumen;
	}
	
	public void bajarVolumen() {
		if(this.volumen>0 && this.volumen<=this.volumenMaximo) {
			this.volumen--;
		}
	}
	
	public Integer bajarVolumen(Integer volumen) {
		if(this.volumen>0 && this.volumen<=this.volumenMaximo) {
			this.volumen++;
		}
		return this.volumen;
	}
	
	public void silenciar() {
		this.volumen=0;
	}
	
	public Boolean estado() {
		return estado;
	}
	public void apagarTelevisor() {
		this.estado=false;
	}
	public void encenderTelevisor() {
		this.estado=true;
	}
	
}
	


