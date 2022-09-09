
package tiposdecondicionales;



public class TiposDeCondicionales {


    public static void main(String[] args) {
        
        boolean noHayInternet =  true;
        boolean hayInternetPeroMuyPoquito = false;
        boolean hayBuenInternetPeroNoEsSuficiente= false;
        
       
        if (noHayInternet) {
        System.out.println("No hay internet");
        } else if  (hayInternetPeroMuyPoquito) {
           System.out.println("Tienes muy poquito Internet");
        } else if (hayBuenInternetPeroNoEsSuficiente) {
           System.out.println("Casi casi, falta solo un poquito más");
        } else  {
           System.out.println("¡Tienes suficiente Internet!");
        }
    }
    
}
