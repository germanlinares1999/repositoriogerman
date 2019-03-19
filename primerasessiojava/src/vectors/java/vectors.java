package vectors.java;

public class vectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] vector = {1, 2, 3};
		float [] vector2 = {3.5f, 3.9f}; //La f se pone para que no de error cuando es float.
		double [] vector3 = {2.5, 6.8};
		
		int []vector4 = new int[5];
		
		for(int i=0;i<vector.length;i++) {
			System.out.println("Posicio:" + i +  " Contingut: " + vector[i]+" ");
		}
		System.out.println("\n Contingut vector 4");
		for(int i = 0; i<vector.length;i++) {
			System.out.println("Posicio: " +i+ "Contingut:" + vector4[i]+" ");
		}
		
		vector4[0] = 7;
		vector4[1] = 8;
		vector4[2] = 9;
		vector4[3] = 10;
		vector4[4] = 11;
		System.out.println("\n Contingut vector 4 post ini");
		for(int i = 0; i<vector.length;i++) {
			System.out.println("Posicio: "+i+" Contingut:" + vector4[i]+" ");
		}
	}

}
