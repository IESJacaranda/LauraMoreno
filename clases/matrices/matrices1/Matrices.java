package matrices1;

public class Matrices {

	public static void main(String[] args) {
		arrays();

	}
	
	public static void arrays() {
		int[]lista = new int [10]; //VECTOR
		int[][]dosD = new int[5][5]; //MATRIZ
		dosD[0][4] = 4;
		
//		for (int i=0;i<lista.length;i++) {
//			System.out.println(i+" " +lista[i]);
//		}
//		
		
		for (int i=0;i<dosD.length;i++) {
			for(int j=0;j<dosD[i].length;j++){
				dosD[i][j]=i+j;
				System.out.println(dosD[i][j]);
			}
		}
}

}
