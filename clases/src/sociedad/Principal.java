package sociedad;

import exceprtionPracticando.siSaludaException;

public class Principal {

	public static void main(String[] args)  {
		
		Rey rey1 = new Rey(); 
		Rey rey2 = new Rey();
		
		rey1.setEdad(4);
		rey2.setEdad(12);
		rey1.setNombre("Loli");
		try {
			rey1.saludarConLaManita();
			rey2.saludarConLaManita();
		} catch (aunNoSaludaException e1) {
			System.out.println(e1.getMessage());
		} catch (siSaludaException e) {
			System.out.println(e.getMessage());		
		}catch(Exception e){
				System.out.println(e.getMessage());		}
		
		
		System.out.println(rey1.loli());
		
	}
}
