package biblioteca;

import java.util.Objects;

public class Libro {
	
	private String titulo;
	private String autor;
	private int cantPaginas;
	private Genero genero;

	public Libro(String titulo, String autor, Genero genero, int cantPaginas) {
		this.autor = autor;
		this.cantPaginas = cantPaginas;
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getCantPaginas() {
		return cantPaginas;
	}

	public String getAutor() {
		return autor;
	}

	public Genero getGenero() {
		return genero;
	}

	@Override
	public int hashCode() {
		return Objects.hash(autor, cantPaginas, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(autor, other.autor) && cantPaginas == other.cantPaginas
				&& Objects.equals(titulo, other.titulo);
	}
	
	
	
	

}
