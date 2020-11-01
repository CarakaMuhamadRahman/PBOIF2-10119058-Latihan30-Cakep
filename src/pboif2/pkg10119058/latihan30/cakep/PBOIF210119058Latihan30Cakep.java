/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119058.latihan30.cakep;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Caraka Muhamad Rahman
 * KELAS    : PBOIF2
 * NIM      : 10119058
 * Deskripsi Program : Program ini berisi program untuk mengetahui apakah kita
 *                     mengerjakan latihan secara mandiri atau tidak.
 * 
 */
public class PBOIF210119058Latihan30Cakep {  
    public static final String RED = "\u001b[31m";
    public static final String GREEN = "\u001b[32m";
    public static final String YELLOW = "\u001b[33m";
    public static final String BLUE = "\u001b[34m";
    public static final String PURPLE = "\u001b[35m";
    public static final String CYAN= "\u001b[36m";
   
     public static void kondisi(String hasil){
        if ("yoi".equals(hasil)){
        System.out.println("");
        System.out.println(RED+"Cakep Bener,"+PURPLE+" Good Job");
        } else {
            System.out.println("");
            System.out.println(RED+"Tetep cakep sih.");
            System.out.println(CYAN+"sing penting paham konsep nya yee.");
            System.out.println("Keep the code works dude");
            }  
    }
     
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        
        String hasil;
        
        System.out.println(RED+"Kamu"+GREEN+" ngerjain sendiri"+YELLOW+" latihan 17 sampe"+BLUE+" latihan 30 ini?");
        System.out.print(BLUE+"Jawab"+RED+" (Yoi/Enggak) : ");
        hasil = input.next();
        System.out.println("");
        kondisi(hasil);
    }
    
}
