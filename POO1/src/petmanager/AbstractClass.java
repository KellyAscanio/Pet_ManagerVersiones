/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petmanager;

import Ejercicio_1.clsDoctor;
import Ejercicio_1.clsVeterinary;

/**
 *
 * @author USER
 */
public class AbstractClass {
    public static void main(String[] args) {
        
        
        clsDoctor doctor = new clsDoctor("Lizeth Cortés", "L12345");
        clsVeterinary veterinary = new clsVeterinary("Veterinaria Udc", "035 443 12 00","Calle 70 N 32-12", doctor);
    
        veterinary.setData(veterinary.getName() + " _ "+veterinary.getAddress());
        
        String data= veterinary.getHospitalInformation();
        String type= veterinary.getPatientType();
        String surgery= veterinary.Surgery();
        
        
        
        System.out.println("Data: "+ data);
        System.out.println("Type: "+ type);
        System.out.println("Surgery: "+ surgery);
    }
}
