package RMIProyecto;

import java.rmi.*;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.*;

public class Servidor extends UnicastRemoteObject implements metodos_rmi{
    
    public Servidor() throws RemoteException{
        super();
    }
    
    @Override
    public float[] sumar(float[]arregloSumar)throws RemoteException{
        float numerador1;
        float numerador2;
        float denominador1;
        float denominador2;
        numerador1 = arregloSumar[0];
        denominador1 = arregloSumar[1];
        numerador2 = arregloSumar[2];
        denominador2 = arregloSumar[3];
        
        float denominadorfinal, suma, division;
        
        if (denominador1 == denominador2) //Si los denominadores de las fracciones son los mismos.
        {
            denominadorfinal = denominador1;
            suma = numerador1 + numerador2;
            division = suma / denominadorfinal;
            float simplificacion;
            
            if (suma%denominadorfinal == 0) //Si el residuo de la division de ambos números es un entero...
            {
                simplificacion = division;
                arregloSumar[0]=suma;
                arregloSumar[1]=denominadorfinal;
                arregloSumar[2]=division;
                arregloSumar[3]=simplificacion;
            
                return arregloSumar;
            }
            
            else{ //simplificar
                //Encontrar el maximo comun divisor del numerador y denominador.
                int num1, num2;
                num1 = Math.round(suma);
                num2 = Math.round(denominadorfinal);

                while(num1 != num2)
                    if (num1 > num2)
                    {
                        num1 = num1 - num2;
                    }
                    else
                    {
                        num2 = num2 - num1;
                    }

                if(num1 == 1 || num2 ==1)//si el maximo comun divisor es 1
                {
                    //No se puede dividir..
                    arregloSumar[0]=suma;
                    arregloSumar[1]=denominadorfinal;
                    arregloSumar[2]=division;
                    arregloSumar[3]=suma;
                    arregloSumar[4]=denominadorfinal;
                    
                    return arregloSumar;
                }

                if(num1 > 1 || num2 > 1) //Si el maximo comun divisor es mayor a uno..
                {
                    //si se puede dividir.
                    float suma2, denominadorfinal2;
                    suma2 = suma / num1; //Se divide entre el maximo comun divisor de numerador y denominador
                    denominadorfinal2 = denominadorfinal / num1;

                    arregloSumar[0]=suma;
                    arregloSumar[1]=denominadorfinal;
                    arregloSumar[2]=division;
                    arregloSumar[3]=suma2;
                    arregloSumar[4]=denominadorfinal2;

                    return arregloSumar;
                }
            }
        }
        
        else{ //Si los denominadores no son iguales...
            denominadorfinal = denominador1 * denominador2;
            
            suma = (numerador1*denominador2) + (denominador1*numerador2);
            division = suma/denominadorfinal;
            float simplificacion;
            
            if (suma%denominadorfinal == 0) //Si el residuo de la division de ambos números es un entero...
            {
                simplificacion = division;
                arregloSumar[0]=suma;
                arregloSumar[1]=denominadorfinal;
                arregloSumar[2]=division;
                arregloSumar[3]=simplificacion;
            
                return arregloSumar;
            }
            
            else{ //simplificar
                //Encontrar el maximo comun divisor del numerador y denominador.
                int num1, num2;
                num1 = Math.round(suma);
                num2 = Math.round(denominadorfinal);

                while(num1 != num2)
                    if (num1 > num2)
                    {
                        num1 = num1 - num2;
                    }
                    else
                    {
                        num2 = num2 - num1;
                    }

                if(num1 == 1 || num2 ==1)//si el maximo comun divisor es 1
                {
                    //No se puede dividir..
                    arregloSumar[0]=suma;
                    arregloSumar[1]=denominadorfinal;
                    arregloSumar[2]=division;
                    arregloSumar[3]=suma;
                    arregloSumar[4]=denominadorfinal;
                    
                    return arregloSumar;
                }

                if(num1 > 1 || num2 > 1) //Si el maximo comun divisor es mayor a uno..
                {
                    //si se puede dividir.
                    float suma2, denominadorfinal2;
                    suma2 = suma / num1; //Se divide entre el maximo comun divisor de numerador y denominador
                    denominadorfinal2 = denominadorfinal / num1;

                    arregloSumar[0]=suma;
                    arregloSumar[1]=denominadorfinal;
                    arregloSumar[2]=division;
                    arregloSumar[3]=suma2;
                    arregloSumar[4]=denominadorfinal2;

                    return arregloSumar;
                }
            }
        }
        float[] equis = {1};
        return equis;
    }
    
    @Override
    public float[] restar(float[]arregloRestar)throws RemoteException
    {
        float numerador1;
        float numerador2;
        float denominador1;
        float denominador2;
               
        numerador1 = arregloRestar[0];
        denominador1 = arregloRestar[1];
        numerador2 = arregloRestar[2];
        denominador2 = arregloRestar[3];
        
        float denominadorfinal, resta, division;
        
        if (denominador1 == denominador2) //Si los denominadores de las fracciones son los mismos.
        {
            denominadorfinal = denominador1;
            resta = numerador1 - numerador2;
            division = resta / denominadorfinal;
            float simplificacion;
            
            if (resta%denominadorfinal == 0) //Si el residuo de la division de ambos números es un entero...
            {
                simplificacion = division;
                arregloRestar[0]=resta;
                arregloRestar[1]=denominadorfinal;
                arregloRestar[2]=division;
                arregloRestar[3]=simplificacion;
            
                return arregloRestar;
            }
            
            else{ //simplificar
                //Encontrar el maximo comun divisor del numerador y denominador.
                int num1, num2;
                num1 = Math.round(resta);
                num2 = Math.round(denominadorfinal);

                while(num1 != num2)
                    if (num1 > num2)
                    {
                        num1 = num1 - num2;
                    }
                    else
                    {
                        num2 = num2 - num1;
                    }

                if(num1 == 1 || num2 ==1)//si el maximo comun divisor es 1
                {
                    //No se puede dividir..
                    arregloRestar[0]=resta;
                    arregloRestar[1]=denominadorfinal;
                    arregloRestar[2]=division;
                    arregloRestar[3]=resta;
                    arregloRestar[4]=denominadorfinal;
                    
                    return arregloRestar;
                }

                else if(num1 > 1 || num2 > 1) //Si el maximo comun divisor es mayor a uno..
                {
                    //si se puede dividir.
                    float suma2, denominadorfinal2;
                    suma2 = resta / num1; //Se divide entre el maximo comun divisor de numerador y denominador
                    denominadorfinal2 = denominadorfinal / num1;

                    arregloRestar[0]=resta;
                    arregloRestar[1]=denominadorfinal;
                    arregloRestar[2]=division;
                    arregloRestar[3]=suma2;
                    arregloRestar[4]=denominadorfinal2;

                    return arregloRestar;
                }
            }
        }
        
        else{ //Si los denominadores no son iguales...
            denominadorfinal = denominador1 * denominador2;
            
            resta = (numerador1*denominador2) - (denominador1*numerador2);
            division = resta/denominadorfinal;
            float simplificacion;
            
            if (resta%denominadorfinal == 0) //Si el residuo de la division de ambos números es un entero...
            {
                simplificacion = division;
                arregloRestar[0]=resta;
                arregloRestar[1]=denominadorfinal;
                arregloRestar[2]=division;
                arregloRestar[3]=simplificacion;
            
                return arregloRestar;
            }
            
            else{ //simplificar
                //Encontrar el maximo comun divisor del numerador y denominador.
                int num1, num2;
                num1 = Math.round(resta);
                num2 = Math.round(denominadorfinal);

                while(num1 != num2)
                    if (num1 > num2)
                    {
                        num1 = num1 - num2;
                    }
                    else
                    {
                        num2 = num2 - num1;
                    }

                if(num1 == 1 || num2 ==1)//si el maximo comun divisor es 1
                {
                    //No se puede dividir..
                    arregloRestar[0]=resta;
                    arregloRestar[1]=denominadorfinal;
                    arregloRestar[2]=division;
                    arregloRestar[3]=resta;
                    arregloRestar[4]=denominadorfinal;
                    
                    return arregloRestar;
                }

                if(num1 > 1 || num2 > 1) //Si el maximo comun divisor es mayor a uno..
                {
                    //si se puede dividir.
                    float suma2, denominadorfinal2;
                    suma2 = resta / num1; //Se divide entre el maximo comun divisor de numerador y denominador
                    denominadorfinal2 = denominadorfinal / num1;

                    arregloRestar[0]=resta;
                    arregloRestar[1]=denominadorfinal;
                    arregloRestar[2]=division;
                    arregloRestar[3]=suma2;
                    arregloRestar[4]=denominadorfinal2;

                    return arregloRestar;
                }
            }
        }
        float[] equis = {1};
        return equis;
    }
    
    @Override
    public float[] multiplicar(float[]arregloMultiplicar)throws RemoteException
    {
        float numerador1;
        float numerador2;
        float denominador1;
        float denominador2;
               
        numerador1 = arregloMultiplicar[0];
        denominador1 = arregloMultiplicar[1];
        numerador2 = arregloMultiplicar[2];
        denominador2 = arregloMultiplicar[3];
        
        float producto1, producto2, division;
        
        producto1 = numerador1 * numerador2;
        producto2 = denominador1 * denominador2;
        
        division = producto1/producto2;
        
        //Simplificacion..
        if(producto1%producto2 == 0) //Si al dividir el numerador y denominador es un numero entero sin residuo..
        {
            arregloMultiplicar[0]=producto1;
            arregloMultiplicar[1]=producto2;
            arregloMultiplicar[2]=division;
            arregloMultiplicar[3]=division;
            
            return arregloMultiplicar;
        }
        
        else //Si se puede simplificar..
        {
            //Encontrar el maximo comun divisor del numerador y denominador.
            int num1, num2;
            num1 = Math.round(producto1);
            num2 = Math.round(producto2);

            while(num1 != num2)
                if (num1 > num2)
                {
                    num1 = num1 - num2;
                }
                else
                {
                    num2 = num2 - num1;
                }

            if(num1 == 1 || num2 ==1)//si el maximo comun divisor es 1
            {
                //No se puede dividir..
                arregloMultiplicar[0]=producto1;
                arregloMultiplicar[1]=producto2;
                arregloMultiplicar[2]=division;
                arregloMultiplicar[3]=producto1;
                arregloMultiplicar[4]=producto2;
                    
                return arregloMultiplicar;
            }

            else if(num1 > 1 || num2 > 1) //Si el maximo comun divisor es mayor a uno..
            {
                //si se puede dividir.
                float suma2, denominadorfinal2;
                suma2 = producto1 / num1; //Se divide entre el maximo comun divisor de numerador y denominador
                denominadorfinal2 = producto2 / num1;

                arregloMultiplicar[0]=producto1;
                arregloMultiplicar[1]=producto2;
                arregloMultiplicar[2]=division;
                arregloMultiplicar[3]=suma2;
                arregloMultiplicar[4]=denominadorfinal2;

                return arregloMultiplicar;
            }
        }
        float[] equis = {1};
        return equis;
    }
    
    @Override
    public float[] dividir(float[]arregloDividir)throws RemoteException
    {
        float numerador1;
        float numerador2;
        float denominador1;
        float denominador2;
               
        numerador1 = arregloDividir[0];
        denominador1 = arregloDividir[1];
        numerador2 = arregloDividir[2];
        denominador2 = arregloDividir[3];
        
        float producto1, producto2, division;
        
        producto1 = numerador1 * denominador2;
        producto2 = denominador1 * numerador2;
        
        division = producto1/producto2;
        
        //Simplificacion..
        if(producto1%producto2 == 0) //Si al dividir el numerador y denominador es un numero entero sin residuo..
        {
            arregloDividir[0]=producto1;
            arregloDividir[1]=producto2;
            arregloDividir[2]=division;
            arregloDividir[3]=division;
            
            return arregloDividir;
        }
        
        else //Si se puede simplificar..
        {
            //Encontrar el maximo comun divisor del numerador y denominador.
            int num1, num2;
            num1 = Math.round(producto1);
            num2 = Math.round(producto2);

            while(num1 != num2)
                if (num1 > num2)
                {
                    num1 = num1 - num2;
                }
                else
                {
                    num2 = num2 - num1;
                }

            if(num1 == 1 || num2 ==1)//si el maximo comun divisor es 1
            {
                //No se puede dividir..
                arregloDividir[0]=producto1;
                arregloDividir[1]=producto2;
                arregloDividir[2]=division;
                arregloDividir[3]=producto1;
                arregloDividir[4]=producto2;
                    
                return arregloDividir;
            }

            else if(num1 > 1 || num2 > 1) //Si el maximo comun divisor es mayor a uno..
            {
                //si se puede dividir.
                float suma2, denominadorfinal2;
                suma2 = producto1 / num1; //Se divide entre el maximo comun divisor de numerador y denominador
                denominadorfinal2 = producto2 / num1;

                arregloDividir[0]=producto1;
                arregloDividir[1]=producto2;
                arregloDividir[2]=division;
                arregloDividir[3]=suma2;
                arregloDividir[4]=denominadorfinal2;

                return arregloDividir;
            }
        }
        float[] equis = {1};
        return equis;
    }
    
    public static void main(String[] args) {
        try{
            Registry registro = LocateRegistry.createRegistry(9999);
            registro.rebind("servidorarti", new Servidor());
            System.out.println("Servidor activo");
        }
        catch (RemoteException ex){
            System.out.println(ex.getMessage());
        }
    }
}
