
package Ejercicio_1;

/**
 *
 * @author USER
 */
public class clsDog extends Pet{ //herencia
    
    private String breed;
    
    private boolean Pedigree; //true o false 
//no cuenta con el get y set.

    public clsDog(String breed, boolean Pedigree, String cod, String name, int born_year, String color, String healtStatus) {
        super(cod, name, born_year, color, healtStatus);
        this.breed = breed;
        this.Pedigree = Pedigree;
    }
    
    public void WalkAround(){
        System.out.println("El perro "+ super.getName() +" esta caminando.");
    }
    @Override
    public void Sound(){
        System.out.println("El perro "+super.getName()+" hace GUAUUUU");
    }

  
    public String getBreed() {
        return breed;
    }
    
    @Override
    public int getNumberOfBones(){
     return 130;
    }
    @Override
    public String getAnimalType(){
     return "Perro";
    }

    /**
     * @param breed the breed to set
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * @return the Pedigree
     */
    public boolean isPedigree() {
        return Pedigree;
    }

    /**
     * @param Pedigree the Pedigree to set
     */
    public void setPedigree(boolean Pedigree) {
        this.Pedigree = Pedigree;
    }
}
