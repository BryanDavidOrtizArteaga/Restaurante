package restauranteapp;

public class Cliente{
    
    String nombre;
    int edad;
    int pedidosRealizados;
    
    public Cliente (String nombre, int edad, int pedidosRealizados){
        this.nombre = nombre;
        this.edad = edad; 
        this.pedidosRealizados = pedidosRealizados;
    }
    
    void Cuenta(){
        System.out.println("USUARIO:" + nombre);
        System.out.println("EDAD:" + edad);
    }
    
    void VerPedidosRealizados(){
        System.out.println("Usted ha completado " + pedidosRealizados + " pedido/s de 3");
    }
    
    boolean VerPedidosRealizados(int x) {

            pedidosRealizados += x;
            System.out.println("Bien hecho usted ha completado: " + pedidosRealizados + " pedido/s");
            return true;
        }
    }
    
}