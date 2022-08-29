
package petmanager;

import Ejercicio_1.*;

import java.util.Date;


public class main {
    public static void main(String[] args) {
        clsDog dog1 = new clsDog("criollo",false,"001", "Pancho", 2017, " Negro", "Saludable");
       
        
        clsCat cat1 = new clsCat("Angora","002", "Jacob", 2013, "Marrón", "Enfermo");
       
        Date fecha_actual = new Date();
        int anioActual = fecha_actual.getYear();
        
        int edadPet1 = anioActual - dog1.getBorn_year();
        int edadPet2 = anioActual - cat1.getBorn_year();
        
        if(edadPet1>edadPet2){
            System.out.println("La mascota "+ dog1.getName()+" es mayor que la mascota "+cat1.getName());
        }else{
          if(edadPet2>edadPet1){
            System.out.println("La mascota "+ cat1.getName()+" es mayor que la mascota "+dog1.getName());
          }else{
              System.out.println("La mascota "+ dog1.getName()+" tiene la misma edad que la mascota "+cat1.getName());
          }
        }
        
        dog1.Eat();
        cat1.Eat();
        dog1.Move();
        cat1.Move();
        
        dog1.WalkAround();
        cat1.SelfCleaning();
    }
 
}
