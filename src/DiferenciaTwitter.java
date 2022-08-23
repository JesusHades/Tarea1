
public class DiferenciaTwitter {

//Mostrar en pantalla la diferencia de seguidores (followers) en Twitter entre el mes de enero y junio.
    
public void DiferenciaTW() {
     
int [] seguidores = new int [2];

seguidores[0] = 62404;
seguidores[1] = 67496;        

int diferencia = seguidores[1] - seguidores[0];

System.out.println("\n");
System.out.println("La diferencia de seguidores es de: " + diferencia + " seguidores");
}   
}
