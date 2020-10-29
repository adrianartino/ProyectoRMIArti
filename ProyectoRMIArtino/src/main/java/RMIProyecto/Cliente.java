package RMIProyecto;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.*;

public class Cliente {
    
    private void conectar_servidor(){
        try{
            // Se crea un enlace al registro con la ip del servidor
            // y el puerto que se va usar.
            Registry registro = LocateRegistry.getRegistry("127.0.0.1", 9999);

            // Busca el objeto remoto en el registro RMI de la máquina remota.
            // Se usa el mismo nombre que tiene el servidor "mates"
            // utilizando la interfaz que ya se ha creado (casting).
            metodos_rmi interfaz = (metodos_rmi)registro.lookup("servidorarti");

            float[] suma;

            // Aquí se hace la invocación al método remoto: sumar()
            // como si se tratara de un método local
            suma = interfaz.multiplicar(new float[]{3,2,7,4,0});
            
            switch (suma.length) {
                
                //Si la division es un entero..
                case 4 -> {
                    System.out.println("La suma de fracciones es:" + Math.round(suma[0]) + "/" + Math.round(suma[1]));
                    System.out.println("La suma simplificada a numero entero es:" + suma[3]);
                    System.out.println("La suma de fracciones en decimal es:" + suma[2]);
                }
                //Si se puede simplificar..
                case 5 -> {
                    System.out.println("La suma de fracciones es:" + Math.round(suma[0]) + "/" + Math.round(suma[1]));
                    System.out.println("La suma de fracciones en decimal es:" + suma[2]);
                    System.out.println("La fraccion simplificada es " + Math.round(suma[3]) + "/" + Math.round(suma[4]));
                }
                default -> {
                }
            }
            
            
            
                        
        }
        
        catch(RemoteException | NotBoundException rex){
            System.out.println(rex.getMessage());
        }
    }
    
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.conectar_servidor();
    }
}
