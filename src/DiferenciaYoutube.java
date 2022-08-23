
import java.util.Scanner;

public class DiferenciaYoutube {
    
//Permita calcular la diferencia de visualizaciones de YouTube entre los meses seleccionados por teclado (enero a junio).    

Scanner entrada = new Scanner(System.in);    
    
public void DiferenciaYT() {

int mes1;
int mes2;
int diferencia;

String [] Meses = new String [6];

System.out.println("\n");
System.out.println("Esta es la cantidad de visualizaciones durante los seis meses:");

System.out.println("\n");
Meses[0] = "1. Enero: 12226 Visualizaciones";
Meses[1] = "2. Febrero: 15605 Visualizaciones";
Meses[2] = "3. Marzo: 19602 Visualizaciones";
Meses[3] = "4. Abril: 19452 Visualizaciones";
Meses[4] = "5. Mayo: 21805 Visualizaciones";
Meses[5] = "6. Junio: 17344 Visualizaciones";

for (int i = 0; i<6; i++){
    System.out.println(Meses[i]);
}

System.out.println("\n");
System.out.println("Ingresa la cantidad a comparar");
mes1 = entrada.nextInt();

System.out.println("\n");
System.out.println("Ingresa la otra cantidad");
mes2 = entrada.nextInt();

System.out.println("\n");
diferencia = mes1 - mes2;
System.out.println("La diferencia es de: " + diferencia + " visualizaciones");
}    

}
