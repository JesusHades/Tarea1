import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Tarea1 {
 
public static final String SEPARADOR = ",";    
    
public static void main(String[] args) {

 BufferedReader bufferLectura = null;
 try {
  bufferLectura = new BufferedReader(new FileReader("D:\\presenciaredes.csv"));
  
  
  String linea = bufferLectura.readLine();
  
  while (linea != null) {
 
   String[] campos = linea.split(SEPARADOR); 
   
   System.out.println(Arrays.toString(campos));
   
   linea = bufferLectura.readLine();
  }
 } 
 catch (IOException e) {
  e.printStackTrace();
 }
 finally {
 
  if (bufferLectura != null) {
   try {
    bufferLectura.close();
   } 
   catch (IOException e) {
    e.printStackTrace();
   }
  }
 }


int dato = 3;
Scanner entrada = new Scanner(System.in);

DiferenciaTwitter DT = new DiferenciaTwitter();
DiferenciaYoutube DY = new DiferenciaYoutube();
PromedioCrecimiento PC = new PromedioCrecimiento();


System.out.println("\n");
System.out.println("Seleccione una opcion");

System.out.println("1. La diferencia de seguidores en Twitter entre enero y junio");
System.out.println("2. Calcular la diferencia de visualizaciones de Youtube");
System.out.println("3. Promedio de crecimiento de Twitter y Facebook entre los meses de enero a junio.");
System.out.println("\n");

dato = entrada.nextInt();

switch (dato) {
    
    case 1: DT.DiferenciaTW() ;
    break;
    
    case 2: DY.DiferenciaYT();
    break;
    
    case 3: PC.promedioCrecimiento();
    break;
    
    default: System.out.println("Opcion invalida");
    break;
        
    
}
          
  
}

}