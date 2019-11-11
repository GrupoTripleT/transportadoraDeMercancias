package packageMercancias;

import java.util.List;

public class Contenedor implements IMercancia {
	
	public List<IMercancia> mercancias;
	public Double volumen;
	public Integer pesoPropio;
	
	

	public List<IMercancia> getMercancias() {
		return mercancias;
	}

	public void setMercancias(List<IMercancia> mercancias) {
		this.mercancias = mercancias;
	}

	public Double getVolumen() {
		return volumen;
	}

	public void setVolumen(Double volumen) {
		this.volumen = volumen;
	}

	public Integer getPesoPropio() {
		return pesoPropio;
	}

	public void setPesoPropio(Integer pesoPropio) {
		this.pesoPropio = pesoPropio;
	}
	
	public void agregarMercancia(IMercancia unaMercancia) {
		this.getMercancias().add(unaMercancia);
	}
	

	public Contenedor(List<IMercancia> mercancias, Double volumen, Integer pesoPropio) {
		super();
		this.mercancias = mercancias;
		this.volumen = volumen;
		this.pesoPropio = pesoPropio;
	}

	@Override
	public Integer peso() {

		return this.getMercancias().stream().mapToInt(mercancia -> mercancia.peso()).sum();
	}

	@Override
	public Double costo() {
		return this.peso() * this.getVolumen() * 0.85;
	}

	@Override
	
	
	public Boolean contieneAlimento() {
		Boolean algunoContieneAlimento = false;
		
		for (IMercancia merc : this.getMercancias()) {
			algunoContieneAlimento = algunoContieneAlimento || merc.contieneAlimento();
		}
		
		return  algunoContieneAlimento;
	}

}
