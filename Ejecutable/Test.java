package Caso_Biblioteca.ejecutable;

import Caso_Biblioteca.controlador.Controlador;
import Caso_Biblioteca.modelo.Biblioteca;
import Caso_Biblioteca.vista.VentanaPrincipal;

public class Test 
{
    public static void main(String[] args) 
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        Biblioteca miBiblioteca = new Biblioteca();
        Controlador miControlador = new Controlador(miVentana, miBiblioteca);
    }

}
