package PruebaJava;

/**
 *
 * @author Vicente Solorza
 */
public class Validacion {

    public Validacion() {
    }
    
    public boolean validarNumeroPlan(int numero) {
        return numero >= 9999999 && numero < 100000000;
    }  
    
    public boolean validarPrecioPlan(int precio) {
        return precio >= 6990;
    }
    
    public boolean validarNombreCliente(String nombre) {
        boolean flag = true;
        if (nombre.isEmpty() == true) {
            flag = false;
        }
        return flag;
    }
    
    public boolean validarNombrePlan(String nombrePlan) {
        boolean flag = true;
        if (nombrePlan.isEmpty() == true) {
            flag = false;
        }
        return flag;
    }
    
}
