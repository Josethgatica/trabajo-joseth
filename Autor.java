/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Date;


package Modelo;
import java.sql.Date;

public class Autor {

    
    
    private int id_autor;
    private String cedula;
        private String nombre;
    private String apellidos;
    private String email;
        private Date fechaNac;
        
        public Autor ( int  id_Autor, String cedula, String nombre, String apellidos, String email, Date  fechaNac) {
            this.id_autor = id_autor;
             this.nombre = nombre; 
              this.apellidos = apellidos;
               this.email = email;
               this. fechaNac =  fechaNac;
            
        }
        
         public Autor (String cedula, String nombre, String apellidos, String email, Date fechaNac) {
             this.cedula = cedula ;
             this.nombre = nombre;
             this.apellidos = apellidos;
             this.email = email;
                  
         }
         public int getId_autor() {
        return id_autor;
    }

    public void setId_autor(int id_autor) {
        this.id_autor = id_autor;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }
         
         
         
         
         
         
         
         
         
         
         
         
         }


    
    
    
     
    
    
    
    
    
