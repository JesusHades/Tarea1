
import java.util.Scanner;

public class PromedioCrecimiento {
    
//Calcular el promedio de crecimiento de Twitter y Facebook entre los meses de enero a junio.
    
Scanner entrada = new Scanner(System.in);

CrecimientoFB CFB = new CrecimientoFB();
CrecimientoTW CTW = new CrecimientoTW();
        
public void promedioCrecimiento () {

int seleccion = 2;

System.out.println("\n");
System.out.println("Seleccione una opcion");

System.out.println("1. Promedio de crecimiento de Facebbok");
System.out.println("2. Promedio de crecimiento de Twitter");
System.out.println("\n");

seleccion = entrada.nextInt();

switch (seleccion) {
    
    case 1: CFB.crecimientoFB(); 
    break;
    
    case 2: CTW.crecimientoTW();
    break;
   
}
    
}

    
}
