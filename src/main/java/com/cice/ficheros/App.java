package com.cice.ficheros;

import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.cice.ficheros.dto.Curso;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.lang.StringBuilder;

public class App
{
    
    private static final String FILE = "texto.txt";
    
    public static void main( String[] args )
    {
        
      Curso curso = new Curso (1L, "Master en Java", "Povedilla", "Programacion");
      Gson gson = new GsonBuilder().setPrettyPrinting().create();
      String aux = gson.toJson(curso);
      escrituraFichero(FILE, aux);
      Curso curso2 = gson.fromJson(leerFichero(FILE), Curso.class);
      System.out.println(curso2.categoria());
      

    }
    
    public static String leerFichero(String rutaFichero){
          
          StringBuilder sb = new StringBuilder();
       
       try {
            
            FileReader fileReader = new FileReader(rutaFichero);
            BufferedReader bufferReader = new BufferedReader(fileReader);
            String cadena = bufferReader.readLine();
            sb.append(cadena);
            cadena = bufferReader.readLine();
            sb.append(cadena);
            bufferReader.close();
            fileReader.close();
        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }catch (IOException ex2){
            ex2.printStackTrace();
        }
        return sb.toString();     
    }
    
    public static void escrituraFichero(String rutaFichero, String json){
        try {
            PrintWriter printWriter = new PrintWriter(rutaFichero);
            printWriter.write(json);
            printWriter.close();
            
        }catch (Exception ex){
            ex.printStackTrace();
        }
        
    }
}
