package packageMercancias;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import java.util.ArrayList;


class ContenedorTest {

	public Contenedor contenedorSut;
	public Paquete paqueteConAlimento;
	public Paquete paqueteSinAlimento;
	

	@BeforeEach
	void setUp() throws Exception {
		contenedorSut = new Contenedor(new ArrayList<IMercancia>(), 300.00, 500);
		paqueteConAlimento = mock(Paquete.class);
			when (paqueteConAlimento.contieneAlimento()).thenReturn (true);
		
		paqueteSinAlimento = mock(Paquete.class);
			when (paqueteSinAlimento.contieneAlimento()).thenReturn (false);
			
		contenedorSut.agregarMercancia(paqueteConAlimento);
		contenedorSut.agregarMercancia(paqueteSinAlimento);
	}

	@Test
	void testContenedorSutContieneAlimento() {
		assertTrue(contenedorSut.contieneAlimento());
	}
	

}