<?php

    /* 
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Scripting/EmptyPHP.php to edit this template
     */
    
    /**
     * 
     * Clase que representa un animal
     * @author Adrián Gutiérrez Vidal
     * @version 1.0
     */
    class Animal{
        // Variables
        /**
         * 
         * @var string nombre del animal
         */
        public $nombreAnimal;
        /**
         * 
         * @var string nombre del animal en latín
         */
        public $nombreAnimalLatin;
        /**
         * 
         * @var string tipo de animal
         */
        public $categoria;
        /**
         * 
         * @var string ruta de la foto del animal
         */
        public $fotoImagen;
        // Funciones globales
        /**
         * @return string Esta función llama a las clases hijas y obtiene su tipo de sangre
         */
        public function getTipoSangue( ) {

        }
        /**
         * @return string Esta función llama a las clases hijas y obtiene como se desplazan
         */
        public function desprazar( ) {

        }
        // Constructor
        /**
         * 
         * @param string $nombreAnimal
         * @param string $nombreAnimalLatin
         * @param string $categoria
         * @param string $fotoImagen
         * @return Animal Este constructor crea un nuevo animal
         */
        public function __construct(string $nombreAnimal, string $nombreAnimalLatin, string $categoria, string $fotoImagen ) {
            $this->nombreAnimal = $nombreAnimal; 
            $this->nombreAnimalLatin = $nombreAnimalLatin;
            $this->categoria = $categoria;
            $this->fotoImagen = $fotoImagen;

        }
    }
?>
