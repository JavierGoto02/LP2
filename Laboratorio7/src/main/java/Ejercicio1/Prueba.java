package Ejercicio1;

import java.util.ArrayList;

/**
 *
 * @author Grupo 1 - Laboratorio 7 - Ejercicio 1
 */
public class Prueba 
{
    public static void main(String[] args) 
    {

        ArrayList<Figura> figuras = new ArrayList<>(); //Lista de figuras

        //Cargamos diferentes figuras
        figuras.add(new Cuadrado(8, "Cuadrado"));
        figuras.add(new Triangulo("Triangulo", 2, 3));
        figuras.add(new Cubo(6, "Cubo"));
        figuras.add(new Tetraedro("Tetraedro", 3, 10));
        figuras.add(new Esfera("Esfera", 20));
        figuras.add(new Circulo("Circulo", 23));
        figuras.add(new Triangulo("Triangulo", 4, 10));
        figuras.add(new Cubo(30, "Cubo"));
        figuras.add(new Cuadrado(10, "Cuadrado"));
        figuras.add(new Esfera("Esfera", 7));
        figuras.add(new Tetraedro("Tetraedro", 20, 20));
        for(Figura figura : figuras)
        {
            System.out.println("Es un " + figura.getNombre());
            System.out.println("Area: " + figura.obtenerArea());
            if(figura instanceof FiguraTridimensional) //Si es figura tridimensional se imprime su volumen
            {
                FiguraTridimensional figuraAux = (FiguraTridimensional)figura;
                System.out.println("Volumen: " + figuraAux.obtenerVolumen());
            }  
            System.out.println();
        }

        
    }
    
}
