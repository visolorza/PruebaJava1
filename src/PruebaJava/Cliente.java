package PruebaJava;

/**
 *
 * @author Vicente Solorza
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private int run;
    private int dv;
    private int telefono;
    private boolean clienteAntiguo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getDv() {
        return dv;
    }

    public void setDv(int dv) {
        this.dv = dv;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public boolean isClienteAntiguo() {
        return clienteAntiguo;
    }

    public void setClienteAntiguo(boolean clienteAntiguo) {
        this.clienteAntiguo = clienteAntiguo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", run=" + run + ", dv=" + dv + ", telefono=" + telefono + ", clienteAntiguo=" + clienteAntiguo + '}';
    }        
       
}
