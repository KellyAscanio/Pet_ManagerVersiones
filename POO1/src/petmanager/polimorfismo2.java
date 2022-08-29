
package petmanager;

import Ejercicio_1.*;



public class polimorfismo2 {
    public static void main(String[] args) {
        clsDog dog1 = new clsDog("criollo",false,"001", "Pancho", 2017, " Negro", "Saludable");

        clsCat cat1 = new clsCat("Angora","002", "Jacob", 2013, "Marrón", "Enfermo");
        
        dog1.Sound();
        cat1.Sound();
    }
  
}
