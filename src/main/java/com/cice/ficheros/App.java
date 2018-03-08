package com.cice.ficheros;

import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App
{
    public static void main( String[] args )
    {
        try {
            PrintWriter printWriter = new PrintWriter("texto.txt");
            BufferedWriter bw = new BufferedWriter(printWriter);
            bw.write("Esto es una cadena de prueba de escritura");
            bw.write("\n Salto de linasdasdasdesssssssa");
            printWriter.println("Tercera caden3333333a");
            bw.close();
            printWriter.close();
            System.out.println("TExt2");
            //leerFichero("texto.txt");
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
    
    public static void leerFichero(String RutaFichero){
       try {
            FileReader fileReader = new FileReader(RutaFichero);
            BufferedReader bufferReader = new BufferedReader(fileReader);
            String cadena = bufferReader.readLine();
            System.out.println(cadena);
            System.out.println("TExt");
            bufferReader.close();
            fileReader.close();
        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }catch (IOException ex2){
            ex2.printStackTrace();
        }
    }
}
