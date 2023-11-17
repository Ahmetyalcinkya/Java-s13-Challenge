package employeeApp.OOP;

import java.util.Arrays;

public class Company {
    private String id;
    private String name;
    private int giro;
    private String[] developerNames;

    private void giroCheck(int giro){
        if(giro < 0){
            this.giro = 0;
            System.out.println("Ciro 0'dan küçük olamaz !!!!");
        }else {
            this.giro = giro;
        }
    }

    public Company(String id, String name, int giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        giroCheck(giro);
        this.developerNames = developerNames;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGiro() {
        return giro;
    }

    public void setGiro(int giro) {
        giroCheck(giro);
    }

    public String getDeveloperNames() {
        return Arrays.toString(developerNames);
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public void addEmployee(int index, String name){
        try {
            if(developerNames[index] == null){
                developerNames[index] = name;
            } else{
                System.out.println("Index: "+ index + " değeri doludur.");
            }
        }catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Böyle bir index değeri yoktur." + index);
        }
    }

    @Override
    public String toString() {
        return "Company{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
    }
}
