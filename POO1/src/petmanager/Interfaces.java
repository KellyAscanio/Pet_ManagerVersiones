/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petmanager;

import Ejercicio_1.*;

/**
 *
 * @author USER
 */
public class Interfaces {
    public static void main(String[] args) {
        clsDog dog1 = new clsDog("criollo",false,"001", "Pancho", 2017, " Negro", "Saludable");

        clsCat cat1 = new clsCat("Angora","002", "Jacob", 2013, "Marrón", "Enfermo");
        
        System.out.println(dog1.getAnimalType());
        System.out.println(dog1.getNumberOfBones());
        System.out.println(cat1.getNumberOfBones());
        System.out.println(cat1.getAnimalType());
        
        
     
    }
}
