
package Ejercicio_1;


public class clsDoctor {
  private String name;
  private String licence;  

    public clsDoctor(String name, String licence) {
        this.name = name;
        this.licence = licence;
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
     * @return the licence
     */
    public String getLicence() {
        return licence;
    }

    /**
     * @param licence the licence to set
     */
    public void setLicence(String licence) {
        this.licence = licence;
    }
}
