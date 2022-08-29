
package petmanager;

import Ejercicio_1.*;



public class polimorfismo {
    public static void main(String[] args) {
        //instancias de las clases hijas
        
        clsDog dog1 = new clsDog("criollo",false,"001", "Pancho", 2017, " Negro", "Saludable");

        clsCat cat1 = new clsCat("Angora","002", "Jacob", 2013, "Marrón", "Enfermo");
        
        //instancia de veterinaria y doctor.
        
        clsDoctor doctor = new clsDoctor("Lizeth Cortés", "L12345");
        clsVeterinary veterinary = new clsVeterinary("Veterinaria Udc", "035 443 12 00","Calle 70 N 32-12", doctor);
    
        String careDog = veterinary.PetCare(dog1); 
        System.out.println("El estado de dalud de "+ dog1.getName()+" es: "+ careDog);
        
        String careCat = veterinary.PetCare(cat1); 
        System.out.println("El estado de dalud de "+ cat1.getName()+" es: "+ careCat);
    
    }
 
}
