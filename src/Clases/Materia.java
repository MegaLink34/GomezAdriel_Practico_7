package Clases;

public class Materia {
    
    private int idMateria;
    private String nombre;
    private int anio;
        
    public Materia(int idMateria, String nombre, int anio){
        
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anio = anio;
    }

    public int getIdMateria() {
        
        return idMateria;
        
    }

    public String getNombre() {
        
        return nombre;
        
    }

    public int getAnio() {
        
        return anio;
        
    }

    @Override
    public String toString() {
        
        return nombre;
        
    }
    
    public void setIdMateria(int idMateria) {
        
        this.idMateria = idMateria;
        
    }

    public void setNombre(String nombre) {
        
        this.nombre = nombre;
        
    }

    public void setAnio(int anio) {
        
        this.anio = anio;
        
    }
        
    @Override
    public int hashCode(){
        
        return idMateria;
        
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Materia)){
            
            return false;
            
        } else {
            
            Materia mat = (Materia)obj;
            return idMateria == mat.getIdMateria();
            
        }
    }
}
