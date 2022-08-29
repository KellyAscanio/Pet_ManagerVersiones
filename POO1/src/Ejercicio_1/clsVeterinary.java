
package Ejercicio_1;


public class clsVeterinary extends AbstHospital{
    private String name;
    private String phone;
    private String  address;
    private clsDoctor doctor; //relacion de composición, obligatoria.

    public clsVeterinary(String name, String phone, String address, clsDoctor doctor) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.doctor = doctor;
    }
    
    public String PetCare(Pet pet){
        System.out.println("Atendiendo a la mascota"+ pet.getName());
        return pet.getHealtStatus();
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
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the doctor
     */
    public clsDoctor getDoctor() {
        return doctor;
    }

    /**
     * @param doctor the doctor to set
     */
    public void setDoctor(clsDoctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public String getPatientType() {
        return "Animal";
    }

    @Override
    public String Surgery() {
        return "Sugery animal data";
    }
}
