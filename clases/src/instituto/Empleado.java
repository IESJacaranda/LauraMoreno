package instituto;

import java.util.Objects;

public class Empleado {
	
	private String nombre;
	private int edad;
	private String genero;
	private String horario;
	private int codigoIdentificacion;
	private String contrasena;
	
	public Empleado() {
		super();
	}
	
	public Empleado(String nombre,int edad,String genero,String horario, String contrasena) {
		this.nombre=nombre;
		this.edad= edad;
		this.genero=genero;
		this.horario=horario;
		//De la siguiente forma se generará un código hash diferene para cada empleado de forma automática.
		this.codigoIdentificacion= Objects.hash(nombre, edad, genero, horario);
		this.contrasena=contrasena;
	}

	
	/**
	 * Realmente si entra en una excepción, ya sería errónea la contraseña pero lo que querido poner como boolean
	 * por si luego lo necesito en el menú.	 	
	 * @throws ContrasenaDemasiadoCorta
	 * @throws contrasenaSin2Mayus
	 * @throws contrasenaSin3Numeros
	 * return booelan si es o no válida la contraseña.
	 */
	public boolean comprobarContrasena() throws ContrasenaDemasiadoCorta, contrasenaSin2Mayus, contrasenaSin3Numeros {
		boolean valido =false;
		int contMayus = 0;
		int contNum = 0;
		
		if(this.contrasena.length()<10) {
			throw new ContrasenaDemasiadoCorta();
		}
		for(int i=0;i<this.contrasena.length();i++) {
			
			if(Character.isUpperCase(this.contrasena.charAt(i))){
				contMayus++;
			}
			if(Character.isDigit(this.contrasena.charAt(i))) {
				contNum++;
			}
		}
		
		if(contMayus<2) {
			throw new contrasenaSin2Mayus();
		}
		
		if(contNum<3) {
			throw new contrasenaSin3Numeros();
		}
		if(contMayus>=3 && contMayus>=2 && this.contrasena.length()>=10) {
			valido = true;
		}
		return valido;
				
	}
	
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public int getCodigoIdentificacion() {
		return codigoIdentificacion;
	}

//	public void setCodigoIdentificacion(int codigoIdentificacion) {
//		this.codigoIdentificacion = codigoIdentificacion;
//	}
	//No es necesario porque se autogenera y no sería correcto que lo eligiera el usuario. Lo que escoge es la contraseña.

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", horario=" + horario
				+ ", codigoIdentificacion=" + codigoIdentificacion + ", contrasena=" + contrasena + "]";
	}

}
