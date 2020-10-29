package RMIProyecto;

import java.rmi.*;

public interface metodos_rmi extends Remote{
    public float[] sumar(float[]arregloSumar)throws RemoteException;
    public float[] restar(float[]arregloRestar)throws RemoteException;
    public float[] multiplicar(float[]arregloMultiplicar)throws RemoteException;
    public float[] dividir(float[]arregloDividir)throws RemoteException;
}
