package biblioteca;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BibliotecaTest {

	
	@Test
	public void bibliotecaNotNullTest() {
		Biblioteca bi = new Biblioteca(100);
		assertNotNull(bi);
	}
	
	@Test
	public void agregarLibrotest() {
		Biblioteca bi = new Biblioteca(100);
		
		bi.agregarLibro("StarWars", "LucasFilm", Genero.CIENCIAFICCION, 400);
		bi.agregarLibro("StarWars2", "LucasFilm2", Genero.CIENCIAFICCION, 500);
		bi.agregarLibro("StarWars3", "LucasFilm3", Genero.CIENCIAFICCION, 600);
		
		assertEquals(3, bi.cuantosLibros());
	}
	
	@Test
	public void libroEnLaPosicionTest() {
		Biblioteca bi = new Biblioteca(100);
		
		bi.agregarLibro("StarWars", "LucasFilm", Genero.CIENCIAFICCION, 400);
		bi.agregarLibro("StarWars2", "LucasFilm2", Genero.CIENCIAFICCION, 500);
		bi.agregarLibro("StarWars3", "LucasFilm3", Genero.CIENCIAFICCION, 600);
		
		assertEquals("StarWars2", bi.libroEnLaPosicion(2));
	}
	
	@Test
	public void libroConMasPaginasTest() {
		Biblioteca bi = new Biblioteca(100);
		
		bi.agregarLibro("StarWars", "LucasFilm", Genero.CIENCIAFICCION, 400);
		bi.agregarLibro("StarWars2", "LucasFilm2", Genero.CIENCIAFICCION, 500);
		bi.agregarLibro("StarWars3", "LucasFilm3", Genero.CIENCIAFICCION, 600);
		
		Libro esperado = new Libro("StarWars3", "LucasFilm3", Genero.CIENCIAFICCION, 600);
		
		assertEquals(esperado, bi.libroConMasPaginas());
	}
	
	@Test
	public void cuantosLibrosDelAutorTest() {
		Biblioteca bi = new Biblioteca(100);
		
		bi.agregarLibro("StarWars", "LucasFilm", Genero.CIENCIAFICCION, 400);
		bi.agregarLibro("StarWars2", "LucasFilm", Genero.CIENCIAFICCION, 500);
		bi.agregarLibro("StarWars3", "LucasFilm", Genero.CIENCIAFICCION, 600);
		
		int esperado = 3;
		
		assertEquals(esperado, bi.cuantosLibrosDelAutor("LucasFilm"));
	}
	
	@Test
	public void librosDelAutorTest() {
		Biblioteca bi = new Biblioteca(100);
		
		bi.agregarLibro("StarWars", "LucasFilm", Genero.CIENCIAFICCION, 400);
		bi.agregarLibro("StarWars2", "LucasFilm", Genero.CIENCIAFICCION, 500);
		bi.agregarLibro("StarWars3", "LucasFilm2", Genero.CIENCIAFICCION, 600);
		
		Libro[] esperado = {new Libro("StarWars", "LucasFilm", Genero.CIENCIAFICCION, 400), new Libro("StarWars2", "LucasFilm", Genero.CIENCIAFICCION, 500)};
		
		assertArrayEquals(esperado, bi.librosDelAutor("LucasFilm"));
	}
	
	@Test
	public void tiempoEnLeerTodosLosLibrosTest() {
		Biblioteca bi = new Biblioteca(100);
		
		bi.agregarLibro("StarWars", "LucasFilm", Genero.CIENCIAFICCION, 400);
		bi.agregarLibro("StarWars2", "LucasFilm", Genero.CIENCIAFICCION, 500);
		bi.agregarLibro("StarWars3", "LucasFilm2", Genero.CIENCIAFICCION, 600);
		
		int esperado = (400 + 500 + 600);
		
		assertEquals(esperado, bi.tiempoEnLeetTodosLosLibros());
	}
	
	@Test
	public void librosPorGeneroLiterarioTest() {
		Biblioteca bi = new Biblioteca(100);
		
		bi.agregarLibro("StarWars", "LucasFilm", Genero.CIENCIAFICCION, 400);
		bi.agregarLibro("StarWars2", "LucasFilm", Genero.AVENTURA, 500);
		bi.agregarLibro("StarWars3", "LucasFilm2", Genero.CIENCIAFICCION, 600);
		 
		bi.librosPorGeneroLiterario();
	}
	
	


}
