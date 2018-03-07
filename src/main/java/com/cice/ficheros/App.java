package com.cice.ficheros;


import java.io.BufferedWriter;
import java.io.PrintWriter;

public class App
{
    public static void main( String[] args )
    {
        try {
            PrintWriter printWriter = new PrintWriter("texto.txt");
            BufferedWriter bw = new BufferedWriter(printWriter);
            bw.write("Esto es una cadena de prueba de escritura");
            bw.write("\n Salto de linesssssssa");
            bw.close();
            printWriter.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
