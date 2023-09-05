package PruebaJava;

import java.util.Scanner;

/**
 *
 * @author Vicente Solorza
 */
public class Principal {
    public static void main(String[] args) {
        
        //Datos cliente
        String nombre;
        String apellido;
        int run;
        int dv;
        int telefono;
        
        //Datos plan
        String nombrePlan;
        int numero;
        int precio;
        int minutos;
        
        //Lectura de datos
        Scanner leer = new Scanner(System.in);
        
        //Cliente
        Cliente cliente = new Cliente();
        
        //Plan
        Plan plan = new Plan();
        
        //Validaciones
        boolean flag;
        Validacion valida = new Validacion();
        
        System.out.println("***INGRESO DATOS DEL CLIENTE***");
        do {            
            System.out.println("Ingrese nombre del cliente: ");
            nombre = leer.next();
            cliente.setNombre(nombre);
            flag = valida.validarNombreCliente(nombre);
        } while (flag == false); 
        
        System.out.println("Ingrese apellido del cliente: ");
        apellido = leer.next();
        cliente.setApellido(apellido);
        
        System.out.println("Ingrese RUN del cliente: ");
        run = leer.nextInt();
        cliente.setRun(run);
        
        System.out.println("Ingrese digito verificador del cliente: ");
        dv = leer.nextInt();
        cliente.setDv(dv);
        
        System.out.println("Ingrese telefono del cliente: ");
        telefono = leer.nextInt();
        cliente.setTelefono(telefono);
        
        System.out.println("Ingrese si es un cliente nuevo o antiguo: ");
        String tipoCliente = leer.next();
        if (tipoCliente.equalsIgnoreCase("nuevo")){
            cliente.setClienteAntiguo(false);
        }
        else {
            if (tipoCliente.equalsIgnoreCase("antiguo")) {
                cliente.setClienteAntiguo(true);
            }
        }
        
        System.out.println(cliente.toString());
        
        System.out.println("***FIN INGRESO DATOS DEL CLIENTE***\n");
        
        System.out.println("***INGRESO DATOS DEL PLAN***");
        
        plan.setCliente(cliente);
        
        do {            
            System.out.println("Ingrese nombre del plan: ");
            nombrePlan = leer.next();
            flag = valida.validarNombrePlan(nombrePlan);
        } while (flag==false);
        plan.setNombrePlan(nombrePlan);
        
        do {            
            System.out.println("Ingrese numero del plan: ");
            numero = leer.nextInt();
            flag = valida.validarNumeroPlan(numero);
            
            if (flag == false) {
                System.out.println("El numero debe tener 8 digitos.");
            }            
        } while (flag==false);
        plan.setNumero(numero);
        
        do {            
            System.out.println("Ingrese precio del plan: ");
            precio = leer.nextInt();
            flag = valida.validarPrecioPlan(precio);
            
            if (flag == false) {
                System.out.println("El precio debe ser igual o mayor 6990");
            }
        } while (flag==false);
        plan.setPrecio(precio);
        
        System.out.println("Ingrese minutos del plan: ");
        minutos = leer.nextInt();
        plan.setMinutos(minutos);
        
        System.out.println("***FIN INGRESO DATOS DEL PLAN\n***");
        
        System.out.println("DETALLE DEL PLAN");
        plan.aplicarDescuento(10);
        plan.mostrarInformacion();   
    }
}
