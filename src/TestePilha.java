import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestePilha {

	@Test
	void pilhaVazia() {
		Pilha p = new Pilha(); 
		assertTrue(p.estaVazia()); 
		assertEquals(0,p.tamanho());
	} 
	
	@Test
	void empilhaUmElemento() {
		Pilha p = new Pilha(); 
		p.empilha("primeiro");
		assertFalse(p.estaVazia()); 
		assertEquals(1,p.tamanho()); 
		assertEquals("primeiro",p.topo());
	} 
	
	@Test
	void empilhadoisElementos() {
		Pilha p = new Pilha(); 
		p.empilha("primeiro"); 
		p.empilha("segundo");
		assertFalse(p.estaVazia()); 
		assertEquals(1,p.tamanho()); 
		assertEquals("segundo",p.topo());
	}


}
