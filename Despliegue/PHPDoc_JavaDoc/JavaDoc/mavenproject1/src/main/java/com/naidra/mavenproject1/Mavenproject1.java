/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.naidra.mavenproject1;

/**
 * This Class simulates the behavior of creating three new Personas and printing all of their personal data
 * @author Adri
 */
public class Mavenproject1 {
        
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Persona per1 = new Persona ("Modesto", "Lopetegui", "Armendia","12345648-Z", 34, 666777888);
        Persona per2 = new Persona ("Adrián", "Hernandez", "Perez","87654321-A", 34, 664758129);
        Persona per3 = new Persona ("Gabi", "Diaz", "Roca","8495621-L", 30, 664758129);
        
        // System.out.println("================================================================");
        // per1.getNombreCompleto();
        System.out.println("================================================================");
        per1.getTodosLosDatos();
        System.out.println("================================================================");
        // System.out.println("================================================================");
        // per2.getNombreCompleto();
        System.out.println("================================================================");
        per2.getTodosLosDatos();
        System.out.println("================================================================");
        // per3.getNombreCompleto();
        System.out.println("================================================================");
        per3.getTodosLosDatos();
        System.out.println("================================================================");
    }
}
