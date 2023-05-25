package BIBLIOTECA_PEREZ.controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import BIBLIOTECA_PEREZ.modelo.Biblioteca;
import BIBLIOTECA_PEREZ.vista.VentanaPrincipal;

public class controlador implements ActionListener
{
    //------------------
    //Atributos
    //------------------
    private VentanaPrincipal venPrin;
    private Biblioteca biblioteca;

    //------------------
    //Metodos
    //------------------

    //Constructor
    public Controlador(VentanaPrincipal pVenPrin, Biblioteca pBiblio)
    {
        this.venPrin = pVenPrin;
        this.biblioteca= pBiblio;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
        this.venPrin.miPanelResultados.mostrarResultado("Funciona -_-");
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        String comando = ae.getActionCommand();

        //Abrir ventana Agregar vendedor
        if(comando.equals("AgregarColeccion"))
        {
            venPrin.crearDialogoAgregarColeccion();
            this.venPrin.miColeccion.agregarOyenteBoton(this);
        }
        if(comando.equals("agregarLibro"))
        {
            venPrin.crearDialogoAgregarLibro();
            this.venPrin.miLibro.agregarOyenteBoton(this);
        }
        if(comando.equals("agregar1"))
        {

        }
        if(comando.equals("agregar2"))
        {
            
        }
        if(comando.equals("salir"))
        {
            System.exit(0);
        }  
    }
}
