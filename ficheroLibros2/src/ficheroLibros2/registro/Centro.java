package ficheroLibros2.registro;

import java.util.ArrayList;
import java.util.List;

public class Centro {
	
	private String centro;
	private TipoCentro tipo;
	private String codigo;
	private List<Curso>cursos;
	
	public Centro(String ti, String nombre, String codigo) {
		this.cursos = new ArrayList<Curso>();
		this.centro = nombre;
		this.codigo = codigo;
		
		if(ti.contains("Centro")) {
			this.tipo = TipoCentro.CENTRO_DOCENTE_PRIVADO;
		}else if(ti.contains("Colegio")) {
			this.tipo= TipoCentro.COLEGIO;
		}else {
			this.tipo = TipoCentro.INSTITUTO;
		}
	}
	
	public void addCurso(Curso c, Materia m) {
		if(!cursos.contains(c)) {
			cursos.add(c);
		}else {
			cursos.get(cursos.indexOf(c)).addMateria(m);
		}
	}
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public TipoCentro getTipo() {
		return tipo;
	}

	public void setTipo(TipoCentro tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return centro;
	}

	public void setNombre(String nombre) {
		this.centro = nombre;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Centro))
			return false;
		Centro other = (Centro) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Centro: "+this.centro+"\n");
		for (Curso curso : cursos) {
			sb.append(curso.toString()+"\n");
		}
		return sb.toString();
	}
	
	

}
