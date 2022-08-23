
public class CrecimientoTW {

public void crecimientoTW (){
    
double [] numerosTW = new double [6];
double totalTW;

numerosTW[0] = 1;
numerosTW[1] = 1;
numerosTW[2] = 1;
numerosTW[3] = 2;
numerosTW[4] = 1;
numerosTW[5] = 1;

totalTW = (numerosTW[0] + numerosTW[1] + numerosTW[2] + numerosTW[3] + numerosTW[4] + numerosTW[5])/6;

System.out.println("\n");
System.out.println("El promedio de crecimiento de Twitter entre los meses de enero y junio es de: " + totalTW + "%");

}    
}
