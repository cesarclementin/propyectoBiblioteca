package biblioteca;

public class Biblioteca {
	
	private Libro[] libros;
	private int contLibros;
	
	public Biblioteca (int maxCantidadDeLibros) {
		this.libros = new Libro[maxCantidadDeLibros];
	}
	
	//1 Se pueda consultar la cantidad de libros que contiene.
	public int cuantosLibros(){
		return contLibros;
	}
	
	/*3. Se pueda agregar un libro indicando su título, autor, Genero y cantidad de páginas, siempre y cuando haya
	lugar en la Biblioteca. Los Generos literarios que le gustan a éste bibiotecario son: POESIA, CIENCIAFIC-
	CION, AVENTURA, NOVELA, HISTORIA, INFANTILES.
	*/
	public boolean agregarLibro(String titulo, String autor, Genero genero, int cantPaginas){
		
		for(int i = 0; i<libros.length;i++) {
			if(this.contLibros<this.libros.length) {
				libros[contLibros] = new Libro(titulo, autor, genero, cantPaginas);
				contLibros++;
				return true;
			}
		}
		return false;
	}
	
	//4. Devuelva el título de un libro a partir de la posición.
	public String libroEnLaPosicion(int posicion){
		return this.libros[posicion-1].getTitulo();
	}
	
	//5. Devuelva el libro con más cantidad de páginas.
	public Libro libroConMasPaginas(){
		
		Libro max = libros[0];
	
		for(int i=0; i<contLibros;i++) {
			if(libros[i].getCantPaginas() > max.getCantPaginas()) {
				max = libros[i];
			}
		}
		return max;
	}
	
	//6. Se pueda consultar cuantos libros hay de determinado autor.
	public int cuantosLibrosDelAutor(String autor){
	
		int cont=0;
		
		for(int i=0; i<contLibros;i++) {
			if(libros[i].getAutor().equals(autor)) {
				cont++;
			}
		}
		return cont;
	}
	
	//7. Devuelva un arreglo con todos los Libros de un autor que se pasa por parámetro.
		public Libro [] librosDelAutor(String autor){
			int contLibros=0;
			Libro[] librosDelAutor = new Libro[this.cuantosLibrosDelAutor(autor)];
			for(int i=0; i<this.contLibros;i++) {
				if(libros[i].getAutor().equals(autor)) {
					librosDelAutor[contLibros] = libros[i];
					contLibros++;
				}
			}
			return librosDelAutor;
		}
		
	//8. Calcule el tiempo (en minutos) que llevaría leer todos los libros, asumiendo que se tarda 1 minuto por página.
	public int tiempoEnLeetTodosLosLibros(){
		
		int sumaTiempo=0;
		
		for(int i=0; i<contLibros;i++) {
			sumaTiempo += libros[i].getCantPaginas();
		}
		
		return sumaTiempo;
	}
	
	//9. Informe por pantalla la cantidad de libros que hay por cada Genero literario.
	public void librosPorGeneroLiterario() {
		int contLibrosPoesia = 0;
		int contLibrosFiccion = 0;
		int contLibrosAventura = 0;
		int contLibrosNovela = 0;
		int contLibrosHistoria = 0;
		int contLibrosInfantiles = 0;

		for (int i = 0; i < this.contLibros; i++) {
			if (libros[i].getGenero() == Genero.POESIA)
				contLibrosPoesia++;
			else if (libros[i].getGenero() == Genero.CIENCIAFICCION)
				contLibrosFiccion++;
			else if (libros[i].getGenero() == Genero.AVENTURA)
				contLibrosAventura++;
			else if (libros[i].getGenero() == Genero.NOVELA)
				contLibrosNovela++;
			else if (libros[i].getGenero() == Genero.HISTORIA)
				contLibrosHistoria++;
			else if (libros[i].getGenero() == Genero.INFANTILES)
				contLibrosInfantiles++;

		}
       
		System.out.println("POESIA: " + contLibrosPoesia + " | " + "CIENCIA FICCION: " + contLibrosFiccion + " | "
				+ "AVENTURA: " + contLibrosAventura + " | " + "NOVELA: " + contLibrosNovela + " | " + "HISTORIA: "
				+ contLibrosHistoria + " | " + "INFANTILES: " + contLibrosInfantiles);
	}
	
}
