
package Ejercicio_1;


public class clsCat extends Pet{ //herencia
    private String breed;

    public clsCat(String breed, String cod, String name, int born_year, String color, String healtStatus) {
        super(cod, name, born_year, color, healtStatus); //el super quiere decir que se construya un objeto de la clase de la cuál
        //se esta heredando
        this.breed = breed;
    }
    
    
    
    
    public void SelfCleaning(){
        System.out.println("El gato "+ super.getName()+" se esta limpiando");
    }
    @Override
    public void Sound(){
        System.out.println("El gato "+super.getName()+" hace MIAUUUU");
    }
    @Override
    public int getNumberOfBones(){
     return 230;
    }
    @Override
    public String getAnimalType(){
     return "Gato";
    }

    /**
     * @return the breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * @param breed the breed to set
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }
}
