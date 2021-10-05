package Clases;

import java.util.HashSet;

public class Alumno {

    private String apellido;
    private String nombre;
    private int legajo;
    private HashSet<Materia> materias;

    public Alumno(int legajo, String apellido, String Nombre) {
        
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = Nombre;
        this.materias = new HashSet<>();
        
    }
    
    public String getNombre() {
        
        return nombre;
        
    }
    
    public String getApellido() {
        
        return apellido;
        
    }   
    
    public int getLegajo() {
        
        return legajo;
        
    }

    public void setNombre(String Nombre) {
        
        this.nombre = Nombre;
        
    }

    public void setApellido(String apellido) {
        
        this.apellido = apellido;
        
    }
    
    public void setLegajo(int legajo) {
        
        this.legajo = legajo;
        
    }
    
    public void agregarMateria(Materia materia) {
        
        materias.add(materia);
        
    }
    
    public int cantidadMaterias() {
        
        return materias.size();
        
    }
    
    @Override
    public String toString() {
        
        return nombre + " " + apellido;
        
    }

    @Override
    public int hashCode() {
        
        return legajo;
        
    }

    @Override
    public boolean equals(Object obj) {
        
        if (obj == null || !(obj instanceof Alumno)){
            
            return false;
            
        } else {
            
            Alumno otra = (Alumno)obj;
            
            return legajo == otra.getLegajo();
        }
    }
}
