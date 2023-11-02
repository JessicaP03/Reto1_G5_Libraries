/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;




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
    
    private String name;
    private String email;
    private String address;
    private String passwd;
    private String passwd2;
    private int phone;
    private int zip;
    private LocalDate createDate;
    private LocalDate writeDate;
    private Boolean activo;
    private int company;
    //private UserType type;

    public User(String name, String email, String address, String passwd, String passwd2, int phone, int zip, LocalDate createDate, LocalDate writeDate, Boolean activo, int company) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.passwd = passwd;
        this.passwd2 = passwd2;
        this.phone = phone;
        this.zip = zip;
        this.createDate = LocalDate.now();
        this.writeDate = LocalDate.now();
        this.activo = true;
        this.company = 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddres(String address) {
        this.address = address;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getPasswd2() {
        return passwd2;
    }

    public void setPasswd2(String passwd2) {
        this.passwd2 = passwd2;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
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

    public int getCompany() {
        return company;
    }

    public void setCompany(int company) {
        this.company = company;
    }

    
   
    
}