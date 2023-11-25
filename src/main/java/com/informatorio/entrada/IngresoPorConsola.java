package com.informatorio.entrada;
import java.util.Scanner;

public class IngresoPorConsola {

    public static Scanner scanner;

    public static void crearScanner(){
        if(scanner == null){
            scanner = new Scanner(System.in);
        }
    }

    public static Scanner getScanner(){
        crearScanner();
        return scanner;
    }

    public static void cerrarScanner(){
        if(scanner != null){
            scanner.close();
        }
    }

}
