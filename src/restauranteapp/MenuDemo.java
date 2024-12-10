package restauranteapp;

import java.util.Scanner;

public class MenuDemo{
    
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        
        int pedidosRealizados = 0;
        
        System.out.print("Bienvenido Ingrese su nombre de usuario: ");
        String nombre1 = s.nextLine();
        
        System.out.print("Ingrese su edad: ");
        int edad1 = s.nextInt();
        s.nextLine();
        
        Cliente persona1 = new Cliente (nombre1,edad1,pedidosRealizados);
        
        int opcion;

            do {
                System.out.println("UN GUSTO TENERTE AQUÍ" + nombre1);
                System.out.println("\n--- ¿MENÚ DE OPCIONES? ---");
                System.out.println("1. Ver mis pedidos pendientes");
                System.out.println("2. Ver mis pedidos realizados");
                System.out.println("3. Marcar pedidos completos");
                System.out.println("4. Ver mi perfil");
                System.out.println("5. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = s.nextInt();

                switch (opcion) {    
                
                    case 1:
                        System.out.print("\n--- MENÚ DE PEDIDOS PENDIENTES ---");
                        System.out.println("1. Combo familiar de arroz ranchero");
                        System.out.println("2. Sandwich cubano con gaseosa");
                        System.out.println("3. Combo de alitas de pollo con papas tamaño medio");
                        break;
                       
                       
                    case 2: 
                    persona1.VerPedidosRealizados();
                        break;
                        

                    case 3: 
                        System.out.print("\n--- ¿CUANTOS PEDIDOS HA COMPLETADO? ---");
                        int cantidad = s.nextInt();
                        persona1.VerPedidosRealizados(cantidad);
                        break; 
                        
                    case 4: 
                    persona1.Cuenta();
                        break;   
                        
                    case 5:
                        System.out.println("Saliendo de la app...");
                        break;
            default:
                System.out.println("Opción no válida. Por favor, intente de nuevo.");
                }
            } while (opcion != 5);
        s.close();
    }
}