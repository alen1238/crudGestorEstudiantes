
package Modelo;


public class Estudiante {
    int id;
    String nom;
    String correo;
    String telefono;

    public Estudiante(int id, String nom, String correo, String telefono) {
        this.id = id;
        this.nom = nom;
        this.correo = correo;
        this.telefono = telefono;
    }

    public Estudiante() {
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
