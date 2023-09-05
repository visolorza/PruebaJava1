package PruebaJava;

/**
 *
 * @author Vicente Solorza
 */
public class Plan {
    private String nombrePlan;
    private int numero;
    private int precio;
    private Cliente cliente;
    private int minutos;

    public String getNombrePlan() {
        return nombrePlan;
    }

    public void setNombrePlan(String nombrePlan) {
        this.nombrePlan = nombrePlan;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
    
    public void aplicarDescuento(int descuento) {
        if (cliente.isClienteAntiguo() == true) {
            this.precio = this.precio - (this.precio*(descuento/100));
        }
        
        if (this.precio >= 20000) {
            this.precio = this.precio - (this.precio*(descuento/100));
        }
    }
    
    public void agregarMinutos(int minutosAgregados) {
        this.minutos = this.minutos + minutosAgregados;
    }
    
    public void mostrarInformacion() {
        System.out.println("***INFORMACION DEL PLAN***");
        System.out.println("Nombre: " + this.nombrePlan);
        System.out.println("Cliente: " + this.cliente);
        System.out.println("Numero: " + this.numero);
        System.out.println("Minutos: " + this.minutos);
        System.out.println("Precio: $" + this.precio);        
    }
    
    @Override
    public String toString() {
        return "Plan{" + "nombrePlan=" + nombrePlan + ", numero=" + numero + ", precio=" + precio + ", cliente=" + cliente + ", minutos=" + minutos + '}';
    }
       
}
