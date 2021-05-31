package corona;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.google.gson.Gson;

public class ListaRecuento {
	private final static String[] meses= {"","enero","febrero","marzo","abril","mayo","junio",
			"julio","agosto","septiembre","octubre","noviembre","diciembre"};

	private List<Corona>recuento;
	
	public ListaRecuento() {
		this.recuento = new ArrayList<Corona>();
		getFallecidos(recuento);
		getCurados(recuento);
		
	}
	
	public void getMejorDia() {
		//CONTAGIADOS
		StringBuilder sb = new StringBuilder("Mejor día de contagiados: ");
		sb.append(recuento.get(0).getFecha()+"\n");
		
		//FALLECIDOS
		Collections.sort(recuento, new ComparaMejorFallecidos());
		sb.append("Mejor día de fallecidos: "+ recuento.get(0).getFecha()+"\n");
		
		//CURADOS
		Collections.sort(recuento,new ComparaMejorCurados());
		sb.append("Mejor día de curados: "+recuento.get(0).getFecha());
		
		System.out.println(sb.toString());
	}
	
	public void getMejorDiaAPartir(int dia, String mes, int anyo) {
		List<Corona>nuevaLista = new ArrayList<Corona>();
		int mesNum = 0;
		boolean resul = false;
		
		for(int i=1; i<meses.length;i++) {
			if(!resul) {
				if(mes.equals(meses[i])) {
					mesNum = i;
					resul = true;
				}
			}
		}
		LocalDate fecha = LocalDate.of(anyo, mesNum, dia);
		
		Collections.sort(recuento, new ComparaPorFecha());
		for(Corona i: recuento) {
			if(i.getFecha().isEqual(fecha) || i.getFecha().isAfter(fecha)) {
				nuevaLista.add(i);
			}
		}
		
		//CONTAGIADOS
		Collections.sort(nuevaLista, new ComparaMejorContagiados());
		System.out.println("Mejor día de contagios: "+nuevaLista.get(0).getFecha());
		
		//FALLECIDOS
		Collections.sort(nuevaLista, new ComparaMejorFallecidos());
		System.out.println("Mejor día de fallecidos: "+nuevaLista.get(0).getFecha());
		
		//CURADOS
		Collections.sort(nuevaLista, new ComparaMejorCurados());
		System.out.println("Mejor día de curados: "+nuevaLista.get(0).getFecha());
	}
	
	public void getPeorDia() {
		//CONTAGIADOS
		StringBuilder sb = new StringBuilder("Peor día de contagiados: ");
		sb.append(recuento.get(recuento.size()-1).getFecha()+"\n");
		
		//FALLECIDOS
		Collections.sort(recuento, new ComparaMejorFallecidos());
		sb.append("Peor día de fallecidos: "+ recuento.get(recuento.size()-1).getFecha()+"\n");
		
		//CURADOS
		Collections.sort(recuento,new ComparaMejorCurados());
		sb.append("Peor día de curados: "+recuento.get(recuento.size()-1).getFecha());
		
		System.out.println(sb.toString());
	}
	
	public void getPeorDiaAPartir(int dia, String mes, int anyo) {
		List<Corona>nuevaLista = new ArrayList<Corona>();
		int mesNum = 0;
		boolean resul = false;
		
		for(int i=1; i<meses.length;i++) {
			if(!resul) {
				if(mes.equals(meses[i])) {
					mesNum = i;
					resul = true;
				}
			}
		}
		
		LocalDate fecha = LocalDate.of(anyo, mesNum, dia);
		
		Collections.sort(recuento, new ComparaPorFecha());
		for(Corona i: recuento) {
			if(i.getFecha().isEqual(fecha) || i.getFecha().isAfter(fecha)) {
				nuevaLista.add(i);
			}
		}
		
		//CONTAGIADOS
		Collections.sort(nuevaLista, new ComparaMejorContagiados());
		System.out.println("Peor día de contagios: "+nuevaLista.get(nuevaLista.size()-1).getFecha());
		
		//FALLECIDOS
		Collections.sort(nuevaLista, new ComparaMejorFallecidos());
		System.out.println("Peor día de fallecidos: "+nuevaLista.get(nuevaLista.size()-1).getFecha());
		
		//CURADOS
		Collections.sort(nuevaLista, new ComparaMejorCurados());
		System.out.println("Peor día de curados: "+nuevaLista.get(nuevaLista.size()-1).getFecha());
	}
	
	public void getDatosDia(int dia, int mes, int anyo) {
		
		LocalDate fecha = LocalDate.of(anyo, mes, dia);
		
		boolean resul = false;
		Iterator<Corona>it = recuento.iterator();
		while(it.hasNext() && !resul) {
			Corona aux = it.next();
			if(aux.getFecha().isEqual(fecha)) {
				System.out.println("Los datos de esa fecha son: " + aux);
				resul = true;
			}
		}
	}
	
	public String getMedia() {
		int fallecidos = 0;
		int contagiados = 0;
		int curados = 0;
		
		for(Corona i: recuento) {
			fallecidos += i.getFallecidos();
			contagiados += i.getContagios();
			curados += i.getCurados();
		}
		
		return "La media de fallecidos es "+fallecidos/recuento.size()+
				"\n La media de contagiados es " + contagiados/recuento.size() +
				"\n La media de curados es " + curados/recuento.size();
		
	}
	
	public List<Corona> getRecuento() {
		return recuento;
	}
	
                                                	/***************************
	                                                *     CONSEGUIR DATOS      *
	                                                ***************************/

	public void getFallecidos(List<Corona>recuento) {
		String linea = "";
		StringBuilder resul = new StringBuilder();
		try (BufferedReader buffer = new BufferedReader(new FileReader(".\\ficheros\\muertos_por_coronavirus_e.json"))){
			linea = buffer.readLine();
				while(linea!=null) {
					resul.append(linea);
					linea = buffer.readLine();
				}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Gson gson = new Gson();
		LecturaJson l = gson.fromJson(resul.toString(), LecturaJson.class);
		int facellidos = 0;
		int aux = 0;
		for(ClaseMetrica i: l.getDatos().getMetricas()) {//FALLECIDOS
			for(Informacion inf: i.getDatos()) {
				facellidos = inf.getValor();
				Corona c = new Corona(0, facellidos-aux,0,inf.getAgno(),inf.getPeriodo());
				recuento.add(c);
				aux = inf.getValor();
			}
		}
		getContagiados(recuento);
	}
	

	
	public void getContagiados(List<Corona>recuento) {
		String linea = "";
		StringBuilder resul = new StringBuilder();
		try (BufferedReader buffer = new BufferedReader(new FileReader(".\\ficheros\\casos_diagnosticados_de_c.json"))){
			linea = buffer.readLine();
				while(linea!=null) {
					resul.append(linea);
					linea = buffer.readLine();
				}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Gson gson = new Gson();
		LecturaJson l = gson.fromJson(resul.toString(), LecturaJson.class);
		int aux = 0;
		
		for(ClaseMetrica i: l.getDatos().getMetricas()) {//CONTAGIADOS
			for(Informacion inf: i.getDatos()) {
				Corona c = new Corona(inf.getValor(), 0,0,inf.getAgno(),inf.getPeriodo());
				if(!recuento.contains(c)) {
					recuento.add(c);
				}else {
					recuento.get(recuento.indexOf(c)).setContagios(inf.getValor()-aux);
				}
				aux = inf.getValor();	
			}
		}	
	}
	
	public void getCurados(List<Corona>recuento) {
		String linea = "";
		StringBuilder resul = new StringBuilder();
		try (BufferedReader buffer = new BufferedReader(new FileReader(".\\ficheros\\evolucion_de_casos_curado.json"))){
			linea = buffer.readLine();
				while(linea!=null) {
					resul.append(linea);
					linea = buffer.readLine();
				}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Gson gson = new Gson();
		LecturaJson l = gson.fromJson(resul.toString(), LecturaJson.class);
		int aux = 0;
		
		for(ClaseMetrica i: l.getDatos().getMetricas()) {//CURADOS
			for(Informacion inf: i.getDatos()) {
				Corona c = new Corona(0, 0,inf.getValor(),inf.getAgno(),inf.getPeriodo());
				if(!recuento.contains(c)) {
					recuento.add(c);
				}else {
					recuento.get(recuento.indexOf(c)).setCurados(inf.getValor()-aux);
				}
				aux = inf.getValor();	
			}
		}	
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(Corona i: recuento) {
			sb.append(i+"\n");
		}
		return sb.toString();
	}

	
}
