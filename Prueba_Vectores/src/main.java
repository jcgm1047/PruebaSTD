
import java.util.Arrays;


public class main {

	public static void main(String[] args) {
		
		 
     int arreglo []  = new int [100];
	
     for (int i = 0; i < arreglo.length; i++) {
    	
    	 arreglo [i] =(int)(Math.random()*100000+1);
    	 
    	 
    			 		 		
	}
     
     Arrays.sort(arreglo);
     for (int i = 0; i < arreglo.length; i++) {
     System.out.println(""+arreglo[i]);
     
     }
     
      
	}
		
	}
