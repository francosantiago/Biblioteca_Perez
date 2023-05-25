package Ejecutable;

import Controlador.controlador;
import Modelo.Biblioteca;
import vista.VentanaPrincipal;

public class Test 
{
    public static void main(String[] args) 
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        Biblioteca miBiblioteca = new Biblioteca();
        controlador miControlador = new controlador(miVentana, miBiblioteca);
    }

}
