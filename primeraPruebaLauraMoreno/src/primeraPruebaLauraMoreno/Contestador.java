package primeraPruebaLauraMoreno;

public class Contestador {

	private String mensaje1;
	private String mensaje2;
	private String mensaje3; 
	
	public Contestador() {
		this.mensaje1 = "";
		this.mensaje2 = "";
		this.mensaje3 = "";
	}
	
	public void anadirMensaje(String mensaje) {
		if(this.mensaje1 == "") {
			this.mensaje1 = mensaje; 
		}
		else if(this.mensaje2 =="") {
			this.mensaje2 = mensaje;
		}
		else if (this.mensaje3 == "") {
			this.mensaje3 = mensaje;
		}else {
			System.out.println("Buzón completo.");
		}
	}
	
	public void oirMensaje(int numMensaje) throws Exception {
		if(numMensaje == 1) {
			if(this.mensaje1=="") {
				throw new Exception ("No existe mensaje.");
			}else {
				System.out.println(this.mensaje1);
		}
		}else if(numMensaje==2) {
			if(this.mensaje2=="") {
				throw new Exception ("No existe mensaje.");
			}else {
				System.out.println(this.mensaje2);
			}
		}
		else {
			if(this.mensaje3=="") {
				throw new Exception ("No existe mensaje.");
			}else {
				System.out.println(this.mensaje3);
				
			}
		}
	}

	
	public String consultarMensajes() {
		int cont = 0;
		
		if(this.mensaje1!="") {
			cont+=1;
		}if(this.mensaje2!="") {
			cont+=1;
		}if(this.mensaje3!="") {
			cont+=1;
		}
		return "El número de mensajes ocupados es de: " + cont;
	}
	
	
	
	public void borrarMensaje(int numMensaje) {
		if(numMensaje == 1) {
			this.mensaje1 = "";
		}else if (numMensaje == 2) {
			this.mensaje2 = "";
		}else {
			this.mensaje3 = "";
		}
	}
	
	public void borrarAllMensajes() {
		this.mensaje1 = "";
		this.mensaje2 = "";
		this.mensaje3 = "";
	}
	
	@Override
	public String toString() {
		return "Los mensajes contenidos son:\n1. " + this.mensaje1+"\n2. "+this.mensaje2+"\n3. "+this.mensaje3;
	}
	
}
