package ficheroLibros2.registro;

public class Libro {

	private String titulo;
	private String ean;
	private String editorial;
	private String digital;
	
	public Libro(String ean, String editorial, String titulo, String digital) {
		this.ean = ean;
		this.editorial = editorial;
		this.titulo = titulo;
		this.digital = ((digital=="") ? "S" : "N");
	}

	public String getEan() {
		return ean;
	}

	public void setEan(String ean) {
		this.ean = ean;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDigital() {
		return digital;
	}

	public void setDigital(String digital) {
		this.digital = digital;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ean == null) ? 0 : ean.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Libro))
			return false;
		Libro other = (Libro) obj;
		if (ean == null) {
			if (other.ean != null)
				return false;
		} else if (!ean.equals(other.ean))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ean=" + ean + ", editorial=" + editorial + ", titulo=" + titulo + ", digital=" + ((digital=="") ? "S" : "N");
	}
	
	
	
}
