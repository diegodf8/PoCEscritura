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
import java.util.ArrayList;
import java.util.List;
import com.google.gson.reflect.TypeToken;

public class App
{    
    private static final String FILE = "texto.txt";
    
    public static void main( String[] args )
    {
      Curso curso = new Curso (1L, "Master en Java", "Povedilla", "Programacion");
      List <Curso> lista = new ArrayList<Curso>();
      lista.add(new Curso(1L, "Master en Java", "Povedilla", "Programacion"));
      lista.add(new Curso(2L, "Master en Oracle", "Povedilla", "Programacion"));
      
      Gson gson = new GsonBuilder().setPrettyPrinting().create();
      String aux = gson.toJson(curso);
      escribirFichero(FILE, aux);
      Curso curso2 = gson.fromJson(leerFichero(FILE), Curso.class);
      System.out.println(curso2.getcategoria());
      
      Gson gson2 = new GsonBuilder().setPrettyPrinting().create();
      String aux2 = gson2.toJson(lista);
      escribirFichero(FILE, aux2);
      List<Curso> lista2 = gson.fromJson(leerFichero(FILE), new TypeToken<ArrayList<Curso>>(){}.getType());
      
      for(Curso c: lista2){
          System.out.println(c.getnombreCurso());
      }
    }
    
    public static String leerFichero(String rutaFichero){
          
          StringBuilder sb = new StringBuilder();
          FileReader fr;
          BufferedReader br;
          
       try {
            fr = new FileReader(rutaFichero);
            br = new BufferedReader(fr);
            String cadena = null;
            while ((cadena = br.readLine()) != null){
                sb.append(cadena);
            }
            br.close();
            fr.close();
        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }catch (IOException ex2){
            ex2.printStackTrace();
        }
        return sb.toString();     
    }
    
    public static void escribirFichero(String rutaFichero, String json){
        try {
            PrintWriter printWriter = new PrintWriter(rutaFichero);
            printWriter.write(json);
            printWriter.close();
            
        }catch (Exception ex){
            ex.printStackTrace();
        }
        
    }
}

