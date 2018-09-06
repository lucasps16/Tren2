/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trensabana;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;



/**
 *
 * @author Estudiante
 */
public class TrenSabana {
    static TrenSabana tren = new TrenSabana();
    
    public static void main(String[] args) throws IOException {
        
        
        tren.read();
        
    }
    
    
    public void read() throws IOException{
        
        
        PrintWriter wr = new PrintWriter("output.txt");
        wr.write("Ride Status \n");
        String date = Files.readAllLines(Paths.get("input.txt")).get(1);
        wr.write("DATE:" +date +"\n" );
        
        int seats, wagons;
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        String lines = br1.readLine();
        
        
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
        String line;
    while (!"%%".equals(line = br.readLine())) {
             wr.println(line);
            }
        wr.close();
        }
        catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el archivo");
        }
    }
    
    public void date1(){
        
    }
    
    
    
    
    

}
