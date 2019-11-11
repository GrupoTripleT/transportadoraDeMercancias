package packageMercancias;

import java.util.List;

public class Camion {

	public List<IMercancia> transportables;
	
	public Integer pesoMaximo;
	
	
	
	public List<IMercancia> getTransportables() {
		return transportables;
	}



	public void setTransportables(List<IMercancia> transportables) {
		this.transportables = transportables;
	}



	public Integer getPesoMaximo() {
		return pesoMaximo;
	}



	public void setPesoMaximo(Integer pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}


	public Camion(List<IMercancia> transportables, Integer pesoMaximo) {
		super();
		this.setTransportables (transportables);
		this.setPesoMaximo (pesoMaximo);
	}



	public Boolean contieneAlimentos() {
		Boolean algunoContieneAlimento = false;
		
		for (IMercancia trans : this.getTransportables()) {
			algunoContieneAlimento = algunoContieneAlimento || trans.contieneAlimento();
		}
		
		return  algunoContieneAlimento;
	}
	
	public Boolean excedePesoPermitido() {
		return this.getTransportables().stream().mapToInt(trans -> trans.peso()).sum() > 
					this.getPesoMaximo();
	}
	
	public Double costoDelEnvio() {
		return this.getTransportables().stream().mapToDouble(trans -> trans.costo()).sum();
	}
}

