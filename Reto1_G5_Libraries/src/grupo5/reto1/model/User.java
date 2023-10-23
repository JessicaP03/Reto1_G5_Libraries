package grupo5.reto1.model;




import java.io.Serializable;
import java.time.LocalDate;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ian.
 */
public class User implements Serializable{
    
    private String nombreCompleto;
    private String email;
    private String direccion;
    private String contrasena;
    private int telefono;
    private int codigoPostal;
    private LocalDate createDate;
    private LocalDate writeDate;
    private Boolean activo;
    private int compania;
    //private UserType type;

    
    public User(String nombreCompleto, String email, String direccion, String contrasena, int telefono, int codigoPostal, LocalDate createDate, LocalDate writeDate, Boolean activo, int compania) {
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.direccion = direccion;
        this.contrasena = contrasena;
        this.telefono = telefono;
        this.codigoPostal = codigoPostal;
        this.createDate = LocalDate.now();
        this.writeDate = LocalDate.now();
        this.activo = true;
        this.compania = 1;
    }

    

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public LocalDate getWriteDate() {
        return writeDate;
    }

    public void setWriteDate(LocalDate writeDate) {
        this.writeDate = writeDate;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public int getCompania() {
        return compania;
    }

    public void setCompania(int compania) {
        this.compania = compania;
    }
    
       
    
}