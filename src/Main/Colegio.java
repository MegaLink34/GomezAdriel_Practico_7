package Main;

import Clases.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EL MEGAS
 */
public class Colegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Materia mat1 = new Materia(1, "Ingles 1", 1);
        Materia mat2 = new Materia(2, "Matemática 1", 1);
        Materia mat3 = new Materia(3, "Laboratorio 1", 1);
        
        Alumno a1 = new Alumno(1001, "Lopez", "Martin");
        Alumno a2 = new Alumno(1002, "Martinez", "Brenda");
        
        a1.agregarMateria(mat1);
        a1.agregarMateria(mat2);
        a1.agregarMateria(mat3);
        
        
        a2.agregarMateria(mat1);
        a2.agregarMateria(mat2);
        a2.agregarMateria(mat3);
        a2.agregarMateria(mat3);
        
        System.out.println(a1.cantidadMaterias());
        System.out.println(a2.cantidadMaterias());
        
    }
    
}
