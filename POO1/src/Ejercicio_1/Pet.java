
package Ejercicio_1;

import Interfaces.*;


public class Pet implements IAnimal, IVertebrate{
 private String cod;
 private String name;
 private int born_year;
 private String color;
 private String healtStatus;
 private clsVeterinary veterinary; //Relación de agregación

    public Pet(String cod, String name, int born_year,String color, String healtStatus) {
        this.cod = cod;
        this.name = name;
        this.born_year = born_year;
        this.color = color;
        this.healtStatus = healtStatus;
    }

    

 
 
 public void Eat(){
     System.out.println("La mascota "+this.name+ " esta comiendo");
}
 public void Move(){
     System.out.println("La mascota "+this.name+" se esta moviendo");
}
 public void Sound(){
     System.out.println("La mascota "+this.name+"  esta haciendo un sonido ");
}

    /**
     * @return the cod
     */
    public String getCod() {
        return cod;
    }

    /**
     * @param cod the cod to set
     */
    public void setCod(String cod) {
        this.cod = cod;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the born_year
     */
    public int getBorn_year() {
        return born_year;
    }

    /**
     * @param born_year the born_year to set
     */
    public void setBorn_year(int born_year) {
        this.born_year = born_year;
    }
    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the healtStatus
     */
    public String getHealtStatus() {
        return healtStatus;
    }

    /**
     * @param healtStatus the healtStatus to set
     */
    public void setHealtStatus(String healtStatus) {
        this.healtStatus = healtStatus;
    }

    /**
     * @return the veterinary
     */
    public clsVeterinary getVeterinary() {
        return veterinary;
    }

    /**
     * @param veterinary the veterinary to set
     */
    public void setVeterinary(clsVeterinary veterinary) {
        this.veterinary = veterinary;
    }

    @Override
    public String getAnimalType() {
        return "domestico";
    }

    @Override
    public int getNumberOfBones() {
        return 0;
    }
 
}

