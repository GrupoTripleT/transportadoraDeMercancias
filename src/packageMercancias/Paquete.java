package packageMercancias;

public class Paquete implements IMercancia {

	public Integer peso;
	public Double volumen;
	public Boolean contieneAlimento;
	public Double factor;
	
	
	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	public Double getVolumen() {
		return volumen;
	}

	public void setVolumen(Double volumen) {
		this.volumen = volumen;
	}

	public Boolean getContieneAlimento() {
		return contieneAlimento;
	}

	public void setContieneAlimento(Boolean contieneAlimento) {
		this.contieneAlimento = contieneAlimento;
	}

	public Double getFactor() {
		return factor;
	}

	public void setFactor(Double factor) {
		this.factor = factor;
	}
	
	

	public Paquete(Integer peso, Double volumen, Boolean contieneAlimento, Double factor) {
		super();
		this.setPeso ( peso);
		this.setVolumen (volumen);
		this.setContieneAlimento (contieneAlimento);
		this.setFactor (factor);
	}

	@Override
	public Integer peso() {
		return this.getPeso();
	}

	@Override
	public Double costo() {
		return this.peso()* this.getVolumen() * this.getFactor();
	}

	@Override
	public Boolean contieneAlimento() {
		return this.getContieneAlimento();
	}

}
