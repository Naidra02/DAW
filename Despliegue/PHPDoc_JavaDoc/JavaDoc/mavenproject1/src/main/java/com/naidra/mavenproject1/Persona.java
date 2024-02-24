/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.naidra.mavenproject1;

/**
 * Persona class 
 * @author Adri
 * @version 1.0
 */
public class Persona {
    /**
     * Persona construction and initialization with name, surnames, DNI, phone code and phone number
     * @param nombre string, person name
     * @param apellido1 string, first surname
     * @param apellido2 string, second surname
     * @param nif string, nine numbers and a letter
     * @param codigoPaisTelefono int, two numbers
     * @param telefono int, nine numbers
     *
    */
    // Definición variables
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String nif;
    private int codigoPaisTelefono;
    private int telefono;
    // Getters/Setters

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public String getApellido1() {
        return apellido1;
    }

    /**
     *
     * @param apellido1
     */
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    /**
     *
     * @return
     */
    public String getApellido2() {
        return apellido2;
    }

    /**
     *
     * @param apellido2
     */
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    /**
     *
     * @return
     */
    public String getNif() {
        return nif;
    }

    /**
     *
     * @param nif
     */
    public void setNif(String nif) {
        this.nif = nif;
    }

    /**
     *
     * @param codigoPaisTelefono
     */
    public void setCodigoPaisTelefono(int codigoPaisTelefono) {
        this.codigoPaisTelefono = codigoPaisTelefono;
    }

    /**
     *
     * @return
     */
    public int getCodigoPaisTelefono() {
        return codigoPaisTelefono;
    }

    /**
     *
     * @return
     */
    public int getTelefono(){
        return telefono;
    }

    /**
     *
     * @param telefono
     */
    public void settelefono(int telefono){
        this.telefono = telefono;
    }
    // métodos

    /**
     * 
     * Get full name
     */
    public void getNombreCompleto(){
      System.out.println(getNombre()+", "+getApellido1()+" " +getApellido2());
    }

    /**
     * Every single get is on this method
     */
    public void getTodosLosDatos(){
        System.out.println("La persona "+getNombre()+", "+getApellido1()+" " +getApellido2()+" con NIF "+getNif()+" tiene el siguiente teléfono (+"+getCodigoPaisTelefono()+") "+getTelefono());
    }
    // Constructors

    /**
     * Empty Persona constructor
     */
    public Persona() {
    }

    /**
     * Persona constructor with all parameters
     * @param nombre
     * @param apellido1
     * @param apellido2
     * @param nif
     * @param codigoPaisTelefono
     * @param telefono
     */
    public Persona(String nombre, String apellido1, String apellido2, String nif, int codigoPaisTelefono, int telefono){
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nif = nif;
        this.codigoPaisTelefono = codigoPaisTelefono;
        this.telefono = telefono;
    }

}
