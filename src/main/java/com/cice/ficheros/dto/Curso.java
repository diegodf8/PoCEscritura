package com.cice.ficheros.dto;

public class Curso {
    
    private Long IdCurso;
    private String nombreCurso;
    private String centro;
    private String categoria;
    
    public Curso (){
        
    }
    
    public Curso (Long idCurso, String nombreCurso, String centro, String categoria){
        
        this.IdCurso = idCurso;
        this.nombreCurso = nombreCurso;
        this.centro = centro;
        this.categoria = categoria;
    }
    
    public Long getidCurso(){
        return this.IdCurso;
    }
    
    public String nombreCurso(){
        return this.nombreCurso;
    }
    
    public String centro(){
        return this.centro;
    }
    
    public String categoria(){
        return this.categoria;
    }
    
    public void setidCurso(Long IdCurso){
        this.IdCurso = IdCurso;    
    }
    
    public void setnombreCurso(String nombreCurso){
        this.nombreCurso = nombreCurso;
    }
    
    public void setcentro(String centro){
        this.centro = centro;
    }
    
    public void setcategoria(String categoria){
        this.categoria = categoria ;
    }
    
    
    
    
    
    
    
}
